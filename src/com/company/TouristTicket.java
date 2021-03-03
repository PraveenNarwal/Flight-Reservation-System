package com.company;
// inherited class regularTicket

public class TouristTicket extends  Ticket {
    private String hotelAddress, touristLocations;
    public  static String [] selectedTouristLocation = {"1","2","3","4","5"};
// constructor of TouristTicket

    public TouristTicket(String pnr, String from, String to, String departureDateTime, String arrivalDateTime, String seatNo, Flight flight,
                         Passenger passenger, float price, boolean cancelled, int touristLocation, String hotelAddress) {
        super(pnr, from, to, departureDateTime, arrivalDateTime, seatNo, flight, passenger, price, cancelled);
        this.hotelAddress = hotelAddress;
        if (touristLocation > 0 && touristLocation < 5 ){
            selectedTouristLocation[touristLocation] = String.valueOf(touristLocation);
        }
        else {
            System.out.println("invalid");
        }
    }

    //get method to access the private instance
    public  String getHotelAddress(){
        return  hotelAddress;

    }
    //get method to access the private instance
    public  String getTouristLocations(){
        return touristLocations ;

    }
}
