package dynamicproxy;

/**
 * 
 * @Title:TestProxy.java 
 * @Description:
 	1.Proxy类的代码量被固定下来，不会因为业务的逐渐庞大而庞大；
	2.可以实现AOP编程，实际上静态代理也可以实现，总的来说，AOP可以算作是代理模式的一个典型应用；
	3.解耦，通过参数就可以判断真实类，不需要事先实例化，更加灵活多变
 * @Author:Ankai Liu
 * @Date: 2015年11月5日 下午8:24:29
 */

public class TestProxy {

	public static void main(String[] args) {
	   ProxyHandler proxy = new ProxyHandler();
       //绑定该类实现的所有接口
       Subject sub = (Subject) proxy.bind(new RealSubject());
       sub.doSomething();
	}


}
