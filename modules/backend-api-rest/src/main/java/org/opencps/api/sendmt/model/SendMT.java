//
// This file was generated by the JavaTM Architecture for XML Binding(JAXB) Reference Implementation, v2.2.8-b130911.1802 
// See <a href="http://java.sun.com/xml/jaxb">http://java.sun.com/xml/jaxb</a> 
// Any modifications to this file will be lost upon recompilation of the source schema. 
// Generated on: 2018.09.18 at 04:23:14 PM ICT 
//


package org.opencps.api.sendmt.model;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
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
 *         &lt;element name="mtseq">
 *           &lt;simpleType>
 *             &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string">
 *               &lt;maxLength value="255"/>
 *             &lt;/restriction>
 *           &lt;/simpleType>
 *         &lt;/element>
 *         &lt;element name="moid">
 *           &lt;simpleType>
 *             &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string">
 *               &lt;maxLength value="255"/>
 *             &lt;/restriction>
 *           &lt;/simpleType>
 *         &lt;/element>
 *         &lt;element name="moseq">
 *           &lt;simpleType>
 *             &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string">
 *               &lt;maxLength value="255"/>
 *             &lt;/restriction>
 *           &lt;/simpleType>
 *         &lt;/element>
 *         &lt;element name="src">
 *           &lt;simpleType>
 *             &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string">
 *               &lt;maxLength value="255"/>
 *             &lt;/restriction>
 *           &lt;/simpleType>
 *         &lt;/element>
 *         &lt;element name="dest">
 *           &lt;simpleType>
 *             &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string">
 *               &lt;maxLength value="255"/>
 *             &lt;/restriction>
 *           &lt;/simpleType>
 *         &lt;/element>
 *         &lt;element name="cmdcode">
 *           &lt;simpleType>
 *             &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string">
 *               &lt;maxLength value="255"/>
 *             &lt;/restriction>
 *           &lt;/simpleType>
 *         &lt;/element>
 *         &lt;element name="msgbody">
 *           &lt;simpleType>
 *             &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string">
 *               &lt;maxLength value="255"/>
 *             &lt;/restriction>
 *           &lt;/simpleType>
 *         &lt;/element>
 *         &lt;element name="msgtype">
 *           &lt;simpleType>
 *             &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string">
 *               &lt;maxLength value="255"/>
 *             &lt;/restriction>
 *           &lt;/simpleType>
 *         &lt;/element>
 *         &lt;element name="msgtitle">
 *           &lt;simpleType>
 *             &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string">
 *               &lt;maxLength value="255"/>
 *             &lt;/restriction>
 *           &lt;/simpleType>
 *         &lt;/element>
 *         &lt;element name="mttotalseg">
 *           &lt;simpleType>
 *             &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string">
 *               &lt;maxLength value="255"/>
 *             &lt;/restriction>
 *           &lt;/simpleType>
 *         &lt;/element>
 *         &lt;element name="mtseqref">
 *           &lt;simpleType>
 *             &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string">
 *               &lt;maxLength value="255"/>
 *             &lt;/restriction>
 *           &lt;/simpleType>
 *         &lt;/element>
 *         &lt;element name="cpid">
 *           &lt;simpleType>
 *             &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string">
 *               &lt;maxLength value="255"/>
 *             &lt;/restriction>
 *           &lt;/simpleType>
 *         &lt;/element>
 *         &lt;element name="serviceid">
 *           &lt;simpleType>
 *             &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string">
 *               &lt;maxLength value="255"/>
 *             &lt;/restriction>
 *           &lt;/simpleType>
 *         &lt;/element>
 *         &lt;element name="reqtime">
 *           &lt;simpleType>
 *             &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string">
 *               &lt;maxLength value="255"/>
 *             &lt;/restriction>
 *           &lt;/simpleType>
 *         &lt;/element>
 *         &lt;element name="procresult">
 *           &lt;simpleType>
 *             &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string">
 *               &lt;maxLength value="255"/>
 *             &lt;/restriction>
 *           &lt;/simpleType>
 *         &lt;/element>
 *         &lt;element name="username">
 *           &lt;simpleType>
 *             &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string">
 *               &lt;maxLength value="255"/>
 *             &lt;/restriction>
 *           &lt;/simpleType>
 *         &lt;/element>
 *         &lt;element name="password">
 *           &lt;simpleType>
 *             &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string">
 *               &lt;maxLength value="255"/>
 *             &lt;/restriction>
 *           &lt;/simpleType>
 *         &lt;/element>
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
    "mtseq",
    "moid",
    "moseq",
    "src",
    "dest",
    "cmdcode",
    "msgbody",
    "msgtype",
    "msgtitle",
    "mttotalseg",
    "mtseqref",
    "cpid",
    "serviceid",
    "reqtime",
    "procresult",
    "username",
    "password"
})
@XmlRootElement(name = "SendMT")
public class SendMT {

    @XmlElement(required = true)
    protected String mtseq;
    @XmlElement(required = true)
    protected String moid;
    @XmlElement(required = true)
    protected String moseq;
    @XmlElement(required = true)
    protected String src;
    @XmlElement(required = true)
    protected String dest;
    @XmlElement(required = true)
    protected String cmdcode;
    @XmlElement(required = true)
    protected String msgbody;
    @XmlElement(required = true)
    protected String msgtype;
    @XmlElement(required = true)
    protected String msgtitle;
    @XmlElement(required = true)
    protected String mttotalseg;
    @XmlElement(required = true)
    protected String mtseqref;
    @XmlElement(required = true)
    protected String cpid;
    @XmlElement(required = true)
    protected String serviceid;
    @XmlElement(required = true)
    protected String reqtime;
    @XmlElement(required = true)
    protected String procresult;
    @XmlElement(required = true)
    protected String username;
    @XmlElement(required = true)
    protected String password;

    /**
     * Gets the value of the mtseq property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getMtseq() {
        return mtseq;
    }

    /**
     * Sets the value of the mtseq property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setMtseq(String value) {
        this.mtseq = value;
    }

    /**
     * Gets the value of the moid property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getMoid() {
        return moid;
    }

    /**
     * Sets the value of the moid property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setMoid(String value) {
        this.moid = value;
    }

    /**
     * Gets the value of the moseq property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getMoseq() {
        return moseq;
    }

    /**
     * Sets the value of the moseq property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setMoseq(String value) {
        this.moseq = value;
    }

    /**
     * Gets the value of the src property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getSrc() {
        return src;
    }

    /**
     * Sets the value of the src property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setSrc(String value) {
        this.src = value;
    }

    /**
     * Gets the value of the dest property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getDest() {
        return dest;
    }

    /**
     * Sets the value of the dest property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setDest(String value) {
        this.dest = value;
    }

    /**
     * Gets the value of the cmdcode property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getCmdcode() {
        return cmdcode;
    }

    /**
     * Sets the value of the cmdcode property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setCmdcode(String value) {
        this.cmdcode = value;
    }

    /**
     * Gets the value of the msgbody property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getMsgbody() {
        return msgbody;
    }

    /**
     * Sets the value of the msgbody property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setMsgbody(String value) {
        this.msgbody = value;
    }

    /**
     * Gets the value of the msgtype property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getMsgtype() {
        return msgtype;
    }

    /**
     * Sets the value of the msgtype property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setMsgtype(String value) {
        this.msgtype = value;
    }

    /**
     * Gets the value of the msgtitle property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getMsgtitle() {
        return msgtitle;
    }

    /**
     * Sets the value of the msgtitle property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setMsgtitle(String value) {
        this.msgtitle = value;
    }

    /**
     * Gets the value of the mttotalseg property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getMttotalseg() {
        return mttotalseg;
    }

    /**
     * Sets the value of the mttotalseg property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setMttotalseg(String value) {
        this.mttotalseg = value;
    }

    /**
     * Gets the value of the mtseqref property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getMtseqref() {
        return mtseqref;
    }

    /**
     * Sets the value of the mtseqref property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setMtseqref(String value) {
        this.mtseqref = value;
    }

    /**
     * Gets the value of the cpid property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getCpid() {
        return cpid;
    }

    /**
     * Sets the value of the cpid property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setCpid(String value) {
        this.cpid = value;
    }

    /**
     * Gets the value of the serviceid property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getServiceid() {
        return serviceid;
    }

    /**
     * Sets the value of the serviceid property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setServiceid(String value) {
        this.serviceid = value;
    }

    /**
     * Gets the value of the reqtime property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getReqtime() {
        return reqtime;
    }

    /**
     * Sets the value of the reqtime property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setReqtime(String value) {
        this.reqtime = value;
    }

    /**
     * Gets the value of the procresult property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getProcresult() {
        return procresult;
    }

    /**
     * Sets the value of the procresult property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setProcresult(String value) {
        this.procresult = value;
    }

    /**
     * Gets the value of the username property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getUsername() {
        return username;
    }

    /**
     * Sets the value of the username property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setUsername(String value) {
        this.username = value;
    }

    /**
     * Gets the value of the password property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getPassword() {
        return password;
    }

    /**
     * Sets the value of the password property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setPassword(String value) {
        this.password = value;
    }

}
