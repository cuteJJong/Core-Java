//1. overshadow 변수, override 메서드는 상속되지 않는다.
//public class InheritanceDemo /*extends Object (생략되어있다.)*/{
//	public static void main(String[] args) {
//		//Mammal m = new Mammel();
//		//상속 : 자식의 자원을 쓰는 것
//		
//		Horse h = new Horse();
//		h.display();			//접근을 자식주소로
//		System.out.println(h.toString()); 				//할아버지의~		Horse@28a418fd(hashCode)
//	}
//}		
//class Mammal /*extends Object (생략되어있다.)*/{
//	public void display() {
//		System.out.println("나는 포유류");
//	}
//}
//class Horse extends Mammal{
//	@Override			//override 메서드는 상속되지 않는다.
//	//할아버지 재정의
//	public String toString() {
//		return "나는 제주말입니다.";
//	}
//	@Override			//임의로 재정의
//	public void display() {
//		super.display(); 		//부모의 	
//		System.out.println("나는 제주말이야");
//	}
//}
