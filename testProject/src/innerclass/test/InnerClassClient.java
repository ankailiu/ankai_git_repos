package innerclass.test;

public class InnerClassClient {

	public static void main(String[] args) {
		simpleInnerClass();
	}

	private static void simpleInnerClass() {
		SimpleInnerClass out = new SimpleInnerClass();
		SimpleInnerClass.InnerClass in = out.new InnerClass();
		in.print();
		
		SimpleInnerClass.InnerClass in1 = new SimpleInnerClass().new InnerClass();
		in1.print();
	}
	
	private static void staticInnerClass(){
		StaticInnerClass.InnerClass in = new StaticInnerClass.InnerClass();
		in.print();
	}
	
	private static void privateInnerClass(){
		PrivateInnerClass out = new PrivateInnerClass();
	    out.outPrint();
	}
	
	private static void methodInnerClass(){
		MethodInnerClass out = new MethodInnerClass();
		out.outPrint(15);
	}

}
