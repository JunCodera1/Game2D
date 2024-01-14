package Event;

import main.GameManager;

public class Event02 {
	public GameManager gm;
	public Event02(GameManager gm){
		this.gm = gm;
	}
	public void lookCave() {
		gm.ui.messageText.setText("You look to the cave...");
	}
	public void talkCave() {
		gm.ui.messageText.setText("You hear the echo of your voice.");
	}
	public void enterCave() {
		if(gm.player.hasLantern == 0) {
			gm.ui.messageText.setText("It's too dark to enter.\n(Look at the pile of rocks...)");
		}
		else {
			gm.sChanger.showScene3();
		}
		
	}
	public void lookRoot() {
		gm.ui.messageText.setText("There's something at the tree.");
	}
	public void talkRoot() {
		gm.ui.messageText.setText("They say plant grow well if you talk to but this tree doesn't look like it needs encouragement.");
	}
	public void searchRoot() {
		if(gm.player.hasLantern == 0) {
			gm.ui.messageText.setText("You find a lantern");
			gm.player.hasLantern = 1;
			gm.player.updatePlayerStatus();
		}
		
	}
	public void meowCat() {
		gm.ui.messageText.setText("Cat: Meow");
	}
	public void curiousCat() {
		gm.ui.messageText.setText("Cat: Meow?(The cat approached the pile of rocks)");
	}
	public void recumbentCat() {
		gm.ui.messageText.setText("Cat: ...\n(The cat lies on its left side)");
	}
	public void curiousDragon() {
		gm.ui.messageText.setText("Dragon: The cat seemed curious about the pile of rocks");
	}
	public void talkDragon() {
		gm.ui.messageText.setText("Dragon: ");
	}
}
