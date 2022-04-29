import java.lang.String;
import java.util.Scanner;

class meeting {
    public static int ID;
    public static String start_date;
    public String end_date;
    public String team_ID;
    public String time;
    public String Project_ID;
    public String MeetID;
    public String Description;
    public String MOM;
    public String Recorder_name;

    public void alloc(){
        ID++;
        this.ID=ID;
    }

    public String generateID(StringBuffer team_ID, StringBuffer Project_ID)
    {
        StringBuffer temp=new StringBuffer(team_ID.append(Project_ID));
        MeetID=temp.toString();
        System.out.println("Meeting ID:");
        System.out.println(MeetID);
        return MeetID;
    }

    public void VerifyID (String MeetID) {
        String UserID;
        Scanner sc = new Scanner(System.in);
        UserID = sc.nextLine();
        if (UserID.equals(MeetID)) {
            System.out.println("Meeting ID Verified");
        }
        else {
            System.out.println("Invalid Meeting ID");
        }
    }

public class meetings {
    public static void main(String[] a){
        
        StringBuffer teamID = new StringBuffer();
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter TeamID: ");
        teamID.append(sc.nextLine());
        System.out.println("Enter ProjectID: ");
        ProjectID.append(sc.nextLine());
        meeting met=new meeting();
        met.alloc();
        emp.generateID();
        emp.VerifyID();
    }
    
}
