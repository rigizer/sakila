package sakila.service;

import java.util.*;
import java.sql.*;
import java.text.SimpleDateFormat;

import sakila.dao.*;
import sakila.vo.*;
import sakila.commons.*;

public class StatsService {	
	private StatsDao statsDao;	// StatsDao 객체 선언
	
	private Stats getToday() {
		Calendar today = Calendar.getInstance();	// Calendar 객체 생성 (날짜 확인)
		System.out.println("Debug: today(" + today + ")");
		SimpleDateFormat formater = new SimpleDateFormat("yyyy-MM-dd");	// 날짜 포맷을 임의로 설정
		String day = formater.format(today.getTime());
		System.out.println("Debug: day(" + day + ")");	// 디버깅 (날짜 확인)
		
		Stats stats = new Stats();
		stats.setDay(day);
		System.out.println("Debug: stats(" + stats + ")");
		
		return stats;
	}
	
	public Stats getStats() {
		Stats returnStats = null;
		
		statsDao = new StatsDao();	// 메소드를 호출하기 위해 객체 생성		
		Connection conn = null;	// Connection 객체 메소드 전역 선언
		
		try {
			DBUtil dbUtil = new DBUtil();	// 데이터베이스 정보가 담긴 객체 생성
			conn = dbUtil.getConnection();	// 데이터베이스 접속
			
			Stats stats = this.getToday();
			System.out.println("Debug: this.getToday() 실행");
			
			returnStats = statsDao.selectDay(conn, stats);
			conn.commit();
		} catch(Exception e) {
			try {
				conn.rollback();
			} catch (SQLException e1) {
				e1.printStackTrace();
			}
			e.printStackTrace();
		} finally {
			try {
				conn.close();	// DB 접속을 종료
			} catch (SQLException e) {
				e.printStackTrace();	// 오류가 발생해도 오류메세지를 출력
			}	
		}
		
		return returnStats;
	}
	
	public void countStats() {
		statsDao = new StatsDao();	// 메소드를 호출하기 위해 객체 생성
		Connection conn = null;	// Connection 객체 메소드 전역 선언
		
		try {
			DBUtil dbUtil = new DBUtil();	// 데이터베이스 정보가 담긴 객체 생성
			conn = dbUtil.getConnection(); // 데이터베이스 접속
			
			Stats stats = this.getToday();
			
			if (statsDao.selectDay(conn, stats) != null) {	// 날짜를 확인하여 날짜가 존재하는 경우 (null이 아닌 경우)
				System.out.println("updateStats 메소드를 수행합니다. 기존 날짜에 데이터를 갱신하여 카운트합니다.");
				statsDao.updateStats(conn, stats);
			} else {	// 날짜를 확인하여 날짜가 존재하지 않는 경우 (null인 경우)
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