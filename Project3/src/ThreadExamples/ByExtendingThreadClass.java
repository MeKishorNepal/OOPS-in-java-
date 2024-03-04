package ThreadExamples;
class A extends Thread{
	public void run() {
		for(int i=0;i<5;i++) {
			System.out.println("Kishor");
		}
		
	}
}
public class ByExtendingThreadClass {

	public static void main(String[] args)throws Exception {
		A t=new A();
		t.start();
		for(int i=0;i<5;i++) {
			System.out.println("Nepal");
			Thread.sleep(1000);
		}
		

	}

}
