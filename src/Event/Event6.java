package Event;

import main.GameManager;

public class Event6 {
	GameManager gm;
	public Event6(GameManager gm) {
		this.gm = gm;
	}
	public void exitGame() {
     
        System.exit(0); // Dùng để đóng ứng dụng Java
    }
	public void happyDragon() {
 	   gm.ui.messageText.setText("Dragon: Ahead is a forest, let's explore what it has to offer");
    }
}
