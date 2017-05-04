package org.sch.issecurity.iam.tools.PSContractorLoader.model;

import java.sql.Date;
import java.sql.Timestamp;

/**
 * Simple POJO to represent a product
 */
public class Contractor
{
    private String personID;
    private Date effectiveDate;
    private String firstName;
    private String middleName;
    private String lastName;
    private String status;
    private String phone;
    private String address1;
    private String address2;
    private String city;
    private String state;
    private String postal;
    private String country;
    private String managerID;
    private String managerName;
    private String departmentID;
    private String departmentDesc;
    private String locationID;
    private String locationDesc;
    private String emailID;
    private String purchaseOrder;
    private String jobTitle;
    private Date contractBeginDate;
    private Date contractEndDate;
    private String vendorID;
    private String vendorName;
    private String previouslyEmployed;
    private String ADID;
    private String createdBy;
    private Timestamp createdDTTM;
    private String lastUpdatedBy;
    private String comment;

    public Contractor() {
    }


    public String getPersonID() {
        return personID;
    }

    public void setPersonID(String personID) {
        this.personID = personID;
    }

    public Date getEffectiveDate() {
        return effectiveDate;
    }

    public void setEffectiveDate(Date effectiveDate) {
        this.effectiveDate = effectiveDate;
    }

    public String getFirstName() {
        return firstName;
    }

    public void setFirstName(String firstName) {
        this.firstName = firstName;
    }

    public String getMiddleName() {
        return middleName;
    }

    public void setMiddleName(String middleName) {
        this.middleName = middleName;
    }

    public String getLastName() {
        return lastName;
    }

    public void setLastName(String lastName) {
        this.lastName = lastName;
    }

    public String getStatus() {
        return status;
    }

    public void setStatus(String status) {
        this.status = status;
    }

    public String getPhone() {
        return phone;
    }

    public void setPhone(String phone) {
        this.phone = phone;
    }

    public String getAddress1() {
        return address1;
    }

    public void setAddress1(String address1) {
        this.address1 = address1;
    }

    public String getAddress2() {
        return address2;
    }

    public void setAddress2(String address2) {
        this.address2 = address2;
    }

    public String getCity() {
        return city;
    }

    public void setCity(String city) {
        this.city = city;
    }

    public String getState() {
        return state;
    }

    public void setState(String state) {
        this.state = state;
    }

    public String getPostal() {
        return postal;
    }

    public void setPostal(String postal) {
        this.postal = postal;
    }

    public String getCountry() {
        return country;
    }

    public void setCountry(String country) {
        this.country = country;
    }

    public String getManagerID() {
        return managerID;
    }

    public void setManagerID(String managerID) {
        this.managerID = managerID;
    }

    public String getManagerName() {
        return managerName;
    }

    public void setManagerName(String managerName) {
        this.managerName = managerName;
    }

    public String getDepartmentID() {
        return departmentID;
    }

    public void setDepartmentID(String departmentID) {
        this.departmentID = departmentID;
    }

    public String getDepartmentDesc() {
        return departmentDesc;
    }

    public void setDepartmentDesc(String departmentDesc) {
        this.departmentDesc = departmentDesc;
    }

    public String getLocationID() {
        return locationID;
    }

    public void setLocationID(String locationID) {
        this.locationID = locationID;
    }

    public String getLocationDesc() {
        return locationDesc;
    }

    public void setLocationDesc(String locationDesc) {
        this.locationDesc = locationDesc;
    }

    public String getEmailID() {
        return emailID;
    }

    public void setEmailID(String emailID) {
        this.emailID = emailID;
    }

    public String getPurchaseOrder() {
        return purchaseOrder;
    }

    public void setPurchaseOrder(String purchaseOrder) {
        this.purchaseOrder = purchaseOrder;
    }

    public String getJobTitle() {
        return jobTitle;
    }

    public void setJobTitle(String jobTitle) {
        this.jobTitle = jobTitle;
    }

    public Date getContractBeginDate() {
        return contractBeginDate;
    }

    public void setContractBeginDate(Date contractBeginDate) {
        this.contractBeginDate = contractBeginDate;
    }

    public Date getContractEndDate() {
        return contractEndDate;
    }

    public void setContractEndDate(Date contractEndDate) {
        this.contractEndDate = contractEndDate;
    }

    public String getVendorID() {
        return vendorID;
    }

    public void setVendorID(String vendorID) {
        this.vendorID = vendorID;
    }

    public String getVendorName() {
        return vendorName;
    }

    public void setVendorName(String vendorName) {
        this.vendorName = vendorName;
    }

    public String getPreviouslyEmployed() {
        return previouslyEmployed;
    }

    public void setPreviouslyEmployed(String previouslyEmployed) {
        this.previouslyEmployed = previouslyEmployed;
    }

    public String getADID() {
        return ADID;
    }

    public void setADID(String ADID) {
        this.ADID = ADID;
    }

    public String getCreatedBy() {
        return createdBy;
    }

    public void setCreatedBy(String createdBy) {
        this.createdBy = createdBy;
    }

    public Timestamp getCreatedDTTM() {
        return createdDTTM;
    }

    public void setCreatedDTTM(Timestamp createdDTTM) {
        this.createdDTTM = createdDTTM;
    }

    public String getLastUpdatedBy() {
        return lastUpdatedBy;
    }

    public void setLastUpdatedBy(String lastUpdatedBy) {
        this.lastUpdatedBy = lastUpdatedBy;
    }

    public String getComment() {
        return comment;
    }

    public void setComment(String comment) {
        this.comment = comment;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;

        Contractor that = (Contractor) o;

        if (!personID.equals(that.personID)) return false;
        if (effectiveDate != null ? !effectiveDate.equals(that.effectiveDate) : that.effectiveDate != null)
            return false;
        if (firstName != null ? !firstName.equals(that.firstName) : that.firstName != null) return false;
        if (middleName != null ? !middleName.equals(that.middleName) : that.middleName != null) return false;
        if (lastName != null ? !lastName.equals(that.lastName) : that.lastName != null) return false;
        if (status != null ? !status.equals(that.status) : that.status != null) return false;
        if (phone != null ? !phone.equals(that.phone) : that.phone != null) return false;
        if (address1 != null ? !address1.equals(that.address1) : that.address1 != null) return false;
        if (address2 != null ? !address2.equals(that.address2) : that.address2 != null) return false;
        if (city != null ? !city.equals(that.city) : that.city != null) return false;
        if (state != null ? !state.equals(that.state) : that.state != null) return false;
        if (postal != null ? !postal.equals(that.postal) : that.postal != null) return false;
        if (country != null ? !country.equals(that.country) : that.country != null) return false;
        if (managerID != null ? !managerID.equals(that.managerID) : that.managerID != null) return false;
        if (managerName != null ? !managerName.equals(that.managerName) : that.managerName != null) return false;
        if (departmentID != null ? !departmentID.equals(that.departmentID) : that.departmentID != null) return false;
        if (departmentDesc != null ? !departmentDesc.equals(that.departmentDesc) : that.departmentDesc != null)
            return false;
        if (locationID != null ? !locationID.equals(that.locationID) : that.locationID != null) return false;
        if (locationDesc != null ? !locationDesc.equals(that.locationDesc) : that.locationDesc != null) return false;
        if (emailID != null ? !emailID.equals(that.emailID) : that.emailID != null) return false;
        if (purchaseOrder != null ? !purchaseOrder.equals(that.purchaseOrder) : that.purchaseOrder != null)
            return false;
        if (jobTitle != null ? !jobTitle.equals(that.jobTitle) : that.jobTitle != null) return false;
        if (contractBeginDate != null ? !contractBeginDate.equals(that.contractBeginDate) : that.contractBeginDate != null)
            return false;
        if (contractEndDate != null ? !contractEndDate.equals(that.contractEndDate) : that.contractEndDate != null)
            return false;
        if (vendorID != null ? !vendorID.equals(that.vendorID) : that.vendorID != null) return false;
        if (vendorName != null ? !vendorName.equals(that.vendorName) : that.vendorName != null) return false;
        if (previouslyEmployed != null ? !previouslyEmployed.equals(that.previouslyEmployed) : that.previouslyEmployed != null)
            return false;
        if (ADID != null ? !ADID.equals(that.ADID) : that.ADID != null) return false;
        if (createdBy != null ? !createdBy.equals(that.createdBy) : that.createdBy != null) return false;
        if (createdDTTM != null ? !createdDTTM.equals(that.createdDTTM) : that.createdDTTM != null) return false;
        if (lastUpdatedBy != null ? !lastUpdatedBy.equals(that.lastUpdatedBy) : that.lastUpdatedBy != null)
            return false;
        return comment != null ? comment.equals(that.comment) : that.comment == null;
    }

    @Override
    public int hashCode() {
        int result = personID.hashCode();
        result = 31 * result + (effectiveDate != null ? effectiveDate.hashCode() : 0);
        result = 31 * result + (firstName != null ? firstName.hashCode() : 0);
        result = 31 * result + (middleName != null ? middleName.hashCode() : 0);
        result = 31 * result + (lastName != null ? lastName.hashCode() : 0);
        result = 31 * result + (status != null ? status.hashCode() : 0);
        result = 31 * result + (phone != null ? phone.hashCode() : 0);
        result = 31 * result + (address1 != null ? address1.hashCode() : 0);
        result = 31 * result + (address2 != null ? address2.hashCode() : 0);
        result = 31 * result + (city != null ? city.hashCode() : 0);
        result = 31 * result + (state != null ? state.hashCode() : 0);
        result = 31 * result + (postal != null ? postal.hashCode() : 0);
        result = 31 * result + (country != null ? country.hashCode() : 0);
        result = 31 * result + (managerID != null ? managerID.hashCode() : 0);
        result = 31 * result + (managerName != null ? managerName.hashCode() : 0);
        result = 31 * result + (departmentID != null ? departmentID.hashCode() : 0);
        result = 31 * result + (departmentDesc != null ? departmentDesc.hashCode() : 0);
        result = 31 * result + (locationID != null ? locationID.hashCode() : 0);
        result = 31 * result + (locationDesc != null ? locationDesc.hashCode() : 0);
        result = 31 * result + (emailID != null ? emailID.hashCode() : 0);
        result = 31 * result + (purchaseOrder != null ? purchaseOrder.hashCode() : 0);
        result = 31 * result + (jobTitle != null ? jobTitle.hashCode() : 0);
        result = 31 * result + (contractBeginDate != null ? contractBeginDate.hashCode() : 0);
        result = 31 * result + (contractEndDate != null ? contractEndDate.hashCode() : 0);
        result = 31 * result + (vendorID != null ? vendorID.hashCode() : 0);
        result = 31 * result + (vendorName != null ? vendorName.hashCode() : 0);
        result = 31 * result + (previouslyEmployed != null ? previouslyEmployed.hashCode() : 0);
        result = 31 * result + (ADID != null ? ADID.hashCode() : 0);
        result = 31 * result + (createdBy != null ? createdBy.hashCode() : 0);
        result = 31 * result + (createdDTTM != null ? createdDTTM.hashCode() : 0);
        result = 31 * result + (lastUpdatedBy != null ? lastUpdatedBy.hashCode() : 0);
        result = 31 * result + (comment != null ? comment.hashCode() : 0);
        return result;
    }

}
