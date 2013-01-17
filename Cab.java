package abc;

public class Cab {
    String cabNo;
    boolean isRunning;
    int totalSeats;
    //String type;
    int distance;
    public Cab(){
    }
    
    
    // To check status of a car..
    public boolean isRunning(Cab c){
        if(c.isRunning==true){
            return true;
        }
        else{
            return false;
        }    
    }
    //Car No.
    public String getCabNo(Cab c){
        return c.cabNo;
    }
    
}
