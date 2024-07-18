
public class DoDemo {

	public static void main(String[] args) {
		// 4!  = 4 * 3 * 2 * 1
		//do문
		String y_n = null;		//참조변수 초기화방법
		java.util.Scanner sc = new java.util.Scanner(System.in);
		do {
			System.out.printf("몇 Factorial ? : ");
			int su = sc.nextInt();
			int answer = 1;
			for (int i = su ; i > 0 ; i--) {
				answer *= i;
			}
			System.out.println(su + "! =" + answer);
			System.out.println("Again(y/n) ? ");			
			y_n = sc.next();		// 문자열 비교
		} while (y_n.equals("Y") || y_n.equals("y"));		//예외처리부분			//대소문자 같이 받는 법
		System.out.println("끝났습니다");
	}

}
