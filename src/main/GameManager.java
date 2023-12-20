package main;

import java.sql.Statement;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;

import com.microsoft.sqlserver.jdbc.SQLServerException;

import Event.Event01;
import Event.Event02;

public class GameManager {
    ActionHandler aHandler = new ActionHandler(this);
    public UI ui = new UI(this);
    public Player player = new Player(this);
    public SceneChanger sChanger = new SceneChanger(this);

    public Event01 ev1 = new Event01(this);
    public Event02 ev2 = new Event02(this);

    public static void main(String[] args) throws SQLServerException {
        try {
            Class.forName("com.microsoft.sqlserver.jdbc.SQLServerDriver");
            String url = "jdbc:sqlserver://LAPTOP-0ULVU2UJ\\SQLEXPRESS:1433;databaseName=players;encrypt=true;trustServerCertificate=true";
            
            String userName = "sa";
            String password = "bestofadcarry1";

            Connection connection = DriverManager.getConnection(url, userName, password);
            String sql = "select * from gameCharacter";
            Statement statement = connection.createStatement();
            ResultSet rs = statement.executeQuery(sql);
            while(rs.next()) {
            	System.out.println(rs.getInt(0));
            	System.out.println(rs.getBoolean(0));
            	
            }
            System.out.println("Kết nối thành công!");
        } catch (Exception e) {
            e.printStackTrace();
        }

        new GameManager();
    }

    public GameManager() {
        player.setPlayerDefaultStatus();
        sChanger.showScene1();
    }
}
