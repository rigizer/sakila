package sakila.dao;

import java.sql.*;

import sakila.query.*;
import sakila.service.*;
import sakila.vo.*;

public class StaffDao {
	// Staff가 존재하는지 확인하는 메소드
	public Staff selectStaffByKey(Connection conn, Staff staff) throws Exception {
		System.out.println("Debug: selectStaffByKey 실행");
		
		Staff returnStaff = null;		
		
		PreparedStatement stmt = conn.prepareStatement(StaffQuery.SELECT_STAFF_BY_KEY);
		stmt.setString(1, staff.getEmail());
		stmt.setString(2, staff.getPassword());
		
		ResultSet rs = stmt.executeQuery();		// conn 접속정보를 가진 SELECT_STAFF_BY_KEY 쿼리를 실행. 이후 결과를 rs에 저장.
		System.out.println("Debug: rs(" + rs + ")");
		
		if (rs.next()) {
			returnStaff = new Staff();
			returnStaff.setEmail(rs.getString("email"));
			System.out.println("Debug: email("+ rs.getString("email") +")");
			returnStaff.setUsername(rs.getString("username"));
			System.out.println("Debug: username("+ rs.getString("username") +")");
		}
		
		return returnStaff;
	}	
}