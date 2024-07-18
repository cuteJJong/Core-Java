
public class Input {
	void input(Student std)	{		//std = younghee, Call by ref
		
		java.util.Scanner sc = new java.util.Scanner(System.in);
		System.out.print("학번 : ");
//		String hakbun = sc.next();
//		std.setHakbun(hakbun);
		std.setHakbun(sc.next());
		System.out.print("국어 : ");
		std.setKor(sc.nextInt());
		System.out.print("영어 : ");
		std.setEng(sc.nextInt());
		System.out.print("수학 : ");
		std.setMath(sc.nextInt());
	}		//std는 같은 이름을 가져도 상관없는 지역변수다
}
