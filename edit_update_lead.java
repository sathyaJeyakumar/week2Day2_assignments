package week2_day2_assignments;

import java.time.Duration;
import java.util.concurrent.TimeUnit;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

public class edit_update_lead {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		WebDriver driver = new ChromeDriver();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(5));
		//System.getProperty("webdriver.chrome.driver", "chromedriver.exe");
		driver.get("http://leaftaps.com/crmsfa/control/main");
		driver.manage().window().maximize();
		
		//Login to LEAFTAPS application 
		driver.findElement(By.name("USERNAME")).sendKeys("demosalesmanager");
		driver.findElement(By.name("PASSWORD")).sendKeys("crmsfa");
		driver.findElement(By.className("loginButton")).click();
		try {
			Thread.sleep(5000);
		} catch (InterruptedException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
		driver.findElement(By.xpath("//a[text()='Leads']")).click();
		driver.findElement(By.xpath("//a[text()='Create Lead']")).click();
		
		//creating new lead 
		try {
			Thread.sleep(5000);
		} catch (InterruptedException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
		driver.findElement(By.xpath("//div[@class='form']//input[@name='companyName']")).sendKeys("Jan17CompanynameJSLatest");
		driver.findElement(By.xpath("//div[@class='form']//input[@name='firstName']")).sendKeys("Jan17FirstnameJSLatest");
		driver.findElement(By.xpath("//div[@class='form']//input[@name='lastName']")).sendKeys("Jan17CompanynameJSLatest");
		
		driver.findElement(By.name("departmentName")).sendKeys("Jan17DeptName_latest");
		driver.findElement(By.name("description")).sendKeys("Jan17 Testing desc field_latest");
		driver.findElement(By.xpath("//input[@id='createLeadForm_primaryEmail']")).sendKeys("Jan17@gmail.com");
		Select wsSelect = new Select(driver.findElement(By.xpath("//select[@name='generalStateProvinceGeoId']")));
		wsSelect.selectByValue("CA");
		
		driver.findElement(By.xpath("//input[@name='submitButton']")).click();
		try {
			Thread.sleep(10000);
		} catch (InterruptedException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
		if ( driver.findElement(By.xpath("//div[@id = 'sectionHeaderTitle_leads']")).getText().equals("View Lead"))
		{
			System.out.println("Lead created succesfully");
			driver.findElement(By.xpath("//a[text()='Edit']")).click();
			driver.findElement(By.xpath("//textarea[@name='importantNote']")).sendKeys("Testing imp notes latest");
			driver.findElement(By.xpath("//textarea[@name='importantNote']/ancestor::tr/following-sibling::tr/td/following-sibling::td/input[@name='submitButton']")).click();
			
		}
		System.out.println(driver.getTitle());
		
		//driver.quit();
		
		
	}

}
