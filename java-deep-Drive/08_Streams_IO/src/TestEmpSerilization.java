import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.InputStream;
import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;
import java.io.OutputStream;

public class TestEmpSerilization {

	public static void main(String[] args) throws IOException, ClassNotFoundException {

		Employee obj = new Employee(1, "Bharani", 24000);

		// Conerting to Streams
		String filePath = "C:\\src\\jdd-emp.txt";
		File f = new File(filePath);

		/*OutputStream fos = new FileOutputStream(f);

		ObjectOutputStream oos = new ObjectOutputStream(fos);
		oos.writeObject(obj);
		oos.close();
		fos.close();*/

		// Read from the File

		InputStream fis = new FileInputStream(f);
		ObjectInputStream ois = new ObjectInputStream(fis);
		Employee deSeri =(Employee) ois.readObject();
		ois.close();
		ois.close();
		
		
	}

}
