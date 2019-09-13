package uk.ac.bristol.pageobjects.admissions.Acd;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import uk.ac.bristol.pageobjects.BasePage;

public class ApplicantDetails extends BasePage {
    public ApplicantDetails(WebDriver driver) { super(driver); }

    public class PersonalDetailsPanel {
        public final By PERSONAL_DETAILS_HEADER_IDENTIFIER = By.cssSelector("#ycls-tab-UDT3 > div > div.sv-row > div:nth-child(1) > div > div > div > div > h3");
        public final By TITLE_LABEL_IDENTIFIER = By.cssSelector("#ycls-tab-UDT3 > div > div.sv-row > div:nth-child(1)  tr:nth-child(1) > th");
        public final By TITLE_FIELD_IDENTIFIER = By.cssSelector("#ycls-tab-UDT3 > div > div.sv-row > div:nth-child(1) tr:nth-child(1) > td");
        public final By FULL_NAME_LABEL_IDENTIFIER = By.cssSelector("#ycls-tab-UDT3 > div > div.sv-row > div:nth-child(1)  tr:nth-child(2) > th");
        public final By FULL_NAME_FIELD_IDENTIFIER = By.cssSelector("#ycls-tab-UDT3 > div > div.sv-row > div:nth-child(1)  tr:nth-child(2) > td");
        public final By PREFERRED_NAME_LABEL_IDENTIFIER = By.cssSelector("#ycls-tab-UDT3 > div > div.sv-row > div:nth-child(1)  tr:nth-child(3) > th");
        public final By PREFERRED_NAME_FIELD_IDENTIFIER = By.cssSelector("#ycls-tab-UDT3 > div > div.sv-row > div:nth-child(1)  tr:nth-child(3) > td");
        public final By PREVIOUS_SURNAME_LABEL_IDENTIFIER = By.cssSelector("#ycls-tab-UDT3 > div > div.sv-row > div:nth-child(1)  tr:nth-child(4) > th");
        public final By PREVIOUS_SURNAME_FIELD_IDENTIFIER = By.cssSelector("#ycls-tab-UDT3 > div > div.sv-row > div:nth-child(1)  tr:nth-child(4) > td");
        public final By DOB_LABEL_IDENTIFIER = By.cssSelector("#ycls-tab-UDT3 > div > div.sv-row > div:nth-child(1)  tr:nth-child(5) > th");
        public final By DOB_FIELD_IDENTIFIER = By.cssSelector("#ycls-tab-UDT3 > div > div.sv-row > div:nth-child(1)  tr:nth-child(5) > td");
        public final By GENDER_LABEL_IDENTIFIER = By.cssSelector("#ycls-tab-UDT3 > div > div.sv-row > div:nth-child(1)  tr:nth-child(6) > th");
        public final By GENDER_FIELD_IDENTIFIER = By.cssSelector("#ycls-tab-UDT3 > div > div.sv-row > div:nth-child(1)  tr:nth-child(6) > td");
        public final By NOMINATED_CONTACT_LABEL_IDENTIFIER = By.cssSelector("#ycls-tab-UDT3 > div > div.sv-row > div:nth-child(1)  tr:nth-child(7) > th");
        public final By NOMINATED_CONTACT_FIELD_IDENTIFIER = By.cssSelector("#ycls-tab-UDT3 > div > div.sv-row > div:nth-child(1)  tr:nth-child(7) > td");
        public final By COUNTRY_OF_BIRTH_LABEL_IDENTIFIER = By.cssSelector("#ycls-tab-UDT3 > div > div.sv-row > div:nth-child(1)  tr:nth-child(8) > th");
        public final By COUNTRY_OF_BIRTH_FIELD_IDENTIFIER = By.cssSelector("#ycls-tab-UDT3 > div > div.sv-row > div:nth-child(1)  tr:nth-child(8) > td");
        public final By COUNTRY_OF_DOMECILE_LABEL_IDENTIFIER = By.cssSelector("#ycls-tab-UDT3 > div > div.sv-row > div:nth-child(1)  tr:nth-child(9) > th");
        public final By COUNTRY_OF_DOMECILE_FIELD_IDENTIFIER = By.cssSelector("#ycls-tab-UDT3 > div > div.sv-row > div:nth-child(1)  tr:nth-child(9) > td");
        public final By NATIONALITY_LABEL_IDENTIFIER = By.cssSelector("#ycls-tab-UDT3 > div > div.sv-row > div:nth-child(1)  tr:nth-child(10) > th");
        public final By NATIONALITY_FIELD_IDENTIFIER = By.cssSelector("#ycls-tab-UDT3 > div > div.sv-row > div:nth-child(1)  tr:nth-child(10) > td");
        public final By DUAL_NATIONALITY_LABEL_IDENTIFIER = By.cssSelector("#ycls-tab-UDT3 > div > div.sv-row > div:nth-child(1)  tr:nth-child(11) > th");
        public final By DUAL_NATIONALITY_FIELD_IDENTIFIER = By.cssSelector("#ycls-tab-UDT3 > div > div.sv-row > div:nth-child(1)  tr:nth-child(11) > td");
        public final By ENG_QUAL_NUMBER_LABEL_IDENTIFIER = By.cssSelector("#ycls-tab-UDT3 > div > div.sv-row > div:nth-child(1)  tr:nth-child(12) > th");
        public final By ENG_QUAL_NUMBER_FIELD_IDENTIFIER = By.cssSelector("#ycls-tab-UDT3 > div > div.sv-row > div:nth-child(1)  tr:nth-child(12) > td");
        public final By FEE_STATUS_LABEL_IDENTIFIER = By.cssSelector("#ycls-tab-UDT3 > div > div.sv-row > div:nth-child(1)  tr:nth-child(12) > th");
        public final By FEE_STATUS_FIELD_IDENTIFIER = By.cssSelector("#ycls-tab-UDT3 > div > div.sv-row > div:nth-child(1)  tr:nth-child(12) > td");
        public final By FEE_STATUS_CHANGE_BUTTON_IDENTIFIER = By.cssSelector("#ycls-tab-UDT3 div:nth-child(1) tr:nth-child(13) > td > a");
    }

    public class AddressDetailsPanel {
        //Address Details Panel
        public final By ADDRESS_DETAILS_HEADER_IDENTIFIER = By.cssSelector("#ycls-tab-UDT3 > div > div.sv-row > div:nth-child(2) > div > div > div > div > h3");
        public final By CONTACT_DETAILS_HEADER_IDENTIFIER = By.cssSelector("#ycls-tab-UDT3 > div > div.sv-row > div:nth-child(2) th:nth-child(1)");
        public final By HOME_DETAILS_HEADER_IDENTIFIER = By.cssSelector("#ycls-tab-UDT3 > div > div.sv-row > div:nth-child(2) th:nth-child(2)");
        public final By CA_LINE1_IDENTIFIER = By.cssSelector("#ycls-tab-UDT3 tr:nth-child(1) > td:nth-child(1) > strong");
        public final By CA_LINE1_FIELD_IDENTIFIER = By.cssSelector("#ycls-tab-UDT3 div.sv-row div:nth-child(2) tr:nth-child(1) > td:nth-child(2)");
        public final By HA_LINE1_IDENTIFIER = By.cssSelector("#ycls-tab-UDT3 tr:nth-child(1) > td:nth-child(3) > strong");
        public final By HA_LINE1_FIELD_IDENTIFIER = By.cssSelector("#ycls-tab-UDT3 div.sv-row div:nth-child(2) tr:nth-child(1) > td:nth-child(4)");
        public final By CA_LINE2_IDENTIFIER = By.cssSelector("#ycls-tab-UDT3 tr:nth-child(2) > td:nth-child(1) > strong");
        public final By CA_LINE2_FIELD_IDENTIFIER = By.cssSelector("#ycls-tab-UDT3 div.sv-row div:nth-child(2) tr:nth-child(2) > td:nth-child(2)");
        public final By HA_LINE2_IDENTIFIER = By.cssSelector("#ycls-tab-UDT3 tr:nth-child(2) > td:nth-child(3) > strong");
        public final By HA_LINE2_FIELD_IDENTIFIER = By.cssSelector("#ycls-tab-UDT3 div.sv-row div:nth-child(2) tr:nth-child(2) > td:nth-child(4)");
        public final By CA_LINE3_IDENTIFIER = By.cssSelector("#ycls-tab-UDT3 tr:nth-child(3) > td:nth-child(1) > strong");
        public final By CA_LINE3_FIELD_IDENTIFIER = By.cssSelector("#ycls-tab-UDT3 div.sv-row div:nth-child(2) tr:nth-child(3) > td:nth-child(2)");
        public final By HA_LINE3_IDENTIFIER = By.cssSelector("#ycls-tab-UDT3 tr:nth-child(3) > td:nth-child(3) > strong");
        public final By HA_LINE3_FIELD_IDENTIFIER = By.cssSelector("#ycls-tab-UDT3 div.sv-row div:nth-child(2) tr:nth-child(3) > td:nth-child(4)");
        public final By CA_LINE4_IDENTIFIER = By.cssSelector("#ycls-tab-UDT3 tr:nth-child(4) > td:nth-child(1) > strong");
        public final By CA_LINE4_FIELD_IDENTIFIER = By.cssSelector("#ycls-tab-UDT3 div.sv-row div:nth-child(2) tr:nth-child(4) > td:nth-child(2)");
        public final By HA_LINE4_IDENTIFIER = By.cssSelector("#ycls-tab-UDT3 tr:nth-child(4) > td:nth-child(3) > strong");
        public final By HA_LINE4_FIELD_IDENTIFIER = By.cssSelector("#ycls-tab-UDT3 div.sv-row div:nth-child(2) tr:nth-child(4) > td:nth-child(4)");
        public final By CA_LINE5_IDENTIFIER = By.cssSelector("#ycls-tab-UDT3 tr:nth-child(5) > td:nth-child(1) > strong");
        public final By CA_LINE5_FIELD_IDENTIFIER = By.cssSelector("#ycls-tab-UDT3 div.sv-row div:nth-child(2) tr:nth-child(5) > td:nth-child(2)");
        public final By HA_LINE5_IDENTIFIER = By.cssSelector("#ycls-tab-UDT3 tr:nth-child(5) > td:nth-child(3) > strong");
        public final By HA_LINE5_FIELD_IDENTIFIER = By.cssSelector("#ycls-tab-UDT3 div.sv-row div:nth-child(2) tr:nth-child(5) > td:nth-child(4)");
        public final By CA_COUNTRY_IDENTIFIER = By.cssSelector("#ycls-tab-UDT3 tr:nth-child(6) > td:nth-child(1) > strong");
        public final By CA_COUNTRY_FIELD_IDENTIFIER = By.cssSelector("#ycls-tab-UDT3 div.sv-row div:nth-child(2) tr:nth-child(6) > td:nth-child(2)");
        public final By HA_COUNTRY_IDENTIFIER = By.cssSelector("#ycls-tab-UDT3 tr:nth-child(6) > td:nth-child(3) > strong");
        public final By HA_COUNTRY_FIELD_IDENTIFIER = By.cssSelector("#ycls-tab-UDT3 div.sv-row div:nth-child(2) tr:nth-child(6) > td:nth-child(4)");
        public final By CA_POSTCODE_IDENTIFIER = By.cssSelector("#ycls-tab-UDT3 tr:nth-child(7) > td:nth-child(1) > strong");
        public final By CA_POSTCODE_FIELD_IDENTIFIER = By.cssSelector("#ycls-tab-UDT3 div.sv-row div:nth-child(2) tr:nth-child(7) > td:nth-child(2)");
        public final By HA_POSTCODE_IDENTIFIER = By.cssSelector("#ycls-tab-UDT3 tr:nth-child(7) > td:nth-child(3) > strong");
        public final By HA_POSTCODE_FIELD_IDENTIFIER = By.cssSelector("#ycls-tab-UDT3 div.sv-row div:nth-child(2) tr:nth-child(7) > td:nth-child(4)");
        public final By CA_TEl_NUMBER_IDENTIFIER = By.cssSelector("#ycls-tab-UDT3 tr:nth-child(8) > td:nth-child(1) > strong");
        public final By CA_TEL_NUMBER_FIELD_IDENTIFIER = By.cssSelector("#ycls-tab-UDT3 div.sv-row div:nth-child(2) tr:nth-child(8) > td:nth-child(2)");
        public final By HA_TEl_NUMBER_IDENTIFIER = By.cssSelector("#ycls-tab-UDT3 tr:nth-child(8) > td:nth-child(3) > strong");
        public final By HA_TEL_NUMBER_FIELD_IDENTIFIER = By.cssSelector("#ycls-tab-UDT3 div.sv-row div:nth-child(2) tr:nth-child(8) > td:nth-child(4)");
        public final By CA_MOB_NUMBER_IDENTIFIER = By.cssSelector("#ycls-tab-UDT3 tr:nth-child(9) > td:nth-child(1) > strong");
        public final By CA_MOB_NUMBER_FIELD_IDENTIFIER = By.cssSelector("#ycls-tab-UDT3 div.sv-row div:nth-child(2) tr:nth-child(9) > td:nth-child(2)");
        public final By HA_MOB_NUMBER_IDENTIFIER = By.cssSelector("#ycls-tab-UDT3 tr:nth-child(9) > td:nth-child(3) > strong");
        public final By HA_MOB_NUMBER_FIELD_IDENTIFIER = By.cssSelector("#ycls-tab-UDT3 div.sv-row div:nth-child(2) tr:nth-child(9) > td:nth-child(4)");
        public final By CA_EMAIL_ADD_IDENTIFIER = By.cssSelector("#ycls-tab-UDT3 tr:nth-child(10) > td:nth-child(1) > strong");
        public final By CA_EMAIL_ADD_FIELD_IDENTIFIER = By.cssSelector("#ycls-tab-UDT3 div.sv-row div:nth-child(2) tr:nth-child(10) > td:nth-child(2)");
        public final By HA_EMAIL_ADD_IDENTIFIER = By.cssSelector("#ycls-tab-UDT3 tr:nth-child(10) > td:nth-child(3) > strong");
        public final By HA_EMAIL_ADD_FIELD_IDENTIFIER = By.cssSelector("#ycls-tab-UDT3 div.sv-row div:nth-child(2) tr:nth-child(10) > td:nth-child(4)");
    }

    public class ApplicationDetailsPanel{
        public final By AD_PANEL_HEADER_IDENTIFIER = By.id("ui-id-29");
        public final By CONTEXTUAL_INFORMATION_TITLE_IDENTIFIER = By.cssSelector("#ui-id-30 > table:nth-child(1) tr:nth-child(1) > th");
        public final By CONTEXTUAL_ELIGIBILITY_COLUMN_HEADER_IDENTIFIER = By.cssSelector("#ui-id-30 > table:nth-child(1) tr:nth-child(2) > th:nth-child(1)");
        public final By ASPIRING_SCHOOL_COLUMN_HEADER_IDENTIFIER = By.cssSelector("#ui-id-30 > table:nth-child(1) tr:nth-child(2) > th:nth-child(2)");
        public final By PROJECT_PARTICIPANT_ATB_COLUMN_HEADER_IDENTIFIER = By.cssSelector("#ui-id-30 > table:nth-child(1) tr:nth-child(2) > th:nth-child(3)");
        public final By PROJECT_PARTICIPANT_SS_COLUMN_HEADER_IDENTIFIER = By.cssSelector("#ui-id-30 > table:nth-child(1) tr:nth-child(2) > th:nth-child(4)");
        public final By INCARE_COLUMN_HEADER_IDENTIFIER = By.cssSelector("#ui-id-30 > table:nth-child(1) tr:nth-child(2) > th:nth-child(5)");
        public final By POLAR3_COLUMN_HEADER_IDENTIFIER = By.cssSelector("#ui-id-30 > table:nth-child(1) tr:nth-child(2) > th:nth-child(6)");
        public final By CRIMINAL_CONVICTION_COLUMN_HEADER_IDENTIFIER = By.cssSelector("#ui-id-30 > table:nth-child(1) tr:nth-child(2) > th:nth-child(7)");
        public final By LIST_APPS_HEADER_IDENTIFIER = By.cssSelector("#ui-id-30 > table:nth-child(3) tr:nth-child(1) > th");
        public final By COURSE_COLUMN_HEADER_IDENTIFIER = By.cssSelector("#ui-id-30 > table:nth-child(3) tr:nth-child(2) > th:nth-child(1)");
        public final By YOE_COLUMN_HEADER_IDENTIFIER = By.cssSelector("#ui-id-30 > table:nth-child(3) tr:nth-child(2) > th:nth-child(2)");
        public final By POE_COLUMN_HEADER_IDENTIFIER = By.cssSelector("#ui-id-30 > table:nth-child(3) tr:nth-child(2) > th:nth-child(3)");
        public final By APP_STATUS_COLUMN_HEADER_IDENTIFIER = By.cssSelector("#ui-id-30 > table:nth-child(3) tr:nth-child(2) > th:nth-child(4)");
        public final By DESCRESP_COLUMN_HEADER_IDENTIFIER = By.cssSelector("#ui-id-30 > table:nth-child(3) tr:nth-child(2) > th:nth-child(5)");
        public final By OFFER_TEXT_COLUMN_HEADER_IDENTIFIER = By.cssSelector("#ui-id-30 > table:nth-child(3) tr:nth-child(2) > th:nth-child(2)");
        public final By COURSE_FIELD_IDENTIFIER = By.cssSelector("#ui-id-30 > table:nth-child(3) tr:nth-child(1) > td:nth-child(1)");
        public final By YOE_FIELD_IDENTIFIER = By.cssSelector("#ui-id-30 > table:nth-child(3) tr:nth-child(1) > td:nth-child(2)");
        public final By POE_FIELD_IDENTIFIER = By.cssSelector("#ui-id-30 > table:nth-child(3) tr:nth-child(1) > th:nth-child(3)");
        public final By APP_STATUS_FIELD_IDENTIFIER = By.cssSelector("#ui-id-30 > table:nth-child(3) tr:nth-child(1) > th:nth-child(4)");
        public final By DESCRESP_FIELD_IDENTIFIER = By.cssSelector("#ui-id-30 > table:nth-child(3) tr:nth-child(1) > th:nth-child(5)");
        public final By OFFER_TEXT_FIELD_IDENTIFIER = By.cssSelector("#ui-id-30 > table:nth-child(3) tr:nth-child(1) > th:nth-child(6)");
    }

}
