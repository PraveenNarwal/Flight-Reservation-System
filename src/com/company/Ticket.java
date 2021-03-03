package com.company;

abstract class Ticket {
    // public attribute declare to access the outside of class and private are only accessed inside the class but we can fetch the
//    detail using getter and setter method
    public  String pnr,from,to,departureDateTime,arrivalDateTime,seatNo;
    public  Flight flight;
    private int flightDuration;
    public  Passenger passenger;
    public  float price;
    public  boolean cancelled;
// Ticket constructor is declared and  initialize  attributes of the class
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
        return   flightDuration;

    }
    public  void  cancel(){

    }

}
