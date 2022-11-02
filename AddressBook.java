package com.bridgelabz.addressbook;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.Scanner;

public class AddressBook {
    ArrayList<Contacts> contactDetails = new ArrayList<>();

    Scanner sc = new Scanner(System.in);
    HashMap<String, ArrayList<Contacts>> hashMap = new HashMap<>();

    // UC2: Add Contact Details
    public void addUserDetails() {
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
    public void updateDetails() {
        System.out.println("Enter First And Last Name to Edit Details");
        System.out.println("Enter First Name: ");
        String first_Name = sc.next();
        System.out.println("Enter Last Name: ");
        String last_Name = sc.next();
        for (int i = 0; i < contactDetails.size(); i++) {
            Contacts contacts = contactDetails.get(i);
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

    // UC4: Delete a Contact Details From AddressBook Using First Name And Last Name
    public void deleteContactDetails() {
        if (contactDetails.size() == 0) {
            System.out.println("No Record Found");
        } else {
            System.out.println("Enter First Name And Last Name to Delete contact");
            System.out.println("Enter First Name: ");
            String first_Name = sc.next();
            System.out.println("Enter Last Name: ");
            String last_Name = sc.next();

            for (int i = 0; i < contactDetails.size(); i++) {
                Contacts contacts = contactDetails.get(i);
                if (contacts.getFirstName().equals(first_Name) && contacts.getLastName().equals(last_Name)) {
                    contactDetails.remove(i);
                    System.out.println();
                    System.out.println("Contact Deleted Successfully.");
                } else {
                    System.out.println("Data Is Not Exist");
                }
            }
        }
    }
    // UC5: Method To Add Multiple Person to Address Book
    public void addMultipleAddressBook(){
        AddressBook addressBook = new AddressBook();
        int ans;
        do {
            System.out.print("Enter Name for Address Book: ");
            String addressBookName = sc.next();

            if (hashMap.containsKey(addressBookName)) {
                System.out.println("The Address Book is already exist...\nPlease Rename Address Book.");
            } else {
                ArrayList<Contacts> contacts = new ArrayList<>();
                addressBook.menuOption(addressBook, contacts);
                hashMap.put(addressBookName, contacts);
            }
            System.out.println("AddressBook Added... \n" +hashMap+ " " + "\n");
            System.out.println("If you want to add another address book Press 1");
            System.out.println("For exit press 0 ");
            ans = sc.nextInt();
        } while (ans == 1);
    }
    //
    // UC6: Refactor the code
    public void menuOption(AddressBook addressBook, ArrayList<Contacts> contacts){

        while (true) {
            System.out.println("""
                    1 -> Add Contact\s
                    2 -> Show Contact\s\s
                    3 -> Update Contact\s""");
            System.out.println("please Enter Your Choice: ");
            int choice = sc.nextInt();

            switch (choice) {
                case 1:
                    addressBook.addUserDetails();
                    break;

                case 3:
                    addressBook.updateDetails();
                    break;

                case 4:
                    addressBook.deleteContactDetails();
                    break;

                case 5:
                    addressBook.show();
                    break;

                default:
                    System.out.println("Invalid Choice");
            }
        }
    }
}
