package com.bridgelabz;

import java.util.ArrayList;
import java.util.Scanner;

public class AddressBook {
    Scanner scanner = new Scanner(System.in);
    ArrayList<PersonDetails> contact = new ArrayList<>();
    PersonDetails personDetails = new PersonDetails();

    public void mainMenu() {
        boolean b = true;
        while (b) {
            System.out.println(" Press 1 to Add Contact \n Press 2 to Edit Contact(Add Contact First)");
            System.out.println(" Press 3 to Delete Contact(Add Contact First) \n Press 4 to Add Multiple Contact \n Press 5 to Exit");
            int option = scanner.nextInt();
            scanner.nextLine();
            switch (option) {
                case 1:
                    addContact();
                    break;
                case 2:
                    editContact();
                    break;
                case 3:
                    deleteContact();
                    break;
                case 4:
                    addMultipleContact();
                    break;
                case 5:
                    b = false;
                    break;
                default:
                    System.out.println("Invalid Option....!!..Enter Again..");
                    break;
            }
        }
    }

    public void addContact() {
        System.out.print("First Name: ");
        personDetails.setFirstName(scanner.next());
        System.out.print("Last Name: ");
        personDetails.setLastName(scanner.next());
        System.out.print("State: ");
        personDetails.setState(scanner.next());
        System.out.print("City: ");
        personDetails.setState(scanner.next());
        System.out.print("Email: ");
        personDetails.setEmail(scanner.next());
        System.out.print("ZIP: ");
        personDetails.setZip(scanner.nextInt());
        System.out.print("Phone: ");
        personDetails.setPhoneNumber(scanner.nextLong());
        contact.add(personDetails);
        System.out.println("Your Contact saved as:-");
        System.out.println(personDetails);
    }

    public void editContact() {
        System.out.print("Enter Y to Edit and N to Exit: ");
        Scanner scanner = new Scanner(System.in);
        String option = scanner.nextLine();
        if (option.equals("Y")) {
            System.out.print("Enter First Name to Edit Contact: ");
            String editName = scanner.nextLine();
            if (editName.equals(personDetails.getFirstName())) {
                addContact();
            } else {
                System.out.println("Invalid Name...!!...Please Enter Valid First Name");
                editContact();
            }
        } else if (option.equals("N")) {
        } else System.out.println("Invalid.. Enter Y and N Only");
    }

    public void deleteContact() {
        System.out.println("Enter the first name of person to delete contact");
        String editName = scanner.nextLine();
        if (editName.equals(personDetails.getFirstName())) {
            System.out.println("Deleted " + personDetails.getFirstName() + " Contact Successfully");
            personDetails = null;
        } else System.out.println("Input does not match..");
    }

    public void addMultipleContact() {
        System.out.print("Enter Number of Contact to Add: ");
        int num = scanner.nextInt();
        for (int i = 1; i <= num; i++) {
            addContact();
        }
    }

    @Override
    public String toString() {
        return "AddressBook{" +
                ", contact=" + contact +
                '}';
    }
}
