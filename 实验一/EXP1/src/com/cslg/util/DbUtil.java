package com.cslg.util;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;

public class DbUtil {
	private String url = "jdbc:mysql://localhost:3306/user";
	private String user = "root";
	private String password = "111111";
	private Connection con = null;

	public DbUtil() {
		try {
			// 1.鍔犺浇椹卞姩绋嬪簭
			Class.forName("com.mysql.jdbc.Driver");
			// 2. 鑾峰緱鏁版嵁搴撹繛鎺�
			con = DriverManager.getConnection(url, user, password);
		} catch (ClassNotFoundException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		} catch (SQLException e) {
			e.printStackTrace();
		}

	}

	public Connection getConnection() {
		return con;
	}
	public void closeConnecction() throws SQLException {
		con.close();
	}
}
