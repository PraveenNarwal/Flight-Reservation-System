package com.company;

public class Passenger {
    public int id;
    private Address address;
    private Contact contact;
    private  int passengerCount;
    private static int idCounter = 0;
    //get method to access the private instance
    public Address getAddress() {
        return address;
    }
    //get method to access the private instance
    public Contact getContact() {
        return contact;
    }

//    constructor of passenger class
    public Passenger(int id, String street, String city, String state, String name, String phone, String email) {
        this.id = id;
        this.address = new Address(street, city, state);
        this.contact = new Contact(name, phone, email);
        idCounter++;
    }
    //get method to access the private instance
    public int getPassengerCount() {
        return idCounter;
    }

    private static class Contact {                    //nested class of contact
        public String name, phone, email;
        private  String contactDetails;
        //    constructor of contact class
        public Contact(String name, String phone, String email) {
            this.name = name;
            this.phone = phone;
            this.email = email;
        }

        public String getContactDetails() {
            return contactDetails;

        }

        public void updateContactDetails(String contactDetail) {

        }
    }

    private static class Address {                                  // nested class of address
        private String street, city, state;
        private String addressDetails;
//  set method used to modified the value
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


