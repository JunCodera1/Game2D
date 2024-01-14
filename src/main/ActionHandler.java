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
		       //EVENT 1
		case "lookHut": gm.ev1.lookHut();break;
		case "talkHut": gm.ev1.talkHut();break;
		case "restHut": gm.ev1.restHut();break;
		case "lookDragon": gm.ev1.lookDragon();break;
		case "talkDragon": gm.ev1.talkDragon();break;
		case "attackDragon": gm.ev1.attackDragon();break;
		case "lookChest": gm.ev1.lookChest();break;
		case "talkChest": gm.ev1.talkChest();break;
		case "openChest": gm.ev1.openChest();break;
		case "touchCat": gm.ev1.touchCat();break;
		case "lookCat": gm.ev1.lookCat();break;
		case "talkCat": gm.ev1.talkCat();break;
		
		       //EVENT 2
		case "lookCave" : gm.ev2.lookCave();break;
		case "talkCave" : gm.ev2.talkCave();break;
		case "enterCave": gm.ev2.enterCave();break;
		case "lookRoot" : gm.ev2.lookRoot();break;
		case "talkRoot" : gm.ev2.talkRoot();break;
		case "searchRoot": gm.ev2.searchRoot();break;
		       
		       // EVENT 3
		case "attackSlime": gm.ev3.attackSlime();break;
		case "lookSlime": gm.ev3.lookSlime();break;
		case "talkSlime": gm.ev3.lookSlime(); break;
		case "attackDragon1": gm.ev3.attackDragon1(); break;
		case "lookDragon1": gm.ev3.lookDragon1();break;
		case "talkDragon1": gm.ev3.talkDragon1();break;
		case "meowCat": gm.ev3.meowCat(); break;
		
		// EVENT 4
		case "attackBoss": gm.ev4.attackBoss();break;
		case "healDragon": gm.ev4.healDragon();break;
		case "summonBoss": gm.ev4.summonBoss();break;
		// Change Scene
		
		case "goScene1": gm.sChanger.showScene1();break;
		case "goScene2": gm.sChanger.showScene2();break; 
		case "goScene3": gm.sChanger.showScene3();break;
		case "goScene4": gm.sChanger.showScene4();break;
		case "goScene5": gm.sChanger.showScene5();break;
		case "goScene6": gm.sChanger.showScene6();break;
		

		
		//OTHERS
		//Exit game
		case "exitDoor": gm.ev6.exitGame();break;
		case "restart": gm.sChanger.existGameOverScreen(); gm.sChanger.showScene1();break;
		}
	}

}
