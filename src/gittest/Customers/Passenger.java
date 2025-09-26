package gittest.Customers;
import gittest.Validate;
import gittest.Booking.TransportService;

public class Passenger extends Person{
    private String passportNumber;
    private TransportService transportservice;
    
    public Passenger(){}
    
    public Passenger(String name, int age, String passportNumber){
        this.setPassportNumber(passportNumber);
    }
    
    public final void setPassportNumber(String passportNumber){
        Validate.ValidateSTRNUM(passportNumber, "passport Number");
        this.passportNumber = passportNumber;
    }
    
    public String getpassportNumber(){
        return this.passportNumber;
    }
    
    public void addTransportService(TransportService transportservice){
        this.transportservice = transportservice;
    }
    
    @Override
    public String toString(){
        String str = super.toString();
            str += "Passport number: " + this.passportNumber;
            str += this.transportservice.toString();
            
        return str;
    }
}

