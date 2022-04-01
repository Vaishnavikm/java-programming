import PMS.*;

public class ProjectMgtSystem {
    public static void main(String[] args) {
        demo obj1 = new demo();
        obj1.show();
        Employee[] emp = new Employee[5];
        Projects pro = new Projects(101, "Plan your Day!");
        System.out.println("Printing Project information");
        System.out.println("ID: " + pro.ID + "\nName: " + pro.Name + "\nClient details: " + pro.Client_det
                + "\nStart date: " + pro.Start_date + "\nEnd date: " + pro.End_date + "\nDescription: "
                + pro.Description + "\nBudget: " + pro.Budget);
        Teams tem = new Teams();
        tem.get_info();

    }
}
