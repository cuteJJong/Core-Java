public class ExceptionDemo2 {
    public static void main(String[] args) {
        //exception 던지는 쪽은 호출하는 방향으로
        a();
    }
    static void a() {
        b();
    }
    static void b() {
        try {
            c();
        }catch(ArithmeticException e) {
            System.out.println("b에서 잡았음");
        }
    }
    static void c() {
        d();
    }
    static void d() {
        System.out.println(5 / 0);
    }
}
