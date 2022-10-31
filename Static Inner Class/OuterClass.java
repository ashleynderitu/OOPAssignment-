class  OuterClass{
	static class InnerNestedClass{
		public void m1(){
			System.out.println("Static class Method");
		}
	}
	public static void main(String[] args){
		InnerNestedClass inc = new InnerNestedClass();
		inc.m1();
		System.out.println("Outer Main Method");
	}
}

class Test{
	public static void main(String[] args){
		OuterClass.InnerNestedClass inc = new OuterClass.InnerNestedClass();
		inc.m1();
		System.out.println("Test Main Method");
	}
}