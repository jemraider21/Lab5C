public class Order {
    String customerName;
    String customerAddress;
    double poundsOfHoney;
    
    public Order(String customerName, 
                 String customerAddress, 
                 double poundsOfHoney){
        
        this.customerName=customerName;
        this.customerAddress=customerAddress;
        this.poundsOfHoney=poundsOfHoney;         
    }
    
    public void setCustomerName(String customerName){
        this.customerName=customerName;
    }
    
    public void setCustomerAddress(String customerAddress){
        this.customerAddress=customerAddress;
    }
    
    public void setPoundsOfHoney(double poundsOfHoney){
        this.poundsOfHoney=poundsOfHoney;
    }
    
    public String getCustomerName(){
        return customerName;
    }
    
    public String getCustomerAddress(){
        return customerAddress;
    }
    
    public double getPoundsOfHoney(){
        return poundsOfHoney;
    }
    
}