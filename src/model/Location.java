//
// Ce fichier a été généré par l'implémentation de référence JavaTM Architecture for XML Binding (JAXB), v2.2.8-b130911.1802 
// Voir <a href="http://java.sun.com/xml/jaxb">http://java.sun.com/xml/jaxb</a> 
// Toute modification apportée à ce fichier sera perdue lors de la recompilation du schéma source. 
// Généré le : 2014.09.09 à 04:59:16 PM CEST 
//


package model;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlRootElement;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Classe Java pour anonymous complex type.
 * 
 * <p>Le fragment de schéma suivant indique le contenu attendu figurant dans cette classe.
 * 
 * <pre>
 * &lt;complexType>
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;choice>
 *         &lt;sequence>
 *           &lt;element name="cx" type="{http://www.w3.org/2001/XMLSchema}double"/>
 *           &lt;element name="cy" type="{http://www.w3.org/2001/XMLSchema}double"/>
 *           &lt;element name="cz" type="{http://www.w3.org/2001/XMLSchema}double" minOccurs="0"/>
 *         &lt;/sequence>
 *         &lt;sequence>
 *           &lt;element name="latitude" type="{http://www.w3.org/2001/XMLSchema}double"/>
 *           &lt;element name="longitude" type="{http://www.w3.org/2001/XMLSchema}double"/>
 *         &lt;/sequence>
 *       &lt;/choice>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "", propOrder = {
    "cx",
    "cy",
    "cz",
    "latitude",
    "longitude"
})
@XmlRootElement(name = "location")
public class Location {

    protected Double cx;
    protected Double cy;
    protected Double cz;
    protected Double latitude;
    protected Double longitude;

    /**
     * Obtient la valeur de la propriété cx.
     * 
     * @return
     *     possible object is
     *     {@link Double }
     *     
     */
    public Double getCx() {
        return cx;
    }

    /**
     * Définit la valeur de la propriété cx.
     * 
     * @param value
     *     allowed object is
     *     {@link Double }
     *     
     */
    public void setCx(Double value) {
        this.cx = value;
    }

    /**
     * Obtient la valeur de la propriété cy.
     * 
     * @return
     *     possible object is
     *     {@link Double }
     *     
     */
    public Double getCy() {
        return cy;
    }

    /**
     * Définit la valeur de la propriété cy.
     * 
     * @param value
     *     allowed object is
     *     {@link Double }
     *     
     */
    public void setCy(Double value) {
        this.cy = value;
    }

    /**
     * Obtient la valeur de la propriété cz.
     * 
     * @return
     *     possible object is
     *     {@link Double }
     *     
     */
    public Double getCz() {
        return cz;
    }

    /**
     * Définit la valeur de la propriété cz.
     * 
     * @param value
     *     allowed object is
     *     {@link Double }
     *     
     */
    public void setCz(Double value) {
        this.cz = value;
    }

    /**
     * Obtient la valeur de la propriété latitude.
     * 
     * @return
     *     possible object is
     *     {@link Double }
     *     
     */
    public Double getLatitude() {
        return latitude;
    }

    /**
     * Définit la valeur de la propriété latitude.
     * 
     * @param value
     *     allowed object is
     *     {@link Double }
     *     
     */
    public void setLatitude(Double value) {
        this.latitude = value;
    }

    /**
     * Obtient la valeur de la propriété longitude.
     * 
     * @return
     *     possible object is
     *     {@link Double }
     *     
     */
    public Double getLongitude() {
        return longitude;
    }

    /**
     * Définit la valeur de la propriété longitude.
     * 
     * @param value
     *     allowed object is
     *     {@link Double }
     *     
     */
    public void setLongitude(Double value) {
        this.longitude = value;
    }

}
