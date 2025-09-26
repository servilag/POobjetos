package gittest.Booking;
import gittest.Validate;

public class Train extends TransportService {
    private String SeatType;
    private int WagonNumber;
    
    public Train (){}
    
    public Train(int id, String origin, String destination, double price, String SeatType, int WagonNumber){
        super(id,origin,destination,price);
        this.setSeatType(SeatType);
        this.setWagonNumber(WagonNumber);
    }
    public void setSeatType(String SeatType){
        Validate.ValidateString(SeatType, "SeatType");
        this.SeatType=SeatType;
    }
    public void setWagonNumber(int WagonNumber){ 
        Validate.ValidateINT(WagonNumber,"Wagon number");
        this.WagonNumber=WagonNumber;
    }
    public String getSeatType(){
        return this.SeatType;
    }
    public int getWagonNumber(){
        return this.WagonNumber;
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
         String str= super.toString() +"\nSeatTpe:\t"+this.getSeatType()+"\nWagon Number:\t"+this.getWagonNumber();
         return str;
     }
}
