package exceptionHandling;

public class NP {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String w=null;
		try {
			System.out.println(w.length());
		}
		catch(NullPointerException e) {
			System.out.println("String is not initialized");
		}

	}

}
