import java.util.Iterator;
import java.util.Set;

import org.openqa.selenium.Alert;
import org.openqa.selenium.firefox.FirefoxDriver;


public class popup {

	public static void main(String[] args) {
		
		FirefoxDriver driver = new FirefoxDriver();
		driver.get("https://in.rediff.com"); 
		driver.manage().window().maximize();
		Set<String> winids = driver.getWindowHandles(); //open windows
		System.out.println("openend windows"+winids.size());
		Iterator<String> it = winids.iterator();
		while(it.hasNext()){
		System.out.println(it.next());//prints the window ids of the windows that are opened
		
		driver.switchTo().window("the window id you want");/* this will switch the control to the window it is switched to, 
																all the operations that follow this window are applicable to this window */
		
		
		driver.close();// closes the current window
		driver.quit();//closes the complete session
		
	// Alert is an inbuilt interface
		Alert al = driver.switchTo().alert();// control switched to alert box
		System.out.println(al.getText()); // gives text written on alert box
		al.accept(); // to accept, here the control is present on alert
		driver.switchTo().defaultContent(); /// control is shifted to the previous window	
		al.dismiss(); // to dismiss
		
		}
	}}