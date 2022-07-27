
public class HelloWorld1 {
	String str = "Hello, World"; // 지역변수가 아님, class에 속해 있으나 인스턴트에 속해있지 않은 변수 (멤버 변수)
	public static void main(String[] args) {
		// 세가지의 변수가 있다
		// Local Variable
		// String str = "Hello, World"; // 지역 변수, 중괄호(블록) 안에서만 사용할 수 있는 변수
		//오류 String str;, int age; // 지역변수는 반드시 사용하기 전에 초기화 해야한다.
		HelloWorld1 hw = new HelloWorld1(); // 멤버변수는 new 라는 연산자의 의해 주소가 생성되어야 한다.
		 System.out.println("str = " +hw.str);
	}
}
