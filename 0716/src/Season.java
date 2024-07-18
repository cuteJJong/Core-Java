/*
* @author Henny
* @version 1.0.0
* @since jdk 17
*
 */
public enum Season {
    //nume 상수가 제일 첫 번째줄에 작성
    Spring(5), summer(100), fall(1000), winter(30_000_000);     //값이 들어온게 생성자로 판단한다.
    private int value;
    Season(int value) {
        this.value = value;
    }
    public int getValue() {
        return this.value;
    }

}
