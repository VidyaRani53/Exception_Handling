package exceptionHandling;
import java.util.*;
public class StringIndex {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner s=new Scanner(System.in);
		String w="SRGEC";
		System.out.println("enter index to display value");
		int i=s.nextInt();
		try {
			System.out.println("index value is:"+w.charAt(i));
		}
		catch(StringIndexOutOfBoundsException e) {
			System.out.println("string index out of range");
		}

	}

}
