public class AbstractDemo extends Normal{
    public AbstractDemo(String name) {      //자기 생성자가 없으니까 부모에게 super로 넘겨줘야한다.
        super(name);
    }
    public static void main(String[] args) {
        //Normal normal = new Normal("한지민");
        Normal normal = new AbstractDemo("한지민");
        System.out.println(normal);     //normal.toString()
    }
}
abstract class Normal {     //허상클래스이기 때문에 메모리에 생성x
    private String name;    //이름은 생성자가 초기화

    public Normal(String name) {
        this.name = name;
    }

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
