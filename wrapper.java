class MyClass {
	public static void main(String[] args) {
		Integer myInt = 5;
		Double myDouble = 5.99;
		Character myChar = 'A';
		System.out.println(myInt);	// 5
		System.out.println(myInt.intValue());	// 5
		System.out.println(myDouble);	// 5.99
		System.out.println(myDouble.doubleValue());	// 5.99
		System.out.println(myChar);	// A
		System.out.println(myChar.charValue());	// A
		
		Integer myInt2 = 1000;
		String myString = myInt2.toString();
		System.out.println(myString.length());	// 4
		
	}
}