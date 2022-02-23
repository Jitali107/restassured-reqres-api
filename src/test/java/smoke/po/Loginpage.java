package smoke.po;

import org.openqa.selenium.support.FindBy;

public class Loginpage {
    @FindBy(id = "identifierId")
    private BaseElement emailEditText;
    private String emailText;

    public BaseElement getEmailEditText() {
        return emailEditText;
    }

    @FindBy(name = "password")
    private BaseElement passwordField;
    private String passwordText;

    public BaseElement getPasswordField() {
        return passwordField;
    }

    @FindBy(css = ".login-btn")
    ButtonElement logInButton;
    public ButtonElement getLogInButton() {
        return logInButton;
    }

    /**
     * This method is used to Fill Email Id in Email field
     *
     * @param email
     */
    public void setEmailEditText(String email) {
        emailText = email;
    }

    private void fillEmailEditText() {
        getEmailEditText().sendKeys(emailText);
    }

    /**
     * This method will fill the Password in Password field
     *
     * @param password
     */
    public void setPasswordEditText(String password) {
        passwordText = password;
    }

    private void fillPasswordEditText() {
        getPasswordField().sendKeys(passwordText);
    }

    /**
     * This method will click on Sign in button and Navigate to Admin Panel
     *
     * @return
     */
    public void clickOnLogInButton() {
        getLogInButton().click();
    }

    public boolean isLogInButtonDisplayed() {
        return getLogInButton().isDisplayed();
    }

    public void sync() {
        fillEmailEditText();
        fillPasswordEditText();
    }


}
