public class Simple_Interest {
int princi,rate,time,sim;
	Simple_Interest(int princi,int time, int rate){
		this.princi=princi;
		this.rate=rate;
		this.time=time;
		//System.out.println(princi+rate+time);
	}
	Simple_Interest()
	{
		System.out.println("The simple interest =");
	}
	void display()
	{
	sim=princi*rate*time/100;
	System.out.println(+sim);
	}
	public static void main(String[]args)
	{
		Simple_Interest obj =new Simple_Interest(1000,10,1);
		Simple_Interest m= new Simple_Interest();
		obj.display();
		
	}
	}