import java.io.*;
import java.util.*;

class InvalidhrsException extends exception {
    InvalidHrsException (String s) {
        super(s);
    }
}

public class Exception {
    static void validate(int hours)throws InvalidExpException {
        if(hours<8)
            {
                throw new InvalidHrsException("");
            }
        else 
            {
                System.out.println("Enter your team details");
            }
        }

    public static void main(String args[]) {
        
    }
}