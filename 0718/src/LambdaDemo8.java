import java.util.Arrays;
import java.util.List;

public class LambdaDemo8 {
    public static void main(String[] args) {
        List<String> list = Arrays.asList("사과", "배", "딸기", "복숭아", "레몬", "망고", "수박");
        //listㅇ 저장된 각element를 iterate해서 출력하기
        //list 안에 전부 찍기
        //1번째 방법
        for (int i = 0; i < list.size(); i++) {
            System.out.print(list.get(i) + ",");
        }
        System.out.println();

        //2번째 방법
        //강화된 for
        for (String str : list)
            System.out.print(str + ",");
        System.out.println();

        //3번째 방법
        //forEach
        list.forEach(str -> System.out.println(str + ","));
    }
}
