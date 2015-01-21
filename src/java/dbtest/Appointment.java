
package dbtest;

import dbtest.Timestamp;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for appointment complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="appointment">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="amka" type="{http://www.w3.org/2001/XMLSchema}int"/>
 *         &lt;element name="date" type="{http://dbTest/}timestamp" minOccurs="0"/>
 *         &lt;element name="emergencyDate" type="{http://dbTest/}timestamp" minOccurs="0"/>
 *         &lt;element name="emergencyReason" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="examination" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="fullName" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="id" type="{http://www.w3.org/2001/XMLSchema}int"/>
 *         &lt;element name="insuranceName" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="medicalOffice" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="userId" type="{http://www.w3.org/2001/XMLSchema}int"/>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "appointment", propOrder = {
    "amka",
    "date",
    "emergencyDate",
    "emergencyReason",
    "examination",
    "fullName",
    "id",
    "insuranceName",
    "medicalOffice",
    "userId"
})
public class Appointment {

    protected int amka;
    protected Timestamp date;
    protected Timestamp emergencyDate;
    protected String emergencyReason;
    protected String examination;
    protected String fullName;
    protected int id;
    protected String insuranceName;
    protected String medicalOffice;
    protected int userId;

    /**
     * Gets the value of the amka property.
     * 
     */
    public int getAmka() {
        return amka;
    }

    /**
     * Sets the value of the amka property.
     * 
     */
    public void setAmka(int value) {
        this.amka = value;
    }

    /**
     * Gets the value of the date property.
     * 
     * @return
     *     possible object is
     *     {@link Timestamp }
     *     
     */
    public Timestamp getDate() {
        return date;
    }

    /**
     * Sets the value of the date property.
     * 
     * @param value
     *     allowed object is
     *     {@link Timestamp }
     *     
     */
    public void setDate(Timestamp value) {
        this.date = value;
    }

    /**
     * Gets the value of the emergencyDate property.
     * 
     * @return
     *     possible object is
     *     {@link Timestamp }
     *     
     */
    public Timestamp getEmergencyDate() {
        return emergencyDate;
    }

    /**
     * Sets the value of the emergencyDate property.
     * 
     * @param value
     *     allowed object is
     *     {@link Timestamp }
     *     
     */
    public void setEmergencyDate(Timestamp value) {
        this.emergencyDate = value;
    }

    /**
     * Gets the value of the emergencyReason property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getEmergencyReason() {
        return emergencyReason;
    }

    /**
     * Sets the value of the emergencyReason property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setEmergencyReason(String value) {
        this.emergencyReason = value;
    }

    /**
     * Gets the value of the examination property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getExamination() {
        return examination;
    }

    /**
     * Sets the value of the examination property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setExamination(String value) {
        this.examination = value;
    }

    /**
     * Gets the value of the fullName property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getFullName() {
        return fullName;
    }

    /**
     * Sets the value of the fullName property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setFullName(String value) {
        this.fullName = value;
    }

    /**
     * Gets the value of the id property.
     * 
     */
    public int getId() {
        return id;
    }

    /**
     * Sets the value of the id property.
     * 
     */
    public void setId(int value) {
        this.id = value;
    }

    /**
     * Gets the value of the insuranceName property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getInsuranceName() {
        return insuranceName;
    }

    /**
     * Sets the value of the insuranceName property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setInsuranceName(String value) {
        this.insuranceName = value;
    }

    /**
     * Gets the value of the medicalOffice property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getMedicalOffice() {
        return medicalOffice;
    }

    /**
     * Sets the value of the medicalOffice property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setMedicalOffice(String value) {
        this.medicalOffice = value;
    }

    /**
     * Gets the value of the userId property.
     * 
     */
    public int getUserId() {
        return userId;
    }

    /**
     * Sets the value of the userId property.
     * 
     */
    public void setUserId(int value) {
        this.userId = value;
    }

}
