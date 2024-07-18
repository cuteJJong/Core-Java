public class GrandSon implements Son{
    public static void main(String[] args) {
        GrandFather jimin = new GrandSon();     //자식은 부모로 형변환가능
        jimin.grandFather();        //본인것만 접근가능

        Father chulsu = new GrandSon();
        chulsu.father();        //GrandFather와 본인 접근가능

        Mother younghee = new GrandSon();
        younghee.mother();  // 본인것만 접근가능

        Son youngsu = new GrandSon();
        youngsu.son();  // 모든 메서드 접근가능

        Son [] array = new Son[3];
        array[0] = new GrandSon();
        //array[0].son(); //모든 메서드 접근 가능
        System.out.println(Father.NAME + ", " + Mother.NAME);
    }

    @Override
    public void father() {
        System.out.println("Called by Father()");
    }

    @Override
    public void grandFather() {
        System.out.println("Called by grandFather()");
    }

    @Override
    public void mother() {
        System.out.println("Called by mother()");
    }

    @Override
    public void son() {
        System.out.println("Called by son()");
    }


}
