import java.io.*;
import java.util.*;

class InvalidRtException extends Exception {
    InvalidRtException(String s)
	{
        super(s);
    }
}

public class except
{      
    static void validate(int rating)throws InvalidRtException {
        if(rating>5 && rating <0)
            {
                throw new InvalidRtException("Invalid Rating. Please Provide a rating (1-5)");
            }
        else 
            {
                System.out.println("Enter Product details");
            }
        }
    public static void main (String args[]) throws IOException
    {
        
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        try {
            String name= null;
            char r;
            int rating,first,agg,second,n,len;
            int a[] = new int[5];
            //System.out.println("Name: Aleena Mary Varghese \n");
            //System.out.println("Hello Candidate enter your basic details-->");
            System.out.println("Enter product name: ");
            name = br.readLine();
            if (name.length() == 0)
            {
                throw new NullPointerException("Please enter product name!"); 
            }
            else
            {
                System.out.println("---"+name+"---");
            }
            System.out.println("Enter your overall ratings");
            for (i = 0; i < 3; i++) {
                rating = Integer.parseInt(br.readLine());
                validate(rating);
            }
           
            System.out.println("Rate the product on the following paramenters");
            System.out.println("Affordable?");
            rating = Integer.parseInt(br.readLine());
            System.out.println("Practical?");
            second = Integer.parseInt(br.readLine());
			System.out.println("Usable?");
            len = Integer.parseInt(br.readLine());
            System.out.println("Usable?");
            
            for(int i=0;i<len;i++)
            {
                System.out.println("Enter scores of " +(i+1)+ " group: ");
                int rd = Integer.parseInt(br.readLine());
                a[i] = rd;
            }
            System.out.println("Enter from how much you wanna divide:");
            n = Integer.parseInt(br.readLine());
            agg = first + second / n;
            System.out.println("The aggregate value is: " +agg);
        
        }
        catch(ArithmeticException e){
            System.out.println(e);
            System.out.println("You can't divide a number by 0");
            
        }
        catch(NullPointerException e){
            System.out.println(e);
            System.out.println("You can't keep the name NULL! Enter your name");
        }
        catch(NumberFormatException e){
            System.out.println(e);
            System.out.println("You can enter only Integer values! String values not allowed");
        }
        catch(ArrayIndexOutOfBoundsException e){
            System.out.println(e);
            System.out.println("You can enter scores of maximum 3 groups");
        }
        catch(InvalidExpException e){
            System.out.println(e);
        }
        finally{
            System.out.println("Have a nice day!");
        }
    }
}
