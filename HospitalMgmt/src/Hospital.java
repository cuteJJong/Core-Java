public class Patient {
    private int id;
    private String departmentCode;
    private int daysAdmitted;
    private int age;
    private int consultationFee;
    private double totalCost;

    public Patient(int id, String departmentCode, int daysAdmitted, int age) {
        this.id = id;
        this.departmentCode = departmentCode;
        this.daysAdmitted = daysAdmitted;
        this.age = age;
    }

    public int getId() {
        return id;
    }

    public String getDepartmentCode() {
        return departmentCode;
    }

    public int getDaysAdmitted() {
        return daysAdmitted;
    }

    public int getAge() {
        return age;
    }

    public int getConsultationFee() {
        return consultationFee;
    }

    public void setConsultationFee(int consultationFee) {
        this.consultationFee = consultationFee;
    }

    public double getTotalCost() {
        return totalCost;
    }

    public void setTotalCost(double totalCost) {
        this.totalCost = totalCost;
    }

    @Override
    public String toString() {
        return String.format("%-10d %-10s %,10d %,10d %,10.2f", id, departmentCode, consultationFee, calculateHospitalizationFee(), totalCost);
    }

    public int calculateHospitalizationFee() {
        int dailyFee = (daysAdmitted <= 3) ? 30000 : 25000;
        int totalFee = dailyFee * daysAdmitted;
        return totalFee;
    }

    public double calculateDiscountRate() {
        if (daysAdmitted < 10) return 1.00;
        if (daysAdmitted < 15) return 0.85;
        if (daysAdmitted < 20) return 0.80;
        if (daysAdmitted < 30) return 0.77;
        if (daysAdmitted < 100) return 0.72;
        return 0.68;
    }
}
