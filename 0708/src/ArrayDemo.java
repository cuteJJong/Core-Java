
public class ArrayDemo {

	public static void main(String[] args) {
		
		//primitive type 배열
//		int [] age;	//declaration			[] 개수에 따라 1차원, 2차원 ..차원
//		age = new int[4];	//creation		힙에 공간을 생성
//		
//		//assignment
//		age[0] = 6;		age[1] = 7;		age[2] = 8;		age[3] = 9;
//	
//		//initialization 과정
//		//char[] array = new char[] {'a', 'b', 'c', 'd'};
//		char[] array = {'a', 'b', 'c', 'd'};		
		
//		char[] array = null;
//		array = {'a', 'b', 'c', 'd'};	X	
		
//		char[] array = null;
//		array = new char[] {'a', 'b', 'c', 'd'};
		
//		String [] array = {"Hello", "World", "Good", "Java", "J"};
		
		//primitive type Array
//		int [] array;
//		array = new int[4];
//		array[0] = 5; 	array[1] = 6;	array[2] = 7;	array[3] = 8;
//		for(int i = 0 ; i < 4 ; i++) {
//			System.out.print("array[" +  i +"] = " + array[i] + "\t");
//		}
//		System.out.println();
 		
		
		//reference type Array
		String [] array= {"Hello", "World", "Good", "Java", "A"};		//initialization
		array[3] = "Python";			//index만 알면  해당 배열에 데이터를 바꿀 수 있다.
		for(int i = 0 ; i < 5 ; i++) {
			System.out.println("array[" + i + "] = " + array[i]);
		}
	}

}
