package VtigerApplication;

import java.util.Set;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class naukaricom {

	public static void main(String[] args) {
	WebDriver driver=new ChromeDriver();
	driver.manage().window().maximize();
	driver.get("https://www.naukri.com/");
	String parentwindow=driver.getWindowHandle();
	System.out.println("parent window id "+parentwindow);
	Set<String> handlevalues=driver.getWindowHandles();
	for(String handle : handlevalues) {
		if(handle.equals(parentwindow)) {
			driver.switchTo().window(handle);
			driver.close();
		}
		driver.switchTo().window(parentwindow);
		String title=driver.getTitle();
		System.out.println(title);
		if(title.contains("jobs-Recruitment")) {
			System.out.println("pass");
		}else {
			System.out.println("fail");
		}
		driver.quit();
	}
		
	
	
	
	
	
	
	
	
	}

}
