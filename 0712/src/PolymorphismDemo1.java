/*
 * Child : String
 * Parent : Object
 * */
public class PolymorphismDemo1 {
	public static void main(String[] args) {
//		String str = "Hello, World";
//		Object original = str;		//자식이 부모형으로 자동 형변환
////		if(original instanceof String) 
////		System.out.println("된다.");
////		else System.out.println("안된다.");
//		
//		String target = (String)original;		//부모가 자식으로 강제 형변환
//		System.out.println(target);
		
//		Child younghee = new Child();
//		younghee.display();
		
		
		Parent jimin = new Parent();
		Child younghee = new Child();
		//부모의 주소로 자식의 메서드를 쓰는것 다형성
		jimin = younghee;
		jimin.display();
	}
}

class Parent{
	public void display() {
		System.out.println("나는 부모 메소드");
	}
}
class Child extends Parent{
	@Override
	public void display() {
		System.out.println("나는 자식 메소드");
	}
}

