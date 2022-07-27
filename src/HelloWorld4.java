
public class HelloWorld4 {
	public static void main(String[] args) {
		System.out.println("msg = " + Demo.msg); // 멤버 변수가 아닌 클래스 변수
	}
}

class Demo {
	static String msg = "Hello, World"; // static 이기 때문에 주소로 호출 안됨
}