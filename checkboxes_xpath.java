package week2_day2_assignments;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class checkboxes_xpath {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		WebDriver driver = new ChromeDriver();
		driver.get(" https://leafground.com/checkbox.xhtml");
		driver.manage().window().maximize();
		
		//Implicit wait
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(5));
		
		//1. Basic check box 
		driver.findElement(By.xpath("//span[text()='Basic']/preceding-sibling::div[1]")).click();
		
		//2 i. Click on the "Notification Checkbox and Verify that the expected message is displayed
		driver.findElement(By.xpath("//span[text()='Ajax']/preceding-sibling::div[1]")).click();
	
		if(driver.findElement(By.xpath("//span[text()='Checked']")).isDisplayed())
		{
			System.out.println("Notification checkbox is checked ");
		}
		
		//2 ii Click on the "Notification Checkbox and Verify that the expected message is displayed
		driver.findElement(By.xpath("//span[text()='Ajax']/preceding-sibling::div[1]")).click();
			
		if(driver.findElement(By.xpath("//span[text()='Unchecked']")).isDisplayed())
		{
			System.out.println("Notification checkbox is Unchecked ");
		}
		
		//3. select ur fav language as Java and Javascript
		driver.findElement(By.xpath("//label[text()='Java']/preceding-sibling::div/div[2]")).click();
		driver.findElement(By.xpath("//label[text()='Javascript']/preceding-sibling::div/div[2]")).click();

		//4. Tristate checkbox
		driver.findElement(By.xpath("//span[@class='ui-chkbox-icon ui-c ']/parent::div")).click();
		if(driver.findElement(By.xpath("//span[@class='ui-chkbox-icon ui-c ui-icon ui-icon-check']")).isEnabled())
		{
			System.out.println("Tristate as icon is tick...");
		}
		driver.findElement(By.xpath("//span[@class='ui-chkbox-icon ui-c ui-icon ui-icon-check']/parent::div")).click();
		if (driver.findElement(By.xpath("//span[@class='ui-chkbox-icon ui-c ui-icon ui-icon-closethick']")).isEnabled())
		{
			System.out.println("Tristate as icon is closethick...");

		}
		//toggle switch
		driver.findElement(By.xpath("//div[@class='ui-toggleswitch-slider']")).click();
		System.out.println(driver.findElement(By.xpath("//span[text()='Checked']")).isDisplayed());
		
		//disabled checkbox
		System.out.println("disable function");
		System.out.println(driver.findElement(By.xpath("//span[text()='Disabled']/preceding-sibling::div/following-sibling::div")).isEnabled());
		////span[@class='ui-chkbox-icon ui-icon ui-icon-blank ui-c']
		
		//Select Multiple
		driver.findElement(By.xpath("//h5[text()='Select Multiple']/parent::div/div//ul")).click();
		driver.findElement(By.xpath("//li[@data-item-value='London']/div")).click();
		if(driver.findElement(By.xpath("//li[@data-item-value='London']/div//input")).isSelected())
		{
			System.out.println("London checkbox is checked");
		}
		driver.findElement(By.xpath("//li[@data-item-value='Paris']/div")).click();
		if(driver.findElement(By.xpath("//li[@data-item-value='Paris']/div//input")).isSelected())
		{
			System.out.println("Paris checkbox is checked");
		}
		driver.findElement(By.xpath("//li[@data-item-value='Rome']/div")).click();
		if(driver.findElement(By.xpath("//li[@data-item-value='Rome']/div//input")).isSelected())
		{
			System.out.println("Rome checkbox is checked");
		}
		
		try {
			Thread.sleep(3000);
		} catch (InterruptedException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
		
		driver.quit();
		
	}

}
