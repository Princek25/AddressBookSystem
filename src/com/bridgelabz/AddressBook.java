package com.bridgelabz;

import java.util.ArrayList;
import java.util.Scanner;

public class AddressBook {
    Scanner scanner = new Scanner(System.in);
    ArrayList<PersonDetails> contact = new ArrayList<>();
    PersonDetails personDetails = new PersonDetails();

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

    @Override
    public String toString() {
        return "AddressBook{" +
                ", contact=" + contact +
                '}';
    }
}
