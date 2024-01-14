package main;

public class Event6 {
	GameManager gm;
	public Event6(GameManager gm) {
		this.gm = gm;
	}
	public void exitGame() {
        // Thực hiện các công việc cần thiết khi thoát khỏi game
        // Điều này có thể bao gồm việc lưu trạng thái game, dừng âm thanh, đóng cửa sổ giao diện, v.v.
        
        System.exit(0); // Dùng để đóng ứng dụng Java
    }
}
