package innerclass.test;

public class SimpleInnerClass {
	private int age = 12;
	
	class InnerClass{
		private int age = 13;
		public void print(){
			int age = 14;
			System.out.println("local variable age :"+age);
			System.out.println("Inner class variable age :"+this.age);
			System.out.println("Outer class variable age :"+SimpleInnerClass.this.age);
		}
	}
}
