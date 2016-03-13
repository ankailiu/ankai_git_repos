package innerclass.test;

public class StaticInnerClass {
	
    private static int age = 12;
    
    static class InnerClass {
        public void print() {
            System.out.println(age);
        }
    }
}
