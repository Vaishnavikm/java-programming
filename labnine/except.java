import java.io.*;
//User defined Exception for checking the  minimum experience
class InvalidExpException extends Exception{
    InvalidExpException(String s)
	{
        super(s);
    }
}
public class Except
{       //This method will be called to check if the Invalid experience exception class is being called or not 
        static void validate(int experience)throws InvalidExpException{
            if(experience<1)
            {
                throw new InvalidExpException("Your experience is not valid to apply");
            }
            else{
                System.out.println("You can proceed!");
            }
        }
    public static void main(String args[])throws IOException
    {
        
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        try{
            String name= null;
            char r;
            int experience,first,agg,second,n,len;
            int a[] = new int[5];
            System.out.println("Name: Aleena Mary Varghese \n");
            System.out.println("Hello Candidate enter your basic details-->");
            //System.out.println("Do you want to enter your name(y/n)");
            //r = (char)br.read();
            //if(r== 'n')
            //{
            //System.out.println("The length of your name is: " +name.length() );
            //}
            System.out.println("Enter your name:");
            name = br.readLine();
            //Here we'll be checking the Null pointer exception to see if the name is null or not
            if (name.length() == 0)
            {
                throw new NullPointerException("Please enter your name!"); 
            }
            else
            {
                System.out.println("nice name!");
            }
            //System.out.println("The length of your name is: " +name.length() );
            System.out.println("Enter your experience in this club:");
            experience = Integer.parseInt(br.readLine());
            // The validate method to check experience exception
            validate(experience);
			
            
            System.out.println("Enter your credits obtained at the first year:");
            //We can check number pointer exception here
            first = Integer.parseInt(br.readLine());
            System.out.println("Enter the credits obtained at the second year:");
            second = Integer.parseInt(br.readLine());
			System.out.println("How many  music credit scores of soundnest groups do you want to enter:");
            len = Integer.parseInt(br.readLine());
            
            for(int i=0;i<len;i++)
            {
                System.out.println("Enter scores of " +(i+1)+ " group: ");
                int rd = Integer.parseInt(br.readLine());
                a[i] = rd;
            }
            System.out.println("Enter from how much you wanna divide:");
            n = Integer.parseInt(br.readLine());
            // Here I'll be checking the Arithemtic error dividing it by zero
            agg = first + second / n;
            System.out.println("The aggregate value is: " +agg);

        
        }
        //catch(Exception e){
            //System.out.println("This is the exception that occured: "+e);
        //}
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
