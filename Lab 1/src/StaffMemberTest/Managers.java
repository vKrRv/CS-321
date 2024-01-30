package StaffMemberTest;

public class Managers extends StaffMember{

    private double basicSalary, servingYear;

    public Managers(String name, int id, int recruitmentYear, double basicSalary) {
        super(name, id, recruitmentYear);
        this.basicSalary = basicSalary;
        this.servingYear = 2024 - super.getRecruitmentYear();
    }

    public void setBasicSalary(double basicSalary){
        this.basicSalary = basicSalary;
    }
    public void setServingHour(double servingHour){
        this.servingYear = servingHour;
    }

    public double getBasicSalary(){
        return basicSalary;
    }
    public double getServingHour(){
        return servingYear;
    }

    @Override
    public double getMonthlySalary() {
        return basicSalary + (basicSalary * servingYear * 0.1);
    }
    public String toString(){
        return "Type: Manager\n" + super.toString()
        + "\n\tMonthly Salary:" + getMonthlySalary() + "$";
    }
}
