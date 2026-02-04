package VtigerApplication;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class CartAmazonPage {

	public static void main(String[] args) {
		ChromeDriver driver=new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://www.amazon.in/");
		WebElement contnewshopping=driver.findElement(By.xpath("//button[text()='Continue shopping']"));
		contnewshopping.click();
		WebElement searchbox=driver.findElement(By.xpath("//div[@class='nav-search-field ']/input[@id='twotabsearchtextbox']"));
		searchbox.sendKeys("Laptop");
		WebElement weclickbutton=driver.findElement(By.xpath("//input[@id='nav-search-submit-button']"));
		weclickbutton.click();
		WebElement addtocart=driver.findElement(By.xpath("//button[@id='nav-assist-show-shortcuts']"));
	//	addtocart.click();
		WebElement carticon=driver.findElement(By.xpath("//span[@id='nav-cart-count']"));
		if(carticon.isDisplayed()) {
			carticon.click();
			System.out.println("cart page is open successfully");
		}else{
			System.out.println("cart page not open");
			WebElement cartcount=driver.findElement(By.xpath("//span[@id='nav-cart-count']"));
			String count=cartcount.getText();
			System.out.println("cart contains " + count +  "item");
			
			int expecteditem=0;
			if(Integer.parseInt(count)==expecteditem) {
				System.out.println("cart item match count expected" + expecteditem);
			}else {
				System.out.println("cart item mismatch count expected");
			}
			
		}
	}
}
	


