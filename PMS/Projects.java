package PMS;

public class Projects {
    public int ID;
    public String Name;
    public String Client_det;
    public String Start_date;
    public String End_date;
    public String Description;
    public double Budget;
    public double Emp_Sal;
    public double multimedia;
    public double maintainance;
    public double marketing;
    public double resources;
    public double misc;

    public Projects (String Client_det, String Start_date, String End_date, String Description, int Budget)
    {
    
        this.Client_det=Client_det;
        this.Start_date=Start_date;
        this.End_date=End_date;
        this.Description=Description;
        this.Budget=Budget;
    }

    public Projects (int ID, String Name) {
        this("ABC Solutions", "21/01/2022", "05/05/2022", "Personal planner web application", 200000);
        this.ID=ID;
        this.Name=Name;
    }

    public void get_info(){
        //get Project information
    }
   
    public void updateProject() {
        //Update Project details
    }

    public void BudgetAllocation(double Budget){
        Emp_Sal = 0.55*Budget;
        multimedia = 0.05*Budget;
        maintainance = 0.15*Budget;
        resources = 0.20*Budget;
        misc = 0.05*Budget;
    }

    public void Estimate(double Budget, double Emp_Sal, double multimedia, double maintainance, double resources, double misc ) {
        System.out.println("\n*********Budget Allocation***********\n");
        System.out.println("Total Budget: "+ Budget);
        System.out.println("Employee Salaries: " + Emp_Sal);
        System.out.println("Multimedia: " + multimedia);
        System.out.println("Maintainence: "+ maintainance);
        System.out.println("Resources: "+ resources);
        System.out.println("misc: "+ misc);
    }

    public void display() {
       
        
    }
    
}
