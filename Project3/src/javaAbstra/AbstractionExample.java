package javaAbstra;
abstract class Animal{
	//abstract method (Does not have body)
	public abstract void animalSound();
	//REGULAR METHOD
	public void sleep() {
		System.out.println("dssdff");
}
}
//subclass (inherit from animal)
class Pig extends Animal{
	public void animalSound() {
		//The body of animalsound() is provided here
		System.out.println("The pig says:wee wee");
	}
	
}


public class AbstractionExample {

	public static void main(String[] args) {
		Pig p=new Pig();
		p.animalSound();
		p.sleep();
		

	}

}
