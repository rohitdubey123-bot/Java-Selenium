package VtigerApplication;

import java.util.Set;

import org.openqa.selenium.By;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class windowhandles {

	public static void main(String[] args) {
		ChromeDriver driver=new ChromeDriver();
		driver.get("http://localhost:8888/");
		driver.findElement(By.xpath("//input[@name='user_name']")).sendKeys("admin");
		driver.findElement(By.xpath("//input[@name='user_password']")).sendKeys("admin");
		driver.findElement(By.xpath("//input[@id='submitButton']")).click();

		String Actual_title=driver.getTitle();
		System.out.println(Actual_title);
		String expectedtitle="Administrator - Home - vtiger CRM 5 - Commercial Open Source CRM";
		if(Actual_title.equalsIgnoreCase(expectedtitle)) {
			System.out.println("passed");	
		}else {
			System.out.println("failed");
		}
		Actions act =new Actions(driver);
		act.moveToElement(driver.findElement(By.xpath("//img[@src='themes/softed/images/info.PNG']"))).build().perform();
		driver.findElement(By.xpath("//a[text()='Help']")).click();

		Set<String>windowhandle=driver.getWindowHandles();
		for(String handle :windowhandle ) {
			driver.switchTo().window(handle);
			String wetitle=driver.getTitle();
			if(wetitle.contains("Connection timed out")) {
				System.out.println("found");
				String page_title=	driver.getTitle();
				System.out.println(page_title);
				break;
			}
			System.out.println(handle);
		}
		driver.close();
	}

}
