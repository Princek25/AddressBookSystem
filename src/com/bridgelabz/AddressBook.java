package com.bridgelabz;

public class AddressBook {
    public String firstName;
    public String lastName;
    public String state;
    public String city;
    public String email;
    public int zip;
    public long phoneNumber;

    public AddressBook(String firstName, String lastName, String state, String city, String email, int zip, long phoneNumber) {
        this.firstName = firstName;
        this.lastName = lastName;
        this.state = state;
        this.city = city;
        this.email = email;
        this.zip = zip;
        this.phoneNumber = phoneNumber;
    }

    @Override
    public String toString() {
        return "AddressBook{" +
                "firstName='" + firstName + '\'' +
                ", lastName='" + lastName + '\'' +
                ", state='" + state + '\'' +
                ", city='" + city + '\'' +
                ", email='" + email + '\'' +
                ", zip=" + zip +
                ", phoneNumber=" + phoneNumber +
                '}';
    }
}
