package uk.ac.bristol.enums;

public enum IntegratedMastersType {
    INTEGRATED_MASTERS_TYPE_2,
    INTEGRATED_MASTERS_TYPE_3,

    /* NOT_APPLICABLE has been included for use when creating Programmes in Curriculum Management,
    An honor level may or may not required depending on the Programme Type being created.
    This option should be used when methods may or may not perform functions with the HonorLevel enum */
    NOT_APPLICABLE;

    IntegratedMastersType() {

    }
}
