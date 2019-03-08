package com.company;

public class Main {
    public static void main(String[] args) {
        Contact newContact = new Contact("Josh", "jw651352@gmail.com");
        BusinessContact newBusinessContact = new BusinessContact("Josh","jw651352@gmail.com", "614-820-0941");
        newContact.toString();
        newBusinessContact.toString();
    }
}
