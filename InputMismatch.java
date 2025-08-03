package exceptionHandling;
import java.util.*;
public class InputMismatch {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner s=new Scanner(System.in);
		System.out.println("enter an integer");
		try {
			int n=s.nextInt();
			System.out.println("number is:"+n);
		}
		catch(InputMismatchException e) {
			System.out.println("enter only integer:"+e.getMessage());
		}

	}

}
