public class StaticDemo {
    public static void main(String[] args) {
        Tiger [] array = new Tiger[4];
        for (int i = 0; i < array.length; i++) {
            array[i] = new Tiger();
        }
        for (Tiger t : array)
            //a는 Tiger안에 b는 밖에
            /*
            * a는 멤버라 tiger 개수만큼 1이 만들어지고 b는 static 이라 계속 더해져서 4가된다.
            * 예시
            * | a=0 |      |a=1|, |a=1|, |a=1|, |a=1|      |b= 1->2->3->4|
            * | b=0 | ->   Tiger  Tiger  Tiger  Tiger
            *  Tiger
            * */
            System.out.println("a = " + t.a + ",b = " + Tiger.b);
    }
}
class Tiger {
    int a;
    static int b;
    public Tiger() {
        a++;
        b++;
    }
}
