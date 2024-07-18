import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class ArraysDemo {
    public static void main(String[] args) {
//        List<Integer> list = Arrays.asList(4, 6, 8, 1, 2);
//        List<String> list1 = Arrays.asList("한지민", "홍지민", "김지민", "박지민");
        int [] array = {5,7,1,2,7,2,9,5};
        Arrays.sort(array);     //오름차순 정렬만 한다.
        for (int a : array)
            System.out.print(a + ",");

    }
}
