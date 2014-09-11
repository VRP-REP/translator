//
// Ce fichier a été généré par l'implémentation de référence JavaTM Architecture for XML Binding (JAXB), v2.2.8-b130911.1802 
// Voir <a href="http://java.sun.com/xml/jaxb">http://java.sun.com/xml/jaxb</a> 
// Toute modification apportée à ce fichier sera perdue lors de la recompilation du schéma source. 
// Généré le : 2014.09.09 à 04:59:16 PM CEST 
//


package model;

import java.util.ArrayList;
import java.util.List;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlAttribute;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlSchemaType;
import javax.xml.bind.annotation.XmlType;
import javax.xml.bind.annotation.XmlValue;


/**
 * Defines a parameter which value is uncertain (e.g., stochastic travel time or stochastic demand)
 * 
 * <p>Classe Java pour uncertain_parameter_type complex type.
 * 
 * <p>Le fragment de schéma suivant indique le contenu attendu figurant dans cette classe.
 * 
 * <pre>
 * &lt;complexType name="uncertain_parameter_type">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;choice>
 *         &lt;element ref="{}random_variable"/>
 *         &lt;element name="scenario" maxOccurs="unbounded" minOccurs="2">
 *           &lt;complexType>
 *             &lt;simpleContent>
 *               &lt;extension base="&lt;http://www.w3.org/2001/XMLSchema>double">
 *                 &lt;attribute name="id" use="required" type="{http://www.w3.org/2001/XMLSchema}anySimpleType" />
 *                 &lt;attribute name="probability" use="required" type="{}probability" />
 *               &lt;/extension>
 *             &lt;/simpleContent>
 *           &lt;/complexType>
 *         &lt;/element>
 *       &lt;/choice>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "uncertain_parameter_type", propOrder = {
    "randomVariable",
    "scenario"
})
public class UncertainParameterType {

    @XmlElement(name = "random_variable")
    protected RandomVariableType randomVariable;
    protected List<UncertainParameterType.Scenario> scenario;

    /**
     * Obtient la valeur de la propriété randomVariable.
     * 
     * @return
     *     possible object is
     *     {@link RandomVariableType }
     *     
     */
    public RandomVariableType getRandomVariable() {
        return randomVariable;
    }

    /**
     * Définit la valeur de la propriété randomVariable.
     * 
     * @param value
     *     allowed object is
     *     {@link RandomVariableType }
     *     
     */
    public void setRandomVariable(RandomVariableType value) {
        this.randomVariable = value;
    }

    /**
     * Gets the value of the scenario property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the scenario property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getScenario().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link UncertainParameterType.Scenario }
     * 
     * 
     */
    public List<UncertainParameterType.Scenario> getScenario() {
        if (scenario == null) {
            scenario = new ArrayList<UncertainParameterType.Scenario>();
        }
        return this.scenario;
    }


    /**
     * <p>Classe Java pour anonymous complex type.
     * 
     * <p>Le fragment de schéma suivant indique le contenu attendu figurant dans cette classe.
     * 
     * <pre>
     * &lt;complexType>
     *   &lt;simpleContent>
     *     &lt;extension base="&lt;http://www.w3.org/2001/XMLSchema>double">
     *       &lt;attribute name="id" use="required" type="{http://www.w3.org/2001/XMLSchema}anySimpleType" />
     *       &lt;attribute name="probability" use="required" type="{}probability" />
     *     &lt;/extension>
     *   &lt;/simpleContent>
     * &lt;/complexType>
     * </pre>
     * 
     * 
     */
    @XmlAccessorType(XmlAccessType.FIELD)
    @XmlType(name = "", propOrder = {
        "value"
    })
    public static class Scenario {

        @XmlValue
        protected double value;
        @XmlAttribute(name = "id", required = true)
        @XmlSchemaType(name = "anySimpleType")
        protected String id;
        @XmlAttribute(name = "probability", required = true)
        protected double probability;

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
         * Obtient la valeur de la propriété id.
         * 
         * @return
         *     possible object is
         *     {@link String }
         *     
         */
        public String getId() {
            return id;
        }

        /**
         * Définit la valeur de la propriété id.
         * 
         * @param value
         *     allowed object is
         *     {@link String }
         *     
         */
        public void setId(String value) {
            this.id = value;
        }

        /**
         * Obtient la valeur de la propriété probability.
         * 
         */
        public double getProbability() {
            return probability;
        }

        /**
         * Définit la valeur de la propriété probability.
         * 
         */
        public void setProbability(double value) {
            this.probability = value;
        }

    }

}
