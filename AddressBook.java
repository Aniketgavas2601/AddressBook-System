package com.bridgelabz.addressbook;

import java.util.ArrayList;
import java.util.Scanner;

public class AddressBook {
    ArrayList<Contacts> contactDetails = new ArrayList<>();

    Scanner sc = new Scanner(System.in);

    // UC2: Add Contact Details
    public void addUserDetails(){
        Contacts userData = new Contacts();
        System.out.println("Enter First Name: ");
        userData.setFirstName(sc.next());
        System.out.println("Enter Last Name: ");
        userData.setLastName(sc.next());
        System.out.println("Enter Your Address: ");
        userData.setAddress(sc.next());
        System.out.println("Enter Your City: ");
        userData.setCity(sc.next());
        System.out.println("Enter Your State: ");
        userData.setState(sc.next());
        System.out.println("Enter a Zipcode: ");
        userData.setZip(sc.nextInt());
        System.out.println("Enter a Phone Number: ");
        userData.setPhoneNumber(sc.nextInt());
        System.out.println("Enter Email: ");
        userData.setEmail(sc.next());
        contactDetails.add(userData);
    }
    public void show(){
        System.out.println(contactDetails);
    }

}
