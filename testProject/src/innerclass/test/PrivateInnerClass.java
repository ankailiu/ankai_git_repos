package innerclass.test;

public class PrivateInnerClass {
	
	private int age = 12;
     
    private class InnerClass {
        public void print() {
            System.out.println(age);
        }
    }
    
    public void outPrint() {
        new InnerClass().print();
    }

}
