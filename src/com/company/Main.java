package com.company;

public class Main {

    public static void main(String[] args) {
        // write your code here
        RegularTicket regularTicket = new RegularTicket(" pnr", "", "", "", "", "", new Flight("", "", 5, 1),
                new Passenger(1, "", "", "", "", "", ""), 12.0f, false, "food");
        TouristTicket touristTicket = new TouristTicket(" pnr1", "", "", "", "", "", new Flight("", "", 5, 1),
                new Passenger(1, "", "", "", "", "", ""), 12.0f, false, 1, "addres");

        printTicketDetails(regularTicket);
        printTicketDetails(touristTicket);
    }


    public static void printTicketDetails(Ticket ticket) {
//        if (ticket instanceof RegularTicket) {
//            RegularTicket regularTicket = (RegularTicket) ticket;
//
//        } else {
//            TouristTicket touristTicket = (TouristTicket) ticket;
//        }
        System.out.println("Pnr no is   " + ticket.pnr);
    }


}
