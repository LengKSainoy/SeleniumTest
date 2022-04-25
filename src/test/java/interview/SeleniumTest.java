package interview;

import Utils.Driver;
import org.openqa.selenium.WebDriver;

public abstract class SeleniumTest {
   WebDriver driver = Driver.getDriver();
   public abstract void runTest(Object val);
}
