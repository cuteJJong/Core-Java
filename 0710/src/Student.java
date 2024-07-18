
public class Student {
	//변수는 타입선택 중요
	//public String hakbun 		이면 모두가 접근 가능 사용 X 모든 변수는 private이어야 한다.
	private String hakbun;		//Field, 속성(Attribute, Property, State)
	private int kor;
	private int eng;
	private int math;
	private int tot;
	private double avg;
	private char grade;
	
	//안쪽에서 print를 하면 std로 불러 올 필요 없다.
	public void print() {
		System.out.printf("%-10s%5d\t%5d\t%5d\t%5d\t%7.1f\t%3c%n", 
				hakbun, kor,eng, math, 
				tot, avg, grade);
	}
	
	public String getHakbun() {
		return hakbun;
	}
	public void setHakbun(String hakbun) {
		this.hakbun = hakbun;
	}
	public int getKor() {
		return kor;
	}
	public void setKor(int kor) {
		this.kor = kor;
	}
	public int getEng() {
		return eng;
	}
	public void setEng(int eng) {
		this.eng = eng;
	}
	public int getMath() {
		return math;
	}
	public void setMath(int math) {
		this.math = math;
	}
	public int getTot() {
		return tot;
	}
	public void setTot(int tot) {
		this.tot = tot;
	}
	public double getAvg() {
		return avg;
	}
	public void setAvg(double avg) {
		this.avg = avg;
	}
	public char getGrade() {
		return grade;
	}
	public void setGrade(char grade) {
		this.grade = grade;
	}
	
	
}
