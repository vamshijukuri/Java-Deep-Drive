
public class TestRunnable {

	public static void main(String[] args) throws InterruptedException {

		Runnable obj=new RunnableDemo(new Calculator());
		System.out.println("Main Thread Name=" + Thread.currentThread().getName());
		//obj.run();
		Thread T1=new Thread(obj);
		Thread T2=new Thread(obj);
		Thread T3=new Thread(obj);
		Thread T4=new Thread(obj);
		
		long startTime=System.currentTimeMillis();
		T1.start();
		T2.start();
		T3.start();
		
		T4.start();
		T4.join();
		T3.join();
		T2.join();
		T1.join();
		
		long endTime=System.currentTimeMillis();
		
		System.out.println("Duration=" + (endTime - startTime));
	}

}
