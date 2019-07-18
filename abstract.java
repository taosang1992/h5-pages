// abstract class
abstract  class Person {
	public String fname = "John";
	public int age = 26;
	public abstract void study();
}

// Subclass (inherit from Person)
class Student extends Person{
	public int graduationYear = 2018;
	public void study(){
		System.out.println("Study all day long");
	}
}


class MyClass{
	public static void main(String[] args) {
		Student myObj = new Student();
		System.out.println("Name: " + myObj.fname);		
		System.out.println("Age: " + myObj.age);		
		System.out.println("GraduationYear: " + myObj.graduationYear);
		myObj.study();	
	}
}