import java.io.*;
public class Thread_SN {
 
 public static void main(String[] args) throws IOException {
     int n;
     String[] arr;
    
     BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
	 System.out.println("PRESENTING SOUND NEST- A MUSIC CLUB FOR ALL");
     System.out.println("Here each part gets their own thread!");
     System.out.println("How many parts do you want to enter?");
     n = Integer.parseInt(br.readLine());
     arr = new String[n];
     for(int i=0;i<n;i++)
     {
         System.out.println("Enter the name of the part " +(i+1)+ ": ");
        arr[i] = br.readLine();
     }
    for(int i=0;i<n;i++)
    {
        SNThread canthread1 = new SNThread(arr[i]);
        canthread1.start();
    }
 }
}
class SNThread implements Runnable {
 Thread userthread;
 private String name;
 SNThread(String name) {
  this.name = name;
 }
 @Override
 public void run() {
  System.out.println(this.name +"'s Thread running\n");
  for (int i = 0; i < 2; i++) {
   System.out.println("Welcome! ");
   System.out.println(name);
   try {
    Thread.sleep(1000);
   } catch (InterruptedException e) {
    System.out.println("Thread has been interrupted");
   }
  }
 }
 public void start() {
  System.out.println("Thread started");
  if (userthread == null) {
   userthread = new Thread(this, name);
   userthread.start();
  }
 
 }
}
