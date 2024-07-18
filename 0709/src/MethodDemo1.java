/*
 * Method 를 호출하는 3가지
 * 1) Call(Pass) by name
 * 2) Call(Pass) by Value
 * 3) Call(Pass) by Reference
 * */

public class MethodDemo1 {

	public static void main(String[] args) {
		//2) Call(Pass) by Value
		MethodDemo1 md = new MethodDemo1();
		md.calcHap(10, 50);
		md.calcHap(1, 100);
		md.calcHap(50, 70);
	}
	void calcHap(int start, int end){		//	member method
		int hap = 0;
		for(int i = start ; i < end ; i++) {
			hap += i;
		}
		System.out.println(start+" 부터 " + end +" 까지의 합은 "+hap +"입니다.");
	}
}
