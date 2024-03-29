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
		gm.ui.bgPanel[4].setVisible(false);
		gm.ui.bgPanel[5].setVisible(false);
		gm.ui.bgPanel[6].setVisible(false);

		gm.ui.messageText.setText("Let's defeat the Demon and save the world\n(Right click on any object to move)");
		
		gm.stopMusic(gm.currentMusic);
		gm.currentMusic = gm.fieldMusic1;
		gm.playMusic(gm.currentMusic);
	}
	public void showScene2() {
		gm.ui.bgPanel[1].setVisible(false);
		gm.ui.bgPanel[2].setVisible(true);
		gm.ui.bgPanel[3].setVisible(false);
		gm.ui.bgPanel[4].setVisible(false);
		gm.ui.bgPanel[5].setVisible(false);
		gm.ui.bgPanel[6].setVisible(false);

	
		gm.ui.messageText.setText("You come the cave outside!");
		
		gm.stopMusic(gm.currentMusic);
		gm.currentMusic = gm.fieldMusic2;
		gm.playMusic(gm.currentMusic);
	}
	public void showScene3() {
		gm.playSE(gm.enterSound);
		gm.ui.bgPanel[1].setVisible(false);
		gm.ui.bgPanel[2].setVisible(false);
		gm.ui.bgPanel[3].setVisible(true);
		gm.ui.bgPanel[4].setVisible(false);
		gm.ui.bgPanel[5].setVisible(false);
		gm.ui.bgPanel[6].setVisible(false);


		gm.ui.messageText.setText("You enter the cave. What is waiting for you inside...\n");
		
		gm.stopMusic(gm.currentMusic);
		gm.currentMusic = gm.fieldMusic3;
		gm.playMusic(gm.currentMusic);
	}
	public void showScene4() {
		gm.ui.bgPanel[1].setVisible(false);
		gm.ui.bgPanel[2].setVisible(false);
		gm.ui.bgPanel[3].setVisible(false);
		gm.ui.bgPanel[4].setVisible(true);
		gm.ui.bgPanel[5].setVisible(false);
		gm.ui.bgPanel[6].setVisible(false);
		
		gm.ui.messageText.setText("Dragon: It's too dark here\nCat: Meow\n(Something is moving)");
		
		gm.stopMusic(gm.currentMusic);
		gm.currentMusic = gm.fieldMusic4;
		gm.playMusic(gm.currentMusic);
	}
	public void showScene5() {
		gm.ui.bgPanel[1].setVisible(false);
		gm.ui.bgPanel[2].setVisible(false);
		gm.ui.bgPanel[3].setVisible(false);
		gm.ui.bgPanel[4].setVisible(false);
		gm.ui.bgPanel[5].setVisible(true);
		gm.ui.bgPanel[6].setVisible(false);
		
		gm.ui.messageText.setText("Dragon: Looks like the exit\n Cat: Meow Meow!!!");
		gm.stopMusic(gm.currentMusic);
		gm.currentMusic = gm.fieldMusic5;
		gm.playMusic(gm.currentMusic);
	}
	public void showScene6() {
		gm.ui.bgPanel[1].setVisible(false);
		gm.ui.bgPanel[2].setVisible(false);
		gm.ui.bgPanel[3].setVisible(false);
		gm.ui.bgPanel[4].setVisible(false);
		gm.ui.bgPanel[5].setVisible(false);
		gm.ui.bgPanel[6].setVisible(true);
		
		gm.ui.messageText.setText("The trial version ends here. Thank you for playing!!!");
	}
	
	public void showGameOverScene(int currentBgNum) {
		gm.ui.bgPanel[currentBgNum].setVisible(false);
		gm.ui.titleLabel.setVisible(true);
		gm.ui.titleLabel.setText("YOU DIED");
		gm.ui.restartButton.setVisible(true);
		gm.ui.restartButton.setText("Click here to restart!");
		
		gm.stopMusic(gm.currentMusic);
		gm.playMusic(gm.gameOver);
	}
	public void existGameOverScreen() {
		gm.ui.titleLabel.setVisible(true);
		gm.ui.restartButton.setVisible(false);
		gm.player.setPlayerDefaultStatus();
	}
}
