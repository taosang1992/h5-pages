class MyClass {
	public static void main(String[] args) {
		if (20 > 18){
			System.out.println("20 is greater than 18");
			// we know that 20 is greater than 18, we print to the screen that " x is greater than Y"
		}else{
			System.out.println("20 is smaller than 18");
		}
		
		int time = 20;
		String result = (time > 18) ? "Good day." : "Good evening";
		System.out.println(result);
	}
}