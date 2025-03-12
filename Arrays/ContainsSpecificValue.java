package Arrays;

import java.util.Arrays;
import java.util.Scanner;

public class ContainsSpecificValue {
     static boolean contains(int[] arr, int n) {
     
        for (int i : arr) {
           
            if (i == n) {
                return true;
            }
        }
        return false;
    }

    public static void main(String[] args) {
        int n;
       
        int[] arr = {10, 16, 33, 78, 85};
        System.out.print("Enter the value which should be searched : ");
        Scanner sc = new Scanner(System.in);
        n = sc.nextInt();
       
        boolean hasValue = contains(arr, n);
       
        if (hasValue) {
            System.out.println("Contains " + n + " in the array");
            System.out.println(Arrays.toString(arr));
        } else {
            System.out.println("Does not Contains " + n + " in the array");
            System.out.println(Arrays.toString(arr));
        }
    }
}
    

