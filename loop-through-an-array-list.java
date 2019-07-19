import java.util.ArrayList;
import java.util.Collections;

class MyClass {
	public static void main(String[] args) {
		ArrayList<String> cars = new ArrayList<String>(); // Create an ArrayList object;
		cars.add("Volvo");
		cars.add("BMW");
		cars.add("Ford");
		cars.add("Mazda");
		
		
		
		System.out.print("For Loop\t");
		for(int i = 0; i < cars.size();i++ ){
			System.out.print(cars.get(i)+"\t");
		}
		Collections.sort(cars); // Sort alphabetically
		System.out.print("\nForeach Loop\t");
		for (String car: cars){
			System.out.print(car + "\t");
		}
		
		ArrayList<Integer> myNumbers = new ArrayList<Integer>();
		myNumbers.add(33);
		myNumbers.add(15);
		myNumbers.add(20);
		myNumbers.add(34);
		myNumbers.add(8);
		myNumbers.add(17);
		myNumbers.add(12);
		
		Collections.sort(myNumbers); // Sort numerically
		System.out.print("\nloop an integer ArrayList\t");
		for(int item :myNumbers){
			System.out.print(item + "\t");
		}
	}
}