package WebTest;

import org.openqa.selenium.By;
import org.junit.Assert;
public class Utils extends BasePage {
    //method for clicking on an element
    public void clickOnElement(By by)
    {
        driver.findElement(by).click();
    }

    public static void assertURL(String text)
    {
        Assert.assertTrue(driver.getCurrentUrl().contains(text));
    }

}

