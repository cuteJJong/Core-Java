/*
 * Method를 호출하는 3가지
 * 1) Call(Pass) by name
 * 2) Call(Pass) by Value
 * 3) Call(Pass) by Reference
 * */

public class MethodDemo {

	public static void main(String[] args) {
		//1) Call(Pass) by name
		MethodDemo md = new MethodDemo();
		md.calcHap();
	}
	void calcHap(){		//method 최소 returnType 이름 ()		member mothod
		int hap = 0;
		for(int i = 1 ; i < 101 ; i++) {
			hap += i;
		}
		System.out.println("1부터 100까지의 합은 " + hap +"입니다.");
	}
}
//Naming Convention
/*
 * 1. PascalCasing : Class, Interface, Enum
 * 2. camelCasing : variable, method
 * 3.Snake_Casing : 대소문자 구별하지 않을 때
 * 4.kebbab-Casing
 */