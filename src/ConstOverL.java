class democlass{
	democlass(){
		System.out.println("No argument constructer is loaded");		
	}
	democlass(int n){
		System.out.println("Single argument constructer loaded and arg is "+n);
	}
	democlass(String a,int n){
		System.out.println("multi argument constructer loaded and args are "+a+" and "+n);
	}
}
public class ConstOverL {

	public static void main(String[] args) {
		democlass obj1=new democlass();
		democlass obj2=new democlass(5);
		democlass obj3=new democlass("shanki",5);
	}
}
