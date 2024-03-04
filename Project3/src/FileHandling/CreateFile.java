package FileHandling;
import java.io.File;
import java.io.IOException;
public class CreateFile {

	public static void main(String[] args) {
		try {
			File myobj=new File("Kishor12.txt");
			if(myobj.createNewFile()) {
				System.out.println("File created: "+myobj.getName());
			}
			else {
				System.out.println("The file is already exists");
			}
		}catch(IOException e) {System.out.println("An errror");
		e.printStackTrace();
		}
		
		

	}

}
