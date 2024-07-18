/*
* 생성자 오버로딩 : 다양한 방법으로 객체를 생성
* */

public class Car {

    //필드
    String company = "현대자동차";
    String model;
    String color;
    int maxSpped;

    //1.생성자
    Car() {
    }

    //2
    Car(String model) {
        this.model = model;     //this : 필드와 동일한 매개변수 사용시
    }

    //3
    Car(String model, String color) {
        this.model = model;
        this.color = color;
    }
    //4
    Car(String model, String color, int maxSpped) {
        this.model = model;
        this.color = color;
        this.maxSpped = maxSpped;
    }

}
