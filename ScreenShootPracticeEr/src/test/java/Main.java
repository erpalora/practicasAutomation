import org.apache.commons.io.FileUtils;
import org.openqa.selenium.*;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.FluentWait;
import org.openqa.selenium.support.ui.Wait;

import java.io.File;
import java.io.IOException;
import java.util.NoSuchElementException;
import java.util.concurrent.TimeUnit;
import java.util.function.Function;

public class Main {
    public static void main(String[] args) throws IOException {
        System.setProperty("webDriver.chrome.driver", "chrome.exe");
        WebDriver driver = new ChromeDriver();
        driver.manage().window().maximize();
        driver.get("https://es.wikipedia.org/wiki/Wikipedia:Portada");


        Wait<WebDriver> fluentWait = new FluentWait<WebDriver>(driver).
                withTimeout(10, TimeUnit.SECONDS).
                pollingEvery(2, TimeUnit.SECONDS).ignoring(NoSuchElementException.class);
        WebElement text = fluentWait.until(new Function<WebDriver, WebElement>() {
            @Override
            public WebElement apply(WebDriver webDriver) {
                return webDriver.findElement(By.id("searchInput"));
            }
        });
        driver.findElement(By.id("searchInput")).sendKeys("Selenium");


        File scrFile =((TakesScreenshot)driver).getScreenshotAs(OutputType.FILE);
        FileUtils.copyFile(scrFile, new File("C:\\TestsResults\\images\\ScreenShot.png"));

        driver.findElement(By.id("searchButton")).click();
    }
}