class Car {
	int modelYear;
	String modelName;
		public void fullThrottle(){
			System.out.println("The car is going as fast as it can!");
		}
		
		public void speed(int maxSpeed){
			System.out.println("Max speed is: " + maxSpeed);
		}
		public Car(int year, String name){
			modelYear = year;
			modelName = name;
		}
		
		public static void main(String[] args){
			Car myCar = new Car(1969,"Mustang");
			System.out.println(myCar.modelYear + " " + myCar.modelName);
			myCar.fullThrottle();
			myCar.speed(120);
		}
}