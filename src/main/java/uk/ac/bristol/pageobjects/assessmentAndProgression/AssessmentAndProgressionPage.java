package uk.ac.bristol.pageobjects.assessmentAndProgression;

import org.openqa.selenium.By;
import org.openqa.selenium.chrome.ChromeDriver;
import uk.ac.bristol.pageobjects.BasePage;

public class AssessmentAndProgressionPage extends BasePage {

    private static final By VIEW_ALL_MY_TUTEES_LINK_IDENTIFIER = By.cssSelector("body > main > div > div.sv-row > div:nth-child(2) > div > div > div:nth-child(1) > div.sv-list-group.sv-portal-2-col > a:nth-child(1)");
    private static final By VIEW_MY_TUTEES_BY_PROGRAMME_LINK_IDENTIFIER = By.cssSelector("body > main > div > div.sv-row > div:nth-child(2) > div > div > div:nth-child(1) > div.sv-list-group.sv-portal-2-col > a:nth-child(2)");

    public AssessmentAndProgressionPage(ChromeDriver driver) {
        super(driver);
    }


    public PersonalTutoringMyTuteesPage clickViewAllMyTuteesLink() {
        clickElement(VIEW_ALL_MY_TUTEES_LINK_IDENTIFIER);

        PersonalTutoringMyTuteesPage personalTutoringMyTuteesPage = new PersonalTutoringMyTuteesPage(driver);
        return personalTutoringMyTuteesPage;
    }

    public PersonalTutoringMyTuteesByProgrammePage clickViewMyTuteesByProgrammeLink() {
        clickElement(VIEW_MY_TUTEES_BY_PROGRAMME_LINK_IDENTIFIER);

        PersonalTutoringMyTuteesByProgrammePage personalTutoringMyTuteesByProgrammePage = new PersonalTutoringMyTuteesByProgrammePage(driver);
        return personalTutoringMyTuteesByProgrammePage;
    }
}
