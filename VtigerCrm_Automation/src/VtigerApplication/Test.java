package VtigerApplication;

public class Test {

	public static void main(String[] args) {
		new Test();

	}
Test(){
	this(10);
	System.out.println("Default constructor");
}
Test(int x){
	System.out.println("Parametirized constructor" +  x);
}
}
