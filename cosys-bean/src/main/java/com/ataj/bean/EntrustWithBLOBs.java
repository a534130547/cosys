package com.ataj.bean;

import java.io.Serializable;

public class EntrustWithBLOBs extends Entrust implements Serializable {
    /**
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column entrust.case_type_id
     *
     * @mbggenerated
     */
    private String caseTypeId;

    /**
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column entrust.product_name
     *
     * @mbggenerated
     */
    private String productName;

    /**
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column entrust.remark
     *
     * @mbggenerated
     */
    private String remark;

    /**
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database table entrust
     *
     * @mbggenerated
     */
    private static final long serialVersionUID = 1L;

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column entrust.case_type_id
     *
     * @return the value of entrust.case_type_id
     *
     * @mbggenerated
     */
    public String getCaseTypeId() {
        return caseTypeId;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column entrust.case_type_id
     *
     * @param caseTypeId the value for entrust.case_type_id
     *
     * @mbggenerated
     */
    public void setCaseTypeId(String caseTypeId) {
        this.caseTypeId = caseTypeId;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column entrust.product_name
     *
     * @return the value of entrust.product_name
     *
     * @mbggenerated
     */
    public String getProductName() {
        return productName;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column entrust.product_name
     *
     * @param productName the value for entrust.product_name
     *
     * @mbggenerated
     */
    public void setProductName(String productName) {
        this.productName = productName;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column entrust.remark
     *
     * @return the value of entrust.remark
     *
     * @mbggenerated
     */
    public String getRemark() {
        return remark;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column entrust.remark
     *
     * @param remark the value for entrust.remark
     *
     * @mbggenerated
     */
    public void setRemark(String remark) {
        this.remark = remark;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table entrust
     *
     * @mbggenerated
     */
    @Override
    public boolean equals(Object that) {
        if (this == that) {
            return true;
        }
        if (that == null) {
            return false;
        }
        if (getClass() != that.getClass()) {
            return false;
        }
        EntrustWithBLOBs other = (EntrustWithBLOBs) that;
        return (this.getId() == null ? other.getId() == null : this.getId().equals(other.getId()))
            && (this.getName() == null ? other.getName() == null : this.getName().equals(other.getName()))
            && (this.getCode() == null ? other.getCode() == null : this.getCode().equals(other.getCode()))
            && (this.getCooperateDate() == null ? other.getCooperateDate() == null : this.getCooperateDate().equals(other.getCooperateDate()))
            && (this.getAddress() == null ? other.getAddress() == null : this.getAddress().equals(other.getAddress()))
            && (this.getServiceHotline() == null ? other.getServiceHotline() == null : this.getServiceHotline().equals(other.getServiceHotline()))
            && (this.getAbutmentPerson() == null ? other.getAbutmentPerson() == null : this.getAbutmentPerson().equals(other.getAbutmentPerson()))
            && (this.getAbutmentEmail() == null ? other.getAbutmentEmail() == null : this.getAbutmentEmail().equals(other.getAbutmentEmail()))
            && (this.getAbutmentPhone() == null ? other.getAbutmentPhone() == null : this.getAbutmentPhone().equals(other.getAbutmentPhone()))
            && (this.getCaseFrequency() == null ? other.getCaseFrequency() == null : this.getCaseFrequency().equals(other.getCaseFrequency()))
            && (this.getEffecRepayPeriod() == null ? other.getEffecRepayPeriod() == null : this.getEffecRepayPeriod().equals(other.getEffecRepayPeriod()))
            && (this.getCollecNominal() == null ? other.getCollecNominal() == null : this.getCollecNominal().equals(other.getCollecNominal()))
            && (this.getCollecTerm() == null ? other.getCollecTerm() == null : this.getCollecTerm().equals(other.getCollecTerm()))
            && (this.getStayRequire() == null ? other.getStayRequire() == null : this.getStayRequire().equals(other.getStayRequire()))
            && (this.getBackRequire() == null ? other.getBackRequire() == null : this.getBackRequire().equals(other.getBackRequire()))
            && (this.getReportPeriod() == null ? other.getReportPeriod() == null : this.getReportPeriod().equals(other.getReportPeriod()))
            && (this.getSettlementPeriod() == null ? other.getSettlementPeriod() == null : this.getSettlementPeriod().equals(other.getSettlementPeriod()))
            && (this.getRepaymentMethod() == null ? other.getRepaymentMethod() == null : this.getRepaymentMethod().equals(other.getRepaymentMethod()))
            && (this.getDiscountReduction() == null ? other.getDiscountReduction() == null : this.getDiscountReduction().equals(other.getDiscountReduction()))
            && (this.getPeriodRepaymentRequire() == null ? other.getPeriodRepaymentRequire() == null : this.getPeriodRepaymentRequire().equals(other.getPeriodRepaymentRequire()))
            && (this.getCancelAccount() == null ? other.getCancelAccount() == null : this.getCancelAccount().equals(other.getCancelAccount()))
            && (this.getResourceRetrieveRequire() == null ? other.getResourceRetrieveRequire() == null : this.getResourceRetrieveRequire().equals(other.getResourceRetrieveRequire()))
            && (this.getCollecSubmitRequire() == null ? other.getCollecSubmitRequire() == null : this.getCollecSubmitRequire().equals(other.getCollecSubmitRequire()))
            && (this.getComplaintHandleRequire() == null ? other.getComplaintHandleRequire() == null : this.getComplaintHandleRequire().equals(other.getComplaintHandleRequire()))
            && (this.getTapeSubmitRequire() == null ? other.getTapeSubmitRequire() == null : this.getTapeSubmitRequire().equals(other.getTapeSubmitRequire()))
            && (this.getDataDestrucRequire() == null ? other.getDataDestrucRequire() == null : this.getDataDestrucRequire().equals(other.getDataDestrucRequire()))
            && (this.getLetterRecoveryRequire() == null ? other.getLetterRecoveryRequire() == null : this.getLetterRecoveryRequire().equals(other.getLetterRecoveryRequire()))
            && (this.getReportRequire() == null ? other.getReportRequire() == null : this.getReportRequire().equals(other.getReportRequire()))
            && (this.getCusSpecialInstruc() == null ? other.getCusSpecialInstruc() == null : this.getCusSpecialInstruc().equals(other.getCusSpecialInstruc()))
            && (this.getState() == null ? other.getState() == null : this.getState().equals(other.getState()))
            && (this.getModifyTime() == null ? other.getModifyTime() == null : this.getModifyTime().equals(other.getModifyTime()))
            && (this.getContractName() == null ? other.getContractName() == null : this.getContractName().equals(other.getContractName()))
            && (this.getCreateEmpId() == null ? other.getCreateEmpId() == null : this.getCreateEmpId().equals(other.getCreateEmpId()))
            && (this.getCreateEmpName() == null ? other.getCreateEmpName() == null : this.getCreateEmpName().equals(other.getCreateEmpName()))
            && (this.getCreateTime() == null ? other.getCreateTime() == null : this.getCreateTime().equals(other.getCreateTime()))
            && (this.getCaseTypeId() == null ? other.getCaseTypeId() == null : this.getCaseTypeId().equals(other.getCaseTypeId()))
            && (this.getProductName() == null ? other.getProductName() == null : this.getProductName().equals(other.getProductName()))
            && (this.getRemark() == null ? other.getRemark() == null : this.getRemark().equals(other.getRemark()));
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table entrust
     *
     * @mbggenerated
     */
    @Override
    public int hashCode() {
        final int prime = 31;
        int result = 1;
        result = prime * result + ((getId() == null) ? 0 : getId().hashCode());
        result = prime * result + ((getName() == null) ? 0 : getName().hashCode());
        result = prime * result + ((getCode() == null) ? 0 : getCode().hashCode());
        result = prime * result + ((getCooperateDate() == null) ? 0 : getCooperateDate().hashCode());
        result = prime * result + ((getAddress() == null) ? 0 : getAddress().hashCode());
        result = prime * result + ((getServiceHotline() == null) ? 0 : getServiceHotline().hashCode());
        result = prime * result + ((getAbutmentPerson() == null) ? 0 : getAbutmentPerson().hashCode());
        result = prime * result + ((getAbutmentEmail() == null) ? 0 : getAbutmentEmail().hashCode());
        result = prime * result + ((getAbutmentPhone() == null) ? 0 : getAbutmentPhone().hashCode());
        result = prime * result + ((getCaseFrequency() == null) ? 0 : getCaseFrequency().hashCode());
        result = prime * result + ((getEffecRepayPeriod() == null) ? 0 : getEffecRepayPeriod().hashCode());
        result = prime * result + ((getCollecNominal() == null) ? 0 : getCollecNominal().hashCode());
        result = prime * result + ((getCollecTerm() == null) ? 0 : getCollecTerm().hashCode());
        result = prime * result + ((getStayRequire() == null) ? 0 : getStayRequire().hashCode());
        result = prime * result + ((getBackRequire() == null) ? 0 : getBackRequire().hashCode());
        result = prime * result + ((getReportPeriod() == null) ? 0 : getReportPeriod().hashCode());
        result = prime * result + ((getSettlementPeriod() == null) ? 0 : getSettlementPeriod().hashCode());
        result = prime * result + ((getRepaymentMethod() == null) ? 0 : getRepaymentMethod().hashCode());
        result = prime * result + ((getDiscountReduction() == null) ? 0 : getDiscountReduction().hashCode());
        result = prime * result + ((getPeriodRepaymentRequire() == null) ? 0 : getPeriodRepaymentRequire().hashCode());
        result = prime * result + ((getCancelAccount() == null) ? 0 : getCancelAccount().hashCode());
        result = prime * result + ((getResourceRetrieveRequire() == null) ? 0 : getResourceRetrieveRequire().hashCode());
        result = prime * result + ((getCollecSubmitRequire() == null) ? 0 : getCollecSubmitRequire().hashCode());
        result = prime * result + ((getComplaintHandleRequire() == null) ? 0 : getComplaintHandleRequire().hashCode());
        result = prime * result + ((getTapeSubmitRequire() == null) ? 0 : getTapeSubmitRequire().hashCode());
        result = prime * result + ((getDataDestrucRequire() == null) ? 0 : getDataDestrucRequire().hashCode());
        result = prime * result + ((getLetterRecoveryRequire() == null) ? 0 : getLetterRecoveryRequire().hashCode());
        result = prime * result + ((getReportRequire() == null) ? 0 : getReportRequire().hashCode());
        result = prime * result + ((getCusSpecialInstruc() == null) ? 0 : getCusSpecialInstruc().hashCode());
        result = prime * result + ((getState() == null) ? 0 : getState().hashCode());
        result = prime * result + ((getModifyTime() == null) ? 0 : getModifyTime().hashCode());
        result = prime * result + ((getContractName() == null) ? 0 : getContractName().hashCode());
        result = prime * result + ((getCreateEmpId() == null) ? 0 : getCreateEmpId().hashCode());
        result = prime * result + ((getCreateEmpName() == null) ? 0 : getCreateEmpName().hashCode());
        result = prime * result + ((getCreateTime() == null) ? 0 : getCreateTime().hashCode());
        result = prime * result + ((getCaseTypeId() == null) ? 0 : getCaseTypeId().hashCode());
        result = prime * result + ((getProductName() == null) ? 0 : getProductName().hashCode());
        result = prime * result + ((getRemark() == null) ? 0 : getRemark().hashCode());
        return result;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table entrust
     *
     * @mbggenerated
     */
    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append(getClass().getSimpleName());
        sb.append(" [");
        sb.append("Hash = ").append(hashCode());
        sb.append(", caseTypeId=").append(caseTypeId);
        sb.append(", productName=").append(productName);
        sb.append(", remark=").append(remark);
        sb.append(", serialVersionUID=").append(serialVersionUID);
        sb.append("]");
        return sb.toString();
    }
}