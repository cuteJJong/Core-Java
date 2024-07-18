
public class AbstractDemo {
	public static void main(String[] args) {
		
		//추상클래스라 error		Tiger t = new Tiger();
		Tiger t = new Lion();
		t.display();
	}
}

//추상 클래스
//추상 클래스는 정상적인 메소드와 추상적인 메소드가 같이 있어도 된다.
//abstract class Tiger {
//	public void print() {
//		System.out.println("나는 정상적인 메소드");
//	}
//	public void display(){}
//	//public abstract void display();
//}


//하나라도 abstract가 있으면 추상메서드이다.
abstract class Tiger {
	public void print() {
		System.out.println("나는 정상적인 메소드");
	}
	public abstract void display();
	//public abstract void display();
}


class Lion extends Tiger{
	public void display() {
		System.out.println("나는 자식메서드");
	}
}