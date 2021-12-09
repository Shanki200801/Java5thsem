class MultithreadingDemo implements Runnable{ 
public void run(){  
System.out.println("Thread implementing runnable interface is in running state.");  
}
}   
class ThreadDemo extends Thread{ 
public void run(){  
System.out.println("thread extending thread class is in running state.");  
}   
public static void main(String args[]){  
ThreadDemo obj=new ThreadDemo(); 
MultithreadingDemo obj2= new MultithreadingDemo();
Thread tobj=new Thread(obj2);
obj.start();  
tobj.start();

}  
}