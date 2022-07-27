
public class StringDemo {
	public static void main(String[] args) {
//		String name;		 // 선언 declaration, 값을 넣지 않고 주소만 넣을 것
//		name = "한지민"; // 할당 assignment
//		String name = "한지민"; // 초기화 initialization, 한번에 함
//		System.out.printf("이름 = %s\n", name);
//		스트링은 new 쓰지않고 바로 사용가능 (자바가 대신 해주는 것)
//		--------------------------------------------------------------------------------------
		String name = new String("한지민"); // Constructor 생성자, new 사용 시 바로 선언 가능
//		System.out.printf("이름 = %s\n", name); // 문자열 출력 : %s
//		--------------------------------------------------------------------------------------
		Student jimin; // 선언 declaration, student에 넣겠다
		jimin = new Student(); // 할당 Assingment, 생성자 이기 때문에 () 사용
		jimin.hakbun = "2022-001"; // ex) 지민 이라는 1000번째 주소에 학번이라는 방, 주소의 주소, 주소만 넣어야 하기 때문에 프로그램에서 넣어 줌
// 		참조형은 사이즈의 차이가 없다, 전부 똑같다
		jimin.age = 26;
		jimin.name = "한지민";	// 한지민 번지
		
		Student chulsu = new Student();
		chulsu.name = "김철수"; // 김철수 번지
		chulsu.age =36;
		
		Student younghee = new Student();
		younghee.name = "이영희"; // 이영희 번지
		younghee.age = 46;
		
		System.out.println("한지민 학생 정보");
		System.out.printf("이름 : %s, 나이 : %d\n", jimin.name, jimin.age);
		System.out.println("김철수 학생 정보");
		System.out.printf("이름 : %s, 나이 : %d\n", chulsu.name, chulsu.age);
		System.out.println("이영희 학생 정보");
		System.out.printf("이름 : %s, 나이 : %d\n", younghee.name, younghee.age);
	}
}
