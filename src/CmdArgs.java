
public class CmdArgs {

	public static void main(String[] args) {
		int i,sum=0;
		System.out.println("Your cmd line arguments are");
		for (i=0;i<args.length;i++)
			{System.out.println(args[i]);
			sum+=Integer.parseInt(args[i]);}
		System.out.println("number of arguments is "+i);
		System.out.println("The sum of your arguments is "+sum);

}}
