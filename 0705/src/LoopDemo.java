import java.util.Scanner;

public class LoopDemo {

	public static void main(String[] args) {

		//A ~Z까지 출력하기
		int i = 65;	// 초기화 밖으로 빼낼 수 있다. //1			// i = 90
		int count  = 0;			// 지역변수는 항상 0으로 초기화
		for( ;  i <= 90 ;  ) {			//조건식은 잊지말기 //2	// i>=65
			System.out.printf("%c\t", (char)i);			//3
			//i++;			// 증감식도 밖으로 뺼 수 있다.	//4	// i--
			count++;
			if(count % 5 == 0) {
				System.out.println();			//줄바꿈
			}
			i++;		//i -= 3;	// i = i - 3
		}
		System.out.println();

		//4의배수 5 개씩 줄 나눔
//		int count = 0;
//		for(int i = 1; i <= 100 ; i++) {
//			if(i % 4 == 0) {
//				count++;
//			}
//		}
//		System.out.printf("개수는 %d\n", count);
		
		//윤년 400년마다 , 년도를 4로 나눈값을 100으로 나누면 나머지가 생긴다.
//		Scanner sc = new Scanner(System.in);
//		int leafYear = sc.nextInt();
//		System.out.println("입력 : "  );
//		
//		if(leafYear % 400 == 0 || (leafYear % 4 ==0 && leafYear % 100 !=0 )) {		// 논리연산자를 & 하나를 써도 가능하다. 시간절약을 위해 &&는 참이어도 
//																																	//	오른쪽으로 연산을 계속 진행하기 때문에			
//			System.out.println("윤년");
//		} else {
//			System.out.println("윤년 아니다.");
//		}
		
	}

}
