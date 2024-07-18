/*
* jar 적용시키기
* 1.IntelliJ의 메뉴에서 File -> Project Structure를 선택
* 2.Project Setting에서 Modules를 클릭한다.
* 3.좌측의 Source, Paths, Dependencies 탭에서 Dependencies를 선택한 후, 우측의 + 버튼을 클릭한다.
* 4.JARs or directories... 를 선택
* 5.추가해야 할 디렉토리나 파일을 지정 -> 추가하였으면, OK를 선택한 후 Jar 추가를 종료
* */

//import com.example.libs.*;
//import java.util.Scanner;
//import java.util.*;
//import kr.seoul.sesac.util.libs.*;
import com.example.libs.Car;
public class ImportDemo extends Car {
    public static void main(String[] args) {
//        Finance f = new Finance();
//        HumanResource hr = new HumanResource();
//        System.out.println(f.money);
//        System.out.println(hr.salary);
        //com.example.libs.Car sonata = new com.example.libs.Car();
        Car sonata = new Car();
        System.out.println(sonata.name);
        ImportDemo id = new ImportDemo();
        System.out.println(id.price);

    }
}
