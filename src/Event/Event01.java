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
		
		gm.ui.messageText.setText("You rest at the hut.\n(Your life has recovered)");
		gm.player.anHanh(0, -1);
		gm.player.updatePlayerStatus();
		gm.playSE(gm.healSound);
	}
	
	public void lookDragon() {
		
		gm.ui.messageText.setText("a Knight is standing in front of you ");
	}
	
	public void talkDragon() {
		
		gm.ui.messageText.setText("Dragon : Don't go any further without a weapon!\nYou should check the chest over there!");
		gm.playSE(gm.dragon_01);
	}
	
	public void attackDragon() {
		
		try {
			if(gm.player.hasShield == 0) {
				if(gm.player.hasSword == 0) {
					if(gm.player.conSongKhong()) {
						gm.ui.messageText.setText("Dragon : Hey, don't be stupid!\n(The guard hits you back and your life decreases by 1)");
					    gm.player.anHanh(1, 1);
					    
					    gm.playSE(gm.hitSound);
					    gm.playSE(gm.dragon_02);
	
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
		catch (Exception e) {
	            System.out.println("Error loading audio file: " + e.getMessage());
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
            gm.playSE(gm.itemSound);
		}
		else {
			gm.ui.messageText.setText("There's nothing inside...");
		}
	}
	public void touchCat() {
		
		gm.ui.messageText.setText("Dragon: Good kitty :>");
	}
	
	public void lookCat() {
		
		gm.ui.messageText.setText("Dragon: ...(UwU)");
	}
	
	public void talkCat() {
		
		gm.ui.messageText.setText("Cat: Meow");
	}
	
}
