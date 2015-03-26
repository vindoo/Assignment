import org.junit.Test;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.firefox.FirefoxDriver;


public class Amazon {
	
	@Test
	public void testamazon(){
		
		/* open the internet browser and go to wwww.amazon.com
		 * click on sign-in and enter email id and password
		 * In the search space, search for the item "watch" and click "go" button
		 * select the desired watch 
		 * click on "Add to cart" button
		 * click on "continue adding to cart" button
		 * click on "proceed to checkout" button
		 * Select the "ship to address" button
		 * select the shipping options
		 * click on continue button
		 * select the card and click on continue
		 * 
		 */
		
		FirefoxDriver driver = new FirefoxDriver();
		driver.get("https://amazon.com");
		WebElement nav = driver.findElement(By.id("nav-your-account"));
		nav.click();
		WebElement signin = driver.findElement(By.xpath(".//input[@id='nav-flyout-ya-signin']/a/span"));
		signin.click();
		WebElement username = driver.findElement(By.id("ap_email"));
		username.sendKeys("charankotte@gmail.com");
		WebElement radio = driver.findElement(By.id("ap_signin_existing_radio"));
		radio.click();
		WebElement paswd = driver.findElement(By.id("ap_password"));
		paswd.sendKeys("sairam99");
		WebElement search = driver.findElement(By.id("nav-iss-attach"));
		search.sendKeys("watch");
		WebElement go = driver.findElement(By.id("nav-searchbar"));
		go.click();
		WebElement select = driver.findElement(By.xpath("//*[@id='result_0']/div/div/div/div[2]/div[1]/a/h2"));
		select.click();
		WebElement add = driver.findElement(By.id("add-to-cart-button"));
		add.click();
		WebElement cadd = driver.findElement(By.className("a-button-inner"));
		cadd.click();
		WebElement proceed = driver.findElement(By.id("hlb-ptc-btn-native"));
		proceed.click();
		driver.findElement(By.id("enterAddressFullName")).sendKeys("street");
		driver.findElement(By.id("enterAddressAddressLine1")).sendKeys("apt");
		driver.findElement(By.id("enterAddressCity")).sendKeys("Fremont");
		driver.findElement(By.id("enterAddressStateOrRegion")).sendKeys("california");
		driver.findElement(By.id("enterAddressPostalCode")).sendKeys("56777");
		driver.findElement(By.id("enterAddressCountryCode")).sendKeys("United States");
		driver.findElement(By.id("enterAddressPhoneNumber")).sendKeys("7697978979");
		driver.findElement(By.name("isBillingAddress")).click();
		driver.findElement(By.name("shipToThisAddress")).click();
		driver.findElement(By.id("continue-top")).click();
		driver.findElement(By.name("action.checkoutInterstitialDecline"));
		
		
	}

}
