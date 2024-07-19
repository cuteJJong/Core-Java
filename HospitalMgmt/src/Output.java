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