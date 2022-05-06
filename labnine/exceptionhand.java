import java.io.*;
import java.util.*;

public class exceptionhand {
    public static void main(String args[]) {
        try {
            throw new Myexception();
        }
        catch(Myexception e) {
            System.out.println("Incorrect ID");
        }
    }
}

class Myexception extends Exception {
    Myexception () {
        String teamID = "01";
        //String ID;
        Scanner sc =  new Scanner(System.in);
        System.out.println("Enter ID");
        String ID = sc.nextLine();
        if (teamID.equals(ID)) {
            System.out.println("ID Successful!");
        }
    }
}
