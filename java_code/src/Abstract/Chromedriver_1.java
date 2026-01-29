package Abstract;

public class Chromedriver_1 implements BrowserDriver {

	

	public void openbrowser() {
		System.out.println("Chrome browser opened ");
	}
	
	public void Closebrowser() {
		System.out.println("Chrome browser closed");
	}
	
	public void navigate (String url) {
		System.out.println("navigating to"+ url);
	}

	@Override
	public void navigate() {
		// TODO Auto-generated method stub
		
	}
}
