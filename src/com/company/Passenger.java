package com.company;

public class Passenger {
    public int id;
    public Address address;
    public Contact contact;
    private static int idCounter = 0;

    public Address getAddress() {
        return address;
    }

    public Contact getContact() {
        return contact;
    }

    public Passenger(int id, String street, String city, String state, String name, String phone, String email) {
        this.id = id;
        this.address = new Address(street, city, state);
        this.contact = new Contact(name, phone, email);
        idCounter++;
    }

    public int getPassengerCount() {
        return idCounter;
    }

    private static class Contact {
        public String name, phone, email;

        public Contact(String name, String phone, String email) {
            this.name = name;
            this.phone = phone;
            this.email = email;
        }

        public String getContactDetails() {
            return "contact detail in contact classs";

        }

        public void updateContactDetails(String contactDetail) {

        }
    }

    private static class Address {
        public String street, city, state;

        public void setStreet(String street) {
            this.street = street;
        }

        public void setCity(String city) {
            this.city = city;
        }

        public void setState(String state) {
            this.state = state;
        }

        public String getStreet() {
            return street;
        }

        public String getCity() {
            return city;
        }

        public String getState() {
            return state;
        }

        public String getAddressDetails() {
            return this.city + this.state;

        }

        public void updateAddressDetails(String addressDetail) {

        }

        public Address(String street, String city, String state) {
            this.street = street;
            this.city = city;
            this.state = state;
        }
    }
}


