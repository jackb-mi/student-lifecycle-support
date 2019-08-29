package uk.ac.bristol.helpers.builders;

import uk.ac.bristol.enums.*;
import uk.ac.bristol.helpers.ProgrammeDetails;
import uk.ac.bristol.helpers.RandomData;

public class ProgrammeDetailsBuilder {

    private String uniqueProgrammeIdentifier;
    private String programmeTitle;
    private String programmeFullName;
    private String programmeShortName;
    private String award;
    private Location location;
    private DistanceLearning distanceLearning;
    private ProgrammeType programmeType;
    private HonourLevel honourLevel;
    private IntegratedMastersType integratedMastersType;
    private AdmissionsEntry admissionsEntry;
    private AcademicYear academicYear;
    private YearInIndustryStage yearInIndustryStage;
    private StudyAbroadStage studyAbroadStage;
    private IntercalatingStage intercalatingStage;
    private TeachingInstitution teachingInstitution;
    private AwardingInstitution awardingInstitution;

    public ProgrammeDetailsBuilder() {

        this.uniqueProgrammeIdentifier = RandomData.alphaNumericString(4);
        this.programmeTitle = "Test Title " + uniqueProgrammeIdentifier;
        this.programmeFullName = "Test Full Name " + uniqueProgrammeIdentifier;
        this.programmeShortName = "Test" + uniqueProgrammeIdentifier;
        //TODO add awards enum
        this.award = "BA01";
        this.location = Location.BRISTOL_CITY_FOOTBALL_CLUB_ASHTON_GATE;
        this.distanceLearning = DistanceLearning.ON_CAMPUS;
        this.programmeType = ProgrammeType.POSTGRADUATE_RESEARCH;
        this.honourLevel = HonourLevel.NOT_APPLICABLE;
        this.integratedMastersType = IntegratedMastersType.NOT_APPLICABLE;
        this.admissionsEntry = AdmissionsEntry.DIRECT_ONLY;
        this.academicYear = AcademicYear.ACADEMIC_YEAR_2019_2020;
        this.yearInIndustryStage = YearInIndustryStage.TWO;
        this.studyAbroadStage = StudyAbroadStage.ZERO;
        this.intercalatingStage = IntercalatingStage.ZERO;
        this.teachingInstitution = TeachingInstitution.UNIVERSITY_OF_BRISTOL;
        this.awardingInstitution = AwardingInstitution.UNIVERSITY_OF_BRISTOL;
        //TODO add variant details array
    }

    public ProgrammeDetailsBuilder withUniqueProgrammeIdentifier(String uniqueProgrammeIdentifier) {
        this.uniqueProgrammeIdentifier = uniqueProgrammeIdentifier;
        return this;
    }

    public ProgrammeDetailsBuilder withProgrammeTitle(String programmeTitle) {
        this.programmeTitle = programmeTitle;
        return this;
    }

    public ProgrammeDetailsBuilder withProgrammeFullName(String programmeFullName) {
        this.programmeFullName = programmeFullName;
        return this;
    }

    public ProgrammeDetailsBuilder withProgrammeShortName(String programmeShortName) {
        this.programmeShortName = programmeShortName;
        return this;
    }

    public ProgrammeDetailsBuilder withAward(String award) {
        this.award = award;
        return this;
    }

    public ProgrammeDetailsBuilder withLocation(Location location) {
        this.location = location;
        return this;
    }

    public ProgrammeDetailsBuilder withDistanceLearning(DistanceLearning distanceLearning) {
        this.distanceLearning = distanceLearning;
        return this;
    }

    public ProgrammeDetailsBuilder withProgrammeType(ProgrammeType programmeType) {
        this.programmeType = programmeType;
        return this;
    }

    public ProgrammeDetailsBuilder withHonourLevel(HonourLevel honourLevel) {
        this.honourLevel = honourLevel;
        return this;
    }

    public ProgrammeDetailsBuilder withIntegratedMastersType(IntegratedMastersType integratedMastersType) {
        this.integratedMastersType = integratedMastersType;
        return this;
    }

    public ProgrammeDetailsBuilder withAdmissionsEntry(AdmissionsEntry admissionsEntry) {
        this.admissionsEntry = admissionsEntry;
        return this;
    }

    public ProgrammeDetailsBuilder withAcademicYear(AcademicYear academicYear) {
        this.academicYear = academicYear;
        return this;
    }

    public ProgrammeDetailsBuilder withYearInIndustryStage(YearInIndustryStage yearInIndustryStage) {
        this.yearInIndustryStage = yearInIndustryStage;
        return this;
    }

    public ProgrammeDetailsBuilder withStudyAbroadStage(StudyAbroadStage studyAbroadStage) {
        this.studyAbroadStage = studyAbroadStage;
        return this;
    }

    public ProgrammeDetailsBuilder withIntercalatingStage(IntercalatingStage intercalatingStage) {
        this.intercalatingStage = intercalatingStage;
        return this;
    }

    public ProgrammeDetailsBuilder withTeachingInstitution(TeachingInstitution teachingInstitution) {
        this.teachingInstitution = teachingInstitution;
        return this;
    }

    public ProgrammeDetailsBuilder withAwardingInstitution(AwardingInstitution awardingInstitution) {
        this.awardingInstitution = awardingInstitution;
        return this;
    }

    public ProgrammeDetails create() {
            return new ProgrammeDetails(uniqueProgrammeIdentifier, programmeTitle, programmeFullName,
                    programmeShortName, award, location, distanceLearning, programmeType, honourLevel,
                    integratedMastersType, admissionsEntry, academicYear, yearInIndustryStage, studyAbroadStage,
                    intercalatingStage, teachingInstitution, awardingInstitution);
        }
}
