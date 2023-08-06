public class ThirdPartyLeaveRecordAdapter implements LeaveRecord {
    private ThirdPartyLeaveRecord thirdPartyLeaveRecord;

    public ThirdPartyLeaveRecordAdapter(ThirdPartyLeaveRecord thirdPartyLeaveRecord) {
        this.thirdPartyLeaveRecord = thirdPartyLeaveRecord;
    }

    @Override
    public String getMostAbsentEmployee() {
        return thirdPartyLeaveRecord.getMostAbsentEmployee().getName();
    }

    @Override
    public int getEmployeeAbsences(String employeeName) {
        for (Employee employee : thirdPartyLeaveRecord.getEmployees().keySet()) {
            if (employee.getName().equals(employeeName)) {
                return thirdPartyLeaveRecord.getEmployees().get(employee);
            }
        }
        return 0;
    }
}
