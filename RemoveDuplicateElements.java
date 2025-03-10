package Arrays;

import java.util.Arrays;

public class RemoveDuplicateElements {
    static int removerDuplicate(int[] arr, int n) {
        if (n == 0 || n == 1) {
            return n;
        }
        // creating another array for only storing the unique elements
        int[] temp = new int[n];
        int j = 0;
        for (int i = 0; i < n - 1; i++) {
            if (arr[i] != arr[i + 1]) {
                temp[j++] = arr[i];
            }
        }
        temp[j++] = arr[n - 1];
        // Changing the original array
        for (int i = 0; i < j; i++) {
            arr[i] = temp[i];
        }
        return j;
    }

    public static void main(String[] args) {
        //declaring and initializing an array
        int[] arr = {15, 20, 20, 67, 44, 44, 56, 56, 78};
        // Printing array as string
        System.out.println("arr[] = " + Arrays.toString(arr));
        int n = arr.length;
        //passing array and array length to method
        n = removerDuplicate(arr, n);
        // Printing The new array elements
        System.out.println("Array after removing duplicate values : ");
        for (int i = 0; i < n; i++)
            System.out.print(arr[i] + " ");
    }
    
}
