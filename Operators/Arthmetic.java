package Operators;

public class Arthmetic {
    static void addition(int a, int b) {
        int add = a + b;
        System.out.println("Addition of a + b = " + add);
    }

    static void subtraction(int a, int b) {
        int sub = a - b;
        System.out.println("Subtraction of a - b = " + sub);
    }

    static void multiplication(int a, int b) {
        int mul = a * b;
        System.out.println("Multiplication of a * b = " + mul);
    }

    static void division(int a, int b) {
        int div = a / b;
        System.out.println("Division of a / b = " + div);
    }

    public static void main(String[] args) {
        int a = 46;
        int b = 33;
        
        addition(a, b);
        subtraction(a, b);
        multiplication(a, b);
        division(a, b);
    }
    
}
