package pages;

import org.openqa.selenium.WebDriver;

/** Элементы общие для всех страниц */
public abstract class AbstractPage {
    protected static WebDriver driver;

    public static WebDriver getDriver() {
        return driver;
    }

    public static void setDriver(WebDriver webDriver) {
        driver = webDriver;
    }
}
