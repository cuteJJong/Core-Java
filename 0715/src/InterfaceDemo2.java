public class InterfaceDemo2 {
    public static void main(String[] args) {
        Product pencil = new Product("모나미연필");
        //Product ballpen = pencil;   //주소 복사

        //값 복사
        Product ballpen = pencil.copy();
        //ballpen.clone();        //colone은 protected라 자식만 쓸 수 있다. -> 자식안에서 써라.
        System.out.println(ballpen.name);
        pencil.name = "컴퓨터";
        System.out.println(ballpen.name);


    }
}
class Product /*extends Object*/ implements Cloneable{  //flag interface
                                                        //Object는 clone()메소드를 가지고 있다.
    String name;
    public Product(String name) {
        this.name = name;
    }
    public Product copy() {
        Product target = null;
        try {
            Object obj = this.clone();
            if(obj instanceof Product) target = (Product) obj;  //강제 형변환
            else System.out.println("형변환 안됨");
        } catch (CloneNotSupportedException e) {
            System.out.println("복제 안됨");
        }
        return target;
    }
}