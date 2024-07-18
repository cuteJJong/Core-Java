public class AbstractDemo1 extends Normal1{
    public AbstractDemo1(String name) {
        super(name);
    }

    public static void main(String[] args) {
        Normal1 normal =new AbstractDemo1("김지민");
        normal.display();       //호출
    }

    @Override
    public void display() {
        System.out.println(super.getName());
    }
}


//abstract 상속의 강제화
abstract class Normal1 {
    private String name;    //field

    public Normal1(String name) {   //constructor
        this.name = name;
    }

    public abstract void display();

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    @Override
    public String toString() {
        return "Normal[" +
                "name='" + name + '\'' +
                ']';
    }
}
