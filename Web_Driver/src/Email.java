import org.junit.Test;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.firefox.FirefoxDriver;


public class Email {
	
	@Test
	public void testgmail(){
		FirefoxDriver driver = new FirefoxDriver();
		driver.get("http://gmail.com");
		WebElement username = driver.findElement(By.id("Email"));
		username.sendKeys("dummy");
		WebElement password = driver.findElement(By.name("Passwd"));
		password.sendKeys("dummy");
		WebElement submit = driver.findElement(By.id("signIn"));
		submit.click();
		
		
		
	}

}
