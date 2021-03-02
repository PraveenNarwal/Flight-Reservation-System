package com.company;

public class TouristTicket extends  Ticket {
    private String hotelAddress;
    public  static String [] selectedTouristLocation = {"1","2","3","4","5"};

    public TouristTicket(String pnr, String from, String to, String departureDateTime, String arrivalDateTime, String seatNo, Flight flight,
                         Passenger passenger, float price, boolean cancelled, int touristLocation, String hotelAddress) {
        super(pnr, from, to, departureDateTime, arrivalDateTime, seatNo, flight, passenger, price, cancelled);
        this.hotelAddress = hotelAddress;
        if (touristLocation > 0 && touristLocation< 5 ){
            selectedTouristLocation[touristLocation] = String.valueOf(touristLocation);
        }
        else throw new RuntimeException("passenger seat invalid");
    }


    public  String getHotelAddress(){
        return  hotelAddress;

    }

    public  String getTouristLocations(){
        return "tourist  location get" ;

    }




}
