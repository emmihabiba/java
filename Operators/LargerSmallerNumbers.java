package Operators;

public class LargerSmallerNumbers {
    public static void main(String[] args) {
        int a = 20;
        int b = 35;
       
        int min = (a<b)?a:b;
        int max = (a>b)?a:b;
        System.out.println("Smaller Number is " + min);
        System.out.println("Larger Number is " + max);

        
        if (a > b) {
            System.out.println("Larger Number is " + a);
        } else {
            System.out.println("Smaller Number is " + a);
        }
        if (b > a) {
            System.out.println("Larger Number is " + b);
        } else {
            System.out.println("Smaller Number is " + b);
        }
    }
    
}
