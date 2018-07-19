package com.TelRan.QA16;

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

    public void setFirstName(String firstName) {
        this.firstName = firstName;
    }

    public void setLastName(String lastName) {
        this.lastName = lastName;
    }

    public void setEmail1(String email1) {
        this.email1 = email1;
    }

    public void setPhone(String phone) {
        this.phone = phone;
    }

    public void setAddress(String address) {
        this.address = address;
    }

    @Override
    public String toString() {
        return "com.TelRan.QA16.ContactData{" +
                "firstName='" + firstName + '\'' +
                ", lastName='" + lastName + '\'' +
                ", email1='" + email1 + '\'' +
                ", phone='" + phone + '\'' +
                ", address='" + address + '\'' +
                '}';
    }
}
