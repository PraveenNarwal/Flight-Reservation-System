package com.company;

public class Main {

    public static void main(String[] args) {
	// write your code here
        Address addressObject = new Address();
        Ticket ticketObject = new Ticket();
        System.out.println(addressObject.getAddressDetails() );
        System.out.println(ticketObject.checkStatus());

    }
}
