package com.company;

public class RegularTicket extends Ticket {
    public String specialServices;

    public RegularTicket(String pnr, String from, String to, String departureDateTime, String arrivalDateTime, String seatNo, Flight flight, Passenger passenger, float price, boolean cancelled, String specialServices) {
        super(pnr, from, to, departureDateTime, arrivalDateTime, seatNo, flight, passenger, price, cancelled);
        this.specialServices = specialServices;
    }


//    public RegularTicket(Flight flight, String specialServices){
//        super(flight);
//        this.specialServices = specialServices;
//
//    }

    public String getSpecialServices() {
        return specialServices;

    }

    public void updateSpecialServices(String specialServices) {
        this.specialServices = specialServices;
    }

}
