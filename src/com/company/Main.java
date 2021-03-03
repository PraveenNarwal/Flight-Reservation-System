package com.company;

public class Main {

    public static void main(String[] args) {
        // creating the object for regular and tourist ticket
        RegularTicket regularTicket = new RegularTicket("R-12356", "Delhi", "bangalore", "8:30", "13:00", "25", new Flight("654321", "AirIndia", 5, 1),
                new Passenger(1, "", "", "", "", "", ""), 12.0f, false, "food");
        TouristTicket touristTicket = new TouristTicket("T-12345", "", "", "", "", "", new Flight("", "", 5, 1),
                new Passenger(1, "oldCampus", "Hisar", "Haryana", "parveen", "98745613", "your@gmail.com"), 12.0f, false, 1, "addres");
// access the printTicketDetail method with object that we create
        printTicketDetails(regularTicket);
        printTicketDetails(touristTicket);
    }
    public static void printTicketDetails(Ticket ticket) {

        System.out.println("Pnr number ticket " + ticket.pnr);
    }


}
