package Mousemovements;

import java.util.List;
import java.util.Random;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.firefox.FirefoxProfile;
import org.openqa.selenium.interactions.Actions;

public class Mouseactions {

	public static void main(String[] args) throws InterruptedException {
		FirefoxProfile fp = new FirefoxProfile();
		fp.areNativeEventsEnabled();
		FirefoxDriver driver = new FirefoxDriver(fp); 
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(20, TimeUnit.SECONDS);
		driver.get("https://americangolf.co.uk/");
		//Actions is an in built class which is meant for mouse actions
		Actions act = new Actions(driver);
		
		WebElement golfclub = driver.findElement(By.xpath("//*[@id='navigation']/nav/ul/li[1]/a"));
		act.moveToElement(golfclub).build().perform();//moves to golf clubs tab
		Thread.sleep(2000);
		WebElement ladies = driver.findElement(By.xpath("//*[@id='navigation']/nav/ul/li[1]/div/div[1]/ul/li[2]/a"));
		act.moveToElement(ladies).build().perform(); // moves to ladies tab 
		WebElement box = driver.findElement(By.xpath("//*[@id='CLUBS_2']"));
		List<WebElement> links = box.findElements(By.tagName("a"));
		//randomly select a link and click
		Random r = new Random();
		int x = r.nextInt(links.size());
		System.out.println(x+ links.get(x).getText());
		links.get(x).click();
	}

}
