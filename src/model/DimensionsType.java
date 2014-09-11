//
// Ce fichier a été généré par l'implémentation de référence JavaTM Architecture for XML Binding (JAXB), v2.2.8-b130911.1802 
// Voir <a href="http://java.sun.com/xml/jaxb">http://java.sun.com/xml/jaxb</a> 
// Toute modification apportée à ce fichier sera perdue lors de la recompilation du schéma source. 
// Généré le : 2014.09.09 à 04:59:16 PM CEST 
//


package model;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlType;


/**
 * Defines the dimensions of an object
 * 
 * <p>Classe Java pour dimensions_type complex type.
 * 
 * <p>Le fragment de schéma suivant indique le contenu attendu figurant dans cette classe.
 * 
 * <pre>
 * &lt;complexType name="dimensions_type">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="width" type="{}positive_double"/>
 *         &lt;element name="height" type="{}positive_double"/>
 *         &lt;element name="depth" type="{}positive_double" minOccurs="0"/>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "dimensions_type", propOrder = {
    "width",
    "height",
    "depth"
})
public class DimensionsType {

    protected double width;
    protected double height;
    protected Double depth;

    /**
     * Obtient la valeur de la propriété width.
     * 
     */
    public double getWidth() {
        return width;
    }

    /**
     * Définit la valeur de la propriété width.
     * 
     */
    public void setWidth(double value) {
        this.width = value;
    }

    /**
     * Obtient la valeur de la propriété height.
     * 
     */
    public double getHeight() {
        return height;
    }

    /**
     * Définit la valeur de la propriété height.
     * 
     */
    public void setHeight(double value) {
        this.height = value;
    }

    /**
     * Obtient la valeur de la propriété depth.
     * 
     * @return
     *     possible object is
     *     {@link Double }
     *     
     */
    public Double getDepth() {
        return depth;
    }

    /**
     * Définit la valeur de la propriété depth.
     * 
     * @param value
     *     allowed object is
     *     {@link Double }
     *     
     */
    public void setDepth(Double value) {
        this.depth = value;
    }

}
