import java.io.BufferedReader;
import java.io.File;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;

public class FileIO {

	public static void main(String[] args) throws IOException {

		String filePath="C:\\src\\jdd-file.txt";
	/*	FileOutputStream oos=new FileOutputStream(new File(filePath));
		BufferedOutputStream bos=new BufferedOutputStream(oos);
		bos.write(45);
		bos.write(54);
		bos.close();
		oos.close();*/
		
		/*FileInputStream fis=new FileInputStream(new File(filePath));
		while(fis.read()  !=-1){
			System.out.println(fis.read());
		}*/
		
		/*FileReader fr=new FileReader(new File(filePath));
		BufferedReader br=new BufferedReader(fr);
		while(true){
			System.out.println(br.readLine());
			if(br.read()==-1){
				break;
			}
		}*/
		
		
		FileWriter fw=new FileWriter(new File(filePath));
		fw.append("Entering Here");
	//	fw.write("I am testing ");
		
		fw.close();
		
		
	}

}
