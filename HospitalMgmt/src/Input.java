/*
 * 작성자: 박종호
 * 작성일: 2024-07-19
 * 작성목적:병원관리프로그램 - Output
 * 작성환경:windows 11 10.0 build 22631
 *        JDK 17.0.11
 *        intellij for Java Developers Version : 2024 -06
 * */
import java.util.Scanner;

public class Input {
    // 환자 정보를 입력받는 메서드
    public static Hospital inputPatient(Scanner scanner) {
        System.out.print("번호: ");
        int number = scanner.nextInt();
        System.out.print("진료코드: ");
        String departmentCode = scanner.next();
        System.out.print("입원일수: ");
        int days = scanner.nextInt();
        System.out.print("나이: ");
        int age = scanner.nextInt();

        return new Hospital(number, departmentCode, days, age);
    }

    // 입력/출력 동작을 묻는 메서드
    public static String promptAction(Scanner scanner) {
        System.out.print("입력/출력 (I/O)? ");
        return scanner.next();
    }
}
