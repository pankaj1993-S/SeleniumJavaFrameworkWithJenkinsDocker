package Pages;

import Utility.BaseClass;
import Utility.BrowserUtility;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.testng.internal.BaseClassFinder;

import java.io.IOException;

public class LoginPage extends BaseClass {
@FindBy(xpath="//button[@id='axeptio_btn_dismiss']")
    WebElement btnCookies;

    public void loginSetUp() throws IOException {
        setUp();

    }
}
