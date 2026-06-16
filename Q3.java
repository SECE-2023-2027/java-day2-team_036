import java.util.*;

public class Q3 {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("enter two strings");
        String str1 = sc.nextLine();
        String str2 = sc.nextLine();

        // Remove the first character of each string
        String result = str1.substring(1) + str2.substring(1);

        System.out.println(result);
    }
}