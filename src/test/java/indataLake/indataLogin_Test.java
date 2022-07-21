package indataLake;

import static org.junit.Assert.*;

import org.junit.After;
import org.junit.Before;
import org.junit.Test;
import org.openqa.selenium.WebDriver;

import base.BasicData;
import indataLake.indataLogin;
@SuppressWarnings("unused")
public class indataLogin_Test {

	private WebDriver driver;
	indataLogin indatalogin;
	@Before
	public void setUp() throws Exception {
		indatalogin = new indataLogin(driver);
		driver = indatalogin.chromeDriverConnection();		
		indatalogin.visit("https://dev-marketing.indatalake.com/auth/sign-in");
	}

	@After
	public void tearDown() throws Exception {
	}

	@Test
	public void test()  throws InterruptedException{
		indatalogin.signIn();
	    indatalogin.createCampaign(BasicData.TEMPLATE_TYPE_2);
	    indatalogin.create();
	}

}
