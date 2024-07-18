class Product {
	int price;
}
public class MethodDemo2 {
	public static void main(String[] args) {
		//2) Call(Pass) by Value			 단점 : 공간이 2개가 만들어지기 때문에 값 복사는 바뀌지 않는다
		MethodDemo2 md = new MethodDemo2();
		Product ballpen = new Product();
		ballpen.price = 100;
		System.out.println("before = "   + ballpen.price);
		//md.change(ballpen.price);		//price는 정수(primitive)이니 call by value이다
		md.change(ballpen);					//Call by Reference는 주소로 넘겨줘야한다.
		//int original = 100;
		//md.print(original);		//Call(Pass) by Value
		System.out.println("after = "   + ballpen.price);
	}
	void change(Product pencil) {			//pencil = ballpen
		pencil.price = 50000;
	}		
//	void print(int target) {		//targer = original
//		System.out.println("target = " + target);
//		target = 50000;
//		System.out.println("target = " + target);
//	}
}
