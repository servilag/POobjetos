package gittest.Booking;

public class Flight extends TransportService{
    private String AirLine;
    private String SeatClass;
    
    public Flight (){}
    
    public Flight(int id, String origin, String destination, double price, String AirLine, String SeatClass){
        super(id,origin,destination,price);
        this.setAirLine(AirLine);
        this.setSeatClass(SeatClass);
    }
    public void setAirLine(String AirLine){
        this.AirLine=AirLine;
    }
    public void setSeatClass(String SeatClass){
        this.SeatClass=SeatClass;
    }
    public String getAirLine(){
        return this.AirLine;
    }
    public String getSeatClass(){
        return this.SeatClass;
    }
    @Override
    public String getServiceInformation(){
        String str="Flight";
        return str;
    }
    @Override
    public String getLuggageInformation(){
        String str="Half full";
        return str;
    }
     @Override
     public String toString(){
         String str= super.toString() +"\nAirline:\t"+this.getAirLine()+"\nSeat class:\t"+this.getSeatClass();
         return str;
     }
}
