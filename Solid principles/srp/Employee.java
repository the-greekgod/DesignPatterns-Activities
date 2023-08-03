package solid.live.srp;


public class Employee {
    private int empId;
    private static int TOTAL_LEAVES_ALLOWED = 30;

    private double monthlySalary;
    private String name;
    private String addressStreet;
    private String addressCity;
    private String addressCountry;
    private int leavesTaken;
    private String manager;
    private int yearsInOrg;
    private int[] leavesLeftPreviously;


    public Employee(int empId, double monthlySalary, String name, String addressStreet, String addressCity, String addressCountry, int leavesTaken, int[] leavesLeftPreviously) {
        this.empId = empId;
        this.monthlySalary = monthlySalary;
        this.name = name;
        this.addressStreet = addressStreet;
        this.addressCity = addressCity;
        this.addressCountry = addressCountry;
        this.leavesTaken = leavesTaken;
        this.leavesLeftPreviously = leavesLeftPreviously;
        this.yearsInOrg = leavesLeftPreviously.length;
    }

    public int getEmpId(){
        return this.empId ;
    }

    public String getName(){
        return this.name ;
    }

    public int getLeavesTaken(){
        return this.leavesTaken;
    }


    public double getMonthlySalary(){
        return this.monthlySalary;
    }

    public String getManager(){
        return this.manager ;
    }

    public int[] getLeavesLeftPreviously(){
        return this.leavesLeftPreviously;
    }

    public int getTotalLeavesAllowed(){
        return TOTAL_LEAVES_ALLOWED ;
    }

    public int calculateTotalLeaveLeftPreviously() {
        int years = 3;
        if (this.yearsInOrg < 3) {
            years = this.yearsInOrg;
        }
        int totalLeaveLeftPreviously = 0;
        for (int i = 0; i < years; i++) {
            totalLeaveLeftPreviously += this.leavesLeftPreviously[this.yearsInOrg-i-1];
        }

        return totalLeaveLeftPreviously;
    }


    
    //other method related to customer
}
