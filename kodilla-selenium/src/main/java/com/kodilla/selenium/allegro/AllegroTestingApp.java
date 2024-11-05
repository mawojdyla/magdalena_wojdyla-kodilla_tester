package com.kodilla.selenium.allegro;

import org.openqa.selenium.Alert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.Select;
import org.openqa.selenium.support.ui.WebDriverWait;

import java.util.List;

public class AllegroTestingApp {
    public static void main(String[] args) {
        System.setProperty("webdriver.chrome.driver", "c:\\selenium-drivers\\chrome\\chromedriver.exe");
        ChromeOptions chromeOptions = new ChromeOptions();
        chromeOptions.addArguments("--remote-allow-origins=*");
        WebDriver driver = new ChromeDriver(chromeOptions);

        driver.get("https://ebay.pl");

        WebElement category = driver.findElement(By.cssSelector("#gh-cat-box > select:first-of-type"));
        Select categorySelect = new Select(category);
        categorySelect.selectByIndex(9);

        WebElement searchField = driver.findElement(By.id("gh-ac"));
        searchField.sendKeys("mavic mini");
        searchField.submit();

        WebDriverWait wait = new WebDriverWait(driver, 20);
        wait.until(ExpectedConditions.visibilityOfElementLocated(By.cssSelector("ul.srp-results")));    //kontener z wynikami wyszukiwania, gdzie Selenium czeka, aż stanie się widoczny

//        Alert alert = driver.switchTo().alert();      // w EBay raczej zbędne
//        alert.accept();

        List<WebElement> productCards = driver.findElements(By.cssSelector("li.s-item"));   // pobiera wszystkie elementy wyników wyszukiwania (karty produktów)

        for (WebElement product : productCards) {
            System.out.println(product.getText());
        }

        driver.quit();
    }

}

/*

Dotyczy submodułu o selektorach XPath

package com.kodilla.selenium.allegro;

import org.openqa.selenium.Alert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;
import org.openqa.selenium.support.ui.Select;

public class AllegroTestingApp {
    public static void main(String[] args) {
        System.setProperty("webdriver.chrome.driver", "c:\\selenium-drivers\\chrome\\chromedriver.exe");
        ChromeOptions chromeOptions = new ChromeOptions();
        chromeOptions.addArguments("--remote-allow-origins=*");
        WebDriver driver = new ChromeDriver(chromeOptions);
        driver.get("https://ebay.pl");

        WebElement category = driver.findElement(By.xpath("//*[@id=\"gh-cat-box\"]/select[1]"));
        Select categorySelect = new Select(category);
        categorySelect.selectByIndex(9);

        WebElement searchField = driver.findElement(By.xpath("//*[@id=\"gh-ac\"]"));
        searchField.sendKeys("mavic mini");
        searchField.submit();

        Alert alert = driver.switchTo().alert();
        alert.accept();
    }

}
 */
