import java.util.logging.*;

class MyClass {
	enum Level {
		LOW,
		MEDIUM,
		HIGH
	}
	
	public static void main(String[] args) {
		Level myLevel = Level.MEDIUM;
		System.out.println(myLevel);
		
		switch (myLevel) {
			case LOW:
				System.out.println("LOW level");
				break;
			case MEDIUM:
				System.out.println("MEDIUM level");
				break;
			case HIGH:
				System.out.println("HIGH level");
				break;	
			default:
				break;
		}
		
		for(Level myGrade: Level.values()){
			System.out.println(myGrade);
		}

	}
}