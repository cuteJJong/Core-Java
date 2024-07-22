/*
 * 작성자: 박종호
 * 작성일: 2024-07-19
 * 작성목적:병원관리프로그램 - Output
 * 작성환경:windows 11 10.0 build 22631
 *        JDK 17.0.11
 *        intellij for Java Developers Version : 2024 -06
 * */
public class Sort {
    // 퀵 정렬 알고리즘
    public static void quickSort(Hospital[] patients, int low, int high) {
        if (low < high) {
            int pi = partition(patients, low, high);
            quickSort(patients, low, pi - 1);
            quickSort(patients, pi + 1, high);
        }
    }

    // 배열을 피벗 기준으로 분할
    private static int partition(Hospital[] patients, int low, int high) {
        int pivot = patients[high].getNumber();
        int i = (low - 1);
        for (int j = low; j < high; j++) {
            if (patients[j].getNumber() < pivot) {
                i++;
                swap(patients, i, j);
            }
        }
        swap(patients, i + 1, high);
        return i + 1;
    }

    // 배열의 두 요소를 교환
    public static void swap(Hospital[] patients, int i, int j) {
        Hospital temp = patients[i];
        patients[i] = patients[j];
        patients[j] = temp;
    }
}