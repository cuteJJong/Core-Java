public class WrapperDemo {
    public static void main(String[] args) {
        //int su = 5;     //stack에 있는 5

        //Integer in = new Integer(su);   //Wrapping, Boxing  //heap에 있는 5
        //int anther = Integer.   //Unwrapping, unBoxing
        int su = 5;
        Integer in = su * 100;
        System.out.println(in);     //Autoboxing
        int another = in;       //Autounboxing
        System.out.println(another);
    }
}
