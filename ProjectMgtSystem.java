import PMS.*;

public class ProjectMgtSystem {
    public static void main(String[] args) {
        Projects pro = new Projects(101, "Plan your Day!");
        System.out.println("\n*************Printing Project information*************\n");
        System.out.println("ID: " + pro.ID + "\nName: " + pro.Name + "\nClient details: " + pro.Client_det
                + "\nStart date: " + pro.Start_date + "\nEnd date: " + pro.End_date + "\nDescription: "
                + pro.Description + "\nBudget: " + pro.Budget);
        Teams tem = new Teams();
        tem.get_info();
        pro.Budget = 200000;
        pro.BudgetAllocation(pro.Budget);
        pro.Estimate(pro.Budget, pro.Emp_Sal, pro.multimedia, pro.maintainance, pro.resources, pro.misc);
        Employee emp = new Employee();
        emp.empid = 001;
        emp.Name = "Akshaya";
        emp.Address = "#4, RK Colony, Bangalore";
        emp.designation = "Manager";
        emp.Previous_projects = "Automatic ticket Generator";
        emp.displayemp();
        emp.basic = 15000;
        emp.allotment(emp.basic);
        emp.calcgrosssal(emp.basic, emp.hra, emp.special_allowance, emp.da);
        emp.calcnetsal(emp.pf, emp.gross_sal, emp.esic);
        emp.display(emp.esic);

        // calculate salary
        Employee employ = new Employee();
        employ.empid = 002;
        employ.Name = "Ramesh";
        employ.Address = "#4, RK Colony, Bangalore";
        employ.designation = "Manager";
        employ.Previous_projects = "Automatic ticket Generator";
        employ.displayemp();
        employ.basic = 15000;
        employ.allotment(employ.basic);
        employ.calcgrosssal(employ.basic, employ.hra, employ.special_allowance, employ.da);
        employ.calcnetsal(employ.pf, employ.gross_sal, employ.esic);
        employ.display(employ.esic);

        // calculate salary
        Employee employ2 = new Employee();
        employ2.empid = 001;
        employ2.Name = "John";
        employ2.Address = "#4, RK Colony, Bangalore";
        employ2.designation = "Manager";
        employ2.Previous_projects = "Automatic ticket Generator";
        employ2.displayemp();
        employ2.basic = 25000;
        employ2.allotment(employ2.basic);
        employ2.calcgrosssal(employ2.basic, employ2.hra, employ2.special_allowance, employ2.da);
        employ2.calcnetsal(employ2.pf, employ2.gross_sal);
        employ2.display();
    }
}
