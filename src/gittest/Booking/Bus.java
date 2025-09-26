package gittest.Booking;
import gittest.Validate;

public class Bus extends TransportService{
    private String BusCompany;
    private String BoardingPoint;
    
    public Bus (){}
    
    public Bus(int id, String origin, String destination, double price, String BusCompany, String BoardingPoint){
        super(id,origin,destination,price);
        this.setBusCompany(BusCompany);
        this.setBoardingPoint(BoardingPoint);
    }
    public void setBusCompany(String BusCompany){
        Validate.ValidateString(BusCompany, "BusCompany");
        this.BusCompany=BusCompany;
    }
    public void setBoardingPoint(String BoardingPoint){
        Validate.ValidateString(BusCompany, "Bus Company");
        this.BoardingPoint=BoardingPoint;
    }
    public String getBusCompany(){
        return this.BusCompany;
    }
    public String getBoardingPoint(){
        return this.BoardingPoint;
    }
    @Override
    public String getServiceInformation(){
        String str="on tracks";
        return str;
    }
    @Override
    public String getLuggageInformation(){
        String str="Half full";
        return str;
    }
     @Override
     public String toString(){
         String str= super.toString() +"\nBusCompany:\t"+this.getBusCompany()+"\nBoarding Point:\t"+this.getBoardingPoint();
         return str;
     }
}
