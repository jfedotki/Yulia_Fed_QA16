package com.TelRan.qa.model;

public class ContactData {
    String firstName,lastName,email1,phone,address;

    public ContactData(String firstName, String lastName, String email1, String phone, String address) {
        this.firstName = firstName;
        this.lastName = lastName;
        this.email1 = email1;
        this.phone = phone;
        this.address = address;
    }

    public ContactData() {
    }

    public String getFirstName() {
        return firstName;
    }

    public String getLastName() {
        return lastName;
    }

    public String getEmail1() {
        return email1;
    }

    public String getPhone() {
        return phone;
    }

    public String getAddress() {
        return address;
    }

    public ContactData setFirstName(String firstName) {

        this.firstName = firstName;
        return this;
    }

    public ContactData setLastName(String lastName) {

        this.lastName = lastName;
        return this;
    }

    public ContactData setEmail1(String email1) {
        this.email1 = email1;
        return this;
    }

    public ContactData setPhone(String phone) {
        this.phone = phone;
        return this;
    }

    public ContactData setAddress(String address) {
        this.address = address;
        return this;
    }

    @Override
    public String toString() {
        return "ContactData{" +
                "firstName='" + firstName + '\'' +
                ", lastName='" + lastName + '\'' +
                ", email1='" + email1 + '\'' +
                ", phone='" + phone + '\'' +
                ", address='" + address + '\'' +
                '}';
    }
}
