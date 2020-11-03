package sakila.query;

public class FilmStoreStatQuery {
	// 매장 통계 출력
	// 카테고리 별 매출액을 반환
	public final static String SELECT_SALES_BY_FILM_CATEGORY = "select category, total_sales from sales_by_film_category";
}