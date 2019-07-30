package uk.ac.bristol.enums;

public enum FolderTreeFolders {
    TO_BE_SCORED("node000002"),
    NOT_PASSED_ACADEMICEXCEPTIONS("node000003"),
    TO_BE_UNSUCCESSFUL("#node000004_anchor"),
    SCORING_ERRORS("node000005"),
    FOLDER_ERRORS("node000006"),
    REVIEWED("node000007"),
    OVERFLOW("node000008"),
    FURTHER_INFORMATION("node000010"),
    FURTHER_INFORMATION_RECEIVED("node000011"),
    FEES_REFERRAL("node000012"),
    CELFS_REFERRAL("node000013"),
    SELECTOR_REFERRAL("node000014"),
    QUALS_REFERRAL("node000015"),
    AT_REFERRAL("node000016"),
    PERSONAL_STATEMENT_TO_SCORE("node000018"),
    TEST_REQUIRED("node000019"),
    CONSIDER_FOR_INTERVIEW("node000021"),
    INVITED_FOR_INTERVEW("node000022"),
    HOLD_BEFORE_INTERVIEW("node000023"),
    CONSIDER_FOR_OFFER("node000025"),
    HOLD_BEFORE_OFFER("node000026"),
    TO_OFFER("node000027"),
    OFFER_PENDING("node000028"),
    OFFER_REVIEW("node000029"),
    UNSUCCESSFUL_AFTER_EVALUATION("node000030"),
    ALTERNATIVE_COURSE_OFFERED("node000031"),
    ALTERNATIVE_COURSE_TO_PROCESS_IN_BULK("node000032"),
    ALTERNATIVE_COURSE_RESPONSE("node000033"),
    REC_CONFIRMATION_TO_ACCEPT("node000034"),
    REC_CONFIRMATION_TO_REJECT("node000035"),
    REC_CONFIRMATION_TO_HOLD("node000036"),
    REJECTED("node000038"),
    DECLINED("node000039"),
    WITHDRAWN("node000040"),
    AWAITING_OFFER_RESPONSE("node000041"),
    CONDITIONAL_FIRM("node000042"),
    CONDITIONAL_INSURANCE("node000043"),
    UNCONDITIONAL_FIRM("node000044"),
    UNCONDITIONAL_INSURANCE("node000045"),
    UNCONDITIONAL_FIRM_FROM_LAST_CYCLE("node000046"),
    RESERVE_FILE("node000047");

    private String id;

    private FolderTreeFolders(String id) {
        this.id = id;
    }

    public String getId() {
        return this.id;
    }
}
