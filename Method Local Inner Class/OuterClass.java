class  OuterClass{
    int x = 15;
    static int y = 25;
   public void m1(){
       class InnerClass{
           public void printSomething(){
               System.out.println("The value of x = "+x);
               System.out.println("The value of y = "+y);
           }
       }
       InnerClass i = new  InnerClass();
       i.printSomething();
   }

   public static void m2(){
       class InnerClass{
           public void printSomething(){
               
               System.out.println("The value of y = "+y);
           }
       }
       InnerClass i = new  InnerClass();
       i.printSomething();
   }
   public static void main(String[] args){
       OuterClass o = new OuterClass();
       o.m1();
       o.m2();
       System.out.println("Outer class main method");
   }
}