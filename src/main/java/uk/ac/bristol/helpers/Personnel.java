package uk.ac.bristol.helpers;

public class Personnel {

    private String personnelCode;
        private String titleCode;
        private String forname1;
        private String surname;
        private String fullName;
        private String emailAddress;
        private Boolean withERPIntegration;
        private String prsExternalIdCode20;
        private String forenameUsed;
        private String dateOfBirth;
        private String mstCode;
        private String userName;

        public Personnel(String personnelCode, String titleCode, String forname1, String surname, String fullName, String emailAddress,
                                 Boolean withERPIntegration, String prsExternalIdCode20, String forenameUsed, String dateOfBirth, String mstCode)
        {
            this.personnelCode = personnelCode;
            this.titleCode = titleCode;
            this.forname1 = forname1;
            this.surname = surname;
            this.fullName = fullName;
            this.emailAddress = emailAddress;
            this.withERPIntegration = withERPIntegration;
            this.prsExternalIdCode20 = prsExternalIdCode20;
            this.forenameUsed = forenameUsed;
            this.dateOfBirth = dateOfBirth;
            this.mstCode = mstCode;
            this.userName = prsExternalIdCode20;
        }

        public String getPersonnelCode() {
            return this.personnelCode;
        }

        public String getTitleCode() {
            return this.titleCode;
        }

        public String getForname1() {
            return this.forname1;
        }

        public String getSurname() {
            return this.surname;
        }

        public String getFullName() {
            return this.fullName;
        }

        public String getEmailAddress() {
            return this.emailAddress;
        }

        public Boolean withERPIntegration() {
            return this.withERPIntegration;
        }

        public String getPrsExternalIdCode20() {
            return this.prsExternalIdCode20;
        }

        public String getForenameUsed() {
            return this.forenameUsed;
        }

        public String getDateOfBirth() {
            return this.dateOfBirth;
        }

        public String getMstCode() {
            return this.mstCode;
        }

        public String getUserName() {
            return this.userName;
        }

}
