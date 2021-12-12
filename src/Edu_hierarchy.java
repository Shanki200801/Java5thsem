class School_edu{
	String institute;
	boolean certificate;
	School_edu(boolean deg, String institute){
		certificate=deg;
		this.institute=institute;
		}
	void display() {
		if(certificate==true)
			System.out.println("Passed out from "+institute);
		else
			System.out.println("Doesnt hold the degree");
	}
}
class Pre_uni_edu extends School_edu{

	Pre_uni_edu(boolean deg, String institute) {
		super(deg, institute);
	}
}
class Bach_deg extends Pre_uni_edu{

	Bach_deg(boolean deg, String institute) {
		super(deg, institute);
	}
}
class Mas_deg extends Bach_deg{

	Mas_deg(boolean deg, String institute) {
		super(deg, institute);
	}
	
}
public class Edu_hierarchy {

	public static void main(String[] args) {
		Mas_deg shashank= new Mas_deg(false,"St josephs");
		Bach_deg Akash= new Bach_deg(true,"St josephs");
		Akash.display();
		shashank.display();
	}

}
