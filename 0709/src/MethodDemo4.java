public class MethodDemo4 {

	public static void main(String[] args) {
		MethodDemo4 md = new MethodDemo4();
		int result= md.calcHap(10, 50);		//리턴되는 값을 받아야하기 위해	int result를 써준다.
		System.out.println(result);
		result = md.calcHap(1, 100);
		System.out.println(result);
		result = md.calcHap(50, 70);
		System.out.println(result);
	}
	int calcHap(int start, int end){		//	member method	hap 정수니까 int
		int hap = 0;
		for(int i = start ; i <= end ; i++) {
			hap += i;
		}
		return hap;
	}
}
