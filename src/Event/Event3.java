package Event;

import main.GameManager;

public class Event3 {
   public GameManager gm;
   public Event3(GameManager gm){
	   this.gm = gm;
   }
   public void attackSlime() {
	   if(gm.player.hasSword > 0) {
	   try {
	        if (gm.bossMonster.hpSlime > 0) {
	            gm.bossMonster.hpSlime -= gm.player.damage;
	            gm.bossMonster.updateHealthBar();
                gm.ui.messageText.setText("Dragon: Simpler than i imagined\n(slime loses blood)\n" 
	            +"HP Slime: "  
	            + gm.bossMonster.hpSlime);
                
	            if (gm.bossMonster.hpSlime <= 0) {
	                gm.ui.messageText.setText("(slime has been defeated)");
	                gm.bossMonster.hideMonsterImage(3,"slime.png");
	            }
	            gm.bossMonster.bossCounterAttack(1);
	        }
	        
	        
	    } catch (Exception e) {
	        e.printStackTrace();
	    }
	   }
	   else {
		   gm.ui.messageText.setText("You are not armed yet!");
		   gm.player.playerLife--;
		   gm.player.updatePlayerStatus();
	   }
   }
   public void talkSlime() {
	   gm.ui.messageText.setText("Slime :...");
   }
   public void lookSlime() {
	   gm.ui.messageText.setText("Dragon: a Slime, the challenge seems simple...");
   }
   public void lookCat() {
	   gm.ui.messageText.setText("Dragon: my cat is so cute");
   }
   public void scaredCat() {
	   gm.ui.messageText.setText("Cat: Meowwwwwww!");
   }
   public void meowCat() {
	   gm.ui.messageText.setText("Cat: Meow...");
   }
   public void healDragon1() {
 	
 	  if(gm.player.playerLife != gm.player.playerMaxLife && gm.player.heathPotions > 0) {
				gm.ui.messageText.setText("Dragon: Luckily I was saved !(you heal 1 health)");
				gm.player.playerLife++;
				gm.player.updatePlayerStatus();
				gm.player.heathPotions--;
		  }
 	  if(gm.player.heathPotions <= 0) {
 		  gm.ui.messageText.setText("You have used up all your health potions!");
 	  }
		  else {
				gm.ui.messageText.setText("Your life is full.");
		  }
   }
   public void talkDragon1() {
	   gm.ui.messageText.setText("Dragon: Let's try to destroy slime");
   }
   public void lookDragon1() {
	   gm.ui.messageText.setText("Dragon: ...");
   }
}
