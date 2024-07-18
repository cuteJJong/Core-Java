/*
 	author : 종호
 	when: 07.05
 	objective : Variable practice
 	environment : windows 10
  */
public class VariableDemo {				//VariableDemo의 member는 static이 없는 eng만 있다.
	int eng = 100;		//instance variable 앞에 static 없음
	static int math = 80 ;		// class variable 앞에 static 있음

	public static void main(String[] args) {
		//int kor ;	//local variables, 지역변수는 반드시 초기화해야 사용가능
		int kor = 90;
		System.out.printf("수학 점수 = %d\n", math);		//= System.out.printf("수학 점수 = %d\n", VariableDemo.math);	
																						// System.out.printf("수학 점수 = %d\n", Demo.math); 불어올 때  class명을 붙여줘야한다.
		
		
		System.out.printf("수학 점수 = %d\n", kor);		//main이 실행될 때 올라온다
		//System.out.printf("수학 점수 = %d\n", eng);
		
		//VariableDemo의 eng를 불러오기위한 과정
		VariableDemo vd = new VariableDemo();
		System.out.printf("영어 점수 = %d\n", vd.eng);		//vd가 eng 주소를 찾아 값을 가져온다.
		
		//Demo eng 를 불러오는 과정
		Demo d= new Demo();
		System.out.printf("영어 점수 = %d\n", d);	
	}

}

class Demo {
	static int math = 80 ;		//Demo 소속
	int eng = 50;			//
}
