
public class SungjukMgmt1 {

	public static void main(String[] args) {
		Student [] array = new Student[2];	// 학생 2명 배열
		java.util.Scanner sc = new java.util.Scanner(System.in);
		for(int i = 0 ; i < 2; i++) {
			array[i] = new Student();			//학생객체 생성  ex) 각 방의 주소를 만들어 주는것 0번째, 1번째 ~
			System.out.print("학번 : ");
			array[i].hakbun = sc.next();
			System.out.print("국어 : ");
			array[i].kor = sc.nextInt();
			System.out.print("영어 : ");
			array[i].eng = sc.nextInt();
			System.out.print("수학 : ");
			array[i].math = sc.nextInt();
			array[i].tot = array[i].kor + array[i].eng + array[i].math;
			array[i].avg = array[i].tot / 3.;
			//array[i].hakbun = hakbun;		//	NullPointerException error : 객체를 만들어줘야한다. student의 주소를 만들어줘야한다.
															//	5번째줄은 student가 들어갈 공간을 만든 것			
		}
		for(int i = 0 ; i < 2 ; i++) {
			System.out.printf("학번: %10s\t국어: %5d\t영어: %5d\t수학: %5d\t토탈: %5d\t평균: %10.1f%n", 
					array[i].hakbun, array[i].kor, array[i].eng, array[i].math, array[i].tot, array[i].avg);
		}
	}	
}
