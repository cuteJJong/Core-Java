public class LocaInnerClassDemo {
    public static void main(String[] args) {
        OuterClass out = new OuterClass();
        out.display();
    }
}
class OuterClass {
    private int a = 5;      //Outer class's member variable
    private static int b =10;   //Outer class's static variable
    public void display() {
       int c = 100; //local variable
       class InnerClass {
           public void print() {
               System.out.println(c);       //member는 static에 접근할 수 있다
               //c = 1000;    //
           }
       }
       InnerClass inner = new InnerClass();
    }
}
