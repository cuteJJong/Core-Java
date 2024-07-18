public class ExceptionDemo1 {
    public static void main(String[] args) {
        Car matiz = new Car();
        matiz.name = "대우 마티즈";
        System.out.println(matiz.name);
        matiz = null;
        try {
            System.out.println(matiz.name);
            //catch 순서중요 위에는 자식 밑에는 부모
        }catch (ArrayIndexOutOfBoundsException e) {   //던져진 exception 과 캐치하는 exception의 타입이 같아야한다.
            System.out.println("아무일 없었음");
            //에러 메세지를 보는 단계
            //System.out.println(e.getMessage());   //에러 메세지만
            //System.out.println(e);  //e.toString() Exception 타입과 에러메세지
            //e.printStackTrace();        //stack 추적
//        } catch (NullPointerException e) {  //type이 달라 안됨
//            System.out.println("배열의 크기는 음수이면 안됩니다.");
//        }
        }catch (NegativeArraySizeException e) {
            System.out.println("배열의 크기는 음수이면 안됩니다.");
        }catch (RuntimeException e) {
            System.out.println("여기서 잡았음");
        }

        /*
        * Exception in thread "main" java.lang.NullPointerException: Cannot read field "name" because "matiz" is null
	at ExceptionDemo1.main(ExceptionDemo1.java:7)
        * */
    }
}
