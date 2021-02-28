package com.company;

public class Ticket {
    public  String pnr,from,to,departureDateTime,arrivalDateTime,seatNo;
    public  Flight flight;
    public  Passenger passenger;
    public  float price;
    public  boolean cancelled;

    public  Ticket (){

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
