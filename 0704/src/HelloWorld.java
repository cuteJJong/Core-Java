/*
 	author : 종호
 	when: 07.04
 	objective : 
 	environment : windows 10
  */
/* 파일안에 여러 클래스 불가
 
 */
public class HelloWorld {
		public static void main(String [] args){ 		//String : 배열, args : 매개 변수
			java.util.Scanner sc = new java.util.Scanner(System.in);			// 스캐너가 ㅊ
			System.out.print("당신의 이름은 ? : ");
			String name = sc.nextLine();
			System.out.printf("귀하의 이름은 %s 입니다. \n", name);
		}
}
