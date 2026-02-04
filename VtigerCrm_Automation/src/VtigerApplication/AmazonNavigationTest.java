package VtigerApplication;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class AmazonNavigationTest {

	public static void main(String[] args) throws InterruptedException  {
		ChromeDriver driver=new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://www.amazon.in/");
		Thread.sleep(2000);
		WebElement wemobile=driver.findElement(By.xpath("//div[@class='nav-div']//a[text()='Mobiles']"));
		wemobile.click();
		String wemobtitle=driver.getTitle();
		System.out.println("mobile title is---:" + wemobtitle);
		String Actualtitle="Mobiles";
		if(wemobtitle.equalsIgnoreCase(Actualtitle)) {
			System.out.println("Actual title pass ");
		}else {
			System.out.println("Actual title fail");
		}
		driver.close();
	}
}
