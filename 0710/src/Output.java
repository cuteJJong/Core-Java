
public class Output {
	void output(Student std) {
		System.out.println("학번\t국어\t영어\t수학\t총점\t평균\t학점");
		System.out.println("-----------------------------------------------------");
		std.print();
//		System.out.printf("%-10s%5d\t%5d\t%5d\t%5d\t%7.1f\t%3c%n", 
//										std.hakbun, std.kor, std.eng, std.math, 
//										std.tot, std.avg, std.grade);
	}
}
