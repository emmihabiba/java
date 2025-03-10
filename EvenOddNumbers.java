package Arrays;

import java.util.Arrays;

public class EvenOddNumbers {
     static void evenNumber(int[] arr) {
        System.out.print("Even numbers in array : ");
       
        for (int i : arr) {
        
            if (i % 2 == 0) {
                System.out.print(i + "  ");
            }
        }
    }
    
    static void oddNumber(int[] arr) {
        System.out.print("\nOdd numbers in array : ");
     
        for (int j : arr) {
         
            if (j % 2 != 0) {
                System.out.print(j + "  ");
            }
        }
    }

    public static void main(String[] args) {
   
        int[] arr = {15, 20, 25, 30, 35};
        System.out.println("a[] = " + Arrays.toString(arr));
        
        evenNumber(arr);
 
        oddNumber(arr);
    }
    
}
