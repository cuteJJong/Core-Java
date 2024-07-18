public class ConstructorDemo {
    public static void main(String[] args) {
//        Car sonata = new Car();         //Car() -> 기본 생성자 | 컴파일러가 자동으로 만들어준다.
//        System.out.println(sonata.name);
//        System.out.println(sonata.price);

        Product p = new Product();      //생성자가 1개라도 있으면 임의로 만들어야한다.
        Product pencil = new Product("모나미 연필", 1000, "모나미社");
        Product computer = new Product("노트북", 25_000_000, "LG Gram");
        Product tv = new Product("텔레비전", 30_000_000, "삼성전자" );
    }
}
