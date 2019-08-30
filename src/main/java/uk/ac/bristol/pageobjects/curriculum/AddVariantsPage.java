package uk.ac.bristol.pageobjects.curriculum;

import org.openqa.selenium.By;
import org.openqa.selenium.chrome.ChromeDriver;
import uk.ac.bristol.enums.IntakeMonth;
import uk.ac.bristol.enums.ProgrammeIntensity;
import uk.ac.bristol.enums.UnitOfMeasurement;
import uk.ac.bristol.helpers.ProgrammeDetails;
import uk.ac.bristol.pageobjects.BasePage;

import static junit.framework.TestCase.fail;

public class AddVariantsPage extends BasePage {

    private static final By INTENSITY_DROPDOWN_IDENTIFIER = By.cssSelector("#ANSWER_TTQ_MENSYS_2__chosen > a > div > b");
    private static final String INTENSITY_VALUE_IDENTIFIER = "ANSWER.TTQ.MENSYS.2.";
    private static final By INTAKE_MONTH_DROPDOWN_IDENTIFIER = By.id("ANSWER.TTQ.MENSYS.3.");
    private static final By LENGTH_INPUT_IDENTIFIER = By.id("ANSWER.TTQ.MENSYS.4.");
    private static final By UNIT_OF_MEASUREMENT_DROPDOWN_IDENTIFIER = By.cssSelector("#ANSWER_TTQ_MENSYS_5__chosen > a > div > b");
    private static final String UNIT_OF_MEASUREMENT_VALUE_IDENTIFIER = "ANSWER.TTQ.MENSYS.5.";
    private static final By ADD_VARIANT_BUTTON_IDENTIFIER = By.id("ANSWER.TTQ.MENSYS.6.");
    private static final By CREATE_PROGRAMME_BUTTON_IDENTIFIER = By.id("ANSWER.TTQ.MENSYS.8.");


    public AddVariantsPage(ChromeDriver driver) {
        super(driver);
    }


    public ProgrammeCreationValidationPage completeAddVariantsPage(ProgrammeDetails programmeDetails) {
        selectIntensity(programmeDetails.getProgrammeIntensity());
        selectIntakeMonth(programmeDetails.getIntakeMonth());
        enterLength(programmeDetails.getLength());
        selectUnitsOfMeasurement(programmeDetails.getUnitOfMeasurement());
        selectAddVariantButton();
        return selectCreateProgrammeButton();
    }


    private void selectIntensity(ProgrammeIntensity programmeIntensity) {
        clickElement(INTENSITY_DROPDOWN_IDENTIFIER);

        switch(programmeIntensity) {
            case FULL_TIME: {
                clickElement(By.id(INTENSITY_VALUE_IDENTIFIER + "0"));
                break;
            }
            case PART_TIME_25_PERCENT: {
                clickElement(By.id(INTENSITY_VALUE_IDENTIFIER + "1"));
                break;
            }
            case PART_TIME_33_PERCENT: {
                clickElement(By.id(INTENSITY_VALUE_IDENTIFIER + "2"));
                break;
            }
            case PART_TIME_50_PERCENT: {
                clickElement(By.id(INTENSITY_VALUE_IDENTIFIER + "3"));
                break;
            }
            case PART_TIME_VARIABLE: {
                clickElement(By.id(INTENSITY_VALUE_IDENTIFIER + "4"));
                break;
            }
            default:
                fail("Unknown Programme Intensity");
        }
    }

    private void selectIntakeMonth(IntakeMonth intakeMonth) {
        selectDropDownOptionByValue(INTAKE_MONTH_DROPDOWN_IDENTIFIER, intakeMonth.getValue());
        clickElement(INTAKE_MONTH_DROPDOWN_IDENTIFIER);
    }

    private void enterLength(String textToEnter) {
        enterTextIntoElement(LENGTH_INPUT_IDENTIFIER, textToEnter);
    }

    private void selectUnitsOfMeasurement(UnitOfMeasurement unitOfMeasurement) {
        clickElement(UNIT_OF_MEASUREMENT_DROPDOWN_IDENTIFIER);

        switch(unitOfMeasurement) {
            case DAYS: {
                clickElement(By.id(UNIT_OF_MEASUREMENT_VALUE_IDENTIFIER + "0"));
                break;
            }
            case HOURS: {
                clickElement(By.id(UNIT_OF_MEASUREMENT_VALUE_IDENTIFIER + "1"));
                break;
            }
            case MONTHS: {
                clickElement(By.id(UNIT_OF_MEASUREMENT_VALUE_IDENTIFIER + "2"));
                break;
            }
            case NOT_APPLICABLE: {
                clickElement(By.id(UNIT_OF_MEASUREMENT_VALUE_IDENTIFIER + "3"));
                break;
            }
            case WEEKS: {
                clickElement(By.id(UNIT_OF_MEASUREMENT_VALUE_IDENTIFIER + "4"));
                break;
            }
            case YEARS: {
                clickElement(By.id(UNIT_OF_MEASUREMENT_VALUE_IDENTIFIER + "5"));
                break;
            }
            default:
                fail("Unknown Unit of Measure");
        }
    }

    private void selectAddVariantButton() {
        clickElement(ADD_VARIANT_BUTTON_IDENTIFIER);
    }

    private ProgrammeCreationValidationPage selectCreateProgrammeButton() {
        clickElement(CREATE_PROGRAMME_BUTTON_IDENTIFIER);

        return new ProgrammeCreationValidationPage(driver);
    }
}
