
public class OverrideDemo {
	public static void main(String[] args) {
		//부모이름으로 자식메서드를
		Base parent = new Derived();
		parent.display();
		//Object obj = new String("Hello, World");
	}
}

//public > protected > (default) > private
/* 
 * Override된 자식 메서드에 범위는 부모 메서드보다 같거나 더 넓어야 한다.
 * */
class Base{
	public void display() {
		System.out.println("나는 부모 메서드");
	}
}
class Derived extends Base{
	@Override
	public void display() {
		System.out.println("나는 자식 메서드");
	}
}