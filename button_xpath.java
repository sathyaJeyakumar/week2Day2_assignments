package week2_day2_assignments;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.devtools.v109.css.CSS.GetBackgroundColorsResponse;

public class button_xpath {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		WebDriver driver = new ChromeDriver();
		
		//maximising the window
		driver.manage().window().maximize();
		
		driver.get("https://leafground.com/button.xhtml");
		
		//1. Check if the button with the text ‘Confirm if the button is disabled’ is disabled.
		
		System.out.println(driver.findElement(By.xpath("//span[text()='Disabled']/parent::button")).isEnabled());
		if(!driver.findElement(By.xpath("//span[text()='Disabled']/parent::button")).isEnabled())
		{
			System.out.println(" ‘Confirm if the button is disabled' is disabled!");
		}
		
		//2. Find and print the position of the button with the text ‘Submit.’
		System.out.println("Position of Submit button");
		System.out.println(driver.findElement(By.xpath("//span[text() = 'Submit']")).getLocation());
		
		//3.Find and print the background color of the button with the text ‘Find the Save button color.’
		System.out.println("color of save button");
		System.out.println(driver.findElement(By.xpath("//span[text() = 'Save']")).getCssValue("color"));
		
		//4. Find the height and width of this button
		System.out.println(driver.findElement(By.xpath("//h5[text()='Find the height and width of this button']/following-sibling::button")).getSize());
		
		
		
	}

}
