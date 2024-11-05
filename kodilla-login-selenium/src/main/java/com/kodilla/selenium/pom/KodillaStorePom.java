package com.kodilla.selenium.pom;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import java.util.List;

public class KodillaStorePom extends AbstractPom {

    @FindBy(css = "input[name='search']")
    WebElement searchField;

    @FindBy(css = ".element")
    List<WebElement> searchResults;

    public KodillaStorePom(WebDriver driver) {
        super(driver);
        PageFactory.initElements(driver, this);
    }

    // metoda do wyszukiwania fraz
    public void search(String query) {
        searchField.clear();
        searchField.sendKeys(query);
//        searchField.submit();   // możemy użyć 'submit' jeśli pole jest w formularzu,
                               // inaczej możemy kliknąć przycisk szukania

    }

    public int getSearchResultsCount() {
        return searchResults.size();
    }


}
