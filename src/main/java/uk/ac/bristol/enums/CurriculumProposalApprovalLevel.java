package uk.ac.bristol.enums;

public enum CurriculumProposalApprovalLevel {

    NEW_PROGRAMMES_HIGH_RISK_CHANGES_UNIVERSITY("040"),
    PROGRAMME_PATHWAY_WITHDRAWAL_UNIVERSITY("039"),
    PROGRAMME_PATHWAY_SUSPENSION_UNIVERSITY("038"),
    OTHER_CHANGES_THAT_REQUIRE_APPROVAL_FACULTY("030"),
    UNIT_UPDATES_THAT_DO_NOT_REQUIRE_APPROVAL("010");

    private String value;

    private CurriculumProposalApprovalLevel(String value) {
        this.value = value;
    }

    public String getValue() {
        return this.value;
    }

}
