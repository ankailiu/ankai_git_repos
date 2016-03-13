package innerclass.test;

public class MethodInnerClass {
	   private int age = 12;
	   public void outPrint(final int x) {
	        class InnerClass {
	            public void inPrint() {
	                System.out.println(x);
	                System.out.println(age);
	            }
	        }
	        new InnerClass().inPrint();
	    }
}
