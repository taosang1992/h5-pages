class DemoClass {
	static void myStaticMethod(){
		System.out.println("Static methods can be called without creating objects");	
	}
	
	public  void myPublicMethod(){
		System.out.println("Public methods can be called by creating objects");
	}
	
	
	public static void main(String[] args) {
		myStaticMethod();
		DemoClass myObj = new DemoClass();
		myObj.myPublicMethod();
	}
}