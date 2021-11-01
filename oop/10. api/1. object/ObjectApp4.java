package example_09_29_object;

import java.lang.reflect.Field;
import java.lang.reflect.Method;
import java.lang.reflect.Parameter;

public class ObjectApp4 {

	public static void main(String[] args) {
		Student student = new Student(100, "홍길동", "컴퓨터공학과", 3);
		
		// Object의 Class<?> getClass()는 객체의 설계도정보(클래스정보)가 포함된 Class객체를 반환한다.
		
		// student 참조변수가 참조하는 객체에 대한 설계도 정보가 포함된 Class객체를 획득한다.
		Class<?> claz = student.getClass();
		
		// 획득된 객체에서 모든 필드정보를 조회한다.
		System.out.println("### Student 객체의 모든 필드를 조회한다");
		Field[] fields = claz.getDeclaredFields();
		for (Field field : fields) {
			// 멤버변수명 조회하기
			String fieldName = field.getName();
			// 멈베변수 타입 조회하기
			String fieldType = field.getType().getName();
			System.out.println(fieldType + ", " + fieldName);
		}
		
		System.out.println();
		
		// 획득된 객체에서 모든 메소드정보를 조회한다.
		System.out.println("### Student 객체의 모든 메소드를 조회한다");
		Method[] methods = claz.getDeclaredMethods();
		for (Method method : methods) {
			String methodDescription = "";
			
			String returnType = method.getReturnType().getName();
			String name =  method.getName();
			
			methodDescription += returnType + "\t" + name;
			
			if (method.getParameterCount() > 0) {
				Parameter parameter =  method.getParameters()[0];
				String parameterType = parameter.getType().getName();
				String parameterName = parameter.getName();

				methodDescription += "(" + parameterType + " " + parameterName +")";
				
			} else {
				methodDescription += "( )";
			}
			System.out.println(methodDescription);
		}
		
	}
}
