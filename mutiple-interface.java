interface FirstInterface{
	public void myMethod();
}

interface SecondInterface{
	public void myOtherMethod();
}

class DemoClass implements FirstInterface, SecondInterface {
	public void myMethod(){
		System.out.println("my method is implemented from FirstInterface");
	}
	
	public void myOtherMethod(){
		System.out.println("my another method is implemented from SecondInterface");
	}
}

class MyMainClass {
	public static void main(String[] args) {
		DemoClass myObj = new DemoClass();
		myObj.myMethod();
		myObj.myOtherMethod();
	}
}