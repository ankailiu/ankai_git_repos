package utilities;

public class RecursionTest {

	public static void main(String[] args) {
//		for(int i =1;i<20;i++){
//			System.out.print(fibonacci(i));
//			if(i != 20-1){
//				System.out.print(",");
//			}
//		}
		
		System.out.println(factorial(10));
	}
	
	public static int fibonacci(int n){
		if(n== 1 || n == 2){
			return 1;
		}else{
			return (fibonacci(n-1) + fibonacci(n-2));
		}
	}
	
	public static int factorial(int n){
		if(n == 1){
			return 1;
		}else{
			return n*(factorial(n-1));
		}
		
	}

}
