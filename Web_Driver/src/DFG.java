import junit.framework.Assert;

import org.junit.After;
import org.junit.AfterClass;
import org.junit.Before;
import org.junit.BeforeClass;
import org.junit.Ignore;
import org.junit.Rule;
import org.junit.Test;
import org.junit.rules.ErrorCollector;


public class DFG {

	@Rule
	public ErrorCollector errCollector = new ErrorCollector();
	
	@BeforeClass
	public static void Begining(){
		System.out.println("***Begining***");
	}
	@AfterClass
	public static void Ending(){
		System.out.println("end");
	}
	@Before
	public void openbrowser(){
		System.out.println("open browser");
	}
	@After
	public void closebrowser(){
		System.out.println("close browser");
	}
	@Test
	public void sendEmailtest(){
		System.out.println("testing sending email");
		int mysendoutemail =100;
		int myreceiveemail = 101;
		try{
			Assert.assertEquals(mysendoutemail,myreceiveemail);
				}catch(Throwable t){
					System.out.println("error");
					errCollector.addError(t);
				}
		System.out.println("sending not equal to receive");
		
	}
	@Test
	public void sendmessage(){
		System.out.println("testing sending message");
		int mysendoutmessage =100;
		int myreceivemessage = 101;
		
			Assert.assertEquals(mysendoutmessage,myreceivemessage);
		
					System.out.println("send message is not equal");
					
	
	}
	@Test
	public void register(){
		System.out.println("register");
	}
	@Ignore
	public void online(){
		System.out.println("online");
}
}