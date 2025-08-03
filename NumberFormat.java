package exceptionHandling;
import java.util.*;
public class NumberFormat {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner s=new Scanner(System.in);
		String w="abc";
		try {
			int n=Integer.parseInt(w);
			System.out.println("number is:"+n);
		}
		catch(NumberFormatException e) {
			System.out.println("Invalid number format,"+e.getMessage());
		}
	}

}
