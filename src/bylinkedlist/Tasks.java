package bylinkedlist;

import java.util.LinkedList;
import java.util.Scanner;

public class Tasks {
    Scanner sc = new Scanner(System.in);
    LinkedList<String> linkedList = new LinkedList<>();

    public void addContact(LinkedList1 linkedlist1) {
        System.out.println("You have choosen to add a new contact: \n" + "Please enter the name of the Person: ");
        System.out.println("First Name : ");
        String firstName = sc.nextLine().trim();
        while(true) {
            if (firstName.matches("[A-Za-z]+")) {
                break;
            } else {
                System.out.println("Please enter the correct Name");
            }
            firstName = sc.nextLine().trim();
        }
        System.out.println("Last Name : ");
        String lastName = sc.nextLine().trim();
        while(true) {
            if (lastName.matches("[A-Za-z]+")) {
                break;
            } else {
                System.out.println("Please enter the correct name");
            }
            lastName = sc.nextLine().trim();
        }
        System.out.println("Contact Number : ");
        while (true) {
            String contact = sc.nextLine().trim();
            if (contact.matches("[0-9]{10}")) {
                linkedList.add(contact);
                break;
            }
        }
        while (true) {
            System.out.println("Would you like to add another contact number? (y/n):");
            char choice = sc.next().charAt(0);
            if (choice == 'y') {
                System.out.println("Contact Number : ");
                String contactNumber1 = sc.nextLine().trim();
                while (true) {
                    if (contactNumber1.matches("[0-9]{10}")) {
                        linkedList.add(contactNumber1);
                        break;
                    } else {
                        System.out.println("Add correct number");
                    }
                }
            } else {
                break;
            }
        }
        System.out.println("Enter your email address :");
        sc.nextLine();
        while (true) {
            String temp = sc.nextLine();
            if (temp.matches("^[a-z]+[0-9]*@[a-z]+\\.[a-z]+$")) {
                linkedlist1.addLast(new Person(firstName, lastName, linkedList, temp));
                break;
            } else {
                System.out.println("Invalid email address ! Enter again");
            }
        }
    }

    public void viewcontact(LinkedList1 linkedList1) {
        System.out.println("---Here are all your contacts---");
        if (!linkedList1.isEmpty()) {
            linkedList1.display();
        } else {
            System.out.println("No results Found");
        }
    }

    public void deleteContact(LinkedList1 linkedList1) {
        if (!linkedList1.isEmpty()) {
            System.out.println("Here are all the contacts: Press the number against" + " to delete the contact.");
            linkedList1.displayOne();
            int choice = sc.nextInt();
            sc.nextLine();
            linkedList1.deleteNode(choice);
            linkedList1.displayOne();
            System.out.println("Deleted..!!");
        } else {
            System.out.println("No Contacts.You must need to add contacts before you could delete..");
        }
    }


    public void searchContact(LinkedList1 linkedList1) {
        System.out.println("You could search for a contact with their first names: ");
        String firstName = sc.nextLine().trim();
        if (linkedList1.indexOf(firstName) >= 0) {
            System.out.println("Match Found.");
            linkedList1.getNode(linkedList1.indexOf(firstName));
        } else {
            System.out.println("No Match Found");
        }
    }
}
