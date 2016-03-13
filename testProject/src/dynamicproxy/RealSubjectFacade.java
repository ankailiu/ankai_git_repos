package dynamicproxy;

public class RealSubjectFacade {
	
	public static Subject dosomething(RealSubject rs){
		
		   ProxyHandler proxy = new ProxyHandler();
	       //绑定该类实现的所有接口
	       Subject sub = (Subject) proxy.bind(rs);
	       
	       return sub;
		
	}
	
	
	

}
