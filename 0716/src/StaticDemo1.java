public class StaticDemo1 {
    //실행 순서 print -> b -> a
    private int a;      //member variable
    private static int b = print();   //static variable   메모리에 제일 먼저
    public static void main(String[] args) {
        System.out.println("나는 메인 메소드");
    }
    void display () {   //member method

    }
    static int print() {      //static method   목적 : 주소없이 메소드를 사용할 떄
        System.out.println("나는 스태틱 메소드");   // 메인보다 먼저
        return 30_000_000;
    }
}
