//4. 부모 생성자는 상속되지 않는다.
//자식 생성자는 부모의 가본생성자만 호출한다.
//super()는 자식 생성자에서 임의로 부모 생성자를 호출할 때 사용한다.
//반드시 생성자 안에서만 사용해야 하고, 생성자안에서 반드시 첫번째 위치해야 한다.
public class InheritanceDemo3 {
	public static void main(String[] args) {
//		Sonata sonata = new Sonata("EF Sonata", 30_000_000);
//	}
}
//final class Car {
//	public Car() {
//		String name;
//		System.out.println("나는 부모의 생성자");
//	}
//}
//class Sonata extends Car {
	int price;
//	public Sonata(int price) {
//		this.price = price;
//	}
	
//	public Sonata(String name, int price) {
//		//System.out.println("나는 자식의 생성자");
//		super(name);
//		this.price = price;
//	}
	
}

