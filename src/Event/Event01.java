package Event;

import main.GameManager;

public class Event01 {
	GameManager gm;
	public Event01(GameManager gm) {
		this.gm = gm;
	}
	public void lookHut() {
		gm.ui.messageText.setText("Look! This is your house");
	}
	public void talkHut() {
		gm.ui.messageText.setText("Who you are talking to ?");
	}
	public void restHut() {
		if(gm.player.playerLife != gm.player.playerMaxLife) {
			gm.ui.messageText.setText("You rest at the hut.\n(Your life has recovered)");
			gm.player.playerLife++;
			gm.player.updatePlayerStatus();
		}
		else {
			gm.ui.messageText.setText("Your life is full.");
		}
	}
	public void lookDragon() {
		gm.ui.messageText.setText("a Knight is standing in front of you ");
	}
	public void talkDragon() {
		gm.ui.messageText.setText("Dragon : Don't go any further without a weapon!\nYou should check the chest over there!");
	}
	public void attackDragon() {
		if(gm.player.hasShield == 0) {
			if(gm.player.hasSword == 0) {
				if(gm.player.playerLife != 1) {
					gm.ui.messageText.setText("Dragon : Hey, don't be stupid!\n(The guard hits you back and your life decreases by 1");
				    gm.player.playerLife--;
			//	    gm.player.updatePlayerStatus();
				}
				else if(gm.player.playerLife == 1) {
					gm.ui.messageText.setText("Dragon: What a fool.");
					gm.player.playerLife--;
		//			gm.player.updatePlayerStatus();
				}
			}
			else if(gm.player.hasSword == 1) {
				gm.ui.messageText.setText("Oh shit!\n(You have defeated the knight and gotten his shield!)");
				gm.player.hasShield += 1;
			}
			gm.player.updatePlayerStatus();
		}
		else {
			gm.ui.messageText.setText("Dragon: Just leave me alone.");
		}
	}
	public void lookChest() {
		gm.ui.messageText.setText("Wow ! We have a chest");
	}
	public void talkChest() {
		gm.ui.messageText.setText("Dragon : ...");
	}
	public void openChest() {
		if(gm.player.hasSword == 0) {
			gm.ui.messageText.setText("Knight open the chest and find a weapon!");	
            gm.player.hasSword = 1;
            gm.player.updatePlayerStatus();
		}
		else {
			gm.ui.messageText.setText("There's nothing inside...");
		}
	}
}
