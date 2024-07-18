public class AnonymousClassDemo {
    public static void main(String[] args) {
//        Canine ca = new Dog();
//        ca.roam();
//        ca.bark();
        //상속을 이용한 anonymous 객체 만드는 법
        Canine ca = new Canine() {
            //Implement Anonymous overriding
            @Override
            void bark() {
                System.out.println("으르렁 짖다.");
            }
            //새롭게 정의된 필드와 메소드는 익명 자식 객체 내부에서만 사용, 외부에서 접근 X
            void distplay() {
                System.out.println("메소드");
            }
        };
        ca.bark();      //호출
        ca.roam();
        //ca.display();   //새로 추가가 되도 사용X
    }
}
abstract class Canine {
    abstract void bark();
    void roam() {
        System.out.println("여기저기 배회하다.");
    }
}
//class Dog extends Canine {
//    void bark() {
//        System.out.println("으르렁 짖다.");
//    }
//}
