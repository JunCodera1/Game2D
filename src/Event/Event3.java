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
	            }
	        }
	    } catch (Exception e) {
	        e.printStackTrace();
	    }
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
   public void attackDragon1() {
	   gm.ui.messageText.setText("Dragon: Don't worry, I'm fine\n(You lost 1 HP)");
   }
   public void talkDragon1() {
	   gm.ui.messageText.setText("Dragon: Let's try to destroy slime");
   }
   public void lookDragon1() {
	   gm.ui.messageText.setText("Dragon: ...");
   }
}
