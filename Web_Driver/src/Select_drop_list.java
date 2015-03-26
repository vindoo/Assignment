import java.io.File;
import java.io.IOException;
import java.util.HashSet;
import java.util.Iterator;
import java.util.List;
import java.util.Set;
import java.util.concurrent.TimeUnit;

import org.apache.commons.io.FileUtils;
import org.openqa.selenium.By;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;


public class Select_drop_list {

	public static void main(String[] args) throws IOException {
		
	FirefoxDriver driver = new FirefoxDriver();
	driver.get("https://bbc.com");
	List<WebElement> links = driver.findElements(By.tagName("a"));
			System.out.println("no.of links--> "+links.size());
			
			for(int i=0; i<= links.size(); i++){
				System.out.println("The" + i + links.get(i).getText() + "---->" + links.get(i).isDisplayed());
			}
			File scrFile = ((TakesScreenshot)driver).getScreenshotAs(OutputType.FILE);
			FileUtils.copyFile(scrFile, new File("c:\\bbc.jpg"));
			//implicit wait-global timeout
			driver.manage().timeouts().implicitlyWait(20, TimeUnit.SECONDS);//driver.findelement will wait for some time
			//explicit wait- not global timeout but specific to an element
			WebDriverWait wait = new WebDriverWait(driver,20);
			wait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath("url")));
			wait.until(ExpectedConditions.invisibilityOfElementLocated(By.xpath("url")));
			//expected condition is an interface
			// if you have to use different wait time for a particular element use fluentwait
			
			Set<String> mySet = new HashSet<String>();
			mySet.add("india");
			//no duplicate values are allowed in hashset, but in arraylist duplicate values are accepted
			
			// iterator - which is used extract elements of a set as there is no index in hash set
			Iterator<String> it = mySet.iterator();
			while(it.hasNext())// until iterator has a next element it prints
			System.out.println(it.next());// iterator points to the element and retrieves the element.
			
			//-------------------------------------------------------------------------------------------------------
			
			Set<String> windowids = driver.getWindowHandles();
			System.out.println("opened windows" + windowids.size());
			
			Iterator<String> ti = windowids.iterator();
			ti.next();
	}

}
