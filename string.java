class Myclass {
	public static void main(String[] args) {
		String greeting = "Hello World";
		System.out.println("The length of the txt string is :" + greeting.length());
		System.out.println(greeting.toUpperCase());
		System.out.println(greeting.toLowerCase());
		System.out.println(greeting.indexOf("Hello"));
		
		String firstName = "John ";
		String lastName = "Doe";
		System.out.println(firstName + ' ' + lastName);
		System.out.println(firstName.concat(lastName));
		
		String txt = "We are the so-called \"Vikings\" from the north";
		System.out.println(txt);
		
		String txt2 = "The charactor \\ is called backslash.";
		System.out.println(txt2);
		
		
		String x = "10";
		String y = "20";
		System.out.println(x + y);
		
		String a = "10";
		int b = 24;
		System.out.println(a + b);
		
	}
}