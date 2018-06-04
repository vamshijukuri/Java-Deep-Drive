
public class RunnableDemo implements Runnable {

	Calculator obj;

	public RunnableDemo(Calculator calc) {
		this.obj = calc;
	}

	@Override
	public void run() {

		/*
		 * try { Thread.sleep(5000); System.out.println("Runnable Thread Name="
		 * + Thread.currentThread().getName()); } catch (InterruptedException e)
		 * { // TODO Auto-generated catch block e.printStackTrace(); }
		 * System.out.println("Hello World from runnable");
		 */
		obj.add();
		
		obj.multiply();
		obj.subtract();
		obj.divide();

	}

}
