import java.util.Scanner;
class MyClass {
	public static void main(String[] args) {
		Scanner myScanner = new Scanner(System.in);
		System.out.println("Enter name, age, and salary");
		String name = myScanner.nextLine();
		int age = myScanner.nextInt();
		float salary = myScanner.nextFloat();
		System.out.println("Name is : " + name);
		System.out.println("Age is : " + age);
		System.out.println("Salary is : " + salary);
	}
}