package PMS;

public class Clients {
    public static int ID;
    public static String Client_password;
    public String Name;
    public String Phone;
    public String Address;
    public String Email;
    public String Project;

    public static void updateClient() {

    }

    public static void searchClient() {

    }

    public static void allocate() {
        int ID = 001;
        String Client_password = "ABC@123";
        System.out.println("\n************Project info*******************\n");
        System.out.println("Project_ID: "+ID);
        System.out.println("Password: "+Client_password);
    }

    public void client_det(int ID, String Client_password) {
            System.out.println("Project_ID: "+ID);
            System.out.println("Password: "+Client_password);
    }
}
