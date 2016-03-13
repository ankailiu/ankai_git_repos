package designpatterns.builder;

public class DellBuilder implements Builder {
	
	Product product = new DellProduct();

	@Override
	public void buildCPU() {
		product.add("Dell CPU");
		
	}

	@Override
	public void buildMemory() {
		product.add("Dell Memory");
	}

	@Override
	public Product getProduct() {
		return product;
	}



}
