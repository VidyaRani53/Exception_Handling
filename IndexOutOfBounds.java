package exceptionHandling;
import java.util.*;

public class IndexOutOfBounds {
    public static void main(String[] args) {
        int arr[] = {10, 20, 30, 40};
        Scanner s = new Scanner(System.in);
        System.out.println("Enter index number: ");
        int i = s.nextInt();

        try {
            System.out.println("Element at given index is: " + arr[i]);
        } catch (ArrayIndexOutOfBoundsException e) {
            System.out.println("Array index out of range: " + e);
        }
    }
}
