
public class VariableArgumentDemo {
	public static void main(String[] args) {
		VariableArgumentDemo vad = new VariableArgumentDemo();
		// 가변인자 보내는 법 배열로
		//int [] array = {3, 4, 5};
//		vad.change(array);
		
		//배열이 아닐 때
		//int a = 5, b = 2, c = 23, d = 4213;
		
		//type도 가변일 때
		int a =5;
		char b = 'b';
		boolean c = true;
		double avg = 89.5;
		String name = "한지민";
		vad.change(a,b,c,avg,name);		//argument, 인자(인수)			| 호출할 때 쓰는
	}
	
//	void change(int [] A) {		//parameter, 매개변수
	
	//배열처럼 받는 방식
//	void change(int ...A) {		//parameter, 매개변수
	
	//type 가변일 때	| 
	void change(Object ...A) {		//parameter, 매개변수
		//for(int su : A) {
		for(Object su : A) {
			System.out.println(su);
		}
	}
}
