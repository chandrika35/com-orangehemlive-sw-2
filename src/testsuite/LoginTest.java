package testsuite;

import browserfactory.BaseTest;
import org.junit.After;
import org.junit.Assert;
import org.junit.Before;
import org.junit.Test;
import org.openqa.selenium.By;

public class LoginTest extends BaseTest {
    String baseUrl = " https://opensource-demo.orangehrmlive.com/";

    @Before
    public void setUp() {

        openBrowser(baseUrl);
    }

    @Test

    public void userShouldLoginSuccessfullyWithValidCredentials() {
       driver.findElement(By.name("Username")).sendKeys("Admin");
        driver.findElement(By.name("password")).sendKeys("admin123");
        driver.findElement(By.xpath("//button[@type ='submit']")).click();
        String expectedMessage = "Dashboard"; // Expected message given from requirement
       String actualMessage = driver.findElement(By.xpath("//h6[@class ='oxd-text oxd-text--h6 oxd-topbar-header-breadcrumb-module']")).getText();
        Assert.assertEquals("User was not able to login successfully.",expectedMessage, actualMessage); 
    }

    @After
    public void tearDown() {
closeBrowser();
    }


}


