public class Employee {
    String sabun;
    double salary;

    //this 메서드는 생성자 안에서 첫번째 줄에 꼭 써야한다.
    public Employee() {
        this("UnsettedSabun", 10_000_000);
//        this.sabun = null;
//        this.salary = 0.0;
    }
    public Employee(String sabun) {
        this(sabun, 10_000_000);
    }
    public Employee(double salary) {
        this("UnsettedSabun", salary);
    }
    public Employee(String sabun, double salary) {
        this.sabun = sabun;
        this.salary = salary;
    }
}
