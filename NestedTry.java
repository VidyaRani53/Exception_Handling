package exceptionHandling;
import java.util.*;
public class NestedTry {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner s=new Scanner(System.in);
		System.out.println("enter a,b values");
		int a=s.nextInt();
		int b=s.nextInt();
		int arr[]= {10,20,30,40};
		System.out.println("enter index value");
		int i=s.nextInt();
		try {
			System.out.println("Division is:"+a/b);
			try {
			System.out.println("index value is:"+arr[i]);
			}
			catch(ArrayIndexOutOfBoundsException e) {
				System.out.println("array index out of range"+e.getLocalizedMessage());
			}
		}
		catch(ArithmeticException e) {
			System.out.println("donot enter zero in the denominator");
		}

	}

}
