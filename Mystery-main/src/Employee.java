class Employee {

    private String id;
    private int tier;
    private int year;
    private int salary;        //급여
    private int bonus;        //수당
    private int amount;    //지급액
    private int amountAfterTax;    //차인 지급액
    private int tax;            //세금

    public Employee(String id, int tier, int year, int bonus) {
        // 생성자
        this.id = id;
        this.tier = tier;
        this.year = year;
        this.bonus = bonus;
    }

    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id;
    }

    public int getTier() {
        return tier;
    }

    public void setTier(int tier) {
        this.tier = tier;
    }

    public int getYear() {
        return year;
    }

    public void setYear(int year) {
        this.year = year;
    }

    public int getSalary() {
        return salary;
    }

    public void setSalary(int salary) {
        this.salary = salary;
    }

    public int getBonus() {
        return bonus;
    }

    public void setBonus(int bonus) {
        this.bonus = bonus;
    }

    public int getAmount() {
        return amount;
    }

    public void setAmount(int amount) {
        this.amount = amount;
    }

    public int getAmountAfterTax() {
        return amountAfterTax;
    }

    public void setAmountAfterTax(int amountAfterTax) {
        this.amountAfterTax = amountAfterTax;
    }

    public double getTax() {
        return tax;
    }

    public void setTax(int tax) {
        this.tax = tax;
    }

    @Override
    public String toString() {
        // 출력 내용
        return String.format("%-5s\t%5d\t%5d\t%10d\t%10d\t%10d\t%10d%n",
            id, tier, year, bonus, amount, tax, amountAfterTax);
    }
}
