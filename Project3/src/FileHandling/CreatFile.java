package FileHandling;
import java.io.*;
public class CreatFile {

	public static void main(String[] args) {
		File f=new File("C:\\Users\\Public\\Desktop");
		try {
			if(f.createNewFile()) {
				System.out.println("file created succefuly");
			}
			else {
				System.out.println("file exist");
			}
		}catch(IOException e) {
			System.out.println("handle");
		}
		}


	}


