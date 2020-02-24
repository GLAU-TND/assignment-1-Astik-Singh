package bylinkedlist;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        LinkedList1 linkedList1 = new LinkedList1();
        Tasks tasks = new Tasks();
        System.out.println("Welcome to Astik's Contact List App");
        System.out.println("Press 1 to add a new Contact");
        System.out.println("Press 2 to view all Contacts");
        System.out.println("Press 3 to search for a Contact");
        System.out.println("Press 4 to delete a Contact");
        System.out.println("Press 5 to exit program");
        int choice = Integer.parseInt(sc.nextLine());
        if (choice == 1) {
            tasks.addContact(linkedList1);
            choice = Integer.parseInt(sc.nextLine());
        }
        if (choice == 2) {
            tasks.viewcontact(linkedList1);
            choice = Integer.parseInt(sc.nextLine());
        }
        if (choice == 3) {
            tasks.searchContact(linkedList1);
            choice = Integer.parseInt(sc.nextLine());
        }
        if (choice == 4) {
            tasks.deleteContact(linkedList1);
            choice = Integer.parseInt(sc.nextLine());
        }
        if (choice == 5) {
            System.out.println("App Terminate");
        }
    }
}
