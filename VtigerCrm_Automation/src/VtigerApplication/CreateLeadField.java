package VtigerApplication;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class CreateLeadField {
	public static void main(String[] args) {
		ChromeDriver driver=new ChromeDriver();
		driver.get("http://localhost:8888/");
		driver.findElement(By.xpath("//input[@name='user_name']")).sendKeys("admin");
		driver.findElement(By.xpath("//input[@name='user_password']")).sendKeys("admin");
		driver.findElement(By.xpath("//input[@id='submitButton']")).click();
		driver.findElement(By.xpath("//a[text()='Leads']")).click();
		driver.findElement(By.xpath("//img[@alt='Create Lead...']")).click();
		String ExpectedLastname="dubey";
		String Expectedcompany="MNC";
		
		driver.findElement(By.xpath("//input[@name='lastname']")).sendKeys(ExpectedLastname);
		driver.findElement(By.xpath("//input[@name='company']")).sendKeys(Expectedcompany);
		driver.findElement(By.xpath("//input[@value='  Save  ']")).click();
		String acttualleadname=driver.findElement(By.xpath("//span[@id='dtlview_Last Name']")).getText();
		
		if(acttualleadname.equals(ExpectedLastname)) {
			System.out.println("Pass : Create Lead Successfully");
		}else {
			System.out.println("Fail : Lead not Create");
		}
		System.out.println("Actual Lead Name is " + acttualleadname);
	}

}
