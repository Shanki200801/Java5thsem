import java.util.Scanner;
public class FloydTri {
	public static void main(String[] args) {
	Scanner sc= new Scanner(System.in);
	System.out.println("Enter the no. of rows of FT");
	int n= sc.nextInt();
	int x=1;
	for (int i=1;i<=n;i++) {
		System.out.println(" ");
		for( int j=1; j<i+1;j++) {
			System.out.print(x+" ");
			x++;
				}
			}
	
		}	
	}