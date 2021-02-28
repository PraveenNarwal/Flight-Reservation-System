package com.company;

public class Passenger {
    public  int id;
    public  Address address;
    public  Contact contact;
    private  static  int idCounter;

    public  Passenger(){
        this.id = idCounter;

    }
    public  int getPassengerCount(){
        return idCounter;
    }


    private  static  class  Contact{

    }
    private  static  class  Address{

    }



}
