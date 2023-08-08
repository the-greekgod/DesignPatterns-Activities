
public class SeniorEmployee extends GenericEmployee {
    private int maxBonus;

    @Override
    public void setSalary(int salary) {
        super.setSalary(salary);
        validate(String.valueOf(salary), new AtLeastValidationStrategy(200));
    }

    @Override
    public void setMonthsSpent(int months) {
        super.setMonthsSpent(months);
        validate(String.valueOf(months), new AtLeastValidationStrategy(60));
    }

    public void setMaxBonus(int bonus) {
        validate(String.valueOf(bonus), new AtLeastValidationStrategy(1));
        this.maxBonus = bonus;
    }
}
