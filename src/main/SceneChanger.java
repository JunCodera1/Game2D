package main;

public class SceneChanger {
	GameManager gm;
	public SceneChanger(GameManager gm) {
		this.gm = gm;
	}
	
	public void showScene1() {
		gm.ui.bgPanel[1].setVisible(true);
		gm.ui.bgPanel[2].setVisible(false);
		gm.ui.bgPanel[3].setVisible(false);
		gm.ui.messageText.setText("Let's defeat the Demon and save the world");
	}
	public void showScene2() {
		gm.ui.bgPanel[1].setVisible(false);
		gm.ui.bgPanel[2].setVisible(true);
		gm.ui.bgPanel[3].setVisible(false);
		gm.ui.messageText.setText("You come the cave outside!");
	}
	public void showScene3() {
		gm.ui.bgPanel[1].setVisible(false);
		gm.ui.bgPanel[2].setVisible(false);
		gm.ui.bgPanel[3].setVisible(true);
		gm.ui.messageText.setText("You enter the cave. What is waiting for you inside...\n\n"
		       + "*** This is the end of the demo. Thank you for playing !!! ***");
	}
}
