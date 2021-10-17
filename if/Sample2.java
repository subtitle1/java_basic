package example_09_01_if;

public class Sample2 {
	public static void main(String[] args) {
		// if ~ else if ~ else 문
		// 검사할 조건이 여러가지인 경우 사용되는 조건문이다.
		
		/* 시험 점수에 맞는 학점을 출력하는 프로그램
		 * 
		 * 4.6 이상 "A+"
		 * 
		 * 
		 */
		
		double score = 3.8;
		
		// if문만 사용해서 구현
//		if (score >= 4.6) {
//			System.out.println("A+");
//		} 
//		if (score >= 4.0 && score <= 4.5) {
//			System.out.println("A");
//		}
//		if (score >= 3.6 && score <= 3.9) {
//			System.out.println("B+");
//		}
//		if (score >= 3.0 && score <= 3.5) {
//			System.out.println("B");
//		}
		
		// if ~ else if를 사용해서 구현
		if (score >= 4.6) {
			System.out.println("A+");
		} else if (score >= 4.0) {
			System.out.println("A");
		} else if (score >= 3.6) {
			System.out.println("B+");
		} else if (score >= 3.0) {
			System.out.println("B");
		} else if (score >= 2.6) {
			System.out.println("C+");
		} else if (score >= 2.0) {
			System.out.println("C");
		} else if (score >= 1.6) {
			System.out.println("D+");
		} else if (score >= 1.0) {
			System.out.println("D");
		} else {
			System.out.println("F");
		}
		
	}
}
