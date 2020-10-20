package sakila.service;

import java.util.*;
import java.sql.*;
import java.text.SimpleDateFormat;

import sakila.dao.*;
import sakila.vo.*;

public class StatsService {	
	private StatsDao statsDao;	// StatsDao 객체 선언
	
	public void countStats() {
		statsDao = new StatsDao();	// 메소드를 호출하기 위해 객체 생성
		
		final String dbUrl = "rigizer.iptime.org/sakila";
		final String dbId = "goodee";
		final String dbPw = "java1004";
		
		Connection conn = null;	// Connection 객체 메소드 전역 선언
		
		try {
			conn = DriverManager.getConnection(dbUrl, dbId, dbPw);
			conn.setAutoCommit(false);	// AutoCommit을 비활성화
			
			Calendar today = Calendar.getInstance();	// Calendar 객체 생성 (날짜 확인)
			SimpleDateFormat formater = new SimpleDateFormat("yyyy-MM-dd");	// 날짜 포맷을 임의로 설정
			String day = formater.format(today);
			System.out.println(day);	// 디버깅 (날짜 확인)
			
			Stats stats = new Stats();
			stats.setDay(day);
			
			if (statsDao.selectDay(conn, stats)) {	// 날짜를 확인하여 날짜가 존재하는 경우 (true)
				System.out.println("updateStats 메소드를 수행합니다. 기존 날짜에 데이터를 갱신하여 카운트합니다.");
				statsDao.updateStats(conn);
			} else {	// 날짜를 확인하여 날짜가 존재하지 않는 경우 (false)
				System.out.println("insertStats 메소드를 수행합니다. 오늘 날짜로 새로운 데이터를 생성합니다.");
				statsDao.insertStats(conn, stats);
			}
			
			conn.commit();	// commit
		} catch(Exception e) {
			e.printStackTrace();	// 오류가 발생해도 오류메세지를 출력
		} finally {
			try {
				conn.close();	// DB 접속을 종료
			} catch (SQLException e) {
				e.printStackTrace();	// 오류가 발생해도 오류메세지를 출력
			}	
		}
	}
}