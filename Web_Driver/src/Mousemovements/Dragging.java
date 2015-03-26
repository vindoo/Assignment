package Mousemovements;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.firefox.FirefoxProfile;
import org.openqa.selenium.interactions.Actions;

public class Dragging {

	public static void main(String[] args) {
		FirefoxProfile fp = new FirefoxProfile();
		fp.areNativeEventsEnabled();
		FirefoxDriver driver = new FirefoxDriver(fp); 
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(20, TimeUnit.SECONDS);
		driver.get("https://americangolf.co.uk/golf-clubs/drivers?prefn1=gender&prefv1=Female");
		//Thread.sleep(2000);
		Actions act = new Actions(driver);
		WebElement drag = driver.findElement(By.xpath("//*[@id='secondary']/div[1]/div[2]/div[1]/div[1]/span[2]"));
		act.dragAndDropBy(drag, -100, 0).build().perform();
		

	}

}
