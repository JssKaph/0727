
public class HelloWorld7 {
	public static void main(String[] args) {
		// display(); //메인 안에 display가 없기 때문에 찾을 수 없다.
		Busan bs = new Busan(); 
		bs.display(); 
		
	}
}

class Busan{
	void display() { // member  method
		System.out.println("Hello, World");
	}
}