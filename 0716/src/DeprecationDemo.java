import java.util.Calendar;
import java.util.Date;
import java.util.GregorianCalendar;

public class DeprecationDemo {
    public static void main(String[] args) {
        Date today = new Date();
        //System.out.println(today);      //today.toString()
        int year = today.getYear();
        System.out.println(year + 1900);       //Date 클래스의 year는 1900년 기준

    }
}