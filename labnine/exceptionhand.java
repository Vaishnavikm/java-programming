import java.io.*;
import java.util.*;

public class exceptionhand {
    public static void main(String args[]) {
        int ClientID;
        String Password;
        try {
            throw new Myexception(3);
        } catch (Myexception e) {
            System.out.println("Invalid ID!");
        }
    }
}

class Myexception extends Exception {
    Myexception(int ClientID) {
        ClientID = 2;
    }
}
