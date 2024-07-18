
public class ArrayDemo3 {

	public static void main(String[] args) {
		//배열의 주소 복사
//		int [] original = {3, 4, 5};
//		int [] target = original;
//		target[0] = 100;
		
		//배열의 값 복사
		int [] original = {3, 4 ,5};
		int [] target = new int[10];
		//target[0] = original[0];			//배열도 2개
		System.arraycopy(original, 0, target, 7, 3);			// ? 번째 , tager 배열의 시작 위치 , 복사 개수 / 배열의 공간을 알아야한다.
		
	}

}
