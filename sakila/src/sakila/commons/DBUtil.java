package sakila.commons;

import java.sql.Connection;
import java.sql.DriverManager;

public class DBUtil {
	public Connection getConnection() throws Exception { // 데이터베이스 접근
		String dbAddr = "jdbc:mariadb://rigizer.iptime.org:8106/sakila";// 주소, 포트, 데이터베이스 이름
		String dbId = "goodee";											// 데이터베이스 계정 ID
		String dbPw = "java1004";										// 데이터베이스 계정 PW
		
		Connection conn;
		
		// 데이터베이스 접속
		conn = DriverManager.getConnection(dbAddr, dbId, dbPw);
		conn.setAutoCommit(false);	// AutoCommit을 비활성화

		return conn;
	}
}