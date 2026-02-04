package VtigerApplication;

import org.openqa.selenium.Alert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Lead_Delete {

	public static void main(String[] args) throws InterruptedException {
		ChromeDriver driver=new ChromeDriver();
		driver.get("http://localhost:8888/");
		WebElement weusername=driver.findElement(By.xpath("//input[@name='user_name']"));
		weusername.sendKeys("admin");
		WebElement weuserpassword =driver.findElement(By.xpath("//input[@name='user_password']"));
		weuserpassword.sendKeys("admin");
		WebElement wesubmitbutton=driver.findElement(By.xpath("//input[@id='submitButton']"));
		wesubmitbutton.click();
		driver.findElement(By.xpath("//a[text()='Leads']")).click();
		driver.findElement(By.xpath("//input[@name='selected_id']")).click();
		driver.findElement(By.xpath("//input[@value='Delete']")).click();
		Alert alert=driver.switchTo().alert();
		alert.accept();
		Thread.sleep(3000);
		String pagesource=driver.getPageSource();
		if(pagesource.contains("Lead Not Found")) {
			System.out.println("Pass : Delete Lead Successfully");
		}else {
			System.out.println("Fail : Lead Exists");
		}

	}

}
