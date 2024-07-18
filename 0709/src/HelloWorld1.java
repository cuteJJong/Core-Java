
public class HelloWorld1 {
	static String str = "Hello World";		//class | static variable		공유변수
	public static void main(String[] args) {
		//String str = "Hello World";		//local | stack | temporary| auto | variable	동일 클래스에 있는 스태틱 변수는 생략 가능하다.
		//static 변수는 class의 이름으로 접근한다.
		System.out.println(HelloWorld1.str);
		System.out.println(Demo.str);
	}

}
class Demo {
	static String str = "Python이 대세야"; 		//class | static variable
}
