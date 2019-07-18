class MyClass {
	public static void main(String[] args) {
		String[] cars = {"Apple","Banana","Cherry","Mazda"};
		int[] myNum = {10,20,30,40};
		System.out.println(cars[0]);
		System.out.println(cars.length);
		
		for(String item: cars){
			System.out.println(item);
		}
		
		for(int i = 0 ; i < myNum.length; i++){
			System.out.println(myNum[i]);
		}
		
		int[][] myNums = {
			{1,2,3,4},
			{5,6,7}
		};
		
		int x = myNums[1][2];
		System.out.println(x);
		
		for(int i = 0; i < myNums.length ;++i){
			for(int j = 0; j < myNums[i].length;++j){
				System.out.println(myNums[i][j]);
			}
		}
	}
}