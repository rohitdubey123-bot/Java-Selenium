package VtigerApplication;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class AmazonApplication {

	public static void main(String[] args) throws InterruptedException {
		ChromeDriver driver=new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://www.amazon.in/");
		Thread.sleep(2000);
		WebElement wemobile=driver.findElement(By.xpath("//div[@class='nav-div']//a[text()='Mobiles']"));
		wemobile.click();
		String wegettitle=driver.getTitle();
		System.out.println("get title is---"+wegettitle );
		String Actualtitle="Mobiles";
		if(wegettitle.equalsIgnoreCase(Actualtitle)) {
			System.out.println("mobile page check");
		}else {
			System.out.println("mobile page not check");
		}
		driver.navigate().back();
		WebElement  todaydeals=driver.findElement(By.xpath("//a[@href='/deals?ref_=nav_cs_gb']"));
		String wedealtext=todaydeals.getText();
		System.out.println("dealtext---" +todaydeals.getText());
		todaydeals.click();
		Thread.sleep(2000);
		
		String actualdealtitle =driver.getTitle();
		System.out.println("Actual title of today deals---:" +actualdealtitle);
		String expecteddealtitle="Deals";
		if(actualdealtitle.contains(expecteddealtitle)) {
			System.out.println("actual title of deals pass--" + actualdealtitle);
		}else {
			System.out.println("actual title of deals Fail--" + actualdealtitle);
		}
		driver.close();
		
		
		
		
		
		
		
		
		
	}

}
