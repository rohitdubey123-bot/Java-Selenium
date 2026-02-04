package VtigerApplication;

public class Parent {

	Parent(){
		System.out.println("parent constructor");
	}
	class child extends Parent {
		child(){
			super(); //parent constructor
			System.out.println("child constructor");
		}
	}
		public static void main(String[]args) {
			Parent p=new Parent();
			Parent.child c=p. new child();
		}
	
}


