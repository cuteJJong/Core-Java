public class Calc {
    // 나이에 따른 진찰비 계산
    public static double calculateConsultationFee(int age) {
        if (age < 10) return 7000;
        if (age < 20) return 5000;
        if (age < 30) return 8000;
        if (age < 40) return 7000;
        if (age < 50) return 4500;
        return 2300;
    }

    // 입원일수에 따른 입원비 계산
    public static double calculateHospitalizationFee(int days) {
        // 3일 이하의 경우 일당 30000원, 그 외 일당 25000원
        double dailyRate = (days <= 3) ? 30000 : 25000;
        double total = dailyRate * days;

        // 입원일수에 따른 할인 적용
        if (days < 10) return total;
        if (days < 15) return total * 0.85;
        if (days < 20) return total * 0.80;
        if (days < 30) return total * 0.77;
        if (days < 100) return total * 0.72;
        return total * 0.68;
    }
}