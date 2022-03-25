package PMS;

public class Employee {
    String Name;
    String designation;
    String Phone;
    String Address;
    String Email;
    String Department;
    int Experience;
    int Salary;
    String area_of_expertise;
    String Previous_projects;

    public Employee (String name, String desig, String Ph, String Add, String mail, String Dept, int Exp, int Pay, String Area,
            String PrevProj) 
    {
        this.Name = name;
        this.designation = desig;
        this.Phone = Ph;
        this.Address = Add;
        this.Email = mail;
        this.Department = Dept;
        this.Experience = Exp;
        this.Salary = Pay;
        this.area_of_expertise = Area;
        this.Previous_projects = PrevProj;

    }

    void get_info() {
        System.out.println(this.Name);
        System.out.println(this.designation);
        System.out.println(this.Phone);
        System.out.println(this.Address);
        System.out.println(this.Email);
        System.out.println(this.Department);
        System.out.println(this.Experience);
        System.out.println(this.Salary);
        System.out.println(this.area_of_expertise);
        System.out.println(this.Previous_projects);
    }

    void updateemp(){
        //update employee details
    }

    void calcSalary() {
        //calculate Salary
    }

    void Appraisal() {
        //Appraisal based on performance and experience
    }

}
