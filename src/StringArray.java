import java.util.Scanner;
import java.util.Arrays;
public class StringArray {
	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter length of array");
		int n=sc.nextInt();
		sc.nextLine();
		String[] string_array= new String[n];
		System.out.println("Enter n strings into the array");
		for(int i=0;i<string_array.length;i++) {
			string_array[i]=sc.nextLine();
		}		
		Arrays.sort(string_array);
		System.out.println(Arrays.toString(string_array));
	}
}
