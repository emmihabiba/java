package Operators;

public class Logical {
    public static void main(String[] args) {
        int a = 25;
        int b = 15;
        int c = 6;
       
        System.out.println(a > b && a > c); 
        System.out.println(a < b && a < c); 
        System.out.println(a > b && a < c); 

       
        System.out.println(a > b || a > c);
        System.out.println(a < b || a < c); 
        System.out.println(a < b || a > c); 

        //Logical NOT [!()]
        System.out.println(!(a > b));      
        System.out.println(!(a < b));     
    }
}
    

