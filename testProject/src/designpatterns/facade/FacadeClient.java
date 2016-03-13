package designpatterns.facade;

public class FacadeClient {

	public static void main(String[] args) {
		
		//********** Not use facade pattern.
        IServiceA sa = new ServiceAImpl();  
        IServiceB sb = new ServiceBImpl();  
        sa.methodA();  
        sb.methodB();  
        //***************
        
        
        //Use facade.
		Facade facade = new Facade();
		facade.methodA();
		facade.methodB();
		facade.methodC();
	}

}
