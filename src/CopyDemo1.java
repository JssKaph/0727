
public class CopyDemo1 {
	public static void main(String[] args) {
		Car sonata = new Car();
		sonata.price = 25_000_000;
		
		Car matiz = new Car();
		matiz.price = sonata.price; // 단순 값 복사
		
		System.out.println("before");
		System.out.println("sonata's price = " + sonata.price);
		System.out.println("matiz's price = " + matiz.price );
		
		System.out.println("after");
		sonata.price = 100_000_000;
		System.out.println("sonata's price = " + sonata.price);
		System.out.println("matiz's price = " + matiz.price );

	}

}

class Car{
	int price ;
}