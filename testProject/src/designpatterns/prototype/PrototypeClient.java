package designpatterns.prototype;

public class PrototypeClient {
	
	public static void main(String [] args){
		AbstractBook book = new ConcreteBook();
		book.setBookName("abc");
		
		AbstractBook b1 = (AbstractBook)book.clone();
		b1.setBookName("def");
		System.out.println(book.getBookName() + " 	" + b1.getBookName());
	}

}
