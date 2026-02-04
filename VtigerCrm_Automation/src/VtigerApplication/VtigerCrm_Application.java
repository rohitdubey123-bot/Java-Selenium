package VtigerApplication;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
public class VtigerCrm_Application {

	public static void main(String[] args) {
		ChromeDriver driver=new ChromeDriver();
		driver.get("http://localhost:8888/");
		WebElement weusername=driver.findElement(By.xpath("//input[@name='user_name']"));
		weusername.sendKeys("admin");
		WebElement weuserpassword =driver.findElement(By.xpath("//input[@name='user_password']"));
		weuserpassword.sendKeys("admin");
		WebElement wesubmitbutton=driver.findElement(By.xpath("//input[@id='submitButton']"));
		wesubmitbutton.click();
		
		String actualtitle=driver.getTitle();
		String expectedtitle="Administrator Home-vtiger CRM";
		if(actualtitle.equals(expectedtitle)) {
			System.out.println("Pass : title is matched");
		}else {
			System.out.println("Fail :title is not matched");
		}
		System.out.println( "Actual title is : "+actualtitle );
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
	}

}
