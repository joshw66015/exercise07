package com.company;

public class BusinessContact extends Contact {
    private String phoneNumber;
    public BusinessContact(String name, String email, String phoneNumber) {
        super(name, email);
        this.phoneNumber = phoneNumber;
    }
    @Override
    public String toString() {
        return "Contact{" +
                "\nname: '" + name + '\'' +
                "\nemail: '" + email + '\'' +
                "\nphone number: '" + phoneNumber + '\'' +
                "\n" +'}' ;
    }
}