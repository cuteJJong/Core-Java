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