package com.company;

abstract class Ticket {
    public  String pnr,from,to,departureDateTime,arrivalDateTime,seatNo;
    public  Flight flight;
    public  Passenger passenger;
    public  float price;
    public  boolean cancelled;

    public Ticket(String pnr, String from, String to, String departureDateTime, String arrivalDateTime, String seatNo, Flight flight, Passenger passenger, float price, boolean cancelled) {
        this.pnr = pnr;
        this.from = from;
        this.to = to;
        this.departureDateTime = departureDateTime;
        this.arrivalDateTime = arrivalDateTime;
        this.seatNo = seatNo;
        this.flight = flight;
        this.passenger = passenger;
        this.price = price;
        this.cancelled = cancelled;
    }

    public  String checkStatus(){
        return "check status in ticket class";

    }
    public  int getFlightDuration(){
        return   4;

    }
    public  void  cancel(){

    }

}
