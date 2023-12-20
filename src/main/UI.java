package main;

import java.awt.Color;
import java.awt.Font;
import java.awt.GridLayout;
import java.awt.Image;
import java.awt.event.MouseEvent;
import java.awt.event.MouseListener;

import javax.swing.ImageIcon;
import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JMenuItem;
import javax.swing.JPanel;
import javax.swing.JPopupMenu;
import javax.swing.JTextArea;
import javax.swing.SwingUtilities;

public class UI {
    GameManager gm;
    JFrame window;
    public JTextArea messageText;
    JPanel bgPanel[] = new JPanel[10];
    JLabel bgLabel[] = new JLabel[10];
    
    //Player UI
    JPanel lifePanel;
    JLabel lifeLabel[] = new JLabel[6];
    JPanel inventoryPanel;
    public JLabel swordLabel, shieldLabel, lanternLabel;
    
    //GAME OVER UI
    public JLabel titleLabel;
    public JButton restartButton;
    
    

    public UI(GameManager gm) {
        this.gm = gm;
        
        // Di chuyển window.setVisible(true) xuống dưới
        createMainField();
        createPlayerField();
        generateScene();
        createGameOverField();
        window.setVisible(true);
    }

    void createMainField() {
        window = new JFrame("Game Window");
        window.setSize(800, 600);
        window.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        window.setLayout(null);
        window.getContentPane().setBackground(Color.black);

        messageText = new JTextArea("Sample Text");
        messageText.setBounds(50, 400, 700, 150);
        messageText.setBackground(Color.black);
        messageText.setForeground(Color.white);
        messageText.setEditable(false);
        messageText.setFont(new Font("Book Antiqua", Font.PLAIN, 26));

        // Thêm JTextArea vào JFrame
        window.add(messageText);
    }
    
    
    void createBackground(int bgNum,  String source) {
    	bgPanel[bgNum] = new JPanel();
    	bgPanel[bgNum].setBounds(50, 50, 700, 350);
    	bgPanel[bgNum].setBackground(Color.black);
    	bgPanel[bgNum].setLayout(null);
    	bgPanel[bgNum].setVisible(false);
    	window.add(bgPanel[bgNum]);
    	
    	bgLabel[bgNum] = new JLabel();
    	bgLabel[bgNum].setBounds(0, 0, 700, 350);
    	
    	ImageIcon bgIcon = new ImageIcon(getClass().getClassLoader().getResource(source));
    	bgLabel[bgNum].setIcon(bgIcon);
    	
    }
    
    
    void createObject(int bgNum, int objX, int objY, int objWidth, int objHeight,
    		String objSource, String choice1Name, String choice2Name, String choice3Name,
    		String choice1Command, String choice2Command, String choice3Command){
    	// CREATE POP MENU
    	final JPopupMenu popMenu = new JPopupMenu();
    	JMenuItem menuItem[] = new JMenuItem[4];
    	
    	// CREATE POP MENU ITEM
    	menuItem[1] = new JMenuItem(choice1Name);
    	menuItem[1].addActionListener(gm.aHandler);
    	menuItem[1].setActionCommand(choice1Command);
    	popMenu.add(menuItem[1]);
    	
    	menuItem[2] = new JMenuItem(choice2Name);
    	menuItem[2].addActionListener(gm.aHandler);
    	menuItem[2].setActionCommand(choice2Command);
    	popMenu.add(menuItem[2]);
    	
    	menuItem[3] = new JMenuItem(choice3Name);
    	menuItem[3].addActionListener(gm.aHandler);
    	menuItem[3].setActionCommand(choice3Command);
    	popMenu.add(menuItem[3]);
    		
    	
    	// CREATE OBJECTS
    	final JLabel objectLabel = new JLabel();
    	objectLabel.setBounds(objX, objY, objWidth, objHeight);
 	  	//objectLabel.setOpaque(true);
    	//objectLabel.setBackground(Color.blue);
    	ImageIcon objIcon = new ImageIcon(getClass().getClassLoader().getResource(objSource));
    	objectLabel.setIcon(objIcon);
    	
    	objectLabel.addMouseListener(new MouseListener() {

			public void mouseClicked(MouseEvent e) {}

			public void mousePressed(MouseEvent e) {
				if(SwingUtilities.isRightMouseButton(e)) {
					popMenu.show(objectLabel, e.getX(), e.getY());
				}
			}

			public void mouseReleased(MouseEvent e) {}

			public void mouseEntered(MouseEvent e) {}

			public void mouseExited(MouseEvent e) {}
    		
    	});
    	
    	bgPanel[bgNum].add(objectLabel);
    	bgPanel[bgNum].add(bgLabel[bgNum]);
    }
    public void createArrowButton(int bgNum,int x, int y, int width, int height ,String arrowFileName, String command) {
    	ImageIcon arrowIcon = new ImageIcon(getClass().getClassLoader().getResource(arrowFileName));
    	JButton arrowButton = new JButton();
    	arrowButton.setBounds(x, y, width, height);
    	arrowButton.setBackground(null);
    	arrowButton.setContentAreaFilled(false);
    	arrowButton.setFocusPainted(false);
    	arrowButton.setIcon(arrowIcon);
    	arrowButton.addActionListener(gm.aHandler);
    	arrowButton.setActionCommand(command);
    	arrowButton.setBorderPainted(false);
    	
    	
    	bgPanel[bgNum].add(arrowButton);
    }
    public void createPlayerField() {
    	lifePanel = new JPanel();
    	lifePanel.setBounds(50, 0, 250, 50);
    	lifePanel.setBackground(Color.black);
    	lifePanel.setLayout(new GridLayout(1,5));
    	window.add(lifePanel);
    	
    	ImageIcon lifeIcon = new ImageIcon(getClass().getClassLoader().getResource("main/heart1.png"));
    	Image image = lifeIcon.getImage().getScaledInstance(35,35,Image.SCALE_DEFAULT);
    	lifeIcon = new ImageIcon(image);
    	
    	int i = 1;
    	while(i < 6) {
    		lifeLabel[i] = new JLabel();
    		lifeLabel[i].setIcon(lifeIcon);
    		lifePanel.add(lifeLabel[i]);
    		i++;
    	}
    	
    	inventoryPanel = new JPanel();
    	inventoryPanel.setBounds(650, 0 , 100, 50);
    	inventoryPanel.setBackground(Color.black);
    	inventoryPanel.setLayout(new GridLayout(1,3));
    	window.add(inventoryPanel);
    	
    	// CREATE ITEMS
    	swordLabel = new JLabel();
    	ImageIcon swordIcon = new ImageIcon(getClass().getClassLoader().getResource("main/plain-dagger.png"));
    	image = swordIcon.getImage().getScaledInstance(30,30,Image.SCALE_DEFAULT);
    	swordIcon = new ImageIcon(image);
    	swordLabel.setIcon(swordIcon);
    	inventoryPanel.add(swordLabel);
    	
    	shieldLabel = new JLabel();
    	ImageIcon shieldIcon = new ImageIcon(getClass().getClassLoader().getResource("main/dragon-shield.png"));
    	image = shieldIcon.getImage().getScaledInstance(30,30,Image.SCALE_DEFAULT);
    	shieldIcon = new ImageIcon(image);
    	shieldLabel.setIcon(shieldIcon);
    	inventoryPanel.add(shieldLabel);
    	
    	lanternLabel = new JLabel();
    	ImageIcon lanternIcon = new ImageIcon(getClass().getClassLoader().getResource("main/lantern-flame.png"));
    	image = lanternIcon.getImage().getScaledInstance(30,30,Image.SCALE_DEFAULT);
    	lanternIcon = new ImageIcon(image);
    	lanternLabel.setIcon(lanternIcon);
    	inventoryPanel.add(lanternLabel);
    	
    }
    public void createGameOverField() {
    	
    	titleLabel = new JLabel("",JLabel.CENTER);
    	titleLabel.setBounds(200,150,400,200);
    	titleLabel.setForeground(Color.red);
    	titleLabel.setFont(new Font("Time New Roman",Font.PLAIN,70));
    	titleLabel.setVisible(false);
    	window.add(titleLabel);
    	
    	restartButton = new JButton();
    	restartButton.setBounds(340,320,120, 50);
    	restartButton.setBorder(null);
    	restartButton.setBackground(null);
    	restartButton.setForeground(Color.white);
    	restartButton.setFocusPainted(false);
    	restartButton.addActionListener(gm.aHandler);
    	restartButton.setActionCommand("restart");
    	restartButton.setVisible(false);
    	window.add(restartButton);
    	
    }
    
    public void generateScene() {
    	// SCENE 1
    	createBackground(1, "main/bg4.png");
    	createObject(1, 440, 130, 200, 200, "main/hut.png","Look","Talk","Rest","lookHut", "talkHut","restHut");
    	createObject(1, 120, 180, 100, 200, "main/dragon.png","Look","Talk","Attack","lookDragon","talkDragon", "attackDragon");
    	createObject(1, 320, 190, 200, 200, "main/chest1.png","Look","Talk","Open","lookChest","talkChest","openChest");
    	createArrowButton(1, 0, 150,50,50,"main/leftArrow.png", "goScene2");
    	bgPanel[1].add(bgLabel[1]);
    	
    	//SCENE 2
    	createBackground(2, "main/caveoutside1.png");
   	    createObject(2, 60, 100, 100, 300, "main/blank.png","Look","Talk","Enter","lookCave", "talkCave","enterCave");
   	    createObject(2, 240, 250, 90, 90, "main/blank.png","Look","Talk","Search","lookRoot" ,"talkRoot","searchRoot");
    
    	createArrowButton(2, 650, 150, 50, 50, "main/rightArrow.png", "goScene1");
    	bgPanel[2].add(bgLabel[2]);
    	
    	//SCENE 3
    	createBackground(3, "main/cave.jpg");    
    	createArrowButton(3, 650, 150, 50, 50, "main/rightArrow.png", "goScene2");
    	bgPanel[3].add(bgLabel[3]);
    }    
}
