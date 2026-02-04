package VtigerApplication;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Validatorcode {

	public static void main(String[] args) {
		WebDriver driver=new ChromeDriver();
		driver.get("http://localhost:8888/");
		driver.findElement(By.xpath("//input[@name='user_name']")).sendKeys("admin");
		driver.findElement(By.xpath("//input[@name='user_password']")).sendKeys("admin");
		driver.findElement(By.xpath("//input[@id='submitButton']")).click();
		String wepagesource=driver.getPageSource();
	//	System.out.println("wepagesource"+wepagesource);
		
		
		driver.get("https://validator.w3.org/");
		WebElement wedirectinput=driver.findElement(By.xpath("//a[text()=' Direct Input']"));
		wedirectinput.click();
		
		JavascriptExecutor jse=(JavascriptExecutor)driver;
		WebElement wetextarea=driver.findElement(By.xpath("//textarea[@id='fragment']"));
		
		jse.executeScript("arguments[0].value=arguments[1];",wetextarea,wepagesource );
		WebElement wecheck=driver.findElement(By.xpath("//fieldset[@id='validate-by-input']//a[text()='Check']"));
		jse.executeScript("arguments[0].click()", wecheck);
		
	}
}