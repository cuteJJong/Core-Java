import java.util.Scanner;

public class Bmi {

	public static void main(String[] args) {
		System.out.printf("이름을 입력하세요 : ");
		Scanner sc = new Scanner(System.in);
		String name = sc.nextLine();
		
		System.out.printf("신장(cm)을 입력하세요 : ");
		double height = sc.nextDouble();
		
		System.out.printf("몸무게(kg)을 입력하세요 : ");
		double weight = sc.nextDouble();
		
		double bmi = weight / (height * height) * 10000;
		
		System.out.printf("%s님은 BMI지수 %.1f이고", name, bmi);
		
	
		if(bmi >= 18.5 && bmi <= 22.5) {
			System.out.println("정상");
		} else if(bmi >= 23 && bmi <= 25){
			System.out.println("비만전단계");
		} else if(bmi >= 25 && bmi <= 30){
			System.out.println("1단계 비만");
		} else if(bmi >= 30 && bmi <= 35){
			System.out.println("2단계 비만");
		} else if(bmi >= 35){
			System.out.println("3단계 비만");
		} else {
			System.out.println("저체중");
		}
	}

}
