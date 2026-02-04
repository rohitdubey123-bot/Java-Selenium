package VtigerApplication;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Amazonaddcart {

	public static void main(String[] args) {
		ChromeDriver	driver=new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://www.amazon.in/");
		WebElement wecontinewshop=driver.findElement(By.xpath("//button[text()='Continue shopping']"));
		wecontinewshop.click();
		WebElement wesearchbox=driver.findElement(By.xpath("//div[@class='nav-search-field ']/input[@id='twotabsearchtextbox']"));
		wesearchbox.sendKeys("Laptop");
		WebElement weclick=driver.findElement(By.xpath("//input[@id='nav-search-submit-button']"));
		weclick.click();
	
		
		
		
		
		
		
		
		
	}

}
