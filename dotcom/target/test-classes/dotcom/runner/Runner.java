package dotcom.runner;


import cucumber.api.CucumberOptions;
import cucumber.api.junit.Cucumber;
import cucumber.api.testng.CucumberFeatureWrapper;
import cucumber.api.testng.TestNGCucumberRunner;

import java.util.concurrent.TimeUnit;

import org.junit.runner.RunWith;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.testng.annotations.AfterClass;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.DataProvider;
import org.testng.annotations.Test;

	@RunWith(Cucumber.class)
	@CucumberOptions(
			features = "src/test/resources/dotcom/features",glue= {"dotcom.steps"}
			)
	public class Runner {
		public static WebDriver driver;
		@BeforeClass
		public static void browserSelection(){
		
			 /*if(browser.equalsIgnoreCase("firefox")){
				System.setProperty("webdriver.firefox.marionette","Drivers\\geckodriver.exe");
				 //System.setProperty("webdriver.gecko.driver","Drivers\\geckodriver.exe");
		        driver = new FirefoxDriver();
		        
			 } else if(browser.equalsIgnoreCase("chrome")){
			 */
		      System.setProperty("webdriver.chrome.driver","Drivers\\chromedriver.exe");
			    driver = new ChromeDriver();
			    driver.get("https://www.xfinity.com");
			 //}
			
			 driver.manage().timeouts().implicitlyWait(15, TimeUnit.SECONDS);
			   driver.manage().window().maximize();
			 }

		 private TestNGCucumberRunner testNGCucumberRunner;
		 
		    @BeforeClass(alwaysRun = true)
		    public void setUpClass() throws Exception {
		        testNGCucumberRunner = new TestNGCucumberRunner(this.getClass());
		    }
		 
		    @Test(groups = "cucumber", description = "Runs Cucumber Feature", dataProvider = "features")
		    public void feature(CucumberFeatureWrapper cucumberFeature) {
		        testNGCucumberRunner.runCucumber(cucumberFeature.getCucumberFeature());
		    }
		 
		    @DataProvider
		    public Object[][] features() {
		        return testNGCucumberRunner.provideFeatures();
		    }
		 
		    @AfterClass(alwaysRun = true)
		    public void tearDownClass() throws Exception {
		        testNGCucumberRunner.finish();
		        driver.quit();
		    }
	}

