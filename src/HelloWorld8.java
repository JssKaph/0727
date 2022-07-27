
public class HelloWorld8 {
	public static void main(String[] args) {
		Seoul.display();
		Daegu.display();
		Kwangju.display();
	}
}

class Seoul{
	static void display() { // static method, class method
		 System.out.println("Hello, World");
		}
}

class Daegu{
	static void display() { // static method, class method
		 System.out.println("안녕, 세계여!!!");
		}
}

class Kwangju{
	static void display() { // static method, class method
		 System.out.println("안녕, 광주여!!!");
		}
}
// 자바는 주소를 가지고 접근하는것, 주소 없이 접근하는법 두 가지가 있다

