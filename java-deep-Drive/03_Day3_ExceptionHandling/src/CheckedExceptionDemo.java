import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;

public class CheckedExceptionDemo {

	public static void main(String[] args) throws IOException {

		String fileName = "F:\\F Drive\\sessions\\plurarlsight\\Spring\\SpringOne\\Java deep Dive\\day.txt";

		File obj = new File(fileName);
		FileReader fr=null;
		try {
			 fr = new FileReader(obj);
			while (fr.read() != -1) {
				System.out.print((char) fr.read());

			}
		} catch (FileNotFoundException e) {
			System.out.println("Inside the catch Block");
			e.printStackTrace();
		}
		
		finally{
			
			
			System.out.println("It will be called all times");
			
		}

		System.out.println("After Catch");

	}

}
