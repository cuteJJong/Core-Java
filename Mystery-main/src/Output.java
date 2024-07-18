public class Output {
    Employee[] array;
    String[] data;

    public Output(Employee[] array, String[] data) {
        this.array = array;
        this.data = data;
    }

    void output() {
        System.out.println("------------------------<<급여 관리 프로그램>>------------------------");
        System.out.println("사번\t급수\t호\t수당\t지급액\t세금\t차인지급액");
        System.out.println("-----------------------------------------------------------------------");
        if (this.array != null) {
            for (Employee employee : this.array) {
                if (employee != null) {
                    System.out.println(employee);
                }
            }
        } else {
            System.out.println("Array is null.");
        }

        System.out.println("-----------------------------------------------------------------------");
        System.out.println("입력데이터 출력");
        if (this.data != null) {
            for (String str : this.data) {
                if (str != null) {
                    System.out.println(str);
                }
            }
        }
    }
}