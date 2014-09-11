//
// Ce fichier a été généré par l'implémentation de référence JavaTM Architecture for XML Binding (JAXB), v2.2.8-b130911.1802 
// Voir <a href="http://java.sun.com/xml/jaxb">http://java.sun.com/xml/jaxb</a> 
// Toute modification apportée à ce fichier sera perdue lors de la recompilation du schéma source. 
// Généré le : 2014.09.09 à 04:59:16 PM CEST 
//


package model;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlAttribute;
import javax.xml.bind.annotation.XmlType;
import javax.xml.bind.annotation.XmlValue;


/**
 * Defines a parameter which value is time-dependent (e.g., travel time or service time)
 * 
 * <p>Classe Java pour time_dependent_parameter_type complex type.
 * 
 * <p>Le fragment de schéma suivant indique le contenu attendu figurant dans cette classe.
 * 
 * <pre>
 * &lt;complexType name="time_dependent_parameter_type">
 *   &lt;simpleContent>
 *     &lt;extension base="&lt;http://www.w3.org/2001/XMLSchema>double">
 *       &lt;attribute name="start" use="required" type="{http://www.w3.org/2001/XMLSchema}int" />
 *       &lt;attribute name="end" use="required" type="{http://www.w3.org/2001/XMLSchema}int" />
 *     &lt;/extension>
 *   &lt;/simpleContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "time_dependent_parameter_type", propOrder = {
    "value"
})
public class TimeDependentParameterType {

    @XmlValue
    protected double value;
    @XmlAttribute(name = "start", required = true)
    protected int start;
    @XmlAttribute(name = "end", required = true)
    protected int end;

    /**
     * Obtient la valeur de la propriété value.
     * 
     */
    public double getValue() {
        return value;
    }

    /**
     * Définit la valeur de la propriété value.
     * 
     */
    public void setValue(double value) {
        this.value = value;
    }

    /**
     * Obtient la valeur de la propriété start.
     * 
     */
    public int getStart() {
        return start;
    }

    /**
     * Définit la valeur de la propriété start.
     * 
     */
    public void setStart(int value) {
        this.start = value;
    }

    /**
     * Obtient la valeur de la propriété end.
     * 
     */
    public int getEnd() {
        return end;
    }

    /**
     * Définit la valeur de la propriété end.
     * 
     */
    public void setEnd(int value) {
        this.end = value;
    }

}
