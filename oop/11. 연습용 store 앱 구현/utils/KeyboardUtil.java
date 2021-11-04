package example_11_02_transaction.utils;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Date;

/**
 * 키보드 입력을 읽어서 정수, 실수, 문자열, 날짜 타입으로 반환하는 기능을 제공하는 클래스다.
 * @author lee_e
 *
 */
public class KeyboardUtil {

	private static BufferedReader in;
	private static SimpleDateFormat sdf = new SimpleDateFormat("yyyy년 M월 d일 H시");
	private KeyboardUtil() {}
	static {
		in = new BufferedReader(new InputStreamReader(System.in));
	}
	
	/**
	 * 키보드 입력을 읽어서 int 타입의 값을 반환합니다.
	 * @return int 범위의 정수값
	 */
	public static int readInt() {
		try {
			return Integer.parseInt(in.readLine());
		} catch (IOException ex) {
			throw new RuntimeException(ex);
		}
	}
	
	/**
	 * 키보드 입력을 읽어서 long 타입의 값을 반환합니다.
	 * @return long 범위의 정수값
	 */
	public static long readLong() {
		try {
			return Long.parseLong(in.readLine());
		} catch (IOException ex) {
			throw new RuntimeException(ex);
		}
	}
	
	/**
	 * 키보드 입력을 읽어서 double 타입의 값을 반환합니다.
	 * @return double 범위의 실수값
	 */
	public static Double readDouble() {
		try {
			return Double.parseDouble(in.readLine());
		} catch (IOException ex) {
			throw new RuntimeException(ex);
		}
	}
	
	/**
	 * 키보드 입력을 읽어서 String 타입의 값을 반환합니다.
	 * @return String 값
	 */
	public static String readString() {
		try {
			return in.readLine();
		} catch (IOException ex) {
			throw new RuntimeException(ex);
		}
	}
	
	/**
	 * 키보드 입력을 읽어서 Date타입의 값을 반환합니다.
	 * @return Date 객체
	 */
	public static Date readDate() {
		try {
			return sdf.parse(in.readLine());
		} catch (IOException ex) {
			throw new RuntimeException(ex);
		} catch (ParseException ex) {
			throw new RuntimeException("2021년 11월 1일 11시와 같은 형식으로 입력하세요", ex);
		}
	}
	
	/**
	 * 키보드와 연결했던 리소스를 해제합니다.
	 */
	public static void close() {
		try {
			in.close();
		} catch (IOException ex) {
			throw new RuntimeException(ex);
		}
	}
}
