package PMS;

public class Teams {
    public String ID;
    public String Name;
    public String emp_list;
    public String Department;
    public String team_leader;
    public void get_info(){
        StringBuffer sb = new StringBuffer ("Team01");
        sb.insert(6, " - Currently working on 'Plan your Day!'");
        System.out.println("Team and Project details: ");
        System.out.println(sb);
    }

    void updateTeam() {
        //Update Team details
    }

    void searchTeam() {
        //Search for teams
    }

    void TeamActivities(){
        //Team activity details
    }
}
