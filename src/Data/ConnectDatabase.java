package Data;

import java.sql.Connection;
import java.sql.DriverManager;

public class ConnectDatabase {

	public static void main(String[] args) {
		try {
			Class.forName("com.microsoft.sqlserver.jdbc.SQLServerDriver");
			String url = "jdbc:sqlserver://LAPTOP-0ULVU2UJ\\SQLEXPRESS:1433;databaseName=TMDT";
			String userName = "sa";
			String password = "bestofadcarry1";
			
			Connection connection = DriverManager.getConnection(url, userName, password);
			System.out.println("Kết nối thành công!");
		}catch(Exception e) {
			e.printStackTrace();
		}

	}

}
