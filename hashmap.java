import java.util.HashMap;
class MyClass {
	public static void main(String[] args) {
		HashMap<String,String> capitalCities = new HashMap<String,String>();
		capitalCities.put("England","London");
		capitalCities.put("China","Beijing");
		capitalCities.put("Japan","Tokyo");
		capitalCities.put("USA","Washington DC");
		capitalCities.put("Germany","Berlin");
		capitalCities.put("Norway","Oslo");
		capitalCities.put("Korean","soul");
		
		System.out.println(capitalCities);
		// outputs {USA=Washington DC, Norway=Oslo, China=Beijing, Japan=Tokyo, England=London, Korean=soul, Germany=Berlin}
		System.out.println(capitalCities.get("China")); // access an item
		
		capitalCities.remove("England"); // remove an item
		System.out.println(capitalCities);
		// outputs {USA=Washington DC, Norway=Oslo, China=Beijing, Japan=Tokyo, Korean=soul, Germany=Berlin}
		
		System.out.println(capitalCities.size()); // the size of hashmap
		
		System.out.println("loop HashMap's keys\t");
		for(String index: capitalCities.keySet()){
			System.out.print(index+"\t");
		}
		
		System.out.println("\nloop HashMap's values\t");
		for(String value: capitalCities.values()){
			System.out.print(value+"\t");
		}
		
		System.out.println("\nloop HashMap's values and values\t");
		for(String index: capitalCities.keySet()){
			System.out.println("Key : " + index + ", Value : " +capitalCities.get(index));
		}
		capitalCities.clear(); // remove all items;
		System.out.println("\n"+capitalCities); // outputs {}
		
		HashMap<String,Integer> people = new HashMap<String,Integer>();
		people.put("Jack",20);
		people.put("Rose",18);
		people.put("Divid",21);
		
		for(String i : people.keySet()){
			System.out.println("Key : " + i + ", Value : " + people.get(i));
		}
	}
}