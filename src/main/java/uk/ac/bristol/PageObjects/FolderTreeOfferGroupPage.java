package uk.ac.bristol.PageObjects;

import org.openqa.selenium.By;
import org.openqa.selenium.chrome.ChromeDriver;

import static uk.ac.bristol.PageObjects.AdmissionsPage.UNDERGRADUATE_LINK_IDENTIFIER;

public class FolderTreeOfferGroupPage extends BasePage{
    public static final String PAGE_TITLE = "Admissions Dashboard";
    public static final String FOLDER_TREE_PANEL_TITLE = "Filter Offer Group by Faculty";

    public static final By OFFER_GROUP_BUTTON_IDENTIFER = By.id("ui-id-1");
    public static final By APPLICANT_SEARCH_BUTTON_IDENTIFER = By.id("ui-id-2");

    public static final By ACCOUNTING_RADIO_IDENTIFER = By.id("radioACCOUNTING");
    public static final By AEROSPACE_ENGINEERING_RADIO_IDENTIFER = By.id("radioAERO_ENG");
    public static final By ANCIENT_HISTORY_RADIO_IDENTIFER = By.id("radioANCIENT_HIST");
    public static final By ANTHROPOLOGY_RADIO_IDENTIFER = By.id("radioANTHRO");
    public static final By ANTHROPOLOGY_INNOVATION_RADIO_IDENTIFER = By.id("radioANTHRO/INNOV");
    public static final By APPLIED_ANATOMY_RADIO_IDENTIFER = By.id("radioAPPLIED_ANATOMY");
    public static final By ARCHEOLOGY_ANTHROPOLOGY_RADIO_IDENTIFER = By.id("radioARCH/ANTHRO");
    public static final By BIOCHEMISTRY_RADIO_IDENTIFER = By.id("radioBIOCHEMISTRY");
    public static final By BIOCHEMISTRY_ZOOLOGY_RADIO_IDENTIFER = By.id("radioBIOL/ZOO");
    public static final By BIOCHEMISTRY_ZOOLOGY_MSC_RADIO_IDENTIFER = By.id("radioBIOL/ZOO_MSCI");
    public static final By BIOMEDICAL_RADIO_IDENTIFER = By.id("radioBIOMEDICAL_SCIE");
    public static final By CELLULAR_RADIO_IDENTIFER = By.id("radioCELLMM");
    public static final By CHEMISTRY_RADIO_IDENTIFER = By.id("radioCHEMISTRY");
    public static final By CHILDHOOD_STUDIES_RADIO_IDENTIFER = By.id("radioCHILDHOOD_STUDI");
    public static final By CHILDHOOD_STUDIES_MANAGEMENT_IDENTIFER = By.id("radioCHILD_STUDI_MAN");
    public static final By CIVIL_ENGINEERING_IDENTIFER = By.id("radioCIVIL_ENG");
    public static final By CLASSICAL_STUDIES_IDENTIFER = By.id("radioCLASS_STUDIES");
    public static final By CLASSICS_IDENTIFER = By.id("radioCLASSICS");
    public static final By COMPUTER_SCIENCE_IDENTIFER = By.id("radioCOMPUTER_SCI");
    public static final By COMPUTER_SCIENCE_MATHS_IDENTIFER = By.id("radioCOMPSCI/MATHS");
    public static final By COMPUTER_SCIENCE_MATHS_INNOVATION_IDENTIFIER = By.id("radioCOMPSCI/INNOV");
    public static final By COMPUTER_SYSTEMS_IDENTIFIER = By.id("radioCOMP_SYSTEMS");
    public static final By CRIMINOLOGY_IDENTIFIER = By.id("radioCRIMINOLOGY");
    public static final By DENTAL_HYGENE_IDENTIFIER = By.id("radioDENT_HYG_THER");
    public static final By DENTISTRY_IDENTIFIER = By.id("radioDENT");
    public static final By EFIM_IDENTIFIER = By.id("radioEFIM_STUDY_IN_E");
    public static final By ECON_FINANCE_IDENTIFIER = By.id("radioECON/FINANCE");
    public static final By ECON_MATHS_IDENTIFIER = By.id("radioECON/MATHS");
    public static final By ECON_POLITICS_IDENTIFIER = By.id("radioECON/POLS");
    public static final By ECON_ECONOMETRICS_IDENTIFIER = By.id("radioECON/ECONMETRIC");
    public static final By EDUCATION_STUDIES_IDENTIFIER = By.id("radioEDUCATION_STUDI");
    public static final By ELECTRICAL_ENG_IDENTIFIER = By.id("radioELECTRIC_ENG");
    public static final By ELECTRICAL_ENG_INNOVATION_IDENTIFIER = By.id("radioELECTRIC_ENG/IN");
    public static final By ENGINEERING_DESIGN_IDENTIFIER = By.id("radioENG_DESIGN");
    public static final By ENGINEERING_MATHS_IDENTIFIER = By.id("radioENG_MATHS");
    public static final By ENGLISH_IDENTIFIER = By.id("radioENGLISH");
    public static final By ENGLISH_CLASSICAL_IDENTIFIER = By.id("radioENGLISH/CLASSIC");
    public static final By ENGLISH_PHILOSOPHY_IDENTIFIER = By.id("radioENGLISH/PHIL");
    public static final By FILM_IDENTIFIER = By.id("radioFILM");
    public static final By FILM_ENGLISH_IDENTIFIER = By.id("radioFILM/ENGLISH");
    public static final By FILM_MODERN_LANGUAGE_IDENTIFIER = By.id("radioFILM/ML");
    public static final By FILM_INNOVATION_IDENTIFIER = By.id("radioFILM/INNOV");
    public static final By FRENCH_IDENTIFIER = By.id("radioFILM/INNOV");
    public static final By GATEWWAY_DENTISTRY_IDENTIFIER = By.id("radioGATEWAY_DENT");
    public static final By GATEWWAY_MEDICINE_IDENTIFIER = By.id("radioGATEWAY_MED");
    public static final By GATEWWAY_VET_SCIENCE_IDENTIFIER = By.id("radioGATEWAY_VET");
    public static final By GEOGRAPHY_IDENTIFIER = By.id("radioGEOGRAPHY");
    public static final By GEOGRAPHY_INNOVATION_IDENTIFIER = By.id("radioGEOGRAPHY/INNOV");
    public static final By GEOGRAPHY_STUDY_ABROAD_IDENTIFIER = By.id("radioGEOGRAPHY/ABROA");
    public static final By GEOGRAPHY_STUDY_CONT_EUR_IDENTIFIER = By.id("radioGEOGRAPHY/EUROS");
    public static final By GEOLOGY_IDENTIFIER = By.id("radioGEOLOGY");
    public static final By GEOPHYSICS_IDENTIFIER = By.id("radioGEOPHYS");
    public static final By GERMAN_IDENTIFIER = By.id("radioGERMAN");
    public static final By HISPANIC_SPANISH_IDENTIFIER = By.id("radioHISP/SP");
    public static final By HISTORY_IDENTIFIER = By.id("radioHISTORY");
    public static final By HISTORY_ART_IDENTIFIER = By.id("radioHIST_OF_ART");
    public static final By HISTORY_ART_MODERN_LANGUAGES_IDENTIFIER = By.id("radioHISTART/ML");
    public static final By HISTORY_INNOVATION_IDENTIFIER = By.id("radioHIST/INNOV");
    public static final By ITALIAN_IDENTIFIER = By.id("radioITALIAN");
    public static final By LAW_IDENTIFIER = By.id("radioLAW");
    public static final By LAW_MODERN_LAN_IDENTIFIER = By.id("radioLAW/MOD_LANG");
    public static final By LIBERAL_ARTS_IDENTIFIER = By.id("radioLIBERAL_ARTS");
    public static final By MANAGEMENT_INNOVATION_IDENTIFIER = By.id("radioMANAGEMENT/INNO");
    public static final By MANAGEMENT_INTERNATIONAL_IDENTIFIER = By.id("radioMANAGEMENT/INT");
    public static final By MATHEMATICS_IDENTIFIER = By.id("radioMATHEMATICS");
    public static final By MATHEMATICS_PHILOSOPHY_IDENTIFIER = By.id("radioMATHS/PHIL");
    public static final By MATHEMATICS_PHYSICS_IDENTIFIER = By.id("radioMATHS/PHYSICS");
    public static final By MECHANICAL_ENGINEERING_IDENTIFIER = By.id("radioMECH_ENG");
    public static final By MECHANICAL_ELECTRICAL_ENGINEERING_IDENTIFIER = By.id("radioMECH_AND_ELEC");
    public static final By MEDICINE_IDENTIFIER = By.id("radioMED");
    public static final By MODERN_LANGUAGES_IDENTIFIER = By.id("radioMODLANG");
    public static final By MODERN_LANGUAGES_POLITICS_IDENTIFIER = By.id("radioML/POLS");
    public static final By MUSIC_IDENTIFIER = By.id("radioMUSIC");
    public static final By MUSIC_MODERN_LANGUAGES_IDENTIFIER = By.id("radioMUSIC/ML");
    public static final By MUSIC_INNOVATION_IDENTIFIER = By.id("radioMUSIC/INNOV");
    public static final By NEUROSCIENCE_IDENTIFIER = By.id("radioNEUROSCIENCEV");
    public static final By PALAEONTOLOGY_IDENTIFIER = By.id("radioPALAEO_AND_EVO");
    public static final By PHARAMCOLOGY_IDENTIFIER = By.id("radioPHARMACOLOGY");
    public static final By PHILOSOPHY_IDENTIFIER = By.id("radioPHILOSOPHY");
    public static final By PHILOSOPHY_ECONOMICS_IDENTIFIER = By.id("radioPHIL/ECON");
    public static final By PHILOSOPHY_MODERN_LAN_IDENTIFIER = By.id("radioPHIL/MOD_LANG");
    public static final By PHILOSOPHY_POLITICS_IDENTIFIER = By.id("radioPHIL/POLS");
    public static final By PHILOSOPHY_THEOLOGY_IDENTIFIER = By.id("radioPHIL/THEOL");
    public static final By PHYSICS_IDENTIFIER = By.id("radioPHYSICS");
    public static final By PHYSICS_PHILOSOPHY_IDENTIFIER = By.id("radioPHYSICS/PHIL");
    public static final By PHYSICS_INNOVATION_IDENTIFIER = By.id("radioPHYSICS/INNOV");
    public static final By PHYSIOLOGY_IDENTIFIER = By.id("radioPHYSIOLOGY");
    public static final By POLITICS_IDENTIFIER = By.id("radioPOLITICS");
    public static final By POLITICS_SOCIOLOGY_IDENTIFIER = By.id("radioPOLS/SOCIOL");
    public static final By PSYCHOLOGY_IDENTIFIER = By.id("radioPSYCHOLOGYSCI");
    public static final By PSYCHOLOGY_EDUCATION_IDENTIFIER = By.id("radioPSYCH_IN_EDUCAT");
    public static final By PSYCHOLOGY_INNOVATION_IDENTIFIER = By.id("radioPSYCHOL/INNOV");
    public static final By RUSSIAN_IDENTIFIER = By.id("radioRUSSIAN");
    public static final By SOCIAL_POLICY_IDENTIFIER = By.id("radioSOCPOLICY");
    public static final By SOCIAL_POLICY_CRIMINOLOGY_IDENTIFIER = By.id("radioSOC_POL_CRIMINO");
    public static final By SOCIAL_POLICY_POLITICS_IDENTIFIER = By.id("radioSOCPOL/POLS");
    public static final By SOCIAL_POLICY_MANAGEMENT_IDENTIFIER = By.id("radioSOCPOL/MANAGE");
    public static final By SOCIOLOGY_IDENTIFIER = By.id("radioSOCIOLOGY");
    public static final By SOCIOLOGY_PHILOSOPHY_IDENTIFIER = By.id("radioSOCIOL/PHILOS");
    public static final By THEATRE_ENGLISH_IDENTIFIER = By.id("radioTHEATRE/ENGLISH");
    public static final By THEATRE_FILM_IDENTIFIER = By.id("radioTHEATRE/FILM");
    public static final By THEATRE_MODERN_LANGUAGES_IDENTIFIER = By.id("radioTHEATRE/ML");
    public static final By THEATRE_PWERFORMANCE_STUDIES_IDENTIFIER = By.id("radioTHEATRE");



















    public FolderTreeOfferGroupPage(ChromeDriver driver) {
        super(driver);
    }

    public FolderTreeOfferGroupPage goToFolderTree() {
        driver.findElement(UNDERGRADUATE_LINK_IDENTIFIER).click();
        FolderTreeOfferGroupPage folderTreeOfferGroup = new FolderTreeOfferGroupPage(driver);
        return folderTreeOfferGroup;
    }
}
