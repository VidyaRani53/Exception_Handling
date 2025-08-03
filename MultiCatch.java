package exceptionHandling;
import java.util.*;
public class MultiCatch {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner s=new Scanner(System.in);
		System.out.println("enter two values");
		int a=s.nextInt();
		int b=s.nextInt();
		int arr[]= {10,20,30,40};
		System.out.println("enter index value");
		int i=s.nextInt();
		try {
			System.out.println("division is:"+a/b);
			System.out.println("index value is:"+arr[i]);
		}
		catch(ArithmeticException e) {
			System.out.println("donot zero in the denominator");
		}
		catch(ArrayIndexOutOfBoundsException e) {
			System.out.println("index out of range");
		}
	}

}
