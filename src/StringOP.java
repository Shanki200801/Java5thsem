import java.io.*;
public class StringOP {
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String mystring= new String();
		InputStreamReader r=new InputStreamReader(System.in);
		BufferedReader br=new BufferedReader(r);
		System.out.println("Enter a string");
		try {
			mystring=br.readLine();
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		System.out.println("The entered string is "+mystring);
		operate(mystring);
		
	}

	private static void operate(String mystring) {
		// TODO Auto-generated method stub
		System.out.println("name in upper case "+mystring.toUpperCase());
		System.out.println("Character at index 3 is"+mystring.charAt(3));
		System.out.println("is the given string empty? "+mystring.isEmpty());
		System.out.println("length of string "+mystring.length());
		System.out.println("Concatinating hello to name: "+mystring.concat(", Hello"));
		char name[]=mystring.toCharArray();
		System.out.println("converting string to an array of characters ");
		for (int i=0;i<name.length;i++) {
			System.out.print(name[i]+" ");
		}
		System.out.println(mystring.toLowerCase().startsWith("s")==true?"\nYour name stasts with s":"\nYour name does not start with s");
		
		
		
	}

}
