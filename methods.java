class MyClass {
	public static void main(String[] args) {
		myMethod("Jack");
		myMethod("Rose");
		myMethod("Anja");
		myMethod("Jenny");
		int z = add(5,7);
		System.out.println(z);
		System.out.println(add(5,6));
	}
	
	static void myMethod(String name){
		System.out.println("Hello " + name);
	}
	
	static int add(int x, int y){
		return x + y;
	}
	
	static void checkAge(int age){
		if(age>18){
			System.out.println("You are old enough,Welcome!");
		}else{
			System.out.println("You are not old enough, Sorry!");
		}
	}
}