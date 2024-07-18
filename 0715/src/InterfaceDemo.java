//public class InterfaceDemo {
//    public static void main(String[] args) {
//        //5.interface도 추상클래스처럼 인스턴스화가 안된다.
//        //Mammal m = new Mammal()
//
////        Mammal m = new Dog();
////        m.birth();
////        Mammal m1 = new Cat();
////        m1.birth();
////        //Mammal.PI = 3.15;     상수이기 때문에 바꿀 수 없다.
////        System.out.println(Mammal.PI);      //public static이기 때문에
////                                            // 주소없이 이름으로 접근
//          //Mammal [] array = {new Dog(), new Cat()};
//          Mammal [] array = new Mammal[2];      //Mammal array 안에 2개 공간 만듬
//          array[0] = new Dog();
//          array[1] = new Cat();
//          for(Mammal m : array)
//              m.birth();
//    }
//}
//
//// 복습용 class 파일
////public interface Mammal {
////    //interface
////    //1. public static fanal이 생략된 상수만 가질 수 있다.
////    //   변수 x , private x
////    double PI = 3.14;
////    int sat = 0;
////    //2. public abstract가 생략된 추상메소드만을 가질 수 있다.
////    void birth();
////}
//
////3. interface를 구현시 implements 키워드 사용
////Dog = 추상클래스
//class Dog implements Mammal{
//    //4.interface 추상메소드 재정의
//    // 필요 부모가 public이 생략되어있어 public 필수
//    //protected X
//    @Override
//    public void birth() {
//        System.out.println("개에 맞게 재정의된 메소드");
//    }
//}
//class  Cat implements Mammal {
//
//    @Override
//    public void birth() {
//        System.out.println("고양이에 맞게 재정의된 메소드");
//    }
//}
