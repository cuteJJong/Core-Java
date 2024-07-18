//member inner class
public class OuterClass {
    public static void main(String[] args) {
        //innerClass ic = new InnerClass();       //모든 member는 주소가 필요하기 때문에 에러
        OuterClass oc = new OuterClass();
        OuterClass.InnerClass ic = oc.new InnerClass(); //중요
        System.out.println(ic.c);
        System.out.println(InnerClass.d);   //static    주소 필요X


    }
    private int a = 5;      //outer class's member variable
    private static int b = 10;  //outer class's static variable
   private class InnerClass {   //member inner class
       private int c = 100;     //inner class's member variable
       private static int d = 500;  //inner class's static variable
       public void display() {  //inner class's member method
           System.out.println(a + "," + b + "," + c + "," + d);
       }
       public static void print() {
           System.out.println(d);    //inner class's static method  , static은 member a에 접근X
       }
   }
}
