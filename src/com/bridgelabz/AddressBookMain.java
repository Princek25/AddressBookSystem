package com.bridgelabz;

public class AddressBookMain {
    public static void main(String[] args) {
        System.out.println("Welcome to Address Book Program in AddressBookMain class on Main Branch");
        AddressBook addressBook = new AddressBook();
        addressBook.addContact();
        System.out.println(addressBook);
        addressBook.editContact();
        System.out.println(addressBook);
        System.out.println("Thanks for using Address Book 📝");
    }
}
