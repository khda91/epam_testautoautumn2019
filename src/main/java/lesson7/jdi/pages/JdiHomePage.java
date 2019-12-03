package lesson7.jdi.pages;

import com.epam.jdi.light.elements.complex.WebList;
import com.epam.jdi.light.elements.composite.WebPage;
import com.epam.jdi.light.elements.pageobjects.annotations.FindBy;

public class JdiHomePage extends WebPage {

    @FindBy(css = ".benefit")
    WebList benefits;

    public int getBenefitsCount() {
        return benefits.size();
    }
}
