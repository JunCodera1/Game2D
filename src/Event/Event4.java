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
    	    try {
    	        if (gm.bossMonster.hpBoss > 0) {
    	            gm.bossMonster.hpBoss -= gm.bossMonster.damage;
    	            gm.bossMonster.updateHealthBar();

    	            if (gm.bossMonster.hpBoss <= 0) {
    	                gm.ui.messageText.setText("Dragon: Boss has been defeated!");
    	                defeatBoss(); // Gọi phương thức để xử lý sau khi đánh bại boss
    	            }
    	        }
    	    } catch (Exception e) {
    	        e.printStackTrace();
    	    }
    	}

    	private void defeatBoss() {
    	    gm.ui.createObject(4, 100, -100, 600, 600, "main\\blank.png", "", "", "", "", "", null);
    	   
    	}


	public void summonBoss() {
	    gm.ui.messageText.setText("");
		gm.ui.createObject(4, 100, 100 , 300,300,"main\\bossEye.png", "Attack","","","attackBoss","","");		
	}




}
