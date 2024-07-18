
public class OverloadingDemo {

	public static void main(String[] args) {

	}
	
	//overloading    이름과 파라미터로 판단하기 때문에 리턴타입은 상관없다.
	void change() {}
	void change(int a) {}
	//void change(int b) {}		X		
	void change(short a) {}
	void change(double a) {}
	void change(int a, int b , int c) {}
	void change(String name, int c) {}
}
