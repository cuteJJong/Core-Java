//2. private 멤버는 상속되지 않는다.
public class InheritanceDemo1 {
	public static void main(String[] args) {
		Frog f  = new Frog();
		//.name = "개구리";			private 상속 x
	}
}
class 양서류 {
	private String name;
	int weight;
}
class Frog extends 양서류 {
	
}
