
public class MethodAcceseDemo {
	public static void main(String[] args) {
//		int su = 345678; //10진수
//		String result = Integer.toBinaryString(su); // static 이므로 주소 없이 사용 가능
//		System.out.println(result);
//		result = Integer.toHexString(su);
//		System.out.println(result);
		
		String msg = "Hello";
		char ch = msg.charAt(0); // static이 아니기 때문에 주소로 접근해야 함, charAt(x) x번째 글자 표시
		System.out.println("ch = " + ch );
	}
}
