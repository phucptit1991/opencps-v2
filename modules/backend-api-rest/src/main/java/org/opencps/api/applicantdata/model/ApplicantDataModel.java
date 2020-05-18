//
// This file was generated by the JavaTM Architecture for XML Binding(JAXB) Reference Implementation, v2.2.8-b130911.1802 
// See <a href="http://java.sun.com/xml/jaxb">http://java.sun.com/xml/jaxb</a> 
// Any modifications to this file will be lost upon recompilation of the source schema. 
// Generated on: 2020.05.18 at 02:53:45 PM ICT 
//


package org.opencps.api.applicantdata.model;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for ApplicantDataModel complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="ApplicantDataModel">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="applicantDataId" type="{http://www.w3.org/2001/XMLSchema}long"/>
 *         &lt;element name="groupId" type="{http://www.w3.org/2001/XMLSchema}long"/>
 *         &lt;element name="userId" type="{http://www.w3.org/2001/XMLSchema}long"/>
 *         &lt;element name="createDate" type="{http://www.w3.org/2001/XMLSchema}string"/>
 *         &lt;element name="modifiedDate" type="{http://www.w3.org/2001/XMLSchema}string"/>
 *         &lt;element name="userName" type="{http://www.w3.org/2001/XMLSchema}string"/>
 *         &lt;element name="fileTemplateNo" type="{http://www.w3.org/2001/XMLSchema}string"/>
 *         &lt;element name="fileNo" type="{http://www.w3.org/2001/XMLSchema}string"/>
 *         &lt;element name="fileName" type="{http://www.w3.org/2001/XMLSchema}string"/>
 *         &lt;element name="fileEntryId" type="{http://www.w3.org/2001/XMLSchema}long"/>
 *         &lt;element name="filePath" type="{http://www.w3.org/2001/XMLSchema}string"/>
 *         &lt;element name="metadata" type="{http://www.w3.org/2001/XMLSchema}string"/>
 *         &lt;element name="status" type="{http://www.w3.org/2001/XMLSchema}int"/>
 *         &lt;element name="applicantIdNo" type="{http://www.w3.org/2001/XMLSchema}string"/>
 *         &lt;element name="applicantDataType" type="{http://www.w3.org/2001/XMLSchema}int"/>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "ApplicantDataModel", propOrder = {
    "applicantDataId",
    "groupId",
    "userId",
    "createDate",
    "modifiedDate",
    "userName",
    "fileTemplateNo",
    "fileNo",
    "fileName",
    "fileEntryId",
    "filePath",
    "metadata",
    "status",
    "applicantIdNo",
    "applicantDataType"
})
public class ApplicantDataModel {

    protected long applicantDataId;
    protected long groupId;
    protected long userId;
    @XmlElement(required = true)
    protected String createDate;
    @XmlElement(required = true)
    protected String modifiedDate;
    @XmlElement(required = true)
    protected String userName;
    @XmlElement(required = true)
    protected String fileTemplateNo;
    @XmlElement(required = true)
    protected String fileNo;
    @XmlElement(required = true)
    protected String fileName;
    protected long fileEntryId;
    @XmlElement(required = true)
    protected String filePath;
    @XmlElement(required = true)
    protected String metadata;
    protected int status;
    @XmlElement(required = true)
    protected String applicantIdNo;
    protected int applicantDataType;

    /**
     * Gets the value of the applicantDataId property.
     * 
     */
    public long getApplicantDataId() {
        return applicantDataId;
    }

    /**
     * Sets the value of the applicantDataId property.
     * 
     */
    public void setApplicantDataId(long value) {
        this.applicantDataId = value;
    }

    /**
     * Gets the value of the groupId property.
     * 
     */
    public long getGroupId() {
        return groupId;
    }

    /**
     * Sets the value of the groupId property.
     * 
     */
    public void setGroupId(long value) {
        this.groupId = value;
    }

    /**
     * Gets the value of the userId property.
     * 
     */
    public long getUserId() {
        return userId;
    }

    /**
     * Sets the value of the userId property.
     * 
     */
    public void setUserId(long value) {
        this.userId = value;
    }

    /**
     * Gets the value of the createDate property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getCreateDate() {
        return createDate;
    }

    /**
     * Sets the value of the createDate property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setCreateDate(String value) {
        this.createDate = value;
    }

    /**
     * Gets the value of the modifiedDate property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getModifiedDate() {
        return modifiedDate;
    }

    /**
     * Sets the value of the modifiedDate property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setModifiedDate(String value) {
        this.modifiedDate = value;
    }

    /**
     * Gets the value of the userName property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getUserName() {
        return userName;
    }

    /**
     * Sets the value of the userName property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setUserName(String value) {
        this.userName = value;
    }

    /**
     * Gets the value of the fileTemplateNo property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getFileTemplateNo() {
        return fileTemplateNo;
    }

    /**
     * Sets the value of the fileTemplateNo property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setFileTemplateNo(String value) {
        this.fileTemplateNo = value;
    }

    /**
     * Gets the value of the fileNo property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getFileNo() {
        return fileNo;
    }

    /**
     * Sets the value of the fileNo property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setFileNo(String value) {
        this.fileNo = value;
    }

    /**
     * Gets the value of the fileName property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getFileName() {
        return fileName;
    }

    /**
     * Sets the value of the fileName property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setFileName(String value) {
        this.fileName = value;
    }

    /**
     * Gets the value of the fileEntryId property.
     * 
     */
    public long getFileEntryId() {
        return fileEntryId;
    }

    /**
     * Sets the value of the fileEntryId property.
     * 
     */
    public void setFileEntryId(long value) {
        this.fileEntryId = value;
    }

    /**
     * Gets the value of the filePath property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getFilePath() {
        return filePath;
    }

    /**
     * Sets the value of the filePath property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setFilePath(String value) {
        this.filePath = value;
    }

    /**
     * Gets the value of the metadata property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getMetadata() {
        return metadata;
    }

    /**
     * Sets the value of the metadata property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setMetadata(String value) {
        this.metadata = value;
    }

    /**
     * Gets the value of the status property.
     * 
     */
    public int getStatus() {
        return status;
    }

    /**
     * Sets the value of the status property.
     * 
     */
    public void setStatus(int value) {
        this.status = value;
    }

    /**
     * Gets the value of the applicantIdNo property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getApplicantIdNo() {
        return applicantIdNo;
    }

    /**
     * Sets the value of the applicantIdNo property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setApplicantIdNo(String value) {
        this.applicantIdNo = value;
    }

    /**
     * Gets the value of the applicantDataType property.
     * 
     */
    public int getApplicantDataType() {
        return applicantDataType;
    }

    /**
     * Sets the value of the applicantDataType property.
     * 
     */
    public void setApplicantDataType(int value) {
        this.applicantDataType = value;
    }

}
