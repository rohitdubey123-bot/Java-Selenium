package VtigerApplication;

import java.util.Set;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class windowhandle {

	public static void main(String[] args) {
		WebDriver driver=new ChromeDriver();
		
		String str=driver.getWindowHandle();
		
		driver.get("http://localhost:8888/");
		driver.findElement(By.xpath("//input[@name='user_name']")).sendKeys("admin");
		driver.findElement(By.xpath("//input[@name='user_password']")).sendKeys("admin");
		driver.findElement(By.xpath("//input[@id='submitButton']")).click();
		Actions act=new Actions(driver);
		act.moveToElement(driver.findElement(By.xpath("//img[@src='themes/softed/images/info.PNG']"))).build().perform();
		driver.findElement(By.linkText("Feedback")).click();
		
		
		String str1=driver.getWindowHandle();
		
		Set<String >handlevalues=driver.getWindowHandles();
		for(String handle :handlevalues ) {
			driver.switchTo().window(handle);
			String windowurl1=driver.getCurrentUrl();
			if(windowurl1.contains("feedback")) {
				System.out.println("found");
				break;
			}
			System.out.println(handle);
		}
		driver.findElement(By.xpath("//textarea[@name='description']")).sendKeys("service is good ");
		handlevalues=driver.getWindowHandles();
		for(String handle :handlevalues ) {
			driver.switchTo().window(handle);
			String windowurl1=driver.getCurrentUrl();
			if(windowurl1.contains("index.php")) {
				System.out.println("found");
				break;
			}
			System.out.println(handle);
	System.out.println("");


	}

}
}
