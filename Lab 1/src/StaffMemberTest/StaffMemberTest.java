package StaffMemberTest;

import java.util.Scanner;

public class StaffMemberTest {
    static Scanner in = new Scanner(System.in);
    static int c; //Choice
    static final String mainMenu =
            """
                    1. Add a new staff member.
                    2. Remove a staff member.
                    3. Display all staff members in the organization with complete information.
                    4. Exit.
                    Choice:\s""";
    static final String staffMenu =
            """
                    Choose staff member type:
                    1-Manager.
                    2-Engineer.
                    3-Administrative Assistant.
                    Choice:\s""";
    static StaffMember[][] members = new StaffMember[3][30];
    static int mCount; //managerCount
    static int eCount; //engineerCount
    static int aCount; //assistantCount

    public static void main(String[] args){
        do {
            displayMainMenu();
            switch (c) {
                case 1:
                    displayStaffMenu();
                    addMember(c);
                    break;
                case 2:
                    //removeMember();
                    break;
                case 3:
                    printMembers(members);
                    break;
                case 4:
                    System.out.println("Good bye(:");
                    break;
                default:
                    System.out.println("Invalid value!");
                    break;
            }
        } while(c != 4);
    }

    public static void displayMainMenu(){
        System.out.print(mainMenu);
        c =  in.nextInt();
    }
    public static void displayStaffMenu(){
        do {
            System.out.print(staffMenu);
            c = in.nextInt();
            if(c > 0 && c < 4){
                break;}
            else System.out.println("Invalid value!");
        } while (true);
    }
    public static void printMembers(StaffMember[][] arr) {
        for(int i = 0; i < 3; i++){
            System.out.println(i == 0? "Type: Manager\n": i == 1? "Type: Engineer\n": "Type: Administrative Assistant\n");
            for(int j = 0; j < (i == 0? mCount : i == 1? eCount : aCount); j++){
                System.out.println(arr[i][j].toString());
            }
        }
    }
    public static void addMember(int type) {
        if(type == 1){
            System.out.print("Name: ");
            String name = in.nextLine(); in.nextLine();
            System.out.print("ID: ");
            int id = in.nextInt();
            System.out.print("Recruitment Year: ");
            int ry = in.nextInt();
            System.out.print("Basic Salary: ");
            double bs = in.nextDouble();
            members[0][mCount] = new Managers(name, id, ry, bs);
            mCount++;}
        else if(type == 2){
            System.out.print("Name: ");
            String name = in.nextLine(); in.nextLine();
            System.out.print("ID: ");
            int id = in.nextInt();
            System.out.print("Recruitment Year: ");
            int ry = in.nextInt();
            System.out.print("Basic Salary: ");
            double bs = in.nextDouble();
            members[1][eCount] = new Engineers(name, id, ry, bs);
            eCount++;}
        else{
            System.out.print("Name: ");
            String name = in.nextLine(); in.nextLine();
            System.out.print("ID: ");
            int id = in.nextInt();
            System.out.print("Recruitment Year: ");
            int ry = in.nextInt();
            System.out.print("working Hours: ");
            double wh = in.nextInt();
            System.out.print("Hourly Wage: ");
            double hw = in.nextDouble();
            members[2][aCount] = new AdministrativeAssistants(name, id, ry, wh, hw);
            aCount++;}
    }
}

