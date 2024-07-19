/*
* 작성자: 박종호
* 작성일: 2024-07-19
* 작성목적:병원관리프로그램 - Output
* 작성환경:windows 11 10.0 build 22631
*        JDK 17.0.11
*        intellij for Java Developers Version : 2024 -06
* */
import java.util.Scanner;

public class Main {
    private static final int MAX_PATIENTS = 5;

    public static void main(String[] args) {
        Hospital[] patients = new Hospital[MAX_PATIENTS];
        int patientCount = 0;
        Scanner scanner = new Scanner(System.in);

        // 입력 루프
        while (true) {
            String action = Input.promptAction(scanner);
            if (action.equalsIgnoreCase("I")) {
                if (patientCount < MAX_PATIENTS) {
                    patients[patientCount++] = Input.inputPatient(scanner);
                } else {
                    System.out.println("최대 환자 수를 초과했습니다.");
                }
            } else if (action.equalsIgnoreCase("O")) {
                break;
            }
        }

        // 환자 정보 처리
        processPatients(patients, patientCount);
        // 환자 정보 정렬
        Sort.quickSort(patients, 0, patientCount - 1);
        // 환자 정보 출력
        Output.printPatients(patients, patientCount);
    }

    // 환자 정보 처리 메서드
    private static void processPatients(Hospital[] patients, int patientCount) {
        for (int i = 0; i < patientCount; i++) {
            Hospital patient = patients[i];
            double consultationFee = Calc.calculateConsultationFee(patient.getAge());
            double hospitalizationFee = Calc.calculateHospitalizationFee(patient.getDays());
            double totalFee = consultationFee + hospitalizationFee;

            patient.setConsultationFee(consultationFee);
            patient.setHospitalizationFee(hospitalizationFee);
            patient.setTotalFee(totalFee);
        }
    }
}