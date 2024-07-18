public class LambdaDemo3 {
    public static void main(String[] args) {
        Person jimin = new Person();
        //1번째 방법 : Polymorphic parameter를 이용하자.
/*        jimin.greeting(new Say() {
            @Override
            public void something() {       //void면 return이 없음
                System.out.println("Im Jimin");
                System.out.println("Nice to meet you");
            }

        });
 */
        //2번째 방법 : Lambda Expression을 이용하자.
        //구현부가 2개 이상이면 중괄호 생략 X
        jimin.greeting(() -> {
                System.out.println("Im Jimin");
                System.out.println("Nice to meet you");
            }
        );
    }
}
@FunctionalInterface
interface Say{
    void something();   //return을 하지않는 lambda
}
class Person{
    public void greeting(Say say){
        say.something();
    }
}
