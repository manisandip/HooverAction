package WebTest;

import io.cucumber.core.gherkin.Step;
import io.cucumber.java.en.And;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;

public class Mystepdefs {
    // created object for homepage class
    HomePage homePage = new HomePage();
    @When("user hoover over category {string} link")
    public void user_hoover_over_category_link(String category) {
        //user can hoover on category
      homePage.hooverOverCategoryLink(category);

    }


    @And("click on subcategory {string} link")
    public void click_on_subcategory_link(String subcategory) {
        //user can click on any subcategory
        homePage.clickOnsubcategoryLink(subcategory);

    }
    @Then("user should be able to navigate to subcategory page {string} successfully")
    public void user_should_be_able_to_navigate_to_subcategory_page_successfully(String subcategory) {
        //user can verify that after clicking on subcategory they are on right page
        homePage.userShouldBeAbleToNavigateToSubcategoryPageSuccessfully(subcategory);


    }

}
