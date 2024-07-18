
public class NestedLoopDemo {

	public static void main(String[] args) {
		// 구구단
		//int dan = 5;
		int i = 1;		//i 초기화
		while(i <= 9) {		//i  조건
			int dan = 2;			//초기화
			while(dan <= 9) {	//dan조건
				System.out.printf("%d X %d = %d\t", dan, i , dan * i);			//\n = %n 가능
				dan++;		//dan 증감식
				
			}
			System.out.println();
			i++;			//i 증감식
		}
		

	}

}
