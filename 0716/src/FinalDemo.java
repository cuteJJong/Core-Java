public class FinalDemo {
    public static void main(String[] args) {
        Parent bumo = new jasik();
        bumo.display();
    }
}
class Parent {
    public final void display() {       //final 메소드는 재정의 안됨
        System.out.println("나는 부모의 메소드");
    }
}
class jasik extends Parent {
//    @Override
//    public void display() {
//        System.out.println("나는 자식의 메소드");
//    }
}
