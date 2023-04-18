package testsuite;

import browserfactory.BaseTest;
import org.junit.After;
import org.junit.Assert;
import org.junit.Before;
import org.junit.Test;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

public class ForgotPasswordTest extends BaseTest {
    public static WebDriver driver;
    String baseUrl = " https://opensource-demo.orangehrmlive.com/";

    @Before
    public void setUp() {

        openBrowser(baseUrl);

    }

    @Test

    public void userShouldNavigateToForgotPasswordPageSuccessfully() {
        driver.findElement(By.xpath("//p[@class = 'oxd-text oxd-text--p orangehrm-login-forgot-header']")).click();
        String expectedMessage = "Reset Password"; // Expected message given from requirement
        String actualMessage = driver.findElement(By.xpath("//h6[@class ='oxd-text oxd-text--h6 orangehrm-forgot-password-title']")).getText();
        Assert.assertEquals("User was not navigated to Forgot Password Page",actualMessage, expectedMessage);
    }

    @After
    public void tearDown() {
        closeBrowser();
    }

}