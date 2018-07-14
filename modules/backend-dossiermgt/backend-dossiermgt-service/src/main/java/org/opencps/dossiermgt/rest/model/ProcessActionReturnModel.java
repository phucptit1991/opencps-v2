//
// This file was generated by the JavaTM Architecture for XML Binding(JAXB) Reference Implementation, v2.2.8-b130911.1802 
// See <a href="http://java.sun.com/xml/jaxb">http://java.sun.com/xml/jaxb</a> 
// Any modifications to this file will be lost upon recompilation of the source schema. 
// Generated on: 2018.07.09 at 08:49:05 AM ICT 
//


package org.opencps.dossiermgt.rest.model;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlRootElement;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for anonymous complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType>
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="processActionId" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="actionCode" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="actionName" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="preStepCode" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="postStepCode" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="autoEvent" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="preCondition" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="allowAssignUser" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="assignUserId" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="assignUserName" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "", propOrder = {
    "processActionId",
    "actionCode",
    "actionName",
    "preStepCode",
    "postStepCode",
    "autoEvent",
    "preCondition",
    "allowAssignUser",
    "assignUserId",
    "assignUserName"
})
@XmlRootElement(name = "ProcessActionReturnModel")
public class ProcessActionReturnModel {

    protected String processActionId;
    protected String actionCode;
    protected String actionName;
    protected String preStepCode;
    protected String postStepCode;
    protected String autoEvent;
    protected String preCondition;
    protected String allowAssignUser;
    protected String assignUserId;
    protected String assignUserName;

    /**
     * Gets the value of the processActionId property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getProcessActionId() {
        return processActionId;
    }

    /**
     * Sets the value of the processActionId property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setProcessActionId(String value) {
        this.processActionId = value;
    }

    /**
     * Gets the value of the actionCode property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getActionCode() {
        return actionCode;
    }

    /**
     * Sets the value of the actionCode property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setActionCode(String value) {
        this.actionCode = value;
    }

    /**
     * Gets the value of the actionName property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getActionName() {
        return actionName;
    }

    /**
     * Sets the value of the actionName property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setActionName(String value) {
        this.actionName = value;
    }

    /**
     * Gets the value of the preStepCode property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getPreStepCode() {
        return preStepCode;
    }

    /**
     * Sets the value of the preStepCode property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setPreStepCode(String value) {
        this.preStepCode = value;
    }

    /**
     * Gets the value of the postStepCode property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getPostStepCode() {
        return postStepCode;
    }

    /**
     * Sets the value of the postStepCode property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setPostStepCode(String value) {
        this.postStepCode = value;
    }

    /**
     * Gets the value of the autoEvent property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getAutoEvent() {
        return autoEvent;
    }

    /**
     * Sets the value of the autoEvent property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setAutoEvent(String value) {
        this.autoEvent = value;
    }

    /**
     * Gets the value of the preCondition property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getPreCondition() {
        return preCondition;
    }

    /**
     * Sets the value of the preCondition property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setPreCondition(String value) {
        this.preCondition = value;
    }

    /**
     * Gets the value of the allowAssignUser property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getAllowAssignUser() {
        return allowAssignUser;
    }

    /**
     * Sets the value of the allowAssignUser property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setAllowAssignUser(String value) {
        this.allowAssignUser = value;
    }

    /**
     * Gets the value of the assignUserId property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getAssignUserId() {
        return assignUserId;
    }

    /**
     * Sets the value of the assignUserId property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setAssignUserId(String value) {
        this.assignUserId = value;
    }

    /**
     * Gets the value of the assignUserName property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getAssignUserName() {
        return assignUserName;
    }

    /**
     * Sets the value of the assignUserName property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setAssignUserName(String value) {
        this.assignUserName = value;
    }

}