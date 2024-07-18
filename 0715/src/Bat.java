//interface의 다중상속 예시

//2개의 추상메서드를 재정의 해줘야한다.
public class Bat extends Mammal implements Birds{

    @Override
    public void fly() {
        System.out.println("하늘을 날다.");
    }

    @Override
    public void giveBirthto() {
        System.out.println("새끼를 낳다.");
    }

    public static void main(String[] args) {
        Bat bat = new Bat();
        bat.fly();
        bat.giveBirthto();
    }
}
