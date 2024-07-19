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
