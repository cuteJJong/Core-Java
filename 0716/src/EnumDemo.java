public class EnumDemo {
    public static void main(String[] args) {
        //Season season = new Season();
        Season season = Season.fall;
        //System.out.println(season);     //나열형은 정수형 변환 X
        System.out.println(season.ordinal());       //ordinal 순서
        System.out.println(season.getValue());
    }
}
