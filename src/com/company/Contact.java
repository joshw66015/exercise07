package com.company;
public class Contact {
    public String name;
    public String email;
    public Contact() {
    }
    public Contact(String name, String email) {
        this.name = name;
        this.email = email;
    }
    public String getName() {
        return name;
    }
    public void setName(String name) {
        this.name = name;
    }
    public String getEmail() {
        return email;
    }
    public void setEmail(String email) {
        this.email = email;
    }
    @Override
    public String toString() {
        return "Contact{" +
                "\nname='" + name + '\'' +
                "\n, email='" + email + '\'' + "\n" +
                '}';
    }
}
