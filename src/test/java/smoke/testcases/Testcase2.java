package smoke.testcases;

import smoke.po.Homepage;
import smoke.po.Loginpage;
import smoke.po.Reportpage;

public class Testcase2 extends Testcase1 {

    @Test(groups = {"home page"})
    public void verifyHomePageIsDisplayed(){
        Homepage homePagePO = navigateToHomePage();
        //Assert.assertTrue(homePagePO.isHomePageDisplayed(), "\"Home Page\" didn't display!");
    }

    @Test(groups = {"login"})
    public void verifyUserCanLogInWithValidCredentials() {
        navigateToUrl(LOGIN_PAGE_URL);
        Loginpage loginPO = new Loginpage();
        Reportpage reportPagePO = login(EMAIL, PASSWORD);
        //Assert.assertTrue(reportPagePO.isSelectReportDateLabelDisplayed(), "(Login Failed) \"Report Page\" didn't display!");
    }
}
