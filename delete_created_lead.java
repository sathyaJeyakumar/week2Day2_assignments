package week2_day2_assignments;

import org.openqa.selenium.By;
import org.openqa.selenium.chrome.ChromeDriver;

public class delete_created_lead {

	public static void main(String[] args) {
		
			
		ChromeDriver driver = new ChromeDriver();
		driver.get("http://leaftaps.com/crmsfa/control/main");
		
		//maximising the window
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
			
			System.out.println(driver.getTitle());
			
			if(driver.getTitle().contains("My Home | opentaps CRM"))
			{
				driver.findElement(By.linkText("Leads")).click();
				
				//System.out.println(driver.findElements(By.xpath("//span[text()='Lead List']//ancestor::div[@class='x-panel-tl']/following-sibling::div//div[@class='x-grid3-cell-inner x-grid3-col-partyId']//a")).get(1).getText());
				//driver.findElement(By.linkText("Find Leads"));
				driver.findElement(By.xpath("//a[text()='Find Leads']")).click();
				driver.findElement(By.xpath("//span[text()='Phone']")).click();
				driver.findElement(By.xpath("//input[@name='phoneNumber']")).sendKeys("1010");
				driver.findElement(By.xpath("//button[text()='Find Leads']")).click();
				try {
					Thread.sleep(5000);
				} catch (InterruptedException e) {
					// TODO Auto-generated catch block
					e.printStackTrace();
				}
				
				driver.findElement(By.xpath("//div[text()='Lead ID']//ancestor::div[@class='x-grid3-header']//following-sibling::div[@class='x-grid3-scroller']//div[@class='x-grid3-cell-inner x-grid3-col-partyId']/a")).click();
				driver.findElement(By.xpath("//a[text()='Delete']")).click();
				
				driver.findElement(By.xpath("//a[text()='Find Leads']")).click();
				driver.findElement(By.xpath("//span[text()='Phone']")).click();
				driver.findElement(By.xpath("//input[@name='phoneNumber']")).sendKeys("1010");
				driver.findElement(By.xpath("//button[text()='Find Leads']")).click();
				try {
					Thread.sleep(5000);
				} catch (InterruptedException e) {
					// TODO Auto-generated catch block
					e.printStackTrace();
				}
				if (driver.findElement(By.xpath("//div[text()='No records to display']")).isDisplayed())
				{
					System.out.println("Recorded succesfully");
				}
				else {
					System.out.println("Failed to delete");
				}
				driver.quit();
				
				
				
			}
				
			
			
			
			driver.quit();
		
	}

}
