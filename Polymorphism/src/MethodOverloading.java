
public class MethodOverloading {
	
	public void add(int a,int b) {
		System.out.println(a+b);
		}
	public void add(int a,int b,int c) {
		System.out.println(a+b+c);
	}
	public void add(double a,double b) {
		System.out.println("double"+a+b);
	}

	public static void main(String[] args) {
		
MethodOverloading obj=new MethodOverloading();
obj.add(2, 3);
obj.add(1.23, 2.34);
obj.add(1, 2, 3);
	}

}
