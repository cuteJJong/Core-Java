
public class MethodDemo3 {

	public static void main(String[] args) {
		MethodDemo3 md = new MethodDemo3();
		md.print();		//주소로~
	}
	String print() {	//member method			 Ex) 0을 리턴 int 로 , 0.0을 리턴 double로, "aaaa" 리턴 String로
//		System.out.println("Hello World");
//		return "aaaa";
		//System.out.println("World");		10줄에서 리턴하니까 11줄로 갈 수 없음.
		//가능하게 하려면 조건문을 써줘야한다
		int su = 5;
		if(su % 2 == 0)
			return "aaaa";
		else {
			System.out.println("World");
			return "bbb";
		}
	}
}
