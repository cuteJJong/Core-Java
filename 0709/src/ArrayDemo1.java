
public class ArrayDemo1 {

	public static void main(String[] array) {			//user가 cmd 라인에서 값을 넣어 줄 때만 쓴다, java는 runtime 때 배열이 만들어진다.
		// String[] args를 왜 쓰는지
		for(int i = 0 ; i < array.length ; i++) {
			System.out.println(array[i]);
		}

	}

}
