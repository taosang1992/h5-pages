class MyClass {
	int x = 5;
	final int y = 5;
	public static void main(String[] args) {
		MyClass myObj1 = new MyClass();
		MyClass myObj2 = new MyClass();
//		myObj1.y = 40;
		System.out.println(myObj1.x);
		System.out.println(myObj1.y); // 无法赋值，会报错
		System.out.println(myObj2.x);
	}
}