
public class Manager extends CompanyMember {
    private String managementBand;

    public void setManagementBand(String managementBand) {
        validate(managementBand, new NotEmptyValidationStrategy());
        this.managementBand = managementBand;
    }
}
