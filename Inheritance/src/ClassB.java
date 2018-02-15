
public class ClassB extends ClassA {

public void add(){
	int a=100;
	int b=200;	
	System.out.println(a+b);
}


	
	public static void main(String[] args) {
		
		
// this is method overriding , same method name(add) use in child(classB) and parent (ChildA) class.		
ClassB obj1=new ClassB();
obj1.add();

ClassA obj2=new ClassA();
obj2.add();

	}

}
