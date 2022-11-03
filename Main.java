package com.bridgelabz.addressbook;

import java.util.ArrayList;
import java.util.Scanner;

public class Main extends AddressBook {
    public static void main(String[] args) {

        System.out.println(">>>>>>>>>>>>>>>[ WELCOME TO ADDRESS BOOK ]<<<<<<<<<<<<<<<");
        AddressBook addressBook = new AddressBook();
        addressBook.addMultipleAddressBook(addressBook);


    }
}
