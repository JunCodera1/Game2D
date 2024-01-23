package main;

public class Player {
	GameManager gm;


	private boolean conSong;
	private int playerMaxLife;
	private int playerLife;
	
	public int hasSword;
	public int hasShield;
	public int hasLantern;
	
	public int damage;
	public int shieldPoint;
	public int heathPotions;
	
	
	public Player(GameManager gm) {
		this.gm = gm;
	}

	public void anHanh(int man, int dam) {
		playerLife -= dam;
		if (playerLife <= 0) {
            gm.sChanger.showGameOverScene(man); // Game over if player's life is 0 or less
            gm.ui.messageText.setText("Dragon: What a fool.");
            conSong = false;
		}
		else if (playerLife > playerMaxLife) playerLife = playerMaxLife;
	}
	
	public boolean conSongKhong() {
		return conSong;
	}
	
	public void setPlayerDefaultStatus() {
		conSong = true;
		playerMaxLife = 7;
		playerLife = 7;
		hasSword = 0;
		hasShield = 0;
		hasLantern = 0;
		damage = 15;
		shieldPoint = 10;
		heathPotions = 3;
		updatePlayerStatus();
		
	}
	public void updatePlayerStatus() {
		// REMOVE ALL LIFE ICON
		int i = 1;
		while(i < 8) {
			gm.ui.lifeLabel[i].setVisible(false);
			i++;
		}
		int lifeCount = playerLife;
		while(lifeCount != 0) {
			gm.ui.lifeLabel[lifeCount].setVisible(true);
			lifeCount--;
		}
		
		// CHECK PLAYER ITEMS
		if(hasSword == 0) {
			gm.ui.swordLabel.setVisible(false);
		}
		if(hasSword == 1) {
			gm.ui.swordLabel.setVisible(true);
		}

		if(hasShield == 0) {
			gm.ui.shieldLabel.setVisible(false);
		}
		if(hasShield == 1) {
			gm.ui.shieldLabel.setVisible(true);
		}
		if(hasLantern == 0) {
			gm.ui.lanternLabel.setVisible(false);
		}
		if(hasLantern == 1) {
			gm.ui.lanternLabel.setVisible(true);
		}

		
	}
}
