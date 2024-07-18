public class Car {
    String name;
    int price;
//   private public Car() {
//        this.name = null; -> 기본 생정자를 만들면 컴파일러가 자동으로 해주는 작업
//        this.price = 0;
//    }
    public void setName(String name) {
        this.name = name;   // name으로 같이 설정하여 값이 들어가면 컴파일러가 name의 주소를 구분을 못한다.
    }
    public void setPrice(int price) {
        this.price = price;
    }
    public String getName() {
        return this.name;
    }
    public int getPrice() {
        return this.price;
    }
    public Car clone() {        //자동차 복제 (주소복사)
     return this;
    }
}
