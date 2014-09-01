//
// Ce fichier a été généré par l'implémentation de référence JavaTM Architecture for XML Binding (JAXB), v2.2.8-b130911.1802 
// Voir <a href="http://java.sun.com/xml/jaxb">http://java.sun.com/xml/jaxb</a> 
// Toute modification apportée à ce fichier sera perdue lors de la recompilation du schéma source. 
// Généré le : 2014.09.01 à 12:12:00 PM CEST 
//


package model;

import java.util.ArrayList;
import java.util.List;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlElements;
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
 *         &lt;element name="avg" type="{http://www.w3.org/2001/XMLSchema}double"/>
 *         &lt;sequence maxOccurs="unbounded">
 *           &lt;element name="speed" type="{http://www.w3.org/2001/XMLSchema}double"/>
 *           &lt;element ref="{}tw" maxOccurs="unbounded"/>
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
    "avg",
    "speedAndTw"
})
@XmlRootElement(name = "speed_profile")
public class SpeedProfile {

    protected Double avg;
    @XmlElements({
        @XmlElement(name = "speed", type = Double.class),
        @XmlElement(name = "tw", type = Tw.class)
    })
    protected List<Object> speedAndTw;

    /**
     * Obtient la valeur de la propriété avg.
     * 
     * @return
     *     possible object is
     *     {@link Double }
     *     
     */
    public Double getAvg() {
        return avg;
    }

    /**
     * Définit la valeur de la propriété avg.
     * 
     * @param value
     *     allowed object is
     *     {@link Double }
     *     
     */
    public void setAvg(Double value) {
        this.avg = value;
    }

    /**
     * Gets the value of the speedAndTw property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the speedAndTw property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getSpeedAndTw().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link Double }
     * {@link Tw }
     * 
     * 
     */
    public List<Object> getSpeedAndTw() {
        if (speedAndTw == null) {
            speedAndTw = new ArrayList<Object>();
        }
        return this.speedAndTw;
    }

}
