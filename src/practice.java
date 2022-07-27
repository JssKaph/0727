import java.util.Scanner;

public class practice {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in); //스캐너 사용을 위한 스캔 초기화
		Employee em = new Employee(); //사원 만들기 클래스 초기화
		
		System.out.print("사원번호 입력 : "); //입력을 받을때는 가급적 print
		em.empno = sc.nextInt();
		sc.nextLine(); // nextInt 뒤에는 sc.nextLine();, 엔터 날리기
		System.out.print("사원이름 입력 : ");
		em.ename = sc.nextLine();		
		System.out.print("사원출생년도 입력 : ");
		em.birthYear = sc.nextInt();	
		System.out.print("사원월급 입력 : ");
		em.salary = sc.nextInt();	
		sc.nextLine();
		System.out.print("사원이메일 입력 : ");
		em.email = sc.nextLine();
		System.out.print("사원전화번호 입력 : ");
		em.tel = sc.nextLine();
		System.out.print("정규직여부 입력 : ");
		em.flag = sc.nextBoolean();
		
		em.birthYear = 2023-em.birthYear;
		
		System.out.printf("<<사원 정보>>\n");
		System.out.printf("사원번호 : %d\n", em.empno);
		System.out.printf("사원이름 : %s\n", em.ename);
		System.out.printf("사원나이 : %d\n", em.birthYear);
		System.out.printf("사원월급 : %d만원\n", em.salary);
		System.out.printf("사원이메일 : %s\n", em.email);
		System.out.printf("사원전화번호 : %s\n", em.tel);
		System.out.printf("정규직 : %s\n", em.flag);
		
		System.out.println("<<사원 정보>>");
		System.out.println("사원번호 : " + em.empno);
		System.out.println("사원이름 : " + em.ename);
		System.out.println("사원나이 : " + em.birthYear);
		System.out.println("사원월급 : " + em.salary + "만원");
		System.out.println("사원이메일 : " + em.email);
		System.out.println("사원전화번호 : " + em.tel);
		System.out.println("정규직 : " + em.flag);	
	}
}
