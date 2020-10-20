package sakila.dao;

import java.sql.*;
import sakila.vo.*;

public class StatsDao {
	// 오늘 날짜가 있는지 없는지 확인하기 위한 메소드
	// boolean을 통해 true라면 updateStats로, false라면 insertStats로
	public boolean selectDay(Connection conn, Stats stats) throws Exception {
		/*
		if (rs.next()) {
			return true;	// updateStats
		}
		*/
		
		return false;	// insertStats
	}
	
	// 방문수 입력을 위한 메소드 (동일 날짜가 없는 경우 새로운 날짜를 생성)
	public void insertStats(Connection conn, Stats stats) throws Exception {
		
	}
	
	// 방문수 수정을 위한 메소드 (동일 날짜가 있는 경우)
	// 무조건 +1을 하기 위해 만들었으므로 Stats는 받아오지 않는다
	public void updateStats(Connection conn) throws Exception {
		
	}
}