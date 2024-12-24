package Utility;

import org.apache.poi.ss.formula.atp.Switch;
import org.apache.xmlbeans.impl.xb.xsdschema.FieldDocument;
import org.openqa.selenium.Alert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

public class BrowserUtility {
    WebDriver driver;

    public void handlePopUp(String param, String sendkeys) {
        if (driver != null) {


        Alert alert = driver.switchTo().alert();
        switch (param.toLowerCase()) {
            case "accept":
                alert.accept();
                break;
            case "dismiss":
                alert.dismiss();
                break;
            case "gettext":
                System.out.println(alert.getText());
                break;
            case "sendkeys":
                if (sendkeys != null && !sendkeys.isEmpty()) {
                    alert.sendKeys(sendkeys);
                } else {
                    throw new IllegalArgumentException("SendKeys parameter is required for 'sendkeys' action");
                }
                break;
            default:
                throw new IllegalStateException("Unexpected value: " + param);
        }
    }

}

public void clickElement(WebElement element){
        driver.findElement(By.xpath("element"));
}


}
