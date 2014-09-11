//
// Ce fichier a été généré par l'implémentation de référence JavaTM Architecture for XML Binding (JAXB), v2.2.8-b130911.1802 
// Voir <a href="http://java.sun.com/xml/jaxb">http://java.sun.com/xml/jaxb</a> 
// Toute modification apportée à ce fichier sera perdue lors de la recompilation du schéma source. 
// Généré le : 2014.09.09 à 04:59:16 PM CEST 
//


package model;

import java.math.BigInteger;
import java.util.ArrayList;
import java.util.List;
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
 *             &lt;element name="min_capacity" type="{}positive_double"/>
 *             &lt;element name="max_capacity" type="{}positive_double"/>
 *           &lt;/sequence>
 *           &lt;element name="fix_capacity" type="{}positive_double"/>
 *         &lt;/choice>
 *         &lt;element name="compatible_request_type" type="{http://www.w3.org/2001/XMLSchema}int" maxOccurs="unbounded" minOccurs="0"/>
 *         &lt;choice minOccurs="0">
 *           &lt;sequence>
 *             &lt;element name="min_dimensions" type="{}dimensions_type"/>
 *             &lt;element name="max_dimensions" type="{}dimensions_type"/>
 *           &lt;/sequence>
 *           &lt;element ref="{}dimensions"/>
 *         &lt;/choice>
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
    "compatibleRequestType",
    "minDimensions",
    "maxDimensions",
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
    @XmlElement(name = "compatible_request_type", type = Integer.class)
    protected List<Integer> compatibleRequestType;
    @XmlElement(name = "min_dimensions")
    protected DimensionsType minDimensions;
    @XmlElement(name = "max_dimensions")
    protected DimensionsType maxDimensions;
    protected DimensionsType dimensions;
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
     * Gets the value of the compatibleRequestType property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the compatibleRequestType property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getCompatibleRequestType().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link Integer }
     * 
     * 
     */
    public List<Integer> getCompatibleRequestType() {
        if (compatibleRequestType == null) {
            compatibleRequestType = new ArrayList<Integer>();
        }
        return this.compatibleRequestType;
    }

    /**
     * Obtient la valeur de la propriété minDimensions.
     * 
     * @return
     *     possible object is
     *     {@link DimensionsType }
     *     
     */
    public DimensionsType getMinDimensions() {
        return minDimensions;
    }

    /**
     * Définit la valeur de la propriété minDimensions.
     * 
     * @param value
     *     allowed object is
     *     {@link DimensionsType }
     *     
     */
    public void setMinDimensions(DimensionsType value) {
        this.minDimensions = value;
    }

    /**
     * Obtient la valeur de la propriété maxDimensions.
     * 
     * @return
     *     possible object is
     *     {@link DimensionsType }
     *     
     */
    public DimensionsType getMaxDimensions() {
        return maxDimensions;
    }

    /**
     * Définit la valeur de la propriété maxDimensions.
     * 
     * @param value
     *     allowed object is
     *     {@link DimensionsType }
     *     
     */
    public void setMaxDimensions(DimensionsType value) {
        this.maxDimensions = value;
    }

    /**
     * Fix compartment dimensions
     * 
     * @return
     *     possible object is
     *     {@link DimensionsType }
     *     
     */
    public DimensionsType getDimensions() {
        return dimensions;
    }

    /**
     * Définit la valeur de la propriété dimensions.
     * 
     * @param value
     *     allowed object is
     *     {@link DimensionsType }
     *     
     */
    public void setDimensions(DimensionsType value) {
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
