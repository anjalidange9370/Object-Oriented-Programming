package Abstraction;
//we can access all the members of Student class
public class Test extends Student{
@Override
	void login(String email,int pass) {
	System.out.println("login successful");
}
Test(){
	System.out.println("this is TEst class constructor");
}
	@Override
	void good() {
		System.out.println("she is literally good person");
	}
	public static void main(String[] args) {
		Test t1=new Test();
		t1.good();
		t1.login("anjali@gmail.com",121234);
		
	}
	
}
