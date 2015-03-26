import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.firefox.FirefoxProfile;


public class Certificate_error {

	public static void main(String[] args) {
		FirefoxProfile fp = new FirefoxProfile(); //firefoxprofile is a class and an object is crested
		fp.setAcceptUntrustedCertificates(true);
		fp.setAssumeUntrustedCertificateIssuer(false);		
		FirefoxDriver driver = new FirefoxDriver();
		driver.get("https://in.rediff.com");
// for IE 
		driver.navigate().to("javascript:document.getElementById('overridelink').click()");
	}

}
