package StaffMemberTest;
public abstract class StaffMember {
    private String name;
    private int id;
    private int recruitmentYear;

    public StaffMember(String name, int id, int recruitmentYear){
        this.name = name;
        this.id = id;
        this.recruitmentYear = recruitmentYear;
    }

    public void setName(String name){
        this.name = name;
    }
    public void setId(int id){
        this.id = id;
    }
    public void setRecruitmentYear(int recruitmentYear){
        this.recruitmentYear = recruitmentYear;
    }

    public String getName(){
        return name;
    }
    public int getId(){
        return id;
    }
    public int getRecruitmentYear(){
        return recruitmentYear;
    }

    public abstract double getMonthlySalary();
    public String toString(){
        return "\tName: " + name + "\n\tID: " + id
        + "\n\tRecruitment Year: " + recruitmentYear;
    }
}