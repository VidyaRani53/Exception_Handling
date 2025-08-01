package exceptionHandling;
import java.util.*;
public class AE {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner s=new Scanner(System.in);
		System.out.println("enter two numbers");
		int a=s.nextInt();
		int b=s.nextInt();
		try {
			System.out.println("division is:"+(a/b));
		}
		catch(ArithmeticException e) {
			System.out.println("donot enter 0 in the denominator");
		}
		

	}

}
