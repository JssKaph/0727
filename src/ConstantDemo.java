
public class ConstantDemo {
	public static void main(String[] args) {
//		int age = 26; // int로 하면 변수를 사용하기 때문에 값이 바뀜
		final int age = 26; // 상수형
		System.out.println("age = " + age);
		//age = 36; //age는 상수이기 때문에 오류 발생
		System.out.println("age = " + age);
	}
}
