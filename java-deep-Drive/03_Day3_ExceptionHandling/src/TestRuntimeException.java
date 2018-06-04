import java.io.IOException;

public class TestRuntimeException {

	public static void main(String[] args) throws IOException {

		RuntimeExceptionDemo demoObj=new RuntimeExceptionDemo();
		double result=0;
		
			result = demoObj.divide(1, 0);
		
		System.out.println(result);
	}

}
