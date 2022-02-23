package smoke.testcases;

import smoke.po.Homepage;

public class Testcase1 {

    final String BASE_URL = "https://www.amazon.com";
    final String APP_PAGE_URL = BASE_URL + "/app";
    final String HOME_PAGE_URL = BASE_URL;
    final String LOGIN_PAGE_URL = "https://accounts.google.com/signin/" ;

    public Homepage navigateToHomePage() {
        navigateToUrl(BASE_URL);
        Homepage homePagePO = new Homepage();
        //Assert.assertTrue(homePagePO.isHomePageDisplayed(), "Home page didn't display, Login might have been failed. Please see the failure screenshot!");
        return homePagePO;
    }

    public void navigateToUrl(String url) {
        getDriver().get(url);
        waitUtils.waitForPageToLoad();
    }
}
