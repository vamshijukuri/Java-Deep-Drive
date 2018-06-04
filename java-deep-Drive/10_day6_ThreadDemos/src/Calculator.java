
public class Calculator {
	volatile int a = 0;

	 void add() {
		try {
			synchronized(this){
			a++;
			}
			System.out.println("Add Thread Name=" + Thread.currentThread().getName() + "@@@a=" + a);
			Thread.sleep(5000);

		} catch (InterruptedException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		System.out.println("Add Mthod comple");
	}

	 void subtract() {
		try {
			synchronized(this){
			a--;
			}
			System.out.println("Subtract Thread Name=" + Thread.currentThread().getName() + "@@@a=" + a);
			Thread.sleep(5000);

		} catch (InterruptedException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}

	 void multiply() {
		try {
			synchronized(this){
				a = a * 3;
			}
			System.out.println("Multiply Thread Name=" + Thread.currentThread().getName() + "@@@a=" + a);
			Thread.sleep(5000);

		} catch (InterruptedException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}

	  void divide() {

		try {
			synchronized(this){
				a = a / 2;
			}
			System.out.println("Divide Thread Name=" + Thread.currentThread().getName() + "@@@a=" + a);
			Thread.sleep(5000);

		} catch (InterruptedException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}

}
