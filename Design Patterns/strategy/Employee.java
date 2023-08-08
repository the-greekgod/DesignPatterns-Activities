
public class Employee extends GenericEmployee {
    private int maxAllowedLeaves;

    public void setMaxAllowedLeaves(int leaves) {
        validate(String.valueOf(leaves), new AtLeastValidationStrategy(1));
        this.maxAllowedLeaves = leaves;
    }
}

