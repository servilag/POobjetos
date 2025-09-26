package gittest;

import gittest.Booking.*;
import gittest.Customers.*;

public class GitTest {

    public static void main(String[] args) {
        
        try{
            Bus trans1 = new Bus(123, "Dubai" , "Bahamas", 12.99, "LimBusCompany" , "P3");
            Flight trans2 = new Flight(456, "Miami", "Mexico", 3.99, "Avianca", "E3T");
            Train trans3= new Train(789, "Bogota", "cali", 60.99, "Metrolinea", 8); 
            
            System.out.println("TRANSPORTS AVAILABLE");
            System.out.println(trans1.toString());
            System.out.println(trans2.toString());
            System.out.println(trans3.toString());
              
            
       }catch(Exception e){
            System.out.println("You are taking too long " + e.getMessage());
           
       }
        
        
        
    }
    
}
