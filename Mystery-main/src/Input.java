import java.util.Scanner;

public class Input {
    private Scanner sc;
    private Employee[] array;
    private String[] data;

    public Input(Employee[] array, String[] data) {
        this.sc = new Scanner(System.in);
        this.array = array;
        this.data = data;
    }

    public void input() {
        String io = null;
        int index = 0;
        do {
            System.out.println("사원의 정보를 입력해 주세요.");
            System.out.print("사원번호: ");
            String id = sc.nextLine();
            System.out.print("급: ");
            int tier = Integer.parseInt(sc.nextLine());
            System.out.print("호: ");
            int year = Integer.parseInt(sc.nextLine());
            System.out.print("수당: ");
            int bonus = Integer.parseInt(sc.nextLine());
            array[index] = new Employee(id, tier, year, bonus);
            String input = getInput(id, tier, year, bonus);
            data[index] = input;
            index++;
            System.out.print("입력/출력(I/O)?: ");
            io = sc.nextLine();
        } while (io.equalsIgnoreCase("I"));
    }

    private String getInput(String id, int tier, int year, int bonus) {
        return String.format("%s%5d%5d%10d", id, tier, year, bonus);
    }
}
