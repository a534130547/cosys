package com.ataj.bean;

import java.io.Serializable;
import java.math.BigDecimal;
import java.util.Date;

public class CaseBatch implements Serializable {
    /**
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column case_batch.id
     *
     * @mbggenerated
     */
    private String id;

    /**
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column case_batch.batch_code
     *
     * @mbggenerated
     */
    private String batchCode;

    /**
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column case_batch.state
     *
     * @mbggenerated
     */
    private Integer state;

    /**
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column case_batch.version
     *
     * @mbggenerated
     */
    private Integer version;

    /**
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column case_batch.entrust_product_id
     *
     * @mbggenerated
     */
    private String entrustProductId;

    /**
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column case_batch.entrust_id
     *
     * @mbggenerated
     */
    private String entrustId;

    /**
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column case_batch.total_money
     *
     * @mbggenerated
     */
    private BigDecimal totalMoney;

    /**
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column case_batch.total_number
     *
     * @mbggenerated
     */
    private Integer totalNumber;

    /**
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column case_batch.type_id
     *
     * @mbggenerated
     */
    private String typeId;

    /**
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column case_batch.begin_date
     *
     * @mbggenerated
     */
    private Date beginDate;

    /**
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column case_batch.area_id
     *
     * @mbggenerated
     */
    private Long areaId;

    /**
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column case_batch.end_date
     *
     * @mbggenerated
     */
    private Date endDate;

    /**
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column case_batch.actual_end_date
     *
     * @mbggenerated
     */
    private Date actualEndDate;

    /**
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column case_batch.create_emp_id
     *
     * @mbggenerated
     */
    private String createEmpId;

    /**
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column case_batch.modify_emp_id
     *
     * @mbggenerated
     */
    private String modifyEmpId;

    /**
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column case_batch.target
     *
     * @mbggenerated
     */
    private BigDecimal target;

    /**
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column case_batch.achieve
     *
     * @mbggenerated
     */
    private BigDecimal achieve;

    /**
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column case_batch.collection_id
     *
     * @mbggenerated
     */
    private String collectionId;

    /**
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column case_batch.batch_xls
     *
     * @mbggenerated
     */
    private String batchXls;

    /**
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column case_batch.upload_time
     *
     * @mbggenerated
     */
    private Date uploadTime;

    /**
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column case_batch.modify_time
     *
     * @mbggenerated
     */
    private Date modifyTime;

    /**
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column case_batch.create_time
     *
     * @mbggenerated
     */
    private Date createTime;

    /**
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column case_batch.bath_tips
     *
     * @mbggenerated
     */
    private String bathTips;

    /**
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column case_batch.status
     *
     * @mbggenerated
     */
    private Integer status;

    /**
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column case_batch.wdc_desc
     *
     * @mbggenerated
     */
    private String wdcDesc;

    /**
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column case_batch.is_upload
     *
     * @mbggenerated
     */
    private Integer isUpload;

    /**
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column case_batch.template_type
     *
     * @mbggenerated
     */
    private String templateType;

    /**
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column case_batch.handle
     *
     * @mbggenerated
     */
    private String handle;

    /**
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database table case_batch
     *
     * @mbggenerated
     */
    private static final long serialVersionUID = 1L;

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column case_batch.id
     *
     * @return the value of case_batch.id
     *
     * @mbggenerated
     */
    public String getId() {
        return id;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column case_batch.id
     *
     * @param id the value for case_batch.id
     *
     * @mbggenerated
     */
    public void setId(String id) {
        this.id = id;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column case_batch.batch_code
     *
     * @return the value of case_batch.batch_code
     *
     * @mbggenerated
     */
    public String getBatchCode() {
        return batchCode;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column case_batch.batch_code
     *
     * @param batchCode the value for case_batch.batch_code
     *
     * @mbggenerated
     */
    public void setBatchCode(String batchCode) {
        this.batchCode = batchCode;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column case_batch.state
     *
     * @return the value of case_batch.state
     *
     * @mbggenerated
     */
    public Integer getState() {
        return state;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column case_batch.state
     *
     * @param state the value for case_batch.state
     *
     * @mbggenerated
     */
    public void setState(Integer state) {
        this.state = state;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column case_batch.version
     *
     * @return the value of case_batch.version
     *
     * @mbggenerated
     */
    public Integer getVersion() {
        return version;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column case_batch.version
     *
     * @param version the value for case_batch.version
     *
     * @mbggenerated
     */
    public void setVersion(Integer version) {
        this.version = version;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column case_batch.entrust_product_id
     *
     * @return the value of case_batch.entrust_product_id
     *
     * @mbggenerated
     */
    public String getEntrustProductId() {
        return entrustProductId;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column case_batch.entrust_product_id
     *
     * @param entrustProductId the value for case_batch.entrust_product_id
     *
     * @mbggenerated
     */
    public void setEntrustProductId(String entrustProductId) {
        this.entrustProductId = entrustProductId;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column case_batch.entrust_id
     *
     * @return the value of case_batch.entrust_id
     *
     * @mbggenerated
     */
    public String getEntrustId() {
        return entrustId;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column case_batch.entrust_id
     *
     * @param entrustId the value for case_batch.entrust_id
     *
     * @mbggenerated
     */
    public void setEntrustId(String entrustId) {
        this.entrustId = entrustId;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column case_batch.total_money
     *
     * @return the value of case_batch.total_money
     *
     * @mbggenerated
     */
    public BigDecimal getTotalMoney() {
        return totalMoney;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column case_batch.total_money
     *
     * @param totalMoney the value for case_batch.total_money
     *
     * @mbggenerated
     */
    public void setTotalMoney(BigDecimal totalMoney) {
        this.totalMoney = totalMoney;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column case_batch.total_number
     *
     * @return the value of case_batch.total_number
     *
     * @mbggenerated
     */
    public Integer getTotalNumber() {
        return totalNumber;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column case_batch.total_number
     *
     * @param totalNumber the value for case_batch.total_number
     *
     * @mbggenerated
     */
    public void setTotalNumber(Integer totalNumber) {
        this.totalNumber = totalNumber;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column case_batch.type_id
     *
     * @return the value of case_batch.type_id
     *
     * @mbggenerated
     */
    public String getTypeId() {
        return typeId;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column case_batch.type_id
     *
     * @param typeId the value for case_batch.type_id
     *
     * @mbggenerated
     */
    public void setTypeId(String typeId) {
        this.typeId = typeId;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column case_batch.begin_date
     *
     * @return the value of case_batch.begin_date
     *
     * @mbggenerated
     */
    public Date getBeginDate() {
        return beginDate;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column case_batch.begin_date
     *
     * @param beginDate the value for case_batch.begin_date
     *
     * @mbggenerated
     */
    public void setBeginDate(Date beginDate) {
        this.beginDate = beginDate;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column case_batch.area_id
     *
     * @return the value of case_batch.area_id
     *
     * @mbggenerated
     */
    public Long getAreaId() {
        return areaId;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column case_batch.area_id
     *
     * @param areaId the value for case_batch.area_id
     *
     * @mbggenerated
     */
    public void setAreaId(Long areaId) {
        this.areaId = areaId;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column case_batch.end_date
     *
     * @return the value of case_batch.end_date
     *
     * @mbggenerated
     */
    public Date getEndDate() {
        return endDate;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column case_batch.end_date
     *
     * @param endDate the value for case_batch.end_date
     *
     * @mbggenerated
     */
    public void setEndDate(Date endDate) {
        this.endDate = endDate;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column case_batch.actual_end_date
     *
     * @return the value of case_batch.actual_end_date
     *
     * @mbggenerated
     */
    public Date getActualEndDate() {
        return actualEndDate;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column case_batch.actual_end_date
     *
     * @param actualEndDate the value for case_batch.actual_end_date
     *
     * @mbggenerated
     */
    public void setActualEndDate(Date actualEndDate) {
        this.actualEndDate = actualEndDate;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column case_batch.create_emp_id
     *
     * @return the value of case_batch.create_emp_id
     *
     * @mbggenerated
     */
    public String getCreateEmpId() {
        return createEmpId;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column case_batch.create_emp_id
     *
     * @param createEmpId the value for case_batch.create_emp_id
     *
     * @mbggenerated
     */
    public void setCreateEmpId(String createEmpId) {
        this.createEmpId = createEmpId;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column case_batch.modify_emp_id
     *
     * @return the value of case_batch.modify_emp_id
     *
     * @mbggenerated
     */
    public String getModifyEmpId() {
        return modifyEmpId;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column case_batch.modify_emp_id
     *
     * @param modifyEmpId the value for case_batch.modify_emp_id
     *
     * @mbggenerated
     */
    public void setModifyEmpId(String modifyEmpId) {
        this.modifyEmpId = modifyEmpId;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column case_batch.target
     *
     * @return the value of case_batch.target
     *
     * @mbggenerated
     */
    public BigDecimal getTarget() {
        return target;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column case_batch.target
     *
     * @param target the value for case_batch.target
     *
     * @mbggenerated
     */
    public void setTarget(BigDecimal target) {
        this.target = target;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column case_batch.achieve
     *
     * @return the value of case_batch.achieve
     *
     * @mbggenerated
     */
    public BigDecimal getAchieve() {
        return achieve;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column case_batch.achieve
     *
     * @param achieve the value for case_batch.achieve
     *
     * @mbggenerated
     */
    public void setAchieve(BigDecimal achieve) {
        this.achieve = achieve;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column case_batch.collection_id
     *
     * @return the value of case_batch.collection_id
     *
     * @mbggenerated
     */
    public String getCollectionId() {
        return collectionId;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column case_batch.collection_id
     *
     * @param collectionId the value for case_batch.collection_id
     *
     * @mbggenerated
     */
    public void setCollectionId(String collectionId) {
        this.collectionId = collectionId;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column case_batch.batch_xls
     *
     * @return the value of case_batch.batch_xls
     *
     * @mbggenerated
     */
    public String getBatchXls() {
        return batchXls;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column case_batch.batch_xls
     *
     * @param batchXls the value for case_batch.batch_xls
     *
     * @mbggenerated
     */
    public void setBatchXls(String batchXls) {
        this.batchXls = batchXls;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column case_batch.upload_time
     *
     * @return the value of case_batch.upload_time
     *
     * @mbggenerated
     */
    public Date getUploadTime() {
        return uploadTime;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column case_batch.upload_time
     *
     * @param uploadTime the value for case_batch.upload_time
     *
     * @mbggenerated
     */
    public void setUploadTime(Date uploadTime) {
        this.uploadTime = uploadTime;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column case_batch.modify_time
     *
     * @return the value of case_batch.modify_time
     *
     * @mbggenerated
     */
    public Date getModifyTime() {
        return modifyTime;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column case_batch.modify_time
     *
     * @param modifyTime the value for case_batch.modify_time
     *
     * @mbggenerated
     */
    public void setModifyTime(Date modifyTime) {
        this.modifyTime = modifyTime;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column case_batch.create_time
     *
     * @return the value of case_batch.create_time
     *
     * @mbggenerated
     */
    public Date getCreateTime() {
        return createTime;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column case_batch.create_time
     *
     * @param createTime the value for case_batch.create_time
     *
     * @mbggenerated
     */
    public void setCreateTime(Date createTime) {
        this.createTime = createTime;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column case_batch.bath_tips
     *
     * @return the value of case_batch.bath_tips
     *
     * @mbggenerated
     */
    public String getBathTips() {
        return bathTips;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column case_batch.bath_tips
     *
     * @param bathTips the value for case_batch.bath_tips
     *
     * @mbggenerated
     */
    public void setBathTips(String bathTips) {
        this.bathTips = bathTips;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column case_batch.status
     *
     * @return the value of case_batch.status
     *
     * @mbggenerated
     */
    public Integer getStatus() {
        return status;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column case_batch.status
     *
     * @param status the value for case_batch.status
     *
     * @mbggenerated
     */
    public void setStatus(Integer status) {
        this.status = status;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column case_batch.wdc_desc
     *
     * @return the value of case_batch.wdc_desc
     *
     * @mbggenerated
     */
    public String getWdcDesc() {
        return wdcDesc;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column case_batch.wdc_desc
     *
     * @param wdcDesc the value for case_batch.wdc_desc
     *
     * @mbggenerated
     */
    public void setWdcDesc(String wdcDesc) {
        this.wdcDesc = wdcDesc;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column case_batch.is_upload
     *
     * @return the value of case_batch.is_upload
     *
     * @mbggenerated
     */
    public Integer getIsUpload() {
        return isUpload;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column case_batch.is_upload
     *
     * @param isUpload the value for case_batch.is_upload
     *
     * @mbggenerated
     */
    public void setIsUpload(Integer isUpload) {
        this.isUpload = isUpload;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column case_batch.template_type
     *
     * @return the value of case_batch.template_type
     *
     * @mbggenerated
     */
    public String getTemplateType() {
        return templateType;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column case_batch.template_type
     *
     * @param templateType the value for case_batch.template_type
     *
     * @mbggenerated
     */
    public void setTemplateType(String templateType) {
        this.templateType = templateType;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column case_batch.handle
     *
     * @return the value of case_batch.handle
     *
     * @mbggenerated
     */
    public String getHandle() {
        return handle;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column case_batch.handle
     *
     * @param handle the value for case_batch.handle
     *
     * @mbggenerated
     */
    public void setHandle(String handle) {
        this.handle = handle;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table case_batch
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
        CaseBatch other = (CaseBatch) that;
        return (this.getId() == null ? other.getId() == null : this.getId().equals(other.getId()))
            && (this.getBatchCode() == null ? other.getBatchCode() == null : this.getBatchCode().equals(other.getBatchCode()))
            && (this.getState() == null ? other.getState() == null : this.getState().equals(other.getState()))
            && (this.getVersion() == null ? other.getVersion() == null : this.getVersion().equals(other.getVersion()))
            && (this.getEntrustProductId() == null ? other.getEntrustProductId() == null : this.getEntrustProductId().equals(other.getEntrustProductId()))
            && (this.getEntrustId() == null ? other.getEntrustId() == null : this.getEntrustId().equals(other.getEntrustId()))
            && (this.getTotalMoney() == null ? other.getTotalMoney() == null : this.getTotalMoney().equals(other.getTotalMoney()))
            && (this.getTotalNumber() == null ? other.getTotalNumber() == null : this.getTotalNumber().equals(other.getTotalNumber()))
            && (this.getTypeId() == null ? other.getTypeId() == null : this.getTypeId().equals(other.getTypeId()))
            && (this.getBeginDate() == null ? other.getBeginDate() == null : this.getBeginDate().equals(other.getBeginDate()))
            && (this.getAreaId() == null ? other.getAreaId() == null : this.getAreaId().equals(other.getAreaId()))
            && (this.getEndDate() == null ? other.getEndDate() == null : this.getEndDate().equals(other.getEndDate()))
            && (this.getActualEndDate() == null ? other.getActualEndDate() == null : this.getActualEndDate().equals(other.getActualEndDate()))
            && (this.getCreateEmpId() == null ? other.getCreateEmpId() == null : this.getCreateEmpId().equals(other.getCreateEmpId()))
            && (this.getModifyEmpId() == null ? other.getModifyEmpId() == null : this.getModifyEmpId().equals(other.getModifyEmpId()))
            && (this.getTarget() == null ? other.getTarget() == null : this.getTarget().equals(other.getTarget()))
            && (this.getAchieve() == null ? other.getAchieve() == null : this.getAchieve().equals(other.getAchieve()))
            && (this.getCollectionId() == null ? other.getCollectionId() == null : this.getCollectionId().equals(other.getCollectionId()))
            && (this.getBatchXls() == null ? other.getBatchXls() == null : this.getBatchXls().equals(other.getBatchXls()))
            && (this.getUploadTime() == null ? other.getUploadTime() == null : this.getUploadTime().equals(other.getUploadTime()))
            && (this.getModifyTime() == null ? other.getModifyTime() == null : this.getModifyTime().equals(other.getModifyTime()))
            && (this.getCreateTime() == null ? other.getCreateTime() == null : this.getCreateTime().equals(other.getCreateTime()))
            && (this.getBathTips() == null ? other.getBathTips() == null : this.getBathTips().equals(other.getBathTips()))
            && (this.getStatus() == null ? other.getStatus() == null : this.getStatus().equals(other.getStatus()))
            && (this.getWdcDesc() == null ? other.getWdcDesc() == null : this.getWdcDesc().equals(other.getWdcDesc()))
            && (this.getIsUpload() == null ? other.getIsUpload() == null : this.getIsUpload().equals(other.getIsUpload()))
            && (this.getTemplateType() == null ? other.getTemplateType() == null : this.getTemplateType().equals(other.getTemplateType()))
            && (this.getHandle() == null ? other.getHandle() == null : this.getHandle().equals(other.getHandle()));
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table case_batch
     *
     * @mbggenerated
     */
    @Override
    public int hashCode() {
        final int prime = 31;
        int result = 1;
        result = prime * result + ((getId() == null) ? 0 : getId().hashCode());
        result = prime * result + ((getBatchCode() == null) ? 0 : getBatchCode().hashCode());
        result = prime * result + ((getState() == null) ? 0 : getState().hashCode());
        result = prime * result + ((getVersion() == null) ? 0 : getVersion().hashCode());
        result = prime * result + ((getEntrustProductId() == null) ? 0 : getEntrustProductId().hashCode());
        result = prime * result + ((getEntrustId() == null) ? 0 : getEntrustId().hashCode());
        result = prime * result + ((getTotalMoney() == null) ? 0 : getTotalMoney().hashCode());
        result = prime * result + ((getTotalNumber() == null) ? 0 : getTotalNumber().hashCode());
        result = prime * result + ((getTypeId() == null) ? 0 : getTypeId().hashCode());
        result = prime * result + ((getBeginDate() == null) ? 0 : getBeginDate().hashCode());
        result = prime * result + ((getAreaId() == null) ? 0 : getAreaId().hashCode());
        result = prime * result + ((getEndDate() == null) ? 0 : getEndDate().hashCode());
        result = prime * result + ((getActualEndDate() == null) ? 0 : getActualEndDate().hashCode());
        result = prime * result + ((getCreateEmpId() == null) ? 0 : getCreateEmpId().hashCode());
        result = prime * result + ((getModifyEmpId() == null) ? 0 : getModifyEmpId().hashCode());
        result = prime * result + ((getTarget() == null) ? 0 : getTarget().hashCode());
        result = prime * result + ((getAchieve() == null) ? 0 : getAchieve().hashCode());
        result = prime * result + ((getCollectionId() == null) ? 0 : getCollectionId().hashCode());
        result = prime * result + ((getBatchXls() == null) ? 0 : getBatchXls().hashCode());
        result = prime * result + ((getUploadTime() == null) ? 0 : getUploadTime().hashCode());
        result = prime * result + ((getModifyTime() == null) ? 0 : getModifyTime().hashCode());
        result = prime * result + ((getCreateTime() == null) ? 0 : getCreateTime().hashCode());
        result = prime * result + ((getBathTips() == null) ? 0 : getBathTips().hashCode());
        result = prime * result + ((getStatus() == null) ? 0 : getStatus().hashCode());
        result = prime * result + ((getWdcDesc() == null) ? 0 : getWdcDesc().hashCode());
        result = prime * result + ((getIsUpload() == null) ? 0 : getIsUpload().hashCode());
        result = prime * result + ((getTemplateType() == null) ? 0 : getTemplateType().hashCode());
        result = prime * result + ((getHandle() == null) ? 0 : getHandle().hashCode());
        return result;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table case_batch
     *
     * @mbggenerated
     */
    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append(getClass().getSimpleName());
        sb.append(" [");
        sb.append("Hash = ").append(hashCode());
        sb.append(", id=").append(id);
        sb.append(", batchCode=").append(batchCode);
        sb.append(", state=").append(state);
        sb.append(", version=").append(version);
        sb.append(", entrustProductId=").append(entrustProductId);
        sb.append(", entrustId=").append(entrustId);
        sb.append(", totalMoney=").append(totalMoney);
        sb.append(", totalNumber=").append(totalNumber);
        sb.append(", typeId=").append(typeId);
        sb.append(", beginDate=").append(beginDate);
        sb.append(", areaId=").append(areaId);
        sb.append(", endDate=").append(endDate);
        sb.append(", actualEndDate=").append(actualEndDate);
        sb.append(", createEmpId=").append(createEmpId);
        sb.append(", modifyEmpId=").append(modifyEmpId);
        sb.append(", target=").append(target);
        sb.append(", achieve=").append(achieve);
        sb.append(", collectionId=").append(collectionId);
        sb.append(", batchXls=").append(batchXls);
        sb.append(", uploadTime=").append(uploadTime);
        sb.append(", modifyTime=").append(modifyTime);
        sb.append(", createTime=").append(createTime);
        sb.append(", bathTips=").append(bathTips);
        sb.append(", status=").append(status);
        sb.append(", wdcDesc=").append(wdcDesc);
        sb.append(", isUpload=").append(isUpload);
        sb.append(", templateType=").append(templateType);
        sb.append(", handle=").append(handle);
        sb.append(", serialVersionUID=").append(serialVersionUID);
        sb.append("]");
        return sb.toString();
    }
}