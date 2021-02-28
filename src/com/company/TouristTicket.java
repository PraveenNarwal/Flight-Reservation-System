package com.company;

public class TouristTicket extends  Ticket {
    private String hotelAddress;
    public  String [] selectedTouristLocation;

    public TouristTicket(){

    }


    public  String getHotelAddress(){
        return  "hotel address get";

    }

    public  String getTouristLocations(){
        return "tourist  location get" ;

    }

    public  void  removeTouristLocations(String  location){

    }
    public  void  addTouristLocations(String location){

    }


}
