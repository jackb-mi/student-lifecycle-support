package uk.ac.bristol.helpers;

import uk.ac.bristol.enums.CommitteeLevel;
import uk.ac.bristol.enums.CurriculumProposalApprovalLevel;

public class ProposalInformation {

    private String proposalTitle;
    private String academicResponsible;
    private String schoolProgrammeEditor;
    private String owningDepartment;
    private CommitteeLevel committeeLevel;
    private CurriculumProposalApprovalLevel approvalLevel;

    public ProposalInformation(String proposalTitle, String academicResponsible, String schoolProgrammeEditor,
                               String owningDepartment, CommitteeLevel committeeLevel, CurriculumProposalApprovalLevel curriculumProposalApprovalLevel)
    {
        this.proposalTitle = proposalTitle;
        this.academicResponsible = academicResponsible;
        this.schoolProgrammeEditor = schoolProgrammeEditor;
        this.owningDepartment = owningDepartment;
        this.committeeLevel = committeeLevel;
        this.approvalLevel = curriculumProposalApprovalLevel;
    }

    public String getProposalTitle() {
        return proposalTitle;
    }

    public String getAcademicResponsible() {
        return academicResponsible;
    }

    public String getSchoolProgrammeEditor() {
        return schoolProgrammeEditor;
    }

    public String getOwningDepartment() {
        return owningDepartment;
    }

    public CommitteeLevel getCommitteeLevel() {
        return committeeLevel;
    }

    public CurriculumProposalApprovalLevel getApprovalLevel() {
        return approvalLevel;
    }
}
