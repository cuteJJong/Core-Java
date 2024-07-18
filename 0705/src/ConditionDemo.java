import java.util.Scanner;

public class ConditionDemo {

	public static void main(String[] args) {
		System.out.print("favorite Seasjon(spring, summer, fall, winter) : ");
		java.util.Scanner sc = new java.util.Scanner(System.in);
		String season =sc.nextLine();				//String은 값을 받는게 아니라 번지를 받아 비교하기 때문에 에러가 난다.
		
		//if문		swtch 문으로다 못 바꾼다.
//		if(season.equals("spring")) {					//equals()는 String class의 멤버 메소드이기 때문에, 주소가 필요하다.	참 거짓 return, 문자열 비교의 정석
//			System.out.println("봄 : 개나리, 진달래");
//		}else if(season.equals("summer")) {
//			System.out.println("여름 : 장미,아카시아");
//		}else if(season.compareTo("fall") == 0) {			//compareTo : 0이냐 아니냐
//			System.out.println("가을 : 백합, 코스모스");
//		}else {
//			System.out.println("겨울: 동백, 매화");
//		}
		
		//switch문	, switch 문은 다 if문으로 바꿀 수 있다.
		
		switch(season) {
			case "spring" : 
				System.out.println("봄 : 개나리, 진달래");	
				break;
			case "summer" : 
				System.out.println("여름 : 장미,아카시아");	
				break;
			case "fall" : 
				System.out.println("가을 : 백합, 코스모스");	
				break;
			default: 
				System.out.println("겨울: 동백, 매화");
				
			
			
		}
	}

}
