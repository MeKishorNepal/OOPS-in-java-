package ThreadExamples;
class Hy implements Runnable{
	public void run() {
		for(int i=0;i<5;i++) {
			System.out.println("hy");
			try {Thread.sleep(500);}catch(Exception e) {}
		}
	}
	
}
class hello implements Runnable{
	public void run() {
		for(int i=0;i<5;i++) {
			System.out.println("hello");
			try {Thread.sleep(500);}catch(Exception e) {}
		}
		
	}
}
public class javaRunnableExample1 {

	public static void main(String[] args) {
		Hy obj=new Hy();
		hello obj2=new hello();
		
		Thread t1=new Thread(obj);
		Thread t2=new Thread(obj2);
		
		t1.start();
		try {Thread.sleep(500);}catch(Exception e) {}
		t2.start();

	}

}
