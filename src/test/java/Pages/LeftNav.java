package Pages;

import Utilities.GWD;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class LeftNav extends ParentPage{
    public LeftNav() {
        PageFactory.initElements(GWD.getDriver(),this);
    }

    @FindBy (xpath = "//a[@href='register.htm']")
    public WebElement registerButton;








    public WebElement getWebElement(String strElementName) {
        switch (strElementName.trim()) {
            case "Register":return registerButton;


        }
        return null;
    }
}
