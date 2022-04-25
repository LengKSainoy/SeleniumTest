package interview;

import Utils.Driver;
import org.openqa.selenium.WebDriver;

public abstract class SeleniumTest {
   static WebDriver driver = Driver.getDriver();
   public static void goToSite(){
       driver.get("https://todomvc.com/examples/vanillajs/");
   }
   public abstract void runTest(Object val);
}
