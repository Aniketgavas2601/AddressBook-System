package com.bridgelabz.addressbook;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        System.out.println(">>>>>>>>>>>>>>>[ WELCOME TO ADDRESS BOOK ]<<<<<<<<<<<<<<<");
        Contacts contacts = new Contacts("Aniket","Gavas", "Sb Road", "Mumbai", "Maharashtra", 400067, 983456964,"aniket45@gmail.com");
        System.out.println(contacts.toString());
    }
}
