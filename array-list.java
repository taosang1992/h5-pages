import java.util.ArrayList;
class MyClass {
	public static void main(String[] args) {
		ArrayList<String> cars = new ArrayList<String>(); // Create an ArrayList object;
		cars.add("Volvo");
		cars.add("BMW");
		cars.add("Ford");
		cars.add("Mazda");
		
		for(int i = 0; i < cars.size();i++ ){
			System.out.print(cars.get(i)+"\t");
		}
		
		System.out.println(cars); // outputs [Volvo, BMW, Ford, Mazda]
		System.out.println(cars.get(0)); // access an item
		cars.set(0,"Opel");	// change an item
		System.out.println(cars);
		cars.remove(0); // remove an item
		System.out.println(cars);
		System.out.println(cars.size()); // get the length of ArrayList
		cars.clear(); // remove all the elements in the ArrayList
		System.out.println(cars); 
	}
}