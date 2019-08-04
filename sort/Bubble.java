class MyClass {
	
	public static void main(String[] args) {
		int[] nums = {30,20,40,10};
		int n = nums.length;
		for (int i = 0; i < n - 1; i++){
			for(int j = 0; j < n - 1 - i ; j++){
				if(nums[j] > nums[j+1]){
					int tmp = nums [j];
					nums[j] = nums[j+1];
					nums[j+1] = tmp;
				}
			}
		}
		
		for (int i = 0; i < n; i++){
			System.out.println(nums[i]);
		}
	}
}