/*
 * 작성자: 박종호
 * 작성일: 2024-07-19
 * 작성목적:병원관리프로그램 - Output
 * 작성환경:windows 11 10.0 build 22631
 *        JDK 17.0.11
 *        intellij for Java Developers Version : 2024 -06
 * */
public enum Department {
    MI("외과"), NI("내과"), SI("피부과"), TI("소아과"), VI("산부인과"), WI("비뇨기과");

    private String name;

    Department(String name) {
        this.name = name;
    }

    public String getName() {
        return name;
    }

    public static Department fromCode(String code) {
        for (Department dept : Department.values()) {
            if (dept.name().equals(code)) {
                return dept;
            }
        }
        throw new IllegalArgumentException("Invalid department code: " + code);
    }
}