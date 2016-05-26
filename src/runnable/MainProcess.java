package runnable;

public class MainProcess {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		System.out.println("Start");
		for (int i =0; i<50; i ++){
			Runnable T1 = new MyThreat(10000000L + i);
			Thread worker = new Thread(T1);
			worker.setName(String.valueOf(100));
			worker.start();
			
			Runnable T2 = new MyThreat(10000000L + 2 * i);
			Thread worker2 = new Thread(T2);
			worker.setName(String.valueOf(100));
			worker2.start();
			}
		System.out.println("Complete");
	}

	}
