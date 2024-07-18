
public class ArrayDemo4 {

	public static void main(String[] args) {
		double [] array = {3.14, 89.5, 182.5, 69.2};
		for(int i = 0 ; i < array.length ; i++) {
			System.out.printf("%.2f%n", array[i]);
		}
		//Enhanced For		지정범위가없다. 미리 만들어져있는 배열에만 가능 Array or collection
		for (double aaa : array) {
			System.out.println(aaa);
		}
	}
}
