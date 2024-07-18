
public class SungjukMgmt {
	
	public static void main(String[] args) {
		Student chulsu = new Student();		//chulsu 8byte  = 참조변수
		java.util.Scanner sc = new java.util.Scanner(System.in);
		String y_n = null;		// 지역변수 초기값 
		do {
			System.out.print("학번 : ");
			chulsu.hakbun = sc.next();
			System.out.print("국어 : ");
			chulsu.kor = sc.nextInt();
			System.out.print("영어 : ");
			chulsu.eng = sc.nextInt();
			System.out.print("수학 : ");
			chulsu.math = sc.nextInt();
			chulsu.tot = chulsu.kor + chulsu.eng + chulsu.math;
			chulsu.avg = 
					chulsu.tot / (double)3.;			//한쪽은 실수여야 결과가 실수로 나온다.
			chulsu.grade = '\0'; 	//ASCII 0 값
			
			switch((int)chulsu.avg / 10) {
				case 10: case 9: 
					chulsu.grade = 'A';
					break;
				case 8:
					chulsu.grade = 'B';
					break;
				case 7:
					chulsu.grade = 'C';
					break;
				case 6:
					chulsu.grade = 'D';
					break;
				default :
					chulsu.grade = 'F';
			}
			System.out.printf("학번:%10s\t국어:%5d\t영어:%5d\t수학:%5d\t토탈:%5d\t총점:%10.1f\t학점:%3c%n", 
										chulsu.hakbun, chulsu.kor, chulsu.eng, chulsu.math,
										chulsu.tot, chulsu.avg, chulsu.grade);
			System.out.printf("Again(y/n) : ");
			y_n = sc.next();
		} while (y_n.equalsIgnoreCase("Y"));//while(y_n.equals("Y") || y_n.equals("y"));
			//qualsIgnoreCase : 대소문자 구분없이 받을 수 있는 메소드
		System.out.println("Program is over...");
	}
}
