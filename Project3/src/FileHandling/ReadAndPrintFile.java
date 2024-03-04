package FileHandling;
import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;
public class ReadAndPrintFile {

	public static void main(String[] args) {
		String filePath="D:\\Project3\\src\\FileHandling\\WriteToFile.java";
		
		try (BufferedReader br=new BufferedReader(new FileReader(filePath))) {
			String line;
			while((line=br.readLine())!=null){
				System.out.println(line);
				}
		}
	catch(IOException e) {
			e.printStackTrace();
		}

	}

}
