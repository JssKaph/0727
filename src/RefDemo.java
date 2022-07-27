import java.util.Scanner;

public class RefDemo {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.print("이름 : ");
		String name = sc.nextLine();
		
		System.out.print("나이 : ");
		int age = sc.nextInt();
		
		Student hojun = new Student();
		hojun.name = name;
		hojun.age = age;
	}
}
