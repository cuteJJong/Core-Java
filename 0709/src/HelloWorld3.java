/*
 * 다른 클래스에 있는 스태틱 변수는 속해 있는 클래스 이름으로 접근한다.
 * */

public class HelloWorld3 {
	public static void main(String[] args) {
		System.out.println(Demo1.str);
		
	}
}
class Demo1 {
	static String str = "Hello world3"; 		//class | static variable
}