
public class HelloWorld3 {
	// String str = "Hello, World"; // 멤버 변수
	static String str = "Hello, World"; //멤버 변수가 아닌 static을 사용한 공유 변수이다, static variable or class variable, 주소 접근 없이 사용 가능
	
	public static void main(String[] args) {
	//	String str = "Hello, World"; // local variable
		System.out.println("str = " + str);
	}
}
