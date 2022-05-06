import java.io.*;
import java.util.*;
abstract class create_file {
    //constructor
    public create_file() {
        System.out.println("Add Meeting Details");
    }
    public void create_file(String fileName) {
        try {
            File file = new File(fileName);
            if (file.createNewFile()) {
                System.out.println("File is created!");
            } else {
                System.out.println("File already exists.");
            }
        } catch (IOException e) {
            e.printStackTrace();
        }
    }
}

//class to do read, write and delete operations

class read_delete extends create_file {
    //constructor
    public read_delete() {
        super();
    }

    
    public void read_file(String fileName) {
        try {
            File file = new File(fileName);
            if (file.exists()) {
                Scanner sc = new Scanner(file);
                while (sc.hasNextLine()) {
                    System.out.println(sc.nextLine());
                }
                sc.close();
            } else {
                System.out.println("File does not exist!");
            }
        } catch (IOException e) {
            e.printStackTrace();
        }
    }

    public void WriteTofile(String fileName) {
        try {
            FileWriter myWriter = new FileWriter(fileName);
            myWriter.write("Files in Java might be tricky, but it is fun enough!");
            myWriter.close();
            System.out.println("Successfully wrote to the file.");
          } catch (IOException e) {
            System.out.println("An error occurred.");
            e.printStackTrace();
          }
    }
    

    public void delete_file(String fileName) {
        try {
            File file = new File(fileName);
            if (file.exists()) {
                file.delete();
                System.out.println("File is deleted!");
            } else {
                System.out.println("File does not exist!");
            }
        } catch (NullPointerException e) {
            e.printStackTrace();
        }
    }
    
}

//class to do display operations

class display extends read_delete {
    //final method to display the file
    public final void display_file(String fileName) {
        try {
            File file = new File(fileName);
            if (file.exists()) {
                Scanner sc = new Scanner(file);
                while (sc.hasNextLine()) {
                    System.out.println(sc.nextLine());
                }
                sc.close();
            } else {
                System.out.println("File does not exist!");
            }
        } catch (IOException e) {
            e.printStackTrace();
        }
    }
    
}
public class labseven extends display {
    public static void main(String[] args) {
        String fileName = args[0];
        labseven obj = new labseven();
        //menu driven
        int choice;
        Scanner sc = new Scanner(System.in);
        do {
            System.out.println("1. Create File");
            System.out.println("2. Read File");
            System.out.println("3. Delete File");
            System.out.println("4. Display File");
            System.out.println("5. Write to File");
            System.out.println("6. Exit!");
            System.out.println("Enter your choice");
            choice = sc.nextInt();
            switch (choice) {
                case 1:
                    obj.create_file(fileName);
                    break;
                case 2:
                    obj.read_file(fileName);
                    break;
                case 3:
                    obj.delete_file(fileName);
                    break;
                case 4:
                    obj.display_file(fileName);
                    break;
                case 5:
                    obj.WriteTofile(fileName);
                    break;
                case 6:
                    System.out.println("Exit");
                    break;
                default:
                    System.out.println("Invalid choice");
            }
        } while (choice != 6);

    }
    
}
