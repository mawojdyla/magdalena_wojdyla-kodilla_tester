package com.kodilla.selenium.pom;

import org.openqa.selenium.Alert;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class KodillaLoginPom extends AbstractPom {

    @FindBy(css = "input[type='email']")
    WebElement emailField;

    @FindBy(css = "input[type='password']")
    WebElement passwordField;

    @FindBy(xpath = "//button[contains(text(), 'Log in')]")
    WebElement loginButton;

//    WebDriver driver;

    public KodillaLoginPom(WebDriver driver) {
//        this.driver = driver;
        super(driver);
        PageFactory.initElements(driver, this);     // zainicjowanie pól z @FindBy
    }

    public boolean login(String email, String password) {           // czy logowanie się powiodło
        emailField.sendKeys(email);
        passwordField.sendKeys(password);
        loginButton.click();
        Alert alert = driver.switchTo().alert();
        String message = alert.getText();       // Po kliknięciu, przełączasz sterowanie na alert
        alert.dismiss();                       // (wyskakujące okienko) i pobierasz jego treść jako tekst.
        System.out.println(message);
        return message.contains("teraz zalogowany!");           // spr. czy tekst z alertu jest równy "Jesteś teraz zalogowany".
                                                                    // Jeśli tak, metoda zwróci true, co oznacza, że logowanie się powiodło.
    }
// .equals - Jesteś (obsługa polskich znaków)
}

/*
przed porządkowaniem kodu:
package com.kodilla.selenium.pom;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class KodillaLoginPom {

    @FindBy(css = "input[type=’email’]")
    WebElement emailField;

    @FindBy(css = "input[type=’password’]")
    WebElement passwordField;

    @FindBy(xpath = "//button[contains(text(), 'Log in')]")
    WebElement loginButton;

    WebDriver driver;

    public KodillaLoginPom() {          // konstruktor klasy
        System.setProperty("webdriver.chrome.driver", "chromedriver.exe");
        driver = new ChromeDriver();        // tworzy sterownik przeglądarki
        PageFactory.initElements(driver, this);     // zainicjowanie pól z @FindBy

        driver.navigate().to("https://kodilla.com/pl/test/login");      // otwiera URL
    }

    public boolean login(String email, String password) {           // czy logowanie się powiodło
        emailField.sendKeys(email);
        passwordField.sendKeys(password);
        loginButton.click();
        String message = driver.switchTo().alert().getText();       // Po kliknięciu, przełączasz sterowanie na alert
                                                                    // (wyskakujące okienko) i pobierasz jego treść jako tekst.


        return message.equals("Jesteś teraz zalogowany");           // spr. czy tekst z alertu jest równy "Jesteś teraz zalogowany".
                                                                    // Jeśli tak, metoda zwróci true, co oznacza, że logowanie się powiodło.
    }

    public void close() {
        driver.close();
    }
}

 */