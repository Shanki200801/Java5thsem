
public class MarksSheet {

	public static void main(String[] args) {
		float m1=Integer.parseInt(args[0]);
		float m2=Integer.parseInt(args[1]);
		float m3=Integer.parseInt(args[2]);
		String grade=null;
		int total=(int) (m1+m3+m3)/3;
		switch (total/10){
		case 10:
		case 9: grade= "A";
				break;
		case 8: grade= "B";
				break;
		case 7: grade= "C";
				break;
		case 6: grade= "D";
				break;
		case 5: grade= "E";
				break;
		default:grade="F";
				break;}
		System.out.println("The the total percent is "+Math.round(m1+m2+m3)/3);
		System.out.println("The grade obtained is "+grade);
			}
		}
	


