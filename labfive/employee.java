import java.io.*;
import java.lang.String;
import java.util.Scanner;

class employees {
    static int tid;
    int empid;
    String f_name;
    String l_name;
    String empname;
    String dob;
    StringBuffer empaddress;
    long empphno;
    String email;
    String designation;

    public void alloc(){
        tid++;
        this.empid=tid;
    }

    public String fullname(StringBuffer f_name, StringBuffer l_name)
    {
        StringBuffer temp=new StringBuffer(f_name.append(l_name));
        empname=temp.toString();
        System.out.println(empname);
        return empname;

    }

    public void emailalloc(String empname)
    {
        StringBuffer std=new StringBuffer("@companyname.in");
        StringBuffer emailtemp = new StringBuffer();
        String[] words=empname.split(" ");
        for(String w:words){  
            System.out.println(w);  
            emailtemp.append(w);
        }  
        emailtemp.append(std);
        email=emailtemp.toString().toLowerCase();
        //System.out.println(email);
    }
        

    public void display()
    {
        System.out.println("\nEmployee ID: "+empid+
                            "\nEmployee name: "+empname+
                            "\nEmail ID: "+email);  
    }

}
public class employee {
    public static void main(String[] a)
    {
        StringBuffer fname=new StringBuffer();
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringBuffer lname=new StringBuffer();
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter Firstname: ");
        fname.append(sc.nextLine());
        System.out.println("Enter Lastname: ");
        lname.append(sc.nextLine());
        employees emp=new employees();
        emp.alloc();
        String name=emp.fullname(fname,lname);
        emp.emailalloc(name);
        emp.display();
    }
    
}
