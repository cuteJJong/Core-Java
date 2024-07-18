
public class SungjukMgmt {

	public static void main(String[] args) {
		Student younghee = new Student();
		//CallbyRefDemo1 d = new CallbyRefDemo1();
		
		// class를 부르는 방법
		//Call by reference 쓰는 이유
		new Input().input(younghee);
		new Calc().calc(younghee);
		new Output().output(younghee);
		
		
		
//		d.input(younghee);			//출력 보낼 때
//		//System.out.println("영희의 국어점수 : " + younghee.kor);		//확인
//		d.calc(younghee);
//		d.output(younghee);

	}
//	void input(Student std)	{		//std = younghee, Call by ref
//		java.util.Scanner sc = new java.util.Scanner(System.in);
//		System.out.print("학번 : ");
//		std.hakbun = sc.next();
//		System.out.print("국어 : ");
//		std.kor = sc.nextInt();
//		System.out.print("영어 : ");
//		std.eng = sc.nextInt();
//		System.out.print("수학 : ");
//		std.math = sc.nextInt();
//	}		//std는 같은 이름을 가져도 상관없는 지역변수다
//	void calc(Student std) {
//		std.tot = std.kor + std.eng + std.math;
//		std.avg = std.tot / 3.;
//		std.grade = (std.avg >= 90) ? 'A' : (std.avg >= 80) ? 'B' :
//								(std.avg >= 70) ? 'C' : (std.avg >= 60) ? 'D' :
//									'F';
//	}
//	void output(Student std) {
//		System.out.println("학번\t국어\t영어\t수학\t총점\t평균\t학점");
//		System.out.println("-----------------------------------------------------");
//		System.out.printf("%-10s%5d\t%5d\t%5d\t%5d\t%7.1f\t%3c%n", 
//										std.hakbun, std.kor, std.eng, std.math, 
//										std.tot, std.avg, std.grade);
//	}
}
