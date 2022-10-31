class  OuterClass{
	int x = 15;
	static int y = 25;
	class InnerClass{
		public void m1(){
			System.out.println("The value of x = "+x);
			System.out.println("The value of y = "+y);
		}
	}
	public void m2(){
		InnerClass i = new  InnerClass();
		i.m1(); 
	}
	public static void main(String[] args){
		OuterClass o = new OuterClass();
		o.m2();
		System.out.println("Outer class main method");
	}
}
