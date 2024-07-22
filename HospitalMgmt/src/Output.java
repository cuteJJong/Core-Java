/*
 * 작성자: 박종호
 * 작성일: 2024-07-19
 * 작성목적:병원관리프로그램 - Output
 * 작성환경:windows 11 10.0 build 22631
 *        JDK 17.0.11
 *        intellij for Java Developers Version : 2024 -06
 * */
public class Output {
    // 환자 정보를 출력하는 메서드
    public static void printPatients(Hospital[] patients, int patientCount) {
        System.out.println("                 <<병원관리프로그램>>                        ");
        System.out.println("--------------------------------------------------------");
        System.out.println("번호\t진찰부서\t진찰비\t입원비\t진료비");
        System.out.println("--------------------------------------------------------");
        for (int i = 0; i < patientCount; i++) {
            System.out.println(patients[i].toString());
        }
    }
}