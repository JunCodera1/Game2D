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
	}
	public void lookDragon() {
		gm.ui.messageText.setText("a Dragon is standing in front of you ");
	}
	public void talkDragon() {
		gm.ui.messageText.setText("Dragon : Don't go any further without a weapon!\nYou should check the chest over there!");
	}
	public void attackDragon() {
		gm.ui.messageText.setText("Dragon : Hey, don't attack me!");
	}
	public void lookChest() {
		gm.ui.messageText.setText("Wow ! We have a chest");
	}
	public void talkChest() {
		gm.ui.messageText.setText("Dragon : ...");
	}
	public void openChest() {
		gm.ui.messageText.setText("Dragon open the chest and find a weapon!");	
	}
	public void lookCave() {
		gm.ui.messageText.setText("You look to the cave...");
	}
	public void talkCave() {
		gm.ui.messageText.setText("Wow! this cave so large");
	}
	public void enterCave() {
		gm.ui.messageText.setText("Let's go into the cave");
	}
	public void lookRoot() {
		gm.ui.messageText.setText("");
	}
	public void talkRoot() {
		gm.ui.messageText.setText("");
	}
	public void searchRoot() {
		gm.ui.messageText.setText("");
	}
}
