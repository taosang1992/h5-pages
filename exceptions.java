class MyClass {
	static void checkAge(int age){
		if(age < 18){
			throw new ArithmeticException("Access denied - You must be at least 18 years old.");
		}else{
			System.out.println("Access granted - You are old enough");
		}
	}
	public static void main(String[] args) {
		try{
			int[] myNumbers = {1,2,3,4};
			System.out.println(myNumbers[10]);
		}catch(Exception e){
			System.out.println("something went wrong");
		}finally{
			System.out.println("The 'try catch' is finished.");
		}
		
//		checkAge(15); // throw an exception
		checkAge(20); // Access granted - You are old enough
		/* output
		*Something went wrong.
		*The 'try catch' is finished.
		*/
		
		
		
	}
}