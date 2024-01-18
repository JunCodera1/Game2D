package Event;

import javax.swing.JProgressBar;

import main.GameManager;

public class Event4 {
	  GameManager gm;
	  JProgressBar jb;
	  
	  public Event4(GameManager gm){
		  this.gm = gm;
	  }
      public void talkDragon() {
    	  gm.ui.messageText.setText("It looks dangerous here, something is moving");
      }
      public void healDragon() {
    	  
    	
      if(gm.player.playerLife != gm.player.playerMaxLife) {
			gm.ui.messageText.setText("Dragon: Luckily I was saved !(you heal 1 health)");
			gm.player.playerLife++;
			gm.player.updatePlayerStatus();
		}
		else {
			gm.ui.messageText.setText("Your life is full.");
		}
      }
      public void attackBoss() {
    	  if(gm.player.hasSword > 0) {
    	    try {
    	        if (gm.bossMonster.hpBoss > 0) {
    	            gm.bossMonster.hpBoss -= gm.player.damage;
    	            gm.bossMonster.updateHealthBar();

    	            if (gm.bossMonster.hpBoss <= 0) {
    	                gm.ui.messageText.setText("Dragon: Boss has been defeated!");
    	            }
    	        }
    	    } catch (Exception e) {
    	        e.printStackTrace();
    	    }
    	}
      }

    	


	public void summonBoss() {
	    gm.ui.messageText.setText("");
		gm.ui.createObject(4, 100, 100 , 300,300,"main\\bossEye.png", "Attack","","","attackBoss","","");		
	}




}
