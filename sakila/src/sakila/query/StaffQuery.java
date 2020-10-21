package sakila.query;

public class StaffQuery {
	// Staff가 존재하는지 확인하는 쿼리
	// email과 password가 모두 일치하는지 여부 확인 후 email와 username을 반환
	public final static String SELECT_STAFF_BY_KEY = "select email, username from staff where email = ? and password = password(?)";
}