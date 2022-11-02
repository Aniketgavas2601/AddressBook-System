package com.bridgelabz.addressbook;

public class Contacts {
    private String firstName;
    private String lastName;
    private String address;
    private String city;
    private String state;
    private int zip;
    private int phoneNumber;
    private String email;

    //parameterized constructor
    public Contacts(String firstName, String lastName, String address, String city, String state, int zip, int phoneNumber, String email){
        this.firstName = firstName;
        this.lastName = lastName;
        this.address = address;
        this.city = city;
        this.state = state;
        this.zip = zip;
        this.phoneNumber = phoneNumber;
        this.email = email;
    }
    
    //toString Method

    @Override
    public String toString() {

       return ">>>>>>>>>>>>[ Contact Details ]<<<<<<<<<<<< "+
               "\n --------------------------------------------"+
               "\n First Name: "+firstName+
               "\n LAst Name: "+lastName+
               "\n Address: "+address+"" +
               "\n City: "+city+
               "\n State: "+state+
               "\n Zipcode: "+zip+"" +
               "\n Phone Number: "+phoneNumber+"" +
               "\n Email: "+email+
               "\n --------------------------------------------";
    }

}
