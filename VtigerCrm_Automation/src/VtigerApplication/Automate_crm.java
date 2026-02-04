package VtigerApplication;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.ui.Select;

public class Automate_crm {

	public static void main(String[] args) throws InterruptedException {
		ChromeDriver driver=new ChromeDriver();
		driver.get("http://localhost:8888/");
		WebElement weusername=driver.findElement(By.xpath("//input[@name='user_name']"));
		weusername.sendKeys("admin");
		WebElement weuserpassword =driver.findElement(By.xpath("//input[@name='user_password']"));
		weuserpassword.sendKeys("admin");
		WebElement wesubmitbutton=driver.findElement(By.xpath("//input[@id='submitButton']"));
		wesubmitbutton.click();
		driver.findElement(By.xpath("//a[@href='index.php?module=Leads&action=index']")).click();

		
		WebElement weacts=driver.findElement(By.xpath("//td[@class='tabUnSelected']"));
		Actions weactions=new Actions(driver);
		//weactions.moveToElement(weacts).perform();
		WebElement wetext=driver.findElement(By.xpath("//a[text()='More']"));
		weactions.contextClick(wetext).build().perform();
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
//		WebElement weselname=driver.findElement(By.xpath("//select[@name='viewname']"));
//		Select weselobj=new Select(weselname);
//		weselobj.selectByVisibleText("Hot Leads");
		
	}

}
