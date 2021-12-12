public class Grade {
	
	public static void main(String[] args) {
		
		int total=0;
		for(int i=0;i<args.length;i++) {
			total=total+Integer.parseInt(args[i]);
		}
		getoutput(total);

		

	}

	private static void getoutput(int total) {
		// TODO Auto-generated method stub
		System.out.println("Student has scored a total of "+total+" with average marks of "+total/5);
		getgrade(total/5);
	}

	private static void getgrade(int avg) {
		// TODO Auto-generated method stub
		avg=(int)avg/10;
		switch(avg) {
		case 10: System.out.println("Grade: A+- Pass");
		break;
		case 9: System.out.println("Grade: A- Pass");
		break;
		case 8: System.out.println("Grade: B- Pass");
		break;
		case 7: System.out.println("Grade: C- Pass");
		break;
		default: System.out.println("Grade: F - Fail");
		break;
		}
		
	}

}
