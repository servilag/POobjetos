package gittest.Booking;

public class TransportService {
    private int id;
    private String origin;
    private String destination;
    private double price;
    
    public TransportService(){}
    
    public TransportService(int id, String origin, String destination, double price){
        this.setId(id);
        this.setOrigin(origin);
        this.setDestination(destination);
        this.setPrice(price);
    }
    
    public final void setId(int id){
        this.id = id;
    }
    
    public final void setOrigin(String origin){
        this.origin = origin;
    }
    
    public final void setDestination(String destination){
        this.destination = destination;
    }
    
    public final void setPrice(double price){
        this.price = price;
    }
    
    public int getId(){
        return id;
    }
    
    public String getOrigin(){
        return origin;
    }
    
    public String getDestination(){
        return destination;
    }
    
    public double getPrice(){
        return price;
    }
    
    public String toString(){
        String str = "TRANSPORT INFORMATION" + "\nID: " + this.getId() 
                + "\nOrigin: " + this.getOrigin() + "\nDestination: " + this.getDestination()
                + "\nPrice: " + this.getPrice();
                
        return str;
    }//hola
    
    public abstract String getServiceInformation();
    public abstract String getLuggageInformation();
}

