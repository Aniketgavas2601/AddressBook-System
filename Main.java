package com.bridgelabz.addressbook;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        System.out.println(">>>>>>>>>>>>>>>[ WELCOME TO ADDRESS BOOK ]<<<<<<<<<<<<<<<");
        AddressBook addressBook = new AddressBook();
        Scanner sc = new Scanner(System.in);
        while (true){
            System.out.println("please Enter Your Choice:  ");
            System.out.println("""
                1 -> Add Contact\s
                2 -> Show Contact\s\s
                3 -> Update Contact\s""");
            int choice = sc.nextInt();

            switch (choice) {
                case 1:
                    addressBook.addUserDetails();
                    break;

                case 3:
                    addressBook.updateDetails();
                    break;

                case 2:
                    addressBook.show();
                    break;

                default:
                    System.out.println("Invalid Choice");
            }
        }
    }
}
