

import java.util.List;

import org.junit.Test;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriverException;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.firefox.FirefoxDriver;

public class NPU_Login {
	
	
@Test
public void testlogin(){
	
	FirefoxDriver driver = new FirefoxDriver();
	driver.get("https://google.com");
	WebElement r = driver.findElement(By.name("q"));
	r.sendKeys("npu");
	r.submit();
	driver.manage().window().maximize();
	String linkText = "test";
	WebElement search = driver.findElement(By.linkText(linkText));
	search.click();
	WebElement app = driver.findElement(By.xpath("/html/body/div[1]/div[2]/div/div[1]/div/div/div[1]/p/a"));
	app.click();
	List<WebElement> list = driver.findElements(By.tagName("a"));	 
	for (int i = 1; i<=list.size(); i=i+1)

	{
		System.out.println(list.get(i).getText());
		list.get(1).click();
		

	}
	
	try{
		if(driver.findElement(By.xpath("//*[@id='main']/fieldset/form[2]/p[2]")).getText().contains("Passwords are required to be a minimum of 6 characters in length")){
			System.out.println("text is present");
		}
			else {
			System.out.print("text not present");
		}
			}
	catch (WebDriverException e){
		throw new WebDriverException(e.getMessage());
	}
	WebElement t = driver.findElement(By.id("new"));
	t.click();
	WebElement f = driver.findElement(By.id("FirstName"));
	f.sendKeys("XYZ");
	WebElement l = driver.findElement(By.id("LastName"));
	l.sendKeys("hjk");
	WebElement g = driver.findElement(By.id("Gender"));
	g.sendKeys("Female");
	WebElement e = driver.findElement(By.id("Email"));
	e.sendKeys("ghhyhkk@gmail.com");
	WebElement p = driver.findElement(By.id("Password"));
	p.sendKeys("hkjhkhk");
	WebElement q = driver.findElement(By.xpath("//*[@id='main']/fieldset/form[2]/input"));
	q.clear();
	driver.close();
	driver.quit();

	}
}
	

