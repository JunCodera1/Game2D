package Event;

import main.GameManager;

public class Event5 {
	
	   GameManager gm;
	   
	   public Event5(GameManager gm) {
		   this.gm = gm;
	   }
	   
       public void supriseCat() {
    	   gm.ui.messageText.setText("Cat: Meow Meow!");
       }
       
       public void happyDragon() {
    	   gm.ui.messageText.setText("Dragon:The way out is here, I'm so happy!");
       }
       

	   
}
