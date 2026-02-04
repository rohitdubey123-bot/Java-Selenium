package VtigerApplication;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class jscodepractice {

	public static void main(String[] args) {
		ChromeDriver driver=new ChromeDriver();
		driver.get("http://localhost:8888/");
		
		JavascriptExecutor jse = (JavascriptExecutor) driver;
		
		WebElement weusername=driver.findElement(By.xpath("//input[@name='user_name']"));
		jse.executeScript("arguments[0].value='admin'", weusername);
		
		WebElement weuserpassword=driver.findElement(By.xpath("//input[@name='user_password']"));
		jse.executeScript("arguments[0].value='admin'", weuserpassword);
		
		WebElement welogin=driver.findElement(By.xpath("//input[@id='submitButton']"));
		jse.executeScript("arguments[0].click()", welogin);
	//	jse.executeScript("window.scrollTo(0,2200)" );
		WebElement wevtiger=driver.findElement(By.linkText("vtiger.com"));
		
		jse.executeScript("arguments[0].scrollIntoView(true);", wevtiger);
		
		jse.executeScript("'window.scrollTo(0, document.body.scrollHeight");
		
		
		Actions act=new Actions(driver);
		WebElement we=driver.findElement(By.xpath("//img[@src='themes/softed/images/info.PNG']"));
		jse.executeScript("var event = new MouseEvent('mouseover', { 'view': window, 'bubbles': true, 'cancelable': true }); arguments[0].dispatchEvent(event);", we);
		
		WebElement wefeedback=driver.findElement(By.xpath("//a[text()='Feedback']"));
		jse.executeScript("arguments[0].click()", wefeedback);

	}

}
