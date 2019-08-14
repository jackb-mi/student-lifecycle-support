package uk.ac.bristol.enums;

public enum FolderTreeFolders {
    TO_BE_SCORED("#node000002_anchor"),
    NOT_PASSED_ACADEMICEXCEPTIONS("#node000003_anchor"),
    TO_BE_UNSUCCESSFUL("#node000004_anchor"),
    SCORING_ERRORS("#node000005_anchor"),
    FOLDER_ERRORS("#node000006_anchor"),
    REVIEWED("#node000007_anchor"),
    OVERFLOW("#node000008_anchor"),
    FURTHER_INFORMATION("#node000010_anchor"),
    FURTHER_INFORMATION_RECEIVED("#node000011_anchor"),
    FEES_REFERRAL("#node000012_anchor"),
    CELFS_REFERRAL("#node000013_anchor"),
    SELECTOR_REFERRAL("#node000014_anchor"),
    QUALS_REFERRAL("#node000015_anchor"),
    AT_REFERRAL("#node000016_anchor"),
    PERSONAL_STATEMENT_TO_SCORE("#node000018_anchor"),
    TEST_REQUIRED("#node000019_anchor"),
    CONSIDER_FOR_INTERVIEW("#node000021_anchor"),
    INVITED_FOR_INTERVEW("#node000022_anchor"),
    HOLD_BEFORE_INTERVIEW("#node000023_anchor"),
    CONSIDER_FOR_OFFER("#node000025_anchor"),
    HOLD_BEFORE_OFFER("#node000026_anchor"),
    TO_OFFER("#node000027_anchor"),
    OFFER_PENDING("#node000028_anchor"),
    OFFER_REVIEW("#node000029_anchor"),
    UNSUCCESSFUL_AFTER_EVALUATION("#node000030_anchor"),
    ALTERNATIVE_COURSE_OFFERED("#node000031_anchor"),
    ALTERNATIVE_COURSE_TO_PROCESS_IN_BULK("#node000032_anchor"),
    ALTERNATIVE_COURSE_RESPONSE("#node000033_anchor"),
    REC_CONFIRMATION_TO_ACCEPT("#node000034_anchor"),
    REC_CONFIRMATION_TO_REJECT("#node000035_anchor"),
    REC_CONFIRMATION_TO_HOLD("#node000036_anchor"),
    REJECTED("#node000038_anchor"),
    DECLINED("#node000039_anchor"),
    WITHDRAWN("#node000040_anchor"),
    AWAITING_OFFER_RESPONSE("#node000041_anchor"),
    CONDITIONAL_FIRM("#node000042_anchor"),
    CONDITIONAL_INSURANCE("#node000043_anchor"),
    UNCONDITIONAL_FIRM("#node000044_anchor"),
    UNCONDITIONAL_INSURANCE("#node000045_anchor"),
    UNCONDITIONAL_FIRM_FROM_LAST_CYCLE("#node000046_anchor"),
    RESERVE_FILE("#node000047_anchor");

    private String id;

    private FolderTreeFolders(String id) {
        this.id = id;
    }

    public String getId() {
        return this.id;
    }
}
