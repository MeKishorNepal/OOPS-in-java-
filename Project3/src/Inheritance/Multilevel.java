package Inheritance;
class A{
	void add() {
		int a=12,b=34;
		int sum=a+b;
		System.out.println(sum);
	}
}
class B extends A{
	void sub() {
	int a=12,b=45;
	int sub=b-a;
	System.out.println(sub);
	}
}
class C extends B{
	void multi() {
		int a=8,b=4;
		int multi=a*b;
		System.out.println(multi);
		
	}
}
public class Multilevel {

	public static void main(String[] args) {
		C obj=new C();
		obj.add();obj.sub();obj.multi();
		

	}

}
