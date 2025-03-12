package Arrays;

import java.util.Arrays;

public class CommonValuesInTwoArrays {
     static void commonValues(int[] arr1, int[] arr2) {
      
        for (int k : arr1) {
        
            for (int i : arr2) {
                
                if (k == i) {
                    
                    System.out.println("Common values : " + k);
                }
            }
        }
    }

    public static void main(String[] args) {
    
        int[] arr1 = {13, 33, 55, 54, 67};
        int[] arr2 = {65, 55, 27, 41, 18};
        System.out.println("arr1[] = " + Arrays.toString(arr1));
        System.out.println("arr2[] = " + Arrays.toString(arr2));
        
        commonValues(arr1, arr2);
    }
}
    
