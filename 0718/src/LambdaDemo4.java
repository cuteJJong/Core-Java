public class LambdaDemo4 {
    public static void main(String[] args) {
        Person1 jimin = new Person1();
        //return이 있는
        //1번째 방법 : Polymorphic parameter를 이용하자.
/*        jimin.greeting(new Say1() {
            @Override
            public int something() {
                System.out.println("Im Jimin");
                System.out.println("Nice to meet you");
                return 100;
            }

            });

 */

        //2번째 방법 : Lambda Expression을 이용하자.
        //구현부가 2개 이상이면 중괄호 생략 X
        jimin.greeting(() -> {
                System.out.println("Im Jimin");
                System.out.println("Nice to meet you");
                return 200;
        });
    }
}
@FunctionalInterface
interface Say1{
    int something();
}
class Person1{
    public void greeting(Say1 say){
        int value = say.something();
        System.out.println("value = " + value);
    }
}
