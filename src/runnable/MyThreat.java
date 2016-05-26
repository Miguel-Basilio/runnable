package runnable;

public class MyThreat implements Runnable {
private final long counter;

public MyThreat(long counter){
	this.counter = counter;
}

@Override 
public void run()
{
	long sum =0;
	for (long i=1; i <counter; i++){
		sum +=1;
	}
	//Thread.currentThread().getName();
	System.out.println(sum);
	
		
}
	
	
}
