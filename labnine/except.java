import java.util.Scanner;

class pro {
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

    public void BudgetAllocation(double Budget) {
        Emp_Sal = 0.55 * Budget;
        multimedia = 0.05 * Budget;
        maintainance = 0.15 * Budget;
        resources = 0.20 * Budget;
        misc = 0.05 * Budget;
    }

    public void Estimate(double Budget, double Emp_Sal, double multimedia, double maintainance, double resources,
            double misc) {
        System.out.println("\n*********Budget Allocation***********\n");
        System.out.println("Total Budget: " + Budget);
        System.out.println("Employee Salaries: " + Emp_Sal);
        System.out.println("Multimedia: " + multimedia);
        System.out.println("Maintainence: " + maintainance);
        System.out.println("Resources: " + resources);
        System.out.println("misc: " + misc);
    }

    public void display() {

    }

}

// class representing custom exception
class InvalidSalException extends Exception {
    public InvalidSalException(String str) {
        // calling the constructor of parent Exception
        super(str);
    }
}

// class that uses custom exception InvalidAgeException
class CustomException {

    // method to check the age
    static void validate(int Emp_sal) throws InvalidSalException {
        if (Emp_sal < 5000) {

            // throw an object of user defined exception
            throw new InvalidSalException("Salary is less than the minimum wage.");
        } else {
            System.out.println("Salary entered successfully.");
        }
    }

}

public class except {
    public static void main(String args[]) {
        Scanner sc = new Scanner(System.in);
            System.out.println("Enter Name: ");
            String Name = sc.nextLine();
        try{    
            if (Name.length() == 0) {
                throw new NullPointerException("Name cannot be null");
            }
        } catch (NullPointerException e){
            System.out.println(e);
        }
            System.out.println("Enter ID: ");
            int ID = sc.nextInt();
            System.out.println("Enter Salary: ");
            int Emp_Sal = sc.nextInt();
        try {
            
            CustomException.validate(Emp_Sal);
        } catch (InvalidSalException ex) {
            System.out.println("Caught the exception");
        
        
            // printing the message from InvalidAgeException object
            System.out.println("Exception occured: " + ex);
        }
    }
}