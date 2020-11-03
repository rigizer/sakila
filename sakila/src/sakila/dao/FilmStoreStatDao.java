package sakila.dao;

import java.sql.*;
import java.util.*;

import sakila.query.*;
import sakila.service.*;
import sakila.vo.*;

public class FilmStoreStatDao {
	// 영화 재고 목록 출력
	public ArrayList<FilmStoreStat> selectSalesByFilmCategory(Connection conn) throws Exception {
		System.out.println("Debug: selectFilmStockList 실행");
		
		ArrayList<FilmStoreStat> list = new ArrayList<FilmStoreStat>();
		
		PreparedStatement stmt = conn.prepareStatement(FilmStoreStatQuery.SELECT_SALES_BY_FILM_CATEGORY);
		
		ResultSet rs = stmt.executeQuery();		// conn 접속정보를 가진 SELECT_SALES_BY_FILM_CATEGORY 쿼리를 실행. 이후 결과를 rs에 저장.
		System.out.println("Debug: rs(" + rs + ")");
		
		while(rs.next()) {
			FilmStoreStat filmStoreStat = new FilmStoreStat();
			filmStoreStat.setCategory(rs.getString("category"));
			System.out.println("Debug: category("+ rs.getString("category") +")");
			filmStoreStat.setTotalSales(rs.getFloat("total_sales"));
			System.out.println("Debug: totalSales("+ rs.getString("total_sales") +")");
			list.add(filmStoreStat);
		}
		
		return list;
	}
}