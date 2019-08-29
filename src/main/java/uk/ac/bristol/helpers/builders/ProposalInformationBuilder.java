package uk.ac.bristol.helpers.builders;

import uk.ac.bristol.enums.CommitteeLevel;
import uk.ac.bristol.enums.CurriculumProposalApprovalLevel;
import uk.ac.bristol.helpers.ProposalInformation;
import uk.ac.bristol.helpers.RandomData;

public class ProposalInformationBuilder {

    private String proposalTitle;
    private String academicResponsible;
    private String schoolProgrammeEditor;
    private String owningDepartment;
    private CommitteeLevel committeeLevel;
    private CurriculumProposalApprovalLevel approvalLevel;

    public ProposalInformationBuilder() {

        this.proposalTitle = "Test Proposal " + RandomData.alphaNumericString(4);
        this.academicResponsible = "XXXTEST3";
        this.schoolProgrammeEditor = "Crt Slsp-CRT01";
        this.owningDepartment = "SART";
        //TODO add awards enum
        this.committeeLevel = CommitteeLevel.POSTGRADUATE;
        this.approvalLevel = CurriculumProposalApprovalLevel.NEW_PROGRAMMES_HIGH_RISK_CHANGES_UNIVERSITY;
    }

    public ProposalInformationBuilder withProposalTitle(String proposalTitle) {
        this.proposalTitle = proposalTitle;
        return this;
    }

    public ProposalInformationBuilder withAcademicResponsible(String academicResponsible) {
        this.academicResponsible = academicResponsible;
        return this;
    }

    public ProposalInformationBuilder withSchoolProgrammeEditor(String schoolProgrammeEditor) {
        this.schoolProgrammeEditor = schoolProgrammeEditor;
        return this;
    }

    public ProposalInformationBuilder withOwningDepartment(String owningDepartment) {
        this.owningDepartment = owningDepartment;
        return this;
    }

    public ProposalInformationBuilder withCommitteeLevel(CommitteeLevel committeeLevel) {
        this.committeeLevel = committeeLevel;
        return this;
    }

    public ProposalInformationBuilder withApprovalLevel(CurriculumProposalApprovalLevel curriculumProposalApprovalLevel) {
        this.approvalLevel = curriculumProposalApprovalLevel;
        return this;
    }

    public ProposalInformation create() {
        return new ProposalInformation(proposalTitle, academicResponsible,
                schoolProgrammeEditor, owningDepartment, committeeLevel, approvalLevel);
    }
}
