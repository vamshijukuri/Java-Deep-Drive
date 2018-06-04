import com.mt.jdd.Student;

/**
 * 
 */

/**
 * @author Shree
 *
 */
public class HelloWorld {

	/**
	 * @param args
	 * @throws InterruptedException 
	 */
	public static void main(String[] args) throws InterruptedException {

		//System.out.println("Welocme to Java Deep Dive....Changed here");
		
		Student obj1=new Student(1, "Bharani", 150);
		//Student obj2=new Student(2, "Sachin", 200);
		
		//Student obj1=new Student();
		//obj1.setFee(250);
		
		for (int i=0;i <10000000; i++){
			
		Student obj=	new Student(1,"Test",123);
		Thread.sleep(1);
		}
		
		System.out.println(obj1.getId());
		System.out.println(obj1.getName());
		
		System.out.println(obj1.getFee());
		
		
		
	}

}
