class OuterClass{
	int x = 10;
//	private class InnerClass{ // 执行会报错
//	protected class InnerClass{ // 执行会报错
//	class InnerClass{ 
	static class InnerClass{ // An Inner class can also be static, which means that you can access it without creating an object of the outer class
		int y = 5;
	}
}


class MyMainClass {
	public static void main(String[] args) {
//		OuterClass myOuter = new OuterClass();
//		OuterClass.InnerClass myInner = myOuter.new InnerClass();
//		System.out.println(myInner.y + myOuter.x);
		OuterClass.InnerClass myInner = new OuterClass.InnerClass();
		System.out.println(myInner.y);
	}
}