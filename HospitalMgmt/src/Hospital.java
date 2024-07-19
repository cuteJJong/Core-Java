public class Hospital {
    private int number;
    private Department department;
    private int days;
    private int age;
    private double consultationFee;
    private double hospitalizationFee;
    private double totalFee;

    public Hospital(int number, String departmentCode, int days, int age) {
        this.number = number;
        this.department = Department.fromCode(departmentCode);
        this.days = days;
        this.age = age;
    }

    public int getNumber() {
        return number;
    }

    public Department getDepartment() {
        return department;
    }

    public int getDays() {
        return days;
    }

    public int getAge() {
        return age;
    }

    public void setConsultationFee(double fee) {
        this.consultationFee = fee;
    }

    public void setHospitalizationFee(double fee) {
        this.hospitalizationFee = fee;
    }

    public void setTotalFee(double fee) {
        this.totalFee = fee;
    }

    public double getConsultationFee() {
        return consultationFee;
    }

    public double getHospitalizationFee() {
        return hospitalizationFee;
    }

    public double getTotalFee() {
        return totalFee;
    }

    @Override
    public String toString() {
        return String.format("%d\t%s\t%.0f\t%.0f\t%.0f",
                number, department.getName(), consultationFee,
                hospitalizationFee, totalFee);
    }
}