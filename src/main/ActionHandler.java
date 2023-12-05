package main;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class ActionHandler implements ActionListener {
	GameManager gm;
	public ActionHandler(GameManager gm) {
		this.gm = gm;
	}

	public void actionPerformed(ActionEvent e) {
		String yourChoice = e.getActionCommand();
		
		switch(yourChoice) {
		case "lookHut": gm.ev1.lookHut();break;
		case "talkHut": gm.ev1.talkHut();break;
		case "restHut": gm.ev1.restHut();break;
		case "lookDragon": gm.ev1.lookDragon();break;
		case "talkDragon": gm.ev1.talkDragon();break;
		case "attackDragon": gm.ev1.attackDragon();break;
		case "lookChest": gm.ev1.lookChest();break;
		case "talkChest": gm.ev1.talkChest();break;
		case "openChest": gm.ev1.openChest();break;
		case "lookCave" : gm.ev1.lookCave();break;
		case "talkCave" : gm.ev1.talkCave();break;
		case "enterCave": gm.ev1.enterCave();break;
		case "lookRoot" : gm.ev1.lookRoot();break;
		case "talkRoot" : gm.ev1.talkRoot();break;
		case "searchRoot": gm.ev1.searchRoot();break;
		// Change Scene
		
		case "goScene1": gm.sChanger.showScene1();break;
		case "goScene2": gm.sChanger.showScene2();break;
		}
	}

}
