import java.util.*;

public class Q6 {
    public static void main(String[] args) {
        int[] arr = {1, 4, 6, 7, 6, 2};
        int value = 6;
        int count = 0;

        System.out.print("Original array: [");
        for (int i = 0; i < arr.length; i++) {
            System.out.print(arr[i]);
            if (i < arr.length - 1)
                System.out.print(", ");
        }
        System.out.println("]");
        for (int num : arr) {
            if (num != value)
                count++;
        }

        System.out.println("The length of the new array is: " + count);
    }
}