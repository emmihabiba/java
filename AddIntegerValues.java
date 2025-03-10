package Arrays;

public class AddIntegerValues {

    static int arrSum(int[] arr) {
        int sum = 0;
        for (int i = 0; i < arr.length; i++)
            sum = sum + arr[i];
        return sum;
    }

    public static void main(String[] args) {
       
        int[] arr = {20, 26, 45, 55, 58};
       
        for (int i : arr)
            System.out.print(i + " + ");
   
        System.out.print(" =  " + arrSum(arr));
    }
}