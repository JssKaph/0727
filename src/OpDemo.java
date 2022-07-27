
public class OpDemo {
	public static void main(String[] args) {
		// 단항 연산자
//		int age = 25;
//		age = age + 1;
//	   	// 증감연산자 ++age or age++; 앞 뒤 상관없음, prefix operator, postfix operator (단독으로 존재할 때는 상관없으나 할당하거나 출력할때는 값이 달라진다)
//		System.out.println("age = " + age);
//		System.out.println("age = " + ++age); // prefix operator, 더하는 것을 먼저하라, 1증가해서 출력
//		System.out.println("age = " + age++); // post operator, 출력먼저, 더하는 것을 나중에 하라
//		System.out.println("age = " + age);		
		
//		int su = 345678;
//		String result = Integer.toBinaryString(su);
//		System.out.println("result = " + result);
//		int su1 = ~su;
//		result = Integer.toBinaryString(su1);
//		System.out.println("result = " + result);
//		System.out.println("su1 =" + su1);
		
//		boolean flag = 4 > 6;
//		System.out.println("flag = " + flag);
//		System.out.println("flag = " + !flag);
		
//		Student jimin = new Student(); // 객체를 인스턴트화 >> new
		
		//형 변환, Cast, Convert
		//1. Cast up, Promotion, 자동형변한,  Implicit Conversion
		double result = 5 + 3.14;
		
		//2. Cast down, Demotion, 강제형변환, Explicit Conversion
		int result1 = (int)(5 + 3.14); // 강제로 int 전환, 결과는 8, (int) << cast 연산자
		
		
		
		
	}
}
