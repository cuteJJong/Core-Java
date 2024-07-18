public class LambdaDemo5 {
    public static void main(String[] args) {
        Person2 jimin = new Person2();
        //1번째 방법 : Polymorphic parameter를 이용하자.
/*        jimin.greeting(new Say2() {
            @Override
            public int something(int a) {
                System.out.println("Im Jimin");
                System.out.println("Nice to meet you");
                return a * 10;
            }

            });

 */

        //2번째 방법 : Lambda Expression을 이용하자.
        //구현부가 2개 이상이면 중괄호 생략 X
        jimin.greeting((a) -> {
                System.out.println("Im Jimin");
                System.out.println("Nice to meet you");
                return a * 10;
            }
        );
    }
}
@FunctionalInterface
interface Say2{
    int something(int a);
}
class Person2{
    public void greeting(Say2 say){
        int value = say.something(5);
        System.out.println("value = " + value);
    }
}

