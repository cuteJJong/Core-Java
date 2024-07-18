public class Calc {
    private Employee[] array; //field

    //생성자
    public Calc(Employee[] array) {
        this.array = array;
    }

    void calc() {
        for (Employee em : this.array) {
            if (em == null) {
                continue;
            }

            int salary = salaryCalc(em.getYear(), em.getTier()); // 급여는 호봉과 급수에 따라 결정
            int amount = salary + em.getBonus();// 지급액 = 급여 + 수당
            int tax = (int)(amount * taxRateCalc(salary)) - correctAmtCalc(salary);
            int amountAfterTax = amount - tax;

            em.setAmount(amount);
            em.setTax(tax);
            em.setAmountAfterTax(amountAfterTax);
        }
    }

    // 급 호봉에 따른 salary(급여) 계산 메소드
    int salaryCalc(int year, int tier) {

        int[][] salaryTable = {
            {95000, 80000}, // 호봉 1
            {92000, 75000}, // 호봉 2
            {89000, 70000},  // 호봉 3
            {86000, 65000}, // 호봉 4
            {83000, 60000},  // 호봉 5
        };

        // 호봉과 급수에 따른 급여 반환
        return salaryTable[year - 1][tier - 1];
    }

    // 지급액에 따른 세율
    double taxRateCalc(int salary) {
        double tax_rate;

        if (salary < 70000) {
            tax_rate = 0;
        } else if (salary < 80000) {
            tax_rate = 0.005;
        } else if (salary < 90000) {
            tax_rate = 0.007;
        } else {
            tax_rate = 0.012;
        }

        return tax_rate;
    }

    // 지급액에 따른 조정액
    int correctAmtCalc(int salary) {
        int correctionAmt;

        if (salary < 70000) {
            correctionAmt = 0;
        } else if (salary < 80000) {
            correctionAmt = 300;
        } else if (salary < 90000) {
            correctionAmt = 500;
        } else {
            correctionAmt = 1000;
        }
        return correctionAmt;
    }

}
