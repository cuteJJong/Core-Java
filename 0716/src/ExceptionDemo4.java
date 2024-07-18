public class ExceptionDemo4 {
    public static void main(String[] args) {
        try {

        } catch (Exception e) {
            throw new RuntimeException(e);
        }


        try {

        } catch (Exception e) {
            throw new RuntimeException(e);
        } finally {
        }

    }
}
