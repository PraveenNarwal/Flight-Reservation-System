package com.company;
// inherited class regularTicket
public class RegularTicket extends Ticket {
    private String specialServices;
// constructor of RegularTicket
    public RegularTicket(String pnr, String from, String to, String departureDateTime, String arrivalDateTime, String seatNo, Flight flight, Passenger passenger, float price, boolean cancelled, String specialServices) {
        super(pnr, from, to, departureDateTime, arrivalDateTime, seatNo, flight, passenger, price, cancelled);
        this.specialServices = specialServices;
    }
    //get method to access the private instance
    public String getSpecialServices() {
        return specialServices;

    }

    public void updateSpecialServices(String specialServices) {
        this.specialServices = specialServices;
    }

}
