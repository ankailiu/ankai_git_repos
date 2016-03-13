package designpatterns.builder;

public interface Builder {
	
	void buildCPU();
	
	void buildMemory();
	
	Product getProduct();

}
