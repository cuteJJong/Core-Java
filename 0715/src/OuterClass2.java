public class OuterClass2 {
    public static void main(String[] args) {
        OuterClass2 oc = new OuterClass2();
        oc.display();
    }
    void display() {
        int a = 5;      //local variable
        class InnerClass2 {     //local class
            int b = 10;     //local inner class's member variable
            static int c = 500;     //local inner class's static variable
            void print() {

            }
        }
        InnerClass2 ic = new InnerClass2();     //순서 중요
        System.out.println(ic.b);               //why? member variable  주소로 찾아가는
        System.out.println(InnerClass2.c);      //why? static           이름으로 찾아가는


    }
}
