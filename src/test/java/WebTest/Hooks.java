package WebTest;

import io.cucumber.java.Before;



public class Hooks extends Utils
{
    BrowserSelector browserSelector =new BrowserSelector();
    @Before
    // method to open browser
    public void openBrowser()
    {
        browserSelector.setUpBrowser();
    }
}
