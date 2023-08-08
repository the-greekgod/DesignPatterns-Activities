
public abstract class GenericEmployee extends CompanyMember {
    public void setSalary(int salary) {
        super.setSalary(salary);
    }

    public void setManagerName(String name) {
        super.setManagerName(name);
        this.mgrName = name;
    }

    public void setMonthsSpent(int months) {
        validate(String.valueOf(months), new AtLeastValidationStrategy(0));
        this.monthsSpent = months;
    }
}