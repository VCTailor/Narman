package features;

import org.openqa.selenium.*;

import org.openqa.selenium.support.ui.Select;
import pages.CreateOrderDetails;
import pages.LoginPage;
import Utils.AutomationConstants;
import Utils.BrowserFactory;
import cucumber.api.Scenario;
import cucumber.api.java.After;
import cucumber.api.java.Before;
import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;

public class CreateOrderStepDef {
	
	  public WebDriver driver;
	  LoginPage loginPage;
      CreateOrderDetails create = new CreateOrderDetails();
    @Before
    public void start()
    {
        driver = BrowserFactory.getDriver();
    }

    @Given("^user is on crareate order page$")
    public void user_is_on_crareate_order_page() throws Throwable {

    	loginPage = new LoginPage();
    	loginPage.login(AutomationConstants.USERNAME, AutomationConstants.PASSWORD);

             Thread.sleep(5000);
             create.goToCreateOrder();

        // Utils.selectFromDropDown(By.id("supplier"),"SwapnaTraders");n("^user enter vaild data$")
          Thread.sleep(3000);

             create.orderDetails_Step1();
             create.orderDetails_Step2();
    }

    @When("^user submit all data$")
    public void user_submit_all_data() throws Throwable {
        
    }

    @Then("^order should successfully created with message$")
    public void order_should_successfully_created_with_message() throws Throwable {
     
    }
    
    
    
    @After
  
    public void embedScreenshot(Scenario scenario) {

        if (scenario.isFailed()) {
            try {
                scenario.write("Current Page URL is " + driver.getCurrentUrl());
//            byte[] screenshot = getScreenshotAs(OutputType.BYTES);
                byte[] screenshot = ((TakesScreenshot) driver).getScreenshotAs(OutputType.BYTES);
                scenario.embed(screenshot, "image/png");
            } catch (WebDriverException somePlatformsDontSupportScreenshots) {
                System.err.println(somePlatformsDontSupportScreenshots.getMessage());
            }

        }

    }
}
