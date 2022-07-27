
public class CopyDemo2 {
	public static void main(String[] args) {
		Product mouse = new Product();
		mouse.price = 20000;
		Product keyboard = mouse; // 마우스의 주소를 키보드에 할당 (참조형이기 때문에 주소 복사)
		
		System.out.println("before");
		System.out.println("mouse's price = " + mouse.price);
		System.out.println("keyboard's price = " + keyboard.price);
		System.out.println("after");
		mouse.price = 100000;
		System.out.println("mouse's price = " + mouse.price);
		System.out.println("keyboard's price = " + keyboard.price);
	}
}

class Product{
	int price;
}