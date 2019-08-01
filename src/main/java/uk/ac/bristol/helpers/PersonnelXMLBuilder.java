package uk.ac.bristol.helpers;

public class PersonnelXMLBuilder {

    private String personnelCode;
    private String titleCode;
    private String surname;
    private String emailAddress;
    private String prsExternalIdCode20;
    private String forenameUsed;
    private String dateOfBirth;

    public PersonnelXMLBuilder() {

        String randomNumber = RandomData.numericString(4);
        String userReference = "TEST" + randomNumber;

        this.personnelCode = userReference;
        this.titleCode = "REV";
        this.surname = userReference;
        this.emailAddress = userReference + "@bristol.ac.uk";
        this.prsExternalIdCode20 = "TEST" + String.valueOf(randomNumber);
        this.forenameUsed = "ALFRED";
        this.dateOfBirth = "1987-11-19";
    }

//    public PersonnelXMLBuilder withPersonnelCode() {
//        this.personnelCode = personnelCode;
//        return this;
//    }

    public PersonnelXMLBuilder withTitleCode(String titleCode) {
        this.titleCode = titleCode;
        return this;
    }

    public PersonnelXMLBuilder withSurname(String surname) {
        this.surname = surname;
        return this;
    }

    public PersonnelXMLBuilder withEmailAddress(String emailAddress) {
        this.emailAddress = emailAddress;
        return this;
    }
//
//    public PersonnelXMLBuilder withPrsExternalIdCode20() {
//        this.prsExternalIdCode20 = prsExternalIdCode20;
//        return this;
//    }

    public PersonnelXMLBuilder withForenameUsed(String forenameUsed) {
        this.forenameUsed = forenameUsed;
        return this;
    }

    public PersonnelXMLBuilder withDateOfBirth(String dateOfBirth) {
        this.dateOfBirth = dateOfBirth;
        return this;
    }

    public String create() {
        String apiBody = "<PersonnelList>" +
                "<Personnel>" +
                "<PersonnelCode>" + personnelCode + "</PersonnelCode>" +
                "<TitleCode>" + titleCode + "</TitleCode>" +
                "<Surname>" + surname + "</Surname>" +
                "<EmailAddress>" + emailAddress + "</EmailAddress>" +
                "<PRSExternalIDCode20>" + prsExternalIdCode20 + "</PRSExternalIDCode20>" +
                "<ForenameUsed>" + forenameUsed + "</ForenameUsed>" +
                "<DateOfBirth>" + dateOfBirth + "</DateOfBirth>" +
                "</Personnel>" +
                "</PersonnelList>";

        System.out.println("User being created with Personnel Code " + personnelCode);

        return apiBody;
    }
}