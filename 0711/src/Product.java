public class Product {
    //명시적으로 초기화 방법
//    String name = "모나미 연필";
//    int price = 1000;
//    String maker = "모나미社";

    String name = "모나미 연필";
    int price = 1000;
    String maker = "모나미社";
    public Product() {}     //Default constructor


//    public Product(String name, int price, String maker) {
//        this.name = null;
//        this.price = 0;
//        this.maker = null;
//    }

    //생성자에서 초기화 하는 방법
    public Product(String name, int price, String maker) {  //constructor
        this.name = name;
        this.price = price;
        this.maker = maker;
    }
}
