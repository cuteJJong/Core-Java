/*
 	author : 종호
 	when: 07.05
 	objective : Variable practice
 	environment : windows 10
  */
public class RandomDemo {

	public static void main(String[] args) {
		//1 ~ 10 random 숫자
		int rand = (int)(Math.random() * 10 + 1);
		System.out.println("rand = " + rand);
		switch(rand) {
			case 1 :
				System.out.println("Bananas");
				break;
			case 2 :
				System.out.println("Oranges");
				break;
			//swich에서 or 처리는 break를 빼준다.
			case 3 :
				System.out.println("Peach");
				
			case 4 :
				System.out.println("Apples");
				
			case 5 :
				System.out.println("Plums");
				break;
			case 6 :
				System.out.println("Pineapples");
				break;
			case 7 :
				break;
			default : 
				System.out.println("Nuts");
		}
	}

}
