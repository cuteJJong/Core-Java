public class InterfaceDemo1 {
    public static void main(String[] args) {
        Car sonata = new Car("EF소나타", 30_000_000);
        Car matiz = new Car("RedMatiz", 10_000_000);
        //sonata - matiz
        int result = sonata.compareTo(matiz);
        System.out.println(result);
    }
}

//Comparable 비교
class Car implements Comparable<Car>{
    private String name;
    private int Price;

    public Car(String name, int price) {
        this.name = name;
        this.Price = price;
    }

    @Override
    public String toString() {
        return "Car{" +
                "name='" + name + '\'' +
                ", Price=" + Price +
                '}';
    }

    @Override
    public int compareTo(Car ohter) {   //내가 other를 뺀다.  양수 -> 내가 큼, 0 -> 같음, 음수 -> other큼
        return this.Price - ohter.Price;
    }
}

