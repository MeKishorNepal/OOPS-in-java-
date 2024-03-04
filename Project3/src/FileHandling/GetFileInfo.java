package FileHandling;
import java.io.File;
public class GetFileInfo {

	public static void main(String[] args) {
		File obj=new File("Kishor12.txt");
		if(obj.exists()) {
			System.out.println("File name: "+obj.getName());
			System.out.println("Absolute path: "+obj.getAbsolutePath());
			System.out.println("Writeable: "+obj.canWrite());
			System.out.println("Readable: "+obj.canRead());
			System.out.println("File size in byte "+obj.length());
		}
		else {
			System.out.println("The file is not exits");
		}
		

	}

}
