package VtigerApplication;

public class Demo {

	public static void main(String[] args) {
		Demo d=new Demo();
		d.m1().m2().m3(); 		// method chaining
		
		
		
		}
Demo m1() {
	System.out.println("method 1");
	return this;
}
Demo m2() {
	System.out.println("method 2");
	return this;

	}
Demo m3() {
	System.out.println("method 3");
	return this;

}
}