
public class HelloWorld2 {
	public static void main(String[] args) {
		Test t = new Test();
		System.out.println("str = " + t.str); // t.str 와 같은 주소를 불러와야 한다. (member 변수)
	}
}
class Test{
	String str = "Hello, World";
}