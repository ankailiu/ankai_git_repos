package designpatterns.chainofresponsibility;

public class ChainOfResponsibilityClient {

	public static void main(String[] args) {
		AbstractHandler handler1 = new DateToStringHandler();
		AbstractHandler handler2 = new IntegerToStringHandler();
		AbstractHandler handler3 = new StringToStringHandler();
		
		handler1.setNextHandler(handler2);
		handler2.setNextHandler(handler3);
		
		handler1.handleRequest(11);
//		handler1.handleRequest(new java.util.Date());
//		handler1.handleRequest("abc");
	}

}
