package PMS;

public class Employee {
    public int empid;
    public String Name;
    public String designation;
    public String Phone;
    public String Address;
    public String Email;
    public String Department;
    public int Experience;
    public int Salary;
    public String area_of_expertise;
    public String Previous_projects;
    public double basic;
    public double hra; // 40 percent of base salary
    public double special_allowance;
    public double da; // 50 percent of basic
    public double gross_sal;
    public double pf; // 12 percent of base
    public double esic; // below 21000, 0.0075
    public double net;

    // public Employee (String name, String desig, String Ph, String Add, String mail, String Dept, int Exp, int Pay, String Area,
    //         String PrevProj) 
    // {
    //     this.Name = name;
    //     this.designation = desig;
    //     this.Phone = Ph;
    //     this.Address = Add;
    //     this.Email = mail;
    //     this.Department = Dept;
    //     this.Experience = Exp;
    //     this.Salary = Pay;
    //     this.area_of_expertise = Area;
    //     this.Previous_projects = PrevProj;

    // }

    public void get_info() {
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

    public void updateemp(){
        //update employee details
    }

    public  void calcSalary() {
        //calculate Salary
    }

    public void Appraisal() {
        //Appraisal based on performance and experience
    }


   public void allotment(double basic) {
        hra = 0.40 * basic;
        special_allowance = 0.10 * basic;
        da = 0.50 * basic;
        pf = 0.12 * basic;
        if (basic < 21000) {
            esic = 0.0075 * basic;
        }
    }

    public void calcgrosssal(double basic, double hra, double special_allowance, double da) {
        // allotment(basic);
        gross_sal = basic + hra + special_allowance + da;
    }

    public void calcnetsal(double pf, double gross_sal, double esic) {
        // allotment(basic);
        net = gross_sal - (pf + esic);
    }

    public void calcnetsal(double pf, double gross_sal) {
        // allotment(basic);
        net = gross_sal - (pf);
        System.out.println("The net salary is: " + net);
    }

    public void display() {
        System.out.println("\nBasic: " + basic +
                "\nHRA: " + hra +
                "\nSpecial Allowance: " + special_allowance +
                "\nDA: " + da +
                "\nGross Salary: " + gross_sal +
                "\nPF: " + pf +
                "\nNet: " + net);
    }

    public void displayemp() {
        System.out.println("\n**********************Employee Details*******************\n"+
                "\nName " + Name +
                "\nAddress " + Address +
                "\ndesignation " + designation +
                "\nprevious Projects " + Previous_projects);
    }

    public void display(double esic) {
        
        System.out.println("\nBasic: " + basic +
                "\nHRA: " + hra +
                "\nSpecial Allowance: " + special_allowance +
                "\nDA: " + da +
                "\nGross Salary: " + gross_sal +
                "\nPF: " + pf +
                "\nESIC: " + esic +
                "\nNet: " + net);
    }

}
