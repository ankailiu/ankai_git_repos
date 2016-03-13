package designpatterns.builder;

public class BuilderPatternClient {

	public static void main(String[] args) {
		Builder builder = new AcerBuilder();
		Director director = new Director(builder);
		director.construct();
		Product acerProduct = builder.getProduct();
		acerProduct.show();
		
		Builder dellBuilder = new DellBuilder();
		Director dellDirector = new Director(dellBuilder);
		dellDirector.construct();
		Product dellProduct = dellBuilder.getProduct();
		dellProduct.show();
	}

}
