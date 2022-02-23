package core.component;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.By;
import org.openqa.selenium.Dimension;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.Point;
import org.openqa.selenium.Rectangle;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebDriverException;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;


import core.driver.WebDriverManager;
import core.pageobject.IgnoreInit;

public class BaseElement implements WebElement {

    @IgnoreInit
    protected WebElement el = null;
    protected String fieldName = "";
    protected Integer explicitWait;

    public BaseElement(final String css) {
        this.el = this.getDriver().findElement(By.cssSelector(css));
    }

    public BaseElement(final WebElement el) {
        this.el = el;
    }

    protected WebDriver getDriver() {
        return WebDriverManager.getThreadLocalDriver();
    }

    protected Actions getActionsDriver() {
        return new Actions(this.getDriver());
    }
    @Override
    public void clear() {
        this.el.clear();
    }

    @Override
    public void click() {
        //this.scrollIntoView();
        this.el.click();
    }


    @Override
    public WebElement findElement(final By arg0) {
        return this.el.findElement(arg0);

    }


}
