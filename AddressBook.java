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
    public void show() {
        if (contactDetails.size() == 0) {
            System.out.println("No Data Found");
        } else {
            for (int i = 0; i < contactDetails.size(); i++) {
                System.out.println(contactDetails.get(i) + " ");
            }
        }
    }

    // UC3: Update The Details In Existing Records
    public void updateDetails(){
        System.out.println("Enter First And Last Name to Edit Details");
        System.out.println("Enter First Name: ");
        String first_Name = sc.next();
        System.out.println("Enter Last Name: ");
        String last_Name = sc.next();
        for(int i=0 ; i < contactDetails.size(); i++) {
            Contacts contacts =  contactDetails.get(i);
            if (contacts.getFirstName().equals(first_Name) && contacts.getLastName().equals(last_Name)) {
                System.out.println("You can Update The Details");
                System.out.println("please Enter Your Choice:  ");
                System.out.println("\n 1 -> Edit First Name" +
                        "\n 2 -> Edit Last Name" +
                        "\n 3 -> Edit a Address" +
                        "\n 4 -> Edit a City" +
                        "\n 5 -> Edit a State" +
                        "\n 6 -> Edit a Zipcode" +
                        "\n 7 -> Edit a Phone Number" +
                        "\n 8 -> Edit a Email");

                int choice = sc.nextInt();

                switch (choice) {
                    case 1:
                        String updateFirstName = sc.next();
                        contacts.setFirstName(updateFirstName);
                        break;

                    case 2:
                        String updateLastName = sc.next();
                        contacts.setLastName(updateLastName);
                        break;

                    case 3:
                        String updateAddress = sc.next();
                        contacts.setAddress(updateAddress);
                        break;

                    case 4:
                        String updateCity = sc.next();
                        contacts.setCity(updateCity);
                        break;
                    case 5:
                        String updateState = sc.next();
                        contacts.setState(updateState);
                        break;

                    case 6:
                        int updateZip = sc.nextInt();
                        contacts.setZip(updateZip);
                        break;

                    case 7:
                        int updatePhoneNumber = sc.nextInt();
                        contacts.setPhoneNumber(updatePhoneNumber);
                        break;

                    case 8:
                        String updateEmail = sc.next();
                        contacts.setEmail(updateEmail);
                        break;

                    default:
                        System.out.println("Enter Correct Choice");
                }

            } else {
                System.out.println("Data Not Found");
            }
        }
    }

}
