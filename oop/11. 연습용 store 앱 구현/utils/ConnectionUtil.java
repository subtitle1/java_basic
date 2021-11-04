package example_11_02_transaction.utils;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;

/**
 * JDBC 드라이버를 등록하고, RDBMS와 연결된 Connection 객체를 제공하는 유틸리티 클래스다.
 * @author Mars
 *
 */
public class ConnectionUtil {

	private static final String URL = "jdbc:oracle:thin:@localhost:1521:xe";
	private static final String USER_NAME = "hr";
	private static final String PASSWORD = "zxcv1234";
	
	// 정적 초기화 블록
	// 객체 생성과 상관없이 클래스가 메모리에 로딩되는 즉시 실행된다
	// 클래스가 메모리에 로딩되는 시점은 수행문에 클래스 이름이 처음 등장하는 순간이다
	// 정적 초기화 블록은 클래스의 일생동안 단 한번만 실행된다
	// JDBC 드라이버를 JVM의 드라이버 레지스트리에 등록하는 작업도 딱 한 번만 등록되면 되기 때문에
	// 정적 초기화 블록으로 작성하였음
	static {
		try {
			Class.forName("oracle.jdbc.OracleDriver");
		} catch (ClassNotFoundException ex) {
			ex.printStackTrace();
		}
	}
	
	/**
	 * RDBMS와 연결된 새로운 Conncetion 객체를 반환한다
	 * @return	RDBMS와 연결을 담당하는 Connection 객체
	 * @throws SQLException RDBMS와의 연결이 실패하는 경우 예외가 던져진다.
	 */
	public static Connection getConnection() throws SQLException {
		return DriverManager.getConnection(URL, USER_NAME, PASSWORD);
	}
}
