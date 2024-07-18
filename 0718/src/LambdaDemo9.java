import java.util.HashMap;
import java.util.Iterator;
import java.util.Map;

/*
* Map에서 사용하는 forEach
*
*/
public class LambdaDemo9 {
    public static void main(String[] args) {
        Map<String, String> map = new HashMap<String, String>();
        //map 넣을 때 put 뽑을 때 get
        map.put("Language", "Java");
        map.put("DB", "MySQL");
        map.put("Framework", "Spring Boot");
        map.put("Front End", "React");
        map.put("Cloud", "AWS");

        //1번째 방법
        //Map에 저장된 Key를 이용하여 각 Value 출력하기
/*        Iterator<String> keys =  map.keySet().iterator();
        while(keys.hasNext()) {
            String key = keys.next();
            System.out.println(key + "=>" + map.get(key));
        }
 */
        //2번째 방법
        //lambda
        map.forEach((key, value) -> System.out.println(key + "=>" + value));

    }
}
