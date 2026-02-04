package VtigerApplication;

import java.util.Set;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class windowhandlepractice {

	public static void main(String[] args) {
	WebDriver	driver=new ChromeDriver();
	driver.manage().window().maximize();
	driver.get("https://demo.automationtesting.in/Windows.html");
	driver.findElement(By.xpath("//button[text()='    click   ']")).click();
	
	Set<String>handlevalues=driver.getWindowHandles();
	for(String window :handlevalues) {
		driver.switchTo().window(window);
		String  actualtitle=driver.getTitle();
		if(actualtitle.contains("selenium")) {
			System.out.println("found");
			break;
		}
		System.out.println(window);
	}
	
	}

}
