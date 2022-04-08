package PMS;

public class Roles {
    int ID;
    String Rolename;
    String Description;
    void get_info() {
        //get Roles information
    }
    
    void updateRole() {
        //update Emp roles
    }

    void searchRole() {
        //Search for role
    }
    public void RoleAssignment() {
        if (ID == 1) {
            Rolename = "Team Head";
        }
        else  if (ID == 2) {
            Rolename = "Developer";
        }
        else if (ID == 3) {
            Rolename = "Intern";
        }
    }
}
