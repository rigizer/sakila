package sakila.dao;

import java.sql.*;
import java.util.*;

import sakila.query.*;
import sakila.service.*;
import sakila.vo.*;

public class CustomerListDao {
	// 회원 목록 출력
	public ArrayList<CustomerList> selectCustomerList(Connection conn, int currentPage, int pagePerRow) throws Exception {
		System.out.println("Debug: selectCustomerList 실행");
		
		ArrayList<CustomerList> list = new ArrayList<CustomerList>();
		
		PreparedStatement stmt = conn.prepareStatement(CustomerListQuery.SELECT_CUSTOMER_LIST);
		stmt.setInt(1, currentPage);
		stmt.setInt(2, pagePerRow);
		
		ResultSet rs = stmt.executeQuery();		// conn 접속정보를 가진 SELECT_CUSTOMER_LIST 쿼리를 실행. 이후 결과를 rs에 저장.
		System.out.println("Debug: rs(" + rs + ")");
		
		while(rs.next()) {
			CustomerList customerList = new CustomerList();
			customerList.setCustomerId(rs.getInt("ID"));
			System.out.println("Debug: customerId("+ rs.getInt("ID") +")");
			customerList.setName(rs.getString("name"));
			System.out.println("Debug: name("+ rs.getString("name") +")");
			customerList.setPhone(rs.getString("phone"));
			System.out.println("Debug: phone("+ rs.getString("phone") +")");
			customerList.setNotes(rs.getString("notes"));
			System.out.println("Debug: notes("+ rs.getString("notes") +")");
			customerList.setOverdue(rs.getString("overdue"));
			System.out.println("Debug: overdue("+ rs.getString("overdue") +")");
			list.add(customerList);
		}
		
		return list;
	}
	
	// 회원 목록의 데이터가 몇 개나 있는지 합계를 출력
	public int countCustomerList(Connection conn) throws Exception {
		System.out.println("Debug: countCustomerList 실행");
		int count = 0;
		
		PreparedStatement stmt = conn.prepareStatement(CustomerListQuery.COUNT_CUSTOMER_LIST);
		
		ResultSet rs = stmt.executeQuery();		// conn 접속정보를 가진 COUNT_CUSTOMER_LIST 쿼리를 실행. 이후 결과를 rs에 저장.
		System.out.println("Debug: rs(" + rs + ")");
		
		if(rs.next()) {
            count = rs.getInt("count(*)");
        }
		
		return count;
	}
}