
public class ExceptionHandling {

	public static void main(String[] args) {
		int a=10;
		int b=0;
		
		try {
			int result = a/b;
		}
		
		catch(ArithmeticException e){
		
			
			int result = a/b;
			System.out.println(result);
			System.out.println("hello");
		}
		


	}

}
