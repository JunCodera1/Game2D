package Event;

import main.GameManager;


public class Event4 {
	  GameManager gm;


	  
	  public Event4(GameManager gm){
		  this.gm = gm;
	  }
      public void talkDragon() {
    	  gm.ui.messageText.setText("It looks dangerous here, something is moving");
      }
      public void healDragon() {
    	
    	  if(gm.player.heathPotions > 0) {
				gm.ui.messageText.setText("Dragon: Luckily I was saved !(you heal 1 health)");
				gm.player.anHanh(4,-1);
				gm.player.updatePlayerStatus();
				gm.player.heathPotions--;
				gm.playSE(gm.healSound);
		  }
    	  else  {
    		  gm.ui.messageText.setText("You have used up all your health potions!");
    	  }
		 
      }
      public void attackBoss() {
    	    if (gm.player.hasSword > 0) {
    	        try {
    	            if (gm.bossMonster.hpBoss > 0) {
    	                gm.bossMonster.hpBoss -= gm.player.damage;
    	                gm.playSE(gm.hitSound);
    	                gm.ui.messageText.setText("Boss HP: " + gm.bossMonster.hpBoss);

    	                if (gm.bossMonster.hpBoss <= 0) {
    	                    gm.ui.messageText.setText("Dragon: Boss has been defeated!");
    	                    gm.stopMusic(gm.currentMusic);
    	                    gm.currentMusic = gm.victoryMusic;
    	                    gm.playMusic(gm.currentMusic);
    	                    gm.bossMonster.hideMonsterImage(4,"bossEye.png");
    	                }
    	                

    	                gm.bossMonster.bossCounterAttack(4);
    	                gm.player.updatePlayerStatus();
    	            }
          
    	        } catch (Exception e) {
    	            e.printStackTrace();
    	        }
    	    } else {
    	        gm.ui.messageText.setText("You are not armed yet!");
    	        gm.playSE(gm.hitSound);
    	        gm.bossMonster.bossCounterAttack(4);   	        
    	        gm.player.updatePlayerStatus();
    	    }
    	}


	public void summonBoss() {
		gm.ui.messageText.setText("Boss HP: " + gm.bossMonster.hpBoss);
		gm.stopMusic(gm.currentMusic);
	    gm.currentMusic = gm.bossMusic;
	    gm.playMusic(gm.currentMusic);
		if (gm.bossMonster.hpBoss <= 0) {
            gm.stopMusic(gm.currentMusic);
		    gm.currentMusic = gm.fieldMusic4;
		    gm.playMusic(gm.currentMusic);
            
        }
		gm.ui.createObject(4, 100, 100 , 300,300,"main\\bossEye.png", "Attack","","","attackBoss","","");		
	}
}
