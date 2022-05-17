import java.io.*;
import java.util.*;

public class cmdline {
    public static void main(String args[]){
      try {
        if (args[0].equals("--register")) {
          Scanner sc = new Scanner(System.in);
          System.out.print("Enter ProjectID: ");
          String ProjectID = sc.nextLine();
          System.out.print("Enter ProjectName: ");
          String name = sc.nextLine();
          System.out.print("Enter Clientname: ");
          String client = sc.nextLine();
          System.out.print("Enter Deadline: ");
          String deadline = sc.nextLine();
          System.out.print("Enter Estimated Budget: ");
          int Budget = sc.nextInt();
          System.out.println("Project Details Entered successfully!!");
        }
      } catch (Exception e) {
        //e.printStackTrace();
        System.out.println("Login Unsuccessful");
      }
  }
}