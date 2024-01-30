package StaffMemberTest;

public class AdministrativeAssistants extends StaffMember{

    private double workingHours, hourlyWage;

    public AdministrativeAssistants(String name, int id, int recruitmentYear, double workingHours, double hourlyWage) {
        super(name, id, recruitmentYear);
        this.workingHours = workingHours;
        this.hourlyWage = hourlyWage;
    }

    public void setWorkingHours(double workingHours){
        this.workingHours = workingHours;
    }
    public void setHourlyWage(double hourlyWage){
        this.hourlyWage = hourlyWage;
    }

    public double getWorkingHours(){
        return workingHours;
    }
    public double getHourlyWage(){
        return hourlyWage;
    }

    @Override
    public double getMonthlySalary() {
        return workingHours * hourlyWage;
    }
    public String toString() {
        return "Type: Administrative Assistant\n" + super.toString()
        + "\n\tMonthly Salary:" + getMonthlySalary()+"$";
    }
}
