package com.kodilla.selenium.pom;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;

import static org.junit.jupiter.api.Assertions.assertEquals;

public class KodillaStorePomTest {

    KodillaStorePom storePom;

    WebDriver driver;

    @BeforeEach
    public void setup() {
            System.setProperty("webdriver.chrome.driver", "C:/Users/Magdalena/IdeaProjects/kodilla-course/chromedriver.exe");

            ChromeOptions chromeOptions = new ChromeOptions();
            chromeOptions.addArguments("--remote-allow-origins=*");
            driver = new ChromeDriver(chromeOptions);

        driver.navigate().to("https://kodilla.com/pl/test/store");
        storePom = new KodillaStorePom(driver);
    }

    @Test
    public void testSearchResultsForNotebook() {
        storePom.search("NoteBook");
        assertEquals(2, storePom.getSearchResultsCount(), "Expected 2 results for 'NoteBook'");
    }

    @Test
    public void testSearchResultsForSchool() {
        storePom.search("School");
        assertEquals(1, storePom.getSearchResultsCount(), "Expected 1 result for 'School'");
    }

    @Test
    public void testSearchResultsForBrand() {
        storePom.search("Brand");
        assertEquals(1, storePom.getSearchResultsCount(), "Expected 1 result for 'Brand'");
    }

    @Test
    public void testSearchResultsForBusiness() {
        storePom.search("Business");
        assertEquals(0, storePom.getSearchResultsCount(), "Expected 0 results for 'Business'");
    }

    @Test
    public void testSearchResultsForGaming() {
        storePom.search("Gaming");
        assertEquals(1, storePom.getSearchResultsCount(), "Expected 1 result for 'Gaming'");
    }

    @Test
    public void testSearchResultsForPowerful() {
        storePom.search("Powerful");
        assertEquals(0, storePom.getSearchResultsCount(), "Expected 0 result for 'Powerful'");
    }

    // Testy dla wielkości znaków
//    @Test
//    public void testSearchIgnoringCase() {
//        storePom.search("notebook");
//        assertEquals(2, storePom.getSearchResultsCount(), "Expected 2 results for 'notebook'");
//
//        storePom.search("NOTEBOOK");
//        assertEquals(2, storePom.getSearchResultsCount(), "Expected 2 results for 'NOTEBOOK'");
//
//        storePom.search("Notebook");
//        assertEquals(2, storePom.getSearchResultsCount(), "Expected 2 results for 'Notebook'");
//    }


//    @AfterEach
//    public void tearDown() {
//        driver.quit();
//    }

}
