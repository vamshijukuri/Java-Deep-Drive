import java.io.IOException;

public class RuntimeExceptionDemo {
	
	public double divide(int a,int b) throws IOException{
		
		if (b==0){
			
			throw new RuntimeException("Infinity Exception");
		}
		
		return a/b;
	}

}
