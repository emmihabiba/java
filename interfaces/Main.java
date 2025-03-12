package interfaces;
interface Vehicle {
    void start();        
    void stop();     
}
class Car implements Vehicle {
    @Override
    public void start() {
        System.out.println("The car has started.");
    }

  
}

public class Main {
    public static void main(String[] args) {
       
        Vehicle myCar = new Car();
        
       
        myCar.start(); 

      
    }
}