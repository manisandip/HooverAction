package WebTest;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Action;
import org.openqa.selenium.interactions.Actions;

public class HomePage extends Utils {
    // This is the method for doing hoover action on category
    public void hooverOverCategoryLink(String category){
        WebElement link_category = driver.findElement(By.linkText(category));
        Actions builder = new Actions(driver);
        Action mouseOverCategory = builder.moveToElement(link_category).build();
        mouseOverCategory.perform();
    }
    //method for clicking on sub category
    public void clickOnsubcategoryLink(String subcategory){
     clickOnElement(By.linkText(subcategory));
    }
    //method to verify we are on the correct page after clicking on subcategory
    public void userShouldBeAbleToNavigateToSubcategoryPageSuccessfully(String subcategory){
        assertURL(subcategory);
    }
}
