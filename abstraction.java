abstract class Animal {
	public abstract void animalSound();
	// An abstract class can have both abstract and regular method
	public void sleep(){
		System.out.println("Zzz");
	}
}
class Pig extends Animal{
	public void animalSound(){
		System.out.println("The pig says: wee wee");
	}
}

class MyClass {
	public static void main(String[] args) {
//		Animal myObj = new Animal(); // will generate an error;
		Pig myPig = new Pig();
		myPig.animalSound();
		myPig.sleep();
	}
}

