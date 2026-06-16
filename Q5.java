import java.util.*;

class Q5 {
    public static void main(String[] args) {
        int[] arr = {1, 2, 3, 4, 5};
        int n = 2;

        int index = arr.length - n;

        System.out.println("Original node:");
        for (int num : arr) {
            System.out.print(num + " ");
        }

        System.out.println("\nAfter removing 2nd element from end:");
        for (int i = 0; i < arr.length; i++) {
            if (i != index) {
                System.out.print(arr[i] + " ");
            }
        }
    }
}