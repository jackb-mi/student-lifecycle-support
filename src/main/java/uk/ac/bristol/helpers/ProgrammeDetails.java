package uk.ac.bristol.helpers;

import uk.ac.bristol.enums.*;

public class ProgrammeDetails {

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
        private ProgrammeIntensity programmeIntensity;
        private IntakeMonth intakeMonth;
        private String length;
        private UnitOfMeasurement unitOfMeasurement;

        public ProgrammeDetails(String uniqueProgrammeIdentifier, String programmeTitle, String programmeFullName,
                                String programmeShortName, String award, Location location, DistanceLearning distanceLearning,
                                ProgrammeType programmeType, HonourLevel honourLevel, IntegratedMastersType integratedMastersType,
                                AdmissionsEntry admissionsEntry, AcademicYear academicYear, YearInIndustryStage yearInIndustryStage,
                                StudyAbroadStage studyAbroadStage, IntercalatingStage intercalatingStage,
                                TeachingInstitution teachingInstitution, AwardingInstitution awardingInstitution,
                                ProgrammeIntensity programmeIntensity, IntakeMonth intakeMonth, String length, UnitOfMeasurement unitOfMeasurement)
        {
            this.uniqueProgrammeIdentifier = uniqueProgrammeIdentifier;
            this.programmeTitle = programmeTitle;
            this.programmeFullName = programmeFullName;
            this.programmeShortName = programmeShortName;
            this.award = award;
            this.location = location;
            this.distanceLearning = distanceLearning;
            this.programmeType = programmeType;
            this.honourLevel = honourLevel;
            this.integratedMastersType = integratedMastersType;
            this.admissionsEntry = admissionsEntry;
            this.academicYear = academicYear;
            this.yearInIndustryStage = yearInIndustryStage;
            this.studyAbroadStage = studyAbroadStage;
            this.intercalatingStage = intercalatingStage;
            this.teachingInstitution = teachingInstitution;
            this.awardingInstitution = awardingInstitution;
            this.programmeIntensity = programmeIntensity;
            this.intakeMonth = intakeMonth;
            this.length = length;
            this.unitOfMeasurement = unitOfMeasurement;
        }

        public String getUniqueProgrammeIdentifier() {
            return uniqueProgrammeIdentifier;
        }

        public String getProgrammeTitle() {
            return programmeTitle;
        }

        public String getProgrammeFullName() {
            return programmeFullName;
        }

        public String getProgrammeShortName() {
            return programmeShortName;
        }

        public String getAward() {
            return award;
        }

        public Location getLocation() {
            return location;
        }

        public DistanceLearning getDistanceLearning() {
            return distanceLearning;
        }

        public ProgrammeType getProgrammeType() {
            return programmeType;
        }

        public HonourLevel getHonourLevel() {
            return honourLevel;
        }

        public IntegratedMastersType getIntegratedMastersType() {
            return integratedMastersType;
        }

        public AdmissionsEntry getAdmissionsEntry() {
            return admissionsEntry;
        }

        public AcademicYear getAcademicYear() {
            return academicYear;
        }

        public YearInIndustryStage getYearInIndustryStage() {
            return yearInIndustryStage;
        }

        public StudyAbroadStage getStudyAbroadStage() {
            return studyAbroadStage;
        }

        public IntercalatingStage getIntercalatingStage() {
            return intercalatingStage;
        }

        public TeachingInstitution getTeachingInstitution() {
            return teachingInstitution;
        }

        public AwardingInstitution getAwardingInstitution() {
            return awardingInstitution;
        }

        public ProgrammeIntensity getProgrammeIntensity() {  return programmeIntensity; }

        public IntakeMonth getIntakeMonth() { return intakeMonth; }

        public String getLength() { return length; }

        public UnitOfMeasurement getUnitOfMeasurement() { return unitOfMeasurement; }
}
