//
// Ce fichier a été généré par l'implémentation de référence JavaTM Architecture for XML Binding (JAXB), v2.2.8-b130911.1802 
// Voir <a href="http://java.sun.com/xml/jaxb">http://java.sun.com/xml/jaxb</a> 
// Toute modification apportée à ce fichier sera perdue lors de la recompilation du schéma source. 
// Généré le : 2014.09.01 à 12:12:00 PM CEST 
//


package model;

import java.math.BigInteger;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlAttribute;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlRootElement;
import javax.xml.bind.annotation.XmlType;


/**
 * Variable capacity (e.g. MC-VRP)
 * 
 * <p>Classe Java pour anonymous complex type.
 * 
 * <p>Le fragment de schéma suivant indique le contenu attendu figurant dans cette classe.
 * 
 * <pre>
 * &lt;complexType>
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;choice>
 *           &lt;sequence>
 *             &lt;element name="min_capacity" type="{http://www.w3.org/2001/XMLSchema}double"/>
 *             &lt;element name="max_capacity" type="{http://www.w3.org/2001/XMLSchema}double"/>
 *           &lt;/sequence>
 *           &lt;sequence>
 *             &lt;element name="fix_capacity" type="{http://www.w3.org/2001/XMLSchema}double"/>
 *           &lt;/sequence>
 *         &lt;/choice>
 *         &lt;element ref="{}dimensions" minOccurs="0"/>
 *       &lt;/sequence>
 *       &lt;attribute name="type" use="required" type="{http://www.w3.org/2001/XMLSchema}integer" />
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "", propOrder = {
    "minCapacity",
    "maxCapacity",
    "fixCapacity",
    "dimensions"
})
@XmlRootElement(name = "compartment")
public class Compartment {

    @XmlElement(name = "min_capacity")
    protected Double minCapacity;
    @XmlElement(name = "max_capacity")
    protected Double maxCapacity;
    @XmlElement(name = "fix_capacity")
    protected Double fixCapacity;
    protected Dimensions dimensions;
    @XmlAttribute(name = "type", required = true)
    protected BigInteger type;

    /**
     * Obtient la valeur de la propriété minCapacity.
     * 
     * @return
     *     possible object is
     *     {@link Double }
     *     
     */
    public Double getMinCapacity() {
        return minCapacity;
    }

    /**
     * Définit la valeur de la propriété minCapacity.
     * 
     * @param value
     *     allowed object is
     *     {@link Double }
     *     
     */
    public void setMinCapacity(Double value) {
        this.minCapacity = value;
    }

    /**
     * Obtient la valeur de la propriété maxCapacity.
     * 
     * @return
     *     possible object is
     *     {@link Double }
     *     
     */
    public Double getMaxCapacity() {
        return maxCapacity;
    }

    /**
     * Définit la valeur de la propriété maxCapacity.
     * 
     * @param value
     *     allowed object is
     *     {@link Double }
     *     
     */
    public void setMaxCapacity(Double value) {
        this.maxCapacity = value;
    }

    /**
     * Obtient la valeur de la propriété fixCapacity.
     * 
     * @return
     *     possible object is
     *     {@link Double }
     *     
     */
    public Double getFixCapacity() {
        return fixCapacity;
    }

    /**
     * Définit la valeur de la propriété fixCapacity.
     * 
     * @param value
     *     allowed object is
     *     {@link Double }
     *     
     */
    public void setFixCapacity(Double value) {
        this.fixCapacity = value;
    }

    /**
     * Defines the dimensions the compartment
     * 
     * @return
     *     possible object is
     *     {@link Dimensions }
     *     
     */
    public Dimensions getDimensions() {
        return dimensions;
    }

    /**
     * Définit la valeur de la propriété dimensions.
     * 
     * @param value
     *     allowed object is
     *     {@link Dimensions }
     *     
     */
    public void setDimensions(Dimensions value) {
        this.dimensions = value;
    }

    /**
     * Obtient la valeur de la propriété type.
     * 
     * @return
     *     possible object is
     *     {@link BigInteger }
     *     
     */
    public BigInteger getType() {
        return type;
    }

    /**
     * Définit la valeur de la propriété type.
     * 
     * @param value
     *     allowed object is
     *     {@link BigInteger }
     *     
     */
    public void setType(BigInteger value) {
        this.type = value;
    }

}
