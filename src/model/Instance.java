//
// Ce fichier a été généré par l'implémentation de référence JavaTM Architecture for XML Binding (JAXB), v2.2.8-b130911.1802 
// Voir <a href="http://java.sun.com/xml/jaxb">http://java.sun.com/xml/jaxb</a> 
// Toute modification apportée à ce fichier sera perdue lors de la recompilation du schéma source. 
// Généré le : 2014.09.01 à 12:12:00 PM CEST 
//


package model;

import java.io.Serializable;
import java.math.BigInteger;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import javax.xml.bind.JAXBElement;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlAnyAttribute;
import javax.xml.bind.annotation.XmlAttribute;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlElementRef;
import javax.xml.bind.annotation.XmlMixed;
import javax.xml.bind.annotation.XmlRootElement;
import javax.xml.bind.annotation.XmlSchemaType;
import javax.xml.bind.annotation.XmlType;
import javax.xml.bind.annotation.XmlValue;
import javax.xml.namespace.QName;


/**
 * <p>Classe Java pour anonymous complex type.
 * 
 * <p>Le fragment de schéma suivant indique le contenu attendu figurant dans cette classe.
 * 
 * <pre>
 * &lt;complexType>
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;all>
 *         &lt;element name="info">
 *           &lt;complexType>
 *             &lt;complexContent>
 *               &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *                 &lt;sequence>
 *                   &lt;element name="dataset" type="{http://www.w3.org/2001/XMLSchema}string"/>
 *                   &lt;element name="name" type="{http://www.w3.org/2001/XMLSchema}string"/>
 *                 &lt;/sequence>
 *               &lt;/restriction>
 *             &lt;/complexContent>
 *           &lt;/complexType>
 *         &lt;/element>
 *         &lt;element name="network">
 *           &lt;complexType>
 *             &lt;complexContent>
 *               &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *                 &lt;sequence>
 *                   &lt;element name="nodes">
 *                     &lt;complexType>
 *                       &lt;complexContent>
 *                         &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *                           &lt;sequence>
 *                             &lt;element name="node" maxOccurs="unbounded" minOccurs="2">
 *                               &lt;complexType>
 *                                 &lt;complexContent>
 *                                   &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *                                     &lt;sequence>
 *                                       &lt;choice minOccurs="0">
 *                                         &lt;sequence>
 *                                           &lt;element name="cx" type="{http://www.w3.org/2001/XMLSchema}double"/>
 *                                           &lt;element name="cy" type="{http://www.w3.org/2001/XMLSchema}double"/>
 *                                           &lt;element name="cz" type="{http://www.w3.org/2001/XMLSchema}double" minOccurs="0"/>
 *                                         &lt;/sequence>
 *                                         &lt;sequence>
 *                                           &lt;element name="latitude" type="{http://www.w3.org/2001/XMLSchema}double"/>
 *                                           &lt;element name="longitude" type="{http://www.w3.org/2001/XMLSchema}double"/>
 *                                         &lt;/sequence>
 *                                       &lt;/choice>
 *                                       &lt;element name="compatible_vehicle" type="{http://www.w3.org/2001/XMLSchema}int" maxOccurs="unbounded" minOccurs="0"/>
 *                                       &lt;element ref="{}custom" minOccurs="0"/>
 *                                     &lt;/sequence>
 *                                     &lt;attribute name="id" use="required" type="{http://www.w3.org/2001/XMLSchema}integer" />
 *                                     &lt;attribute name="type" use="required" type="{http://www.w3.org/2001/XMLSchema}integer" />
 *                                     &lt;anyAttribute processContents='skip'/>
 *                                   &lt;/restriction>
 *                                 &lt;/complexContent>
 *                               &lt;/complexType>
 *                             &lt;/element>
 *                           &lt;/sequence>
 *                         &lt;/restriction>
 *                       &lt;/complexContent>
 *                     &lt;/complexType>
 *                   &lt;/element>
 *                   &lt;choice>
 *                     &lt;element name="links">
 *                       &lt;complexType>
 *                         &lt;complexContent>
 *                           &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *                             &lt;sequence>
 *                               &lt;element name="link" maxOccurs="unbounded">
 *                                 &lt;complexType>
 *                                   &lt;complexContent>
 *                                     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *                                       &lt;sequence>
 *                                         &lt;element name="length" type="{http://www.w3.org/2001/XMLSchema}double" minOccurs="0"/>
 *                                         &lt;choice minOccurs="0">
 *                                           &lt;element name="travel_time" type="{}type_time"/>
 *                                           &lt;element name="td_travel_time" maxOccurs="unbounded">
 *                                             &lt;complexType>
 *                                               &lt;complexContent>
 *                                                 &lt;extension base="{}type_tw">
 *                                                   &lt;sequence>
 *                                                     &lt;element ref="{}time"/>
 *                                                   &lt;/sequence>
 *                                                 &lt;/extension>
 *                                               &lt;/complexContent>
 *                                             &lt;/complexType>
 *                                           &lt;/element>
 *                                         &lt;/choice>
 *                                         &lt;choice minOccurs="0">
 *                                           &lt;element name="travel_cost" type="{}type_cost"/>
 *                                           &lt;element name="td_trave_cost" maxOccurs="unbounded">
 *                                             &lt;complexType>
 *                                               &lt;complexContent>
 *                                                 &lt;extension base="{}type_tw">
 *                                                   &lt;sequence>
 *                                                     &lt;element ref="{}cost"/>
 *                                                   &lt;/sequence>
 *                                                 &lt;/extension>
 *                                               &lt;/complexContent>
 *                                             &lt;/complexType>
 *                                           &lt;/element>
 *                                         &lt;/choice>
 *                                         &lt;element ref="{}custom" minOccurs="0"/>
 *                                       &lt;/sequence>
 *                                       &lt;attribute name="tail" use="required" type="{http://www.w3.org/2001/XMLSchema}integer" />
 *                                       &lt;attribute name="head" use="required" type="{http://www.w3.org/2001/XMLSchema}integer" />
 *                                       &lt;attribute name="id" type="{http://www.w3.org/2001/XMLSchema}integer" />
 *                                       &lt;attribute name="directed" type="{http://www.w3.org/2001/XMLSchema}boolean" default="false" />
 *                                       &lt;attribute name="type" type="{http://www.w3.org/2001/XMLSchema}integer" />
 *                                       &lt;anyAttribute processContents='skip'/>
 *                                     &lt;/restriction>
 *                                   &lt;/complexContent>
 *                                 &lt;/complexType>
 *                               &lt;/element>
 *                             &lt;/sequence>
 *                             &lt;attribute name="symmetric" use="required" type="{http://www.w3.org/2001/XMLSchema}boolean" />
 *                           &lt;/restriction>
 *                         &lt;/complexContent>
 *                       &lt;/complexType>
 *                     &lt;/element>
 *                     &lt;sequence>
 *                       &lt;choice>
 *                         &lt;element name="euclidean" type="{http://www.w3.org/2001/XMLSchema}anyType"/>
 *                         &lt;element name="manhattan" type="{http://www.w3.org/2001/XMLSchema}anyType"/>
 *                         &lt;element name="distance_calculator" type="{http://www.w3.org/2001/XMLSchema}string"/>
 *                       &lt;/choice>
 *                       &lt;choice>
 *                         &lt;element name="ceil" type="{http://www.w3.org/2001/XMLSchema}anyType"/>
 *                         &lt;element name="floor" type="{http://www.w3.org/2001/XMLSchema}anyType"/>
 *                         &lt;element name="decimals" type="{http://www.w3.org/2001/XMLSchema}int"/>
 *                       &lt;/choice>
 *                     &lt;/sequence>
 *                   &lt;/choice>
 *                   &lt;element ref="{}custom" minOccurs="0"/>
 *                 &lt;/sequence>
 *               &lt;/restriction>
 *             &lt;/complexContent>
 *           &lt;/complexType>
 *         &lt;/element>
 *         &lt;element name="fleet">
 *           &lt;complexType>
 *             &lt;complexContent>
 *               &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *                 &lt;sequence>
 *                   &lt;element name="vehicle" maxOccurs="unbounded">
 *                     &lt;complexType>
 *                       &lt;complexContent>
 *                         &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *                           &lt;sequence>
 *                             &lt;choice minOccurs="0">
 *                               &lt;element name="capacity" type="{http://www.w3.org/2001/XMLSchema}double"/>
 *                               &lt;sequence>
 *                                 &lt;element name="max_weight" type="{http://www.w3.org/2001/XMLSchema}double"/>
 *                                 &lt;element name="max_volume" type="{http://www.w3.org/2001/XMLSchema}double"/>
 *                               &lt;/sequence>
 *                             &lt;/choice>
 *                             &lt;element ref="{}dimensions" minOccurs="0"/>
 *                             &lt;element name="max_travel_distance" type="{http://www.w3.org/2001/XMLSchema}double" minOccurs="0"/>
 *                             &lt;element name="max_travel_time" type="{http://www.w3.org/2001/XMLSchema}double" minOccurs="0"/>
 *                             &lt;element ref="{}compartment" maxOccurs="unbounded" minOccurs="0"/>
 *                             &lt;element name="compatible_node_types" type="{http://www.w3.org/2001/XMLSchema}integer" maxOccurs="unbounded" minOccurs="0"/>
 *                             &lt;element name="max_stops" maxOccurs="unbounded" minOccurs="0">
 *                               &lt;complexType>
 *                                 &lt;simpleContent>
 *                                   &lt;extension base="&lt;http://www.w3.org/2001/XMLSchema>int">
 *                                     &lt;attribute name="type" type="{http://www.w3.org/2001/XMLSchema}string" />
 *                                   &lt;/extension>
 *                                 &lt;/simpleContent>
 *                               &lt;/complexType>
 *                             &lt;/element>
 *                             &lt;element ref="{}speed_profile" minOccurs="0"/>
 *                             &lt;element name="departure_node" type="{http://www.w3.org/2001/XMLSchema}integer" minOccurs="0"/>
 *                             &lt;element name="arrival_node" type="{http://www.w3.org/2001/XMLSchema}integer" minOccurs="0"/>
 *                             &lt;element name="resource" maxOccurs="unbounded" minOccurs="0">
 *                               &lt;complexType>
 *                                 &lt;simpleContent>
 *                                   &lt;extension base="&lt;http://www.w3.org/2001/XMLSchema>double">
 *                                     &lt;attribute name="type" use="required" type="{http://www.w3.org/2001/XMLSchema}anySimpleType" />
 *                                   &lt;/extension>
 *                                 &lt;/simpleContent>
 *                               &lt;/complexType>
 *                             &lt;/element>
 *                             &lt;element ref="{}cost" maxOccurs="unbounded" minOccurs="0"/>
 *                             &lt;element ref="{}custom" minOccurs="0"/>
 *                           &lt;/sequence>
 *                           &lt;attribute name="type" use="required" type="{http://www.w3.org/2001/XMLSchema}integer" />
 *                           &lt;attribute name="id" type="{http://www.w3.org/2001/XMLSchema}int" />
 *                           &lt;attribute name="number" type="{http://www.w3.org/2001/XMLSchema}int" />
 *                         &lt;/restriction>
 *                       &lt;/complexContent>
 *                     &lt;/complexType>
 *                   &lt;/element>
 *                 &lt;/sequence>
 *               &lt;/restriction>
 *             &lt;/complexContent>
 *           &lt;/complexType>
 *         &lt;/element>
 *         &lt;element name="requests">
 *           &lt;complexType>
 *             &lt;complexContent>
 *               &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *                 &lt;sequence>
 *                   &lt;element name="request" maxOccurs="unbounded">
 *                     &lt;complexType>
 *                       &lt;complexContent>
 *                         &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *                           &lt;sequence>
 *                             &lt;element ref="{}tw" maxOccurs="unbounded" minOccurs="0"/>
 *                             &lt;element ref="{}demand" maxOccurs="unbounded" minOccurs="0"/>
 *                             &lt;element name="prize" type="{http://www.w3.org/2001/XMLSchema}integer" minOccurs="0"/>
 *                             &lt;element ref="{}cost" maxOccurs="unbounded" minOccurs="0"/>
 *                             &lt;element name="release_date" type="{http://www.w3.org/2001/XMLSchema}double" minOccurs="0"/>
 *                             &lt;element name="service_time" type="{}type_time" minOccurs="0"/>
 *                             &lt;element name="predecessors" minOccurs="0">
 *                               &lt;complexType>
 *                                 &lt;complexContent>
 *                                   &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *                                     &lt;sequence>
 *                                       &lt;element name="request" type="{http://www.w3.org/2001/XMLSchema}integer" maxOccurs="unbounded"/>
 *                                     &lt;/sequence>
 *                                   &lt;/restriction>
 *                                 &lt;/complexContent>
 *                               &lt;/complexType>
 *                             &lt;/element>
 *                             &lt;element name="successors" minOccurs="0">
 *                               &lt;complexType>
 *                                 &lt;complexContent>
 *                                   &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *                                     &lt;sequence>
 *                                       &lt;element name="request" type="{http://www.w3.org/2001/XMLSchema}integer" maxOccurs="unbounded"/>
 *                                     &lt;/sequence>
 *                                   &lt;/restriction>
 *                                 &lt;/complexContent>
 *                               &lt;/complexType>
 *                             &lt;/element>
 *                             &lt;element name="skill" type="{http://www.w3.org/2001/XMLSchema}int" maxOccurs="unbounded" minOccurs="0"/>
 *                             &lt;element name="resource" maxOccurs="unbounded" minOccurs="0">
 *                               &lt;complexType>
 *                                 &lt;simpleContent>
 *                                   &lt;extension base="&lt;http://www.w3.org/2001/XMLSchema>double">
 *                                     &lt;attribute name="resource_id" use="required" type="{http://www.w3.org/2001/XMLSchema}int" />
 *                                   &lt;/extension>
 *                                 &lt;/simpleContent>
 *                               &lt;/complexType>
 *                             &lt;/element>
 *                             &lt;element ref="{}custom" minOccurs="0"/>
 *                           &lt;/sequence>
 *                           &lt;attribute name="id" use="required" type="{http://www.w3.org/2001/XMLSchema}integer" />
 *                           &lt;attribute name="type" type="{http://www.w3.org/2001/XMLSchema}integer" />
 *                           &lt;attribute name="node" type="{http://www.w3.org/2001/XMLSchema}integer" />
 *                           &lt;attribute name="link" type="{http://www.w3.org/2001/XMLSchema}integer" />
 *                         &lt;/restriction>
 *                       &lt;/complexContent>
 *                     &lt;/complexType>
 *                   &lt;/element>
 *                 &lt;/sequence>
 *               &lt;/restriction>
 *             &lt;/complexContent>
 *           &lt;/complexType>
 *         &lt;/element>
 *         &lt;element name="drivers" minOccurs="0">
 *           &lt;complexType>
 *             &lt;complexContent>
 *               &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *                 &lt;sequence>
 *                   &lt;element name="driver_profile" maxOccurs="unbounded">
 *                     &lt;complexType>
 *                       &lt;complexContent>
 *                         &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *                           &lt;sequence>
 *                             &lt;element name="skill" maxOccurs="unbounded" minOccurs="0">
 *                               &lt;complexType>
 *                                 &lt;complexContent>
 *                                   &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *                                     &lt;attribute name="id" use="required" type="{http://www.w3.org/2001/XMLSchema}integer" />
 *                                     &lt;anyAttribute processContents='skip'/>
 *                                   &lt;/restriction>
 *                                 &lt;/complexContent>
 *                               &lt;/complexType>
 *                             &lt;/element>
 *                             &lt;element name="workload_profile" minOccurs="0">
 *                               &lt;complexType>
 *                                 &lt;complexContent>
 *                                   &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *                                     &lt;sequence>
 *                                       &lt;element name="max_work_time" type="{http://www.w3.org/2001/XMLSchema}double" minOccurs="0"/>
 *                                       &lt;element name="max_driving_time" type="{http://www.w3.org/2001/XMLSchema}double" minOccurs="0"/>
 *                                       &lt;element ref="{}tw" maxOccurs="unbounded" minOccurs="0"/>
 *                                       &lt;element ref="{}custom" minOccurs="0"/>
 *                                     &lt;/sequence>
 *                                   &lt;/restriction>
 *                                 &lt;/complexContent>
 *                               &lt;/complexType>
 *                             &lt;/element>
 *                             &lt;element ref="{}cost" maxOccurs="unbounded" minOccurs="0"/>
 *                             &lt;element ref="{}custom" minOccurs="0"/>
 *                           &lt;/sequence>
 *                           &lt;attribute name="type" use="required" type="{http://www.w3.org/2001/XMLSchema}int" />
 *                         &lt;/restriction>
 *                       &lt;/complexContent>
 *                     &lt;/complexType>
 *                   &lt;/element>
 *                 &lt;/sequence>
 *               &lt;/restriction>
 *             &lt;/complexContent>
 *           &lt;/complexType>
 *         &lt;/element>
 *         &lt;element name="resources" minOccurs="0">
 *           &lt;complexType>
 *             &lt;complexContent>
 *               &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *                 &lt;sequence>
 *                   &lt;element name="resource" maxOccurs="unbounded">
 *                     &lt;complexType>
 *                       &lt;complexContent>
 *                         &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *                           &lt;sequence>
 *                             &lt;element name="descriptor" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *                           &lt;/sequence>
 *                           &lt;attribute name="id" use="required" type="{http://www.w3.org/2001/XMLSchema}integer" />
 *                           &lt;anyAttribute processContents='skip'/>
 *                         &lt;/restriction>
 *                       &lt;/complexContent>
 *                     &lt;/complexType>
 *                   &lt;/element>
 *                 &lt;/sequence>
 *               &lt;/restriction>
 *             &lt;/complexContent>
 *           &lt;/complexType>
 *         &lt;/element>
 *         &lt;element name="additional_fees" minOccurs="0">
 *           &lt;complexType>
 *             &lt;complexContent>
 *               &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *                 &lt;sequence>
 *                   &lt;element name="fee">
 *                     &lt;complexType>
 *                       &lt;complexContent>
 *                         &lt;extension base="{}type_cost">
 *                           &lt;attribute name="type" use="required" type="{http://www.w3.org/2001/XMLSchema}int" />
 *                         &lt;/extension>
 *                       &lt;/complexContent>
 *                     &lt;/complexType>
 *                   &lt;/element>
 *                 &lt;/sequence>
 *               &lt;/restriction>
 *             &lt;/complexContent>
 *           &lt;/complexType>
 *         &lt;/element>
 *       &lt;/all>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "", propOrder = {

})
@XmlRootElement(name = "instance")
public class Instance {

    @XmlElement(required = true)
    protected Instance.Info info;
    @XmlElement(required = true)
    protected Instance.Network network;
    @XmlElement(required = true)
    protected Instance.Fleet fleet;
    @XmlElement(required = true)
    protected Instance.Requests requests;
    protected Instance.Drivers drivers;
    protected Instance.Resources resources;
    @XmlElement(name = "additional_fees")
    protected Instance.AdditionalFees additionalFees;

    /**
     * Obtient la valeur de la propriété info.
     * 
     * @return
     *     possible object is
     *     {@link Instance.Info }
     *     
     */
    public Instance.Info getInfo() {
        return info;
    }

    /**
     * Définit la valeur de la propriété info.
     * 
     * @param value
     *     allowed object is
     *     {@link Instance.Info }
     *     
     */
    public void setInfo(Instance.Info value) {
        this.info = value;
    }

    /**
     * Obtient la valeur de la propriété network.
     * 
     * @return
     *     possible object is
     *     {@link Instance.Network }
     *     
     */
    public Instance.Network getNetwork() {
        return network;
    }

    /**
     * Définit la valeur de la propriété network.
     * 
     * @param value
     *     allowed object is
     *     {@link Instance.Network }
     *     
     */
    public void setNetwork(Instance.Network value) {
        this.network = value;
    }

    /**
     * Obtient la valeur de la propriété fleet.
     * 
     * @return
     *     possible object is
     *     {@link Instance.Fleet }
     *     
     */
    public Instance.Fleet getFleet() {
        return fleet;
    }

    /**
     * Définit la valeur de la propriété fleet.
     * 
     * @param value
     *     allowed object is
     *     {@link Instance.Fleet }
     *     
     */
    public void setFleet(Instance.Fleet value) {
        this.fleet = value;
    }

    /**
     * Obtient la valeur de la propriété requests.
     * 
     * @return
     *     possible object is
     *     {@link Instance.Requests }
     *     
     */
    public Instance.Requests getRequests() {
        return requests;
    }

    /**
     * Définit la valeur de la propriété requests.
     * 
     * @param value
     *     allowed object is
     *     {@link Instance.Requests }
     *     
     */
    public void setRequests(Instance.Requests value) {
        this.requests = value;
    }

    /**
     * Obtient la valeur de la propriété drivers.
     * 
     * @return
     *     possible object is
     *     {@link Instance.Drivers }
     *     
     */
    public Instance.Drivers getDrivers() {
        return drivers;
    }

    /**
     * Définit la valeur de la propriété drivers.
     * 
     * @param value
     *     allowed object is
     *     {@link Instance.Drivers }
     *     
     */
    public void setDrivers(Instance.Drivers value) {
        this.drivers = value;
    }

    /**
     * Obtient la valeur de la propriété resources.
     * 
     * @return
     *     possible object is
     *     {@link Instance.Resources }
     *     
     */
    public Instance.Resources getResources() {
        return resources;
    }

    /**
     * Définit la valeur de la propriété resources.
     * 
     * @param value
     *     allowed object is
     *     {@link Instance.Resources }
     *     
     */
    public void setResources(Instance.Resources value) {
        this.resources = value;
    }

    /**
     * Obtient la valeur de la propriété additionalFees.
     * 
     * @return
     *     possible object is
     *     {@link Instance.AdditionalFees }
     *     
     */
    public Instance.AdditionalFees getAdditionalFees() {
        return additionalFees;
    }

    /**
     * Définit la valeur de la propriété additionalFees.
     * 
     * @param value
     *     allowed object is
     *     {@link Instance.AdditionalFees }
     *     
     */
    public void setAdditionalFees(Instance.AdditionalFees value) {
        this.additionalFees = value;
    }


    /**
     * <p>Classe Java pour anonymous complex type.
     * 
     * <p>Le fragment de schéma suivant indique le contenu attendu figurant dans cette classe.
     * 
     * <pre>
     * &lt;complexType>
     *   &lt;complexContent>
     *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
     *       &lt;sequence>
     *         &lt;element name="fee">
     *           &lt;complexType>
     *             &lt;complexContent>
     *               &lt;extension base="{}type_cost">
     *                 &lt;attribute name="type" use="required" type="{http://www.w3.org/2001/XMLSchema}int" />
     *               &lt;/extension>
     *             &lt;/complexContent>
     *           &lt;/complexType>
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
        "fee"
    })
    public static class AdditionalFees {

        @XmlElement(required = true)
        protected Instance.AdditionalFees.Fee fee;

        /**
         * Obtient la valeur de la propriété fee.
         * 
         * @return
         *     possible object is
         *     {@link Instance.AdditionalFees.Fee }
         *     
         */
        public Instance.AdditionalFees.Fee getFee() {
            return fee;
        }

        /**
         * Définit la valeur de la propriété fee.
         * 
         * @param value
         *     allowed object is
         *     {@link Instance.AdditionalFees.Fee }
         *     
         */
        public void setFee(Instance.AdditionalFees.Fee value) {
            this.fee = value;
        }


        /**
         * <p>Classe Java pour anonymous complex type.
         * 
         * <p>Le fragment de schéma suivant indique le contenu attendu figurant dans cette classe.
         * 
         * <pre>
         * &lt;complexType>
         *   &lt;complexContent>
         *     &lt;extension base="{}type_cost">
         *       &lt;attribute name="type" use="required" type="{http://www.w3.org/2001/XMLSchema}int" />
         *     &lt;/extension>
         *   &lt;/complexContent>
         * &lt;/complexType>
         * </pre>
         * 
         * 
         */
        @XmlAccessorType(XmlAccessType.FIELD)
        @XmlType(name = "")
        public static class Fee
            extends TypeCost
        {

            @XmlAttribute(name = "type", required = true)
            protected int type;

            /**
             * Obtient la valeur de la propriété type.
             * 
             */
            public int getType() {
                return type;
            }

            /**
             * Définit la valeur de la propriété type.
             * 
             */
            public void setType(int value) {
                this.type = value;
            }

        }

    }


    /**
     * <p>Classe Java pour anonymous complex type.
     * 
     * <p>Le fragment de schéma suivant indique le contenu attendu figurant dans cette classe.
     * 
     * <pre>
     * &lt;complexType>
     *   &lt;complexContent>
     *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
     *       &lt;sequence>
     *         &lt;element name="driver_profile" maxOccurs="unbounded">
     *           &lt;complexType>
     *             &lt;complexContent>
     *               &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
     *                 &lt;sequence>
     *                   &lt;element name="skill" maxOccurs="unbounded" minOccurs="0">
     *                     &lt;complexType>
     *                       &lt;complexContent>
     *                         &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
     *                           &lt;attribute name="id" use="required" type="{http://www.w3.org/2001/XMLSchema}integer" />
     *                           &lt;anyAttribute processContents='skip'/>
     *                         &lt;/restriction>
     *                       &lt;/complexContent>
     *                     &lt;/complexType>
     *                   &lt;/element>
     *                   &lt;element name="workload_profile" minOccurs="0">
     *                     &lt;complexType>
     *                       &lt;complexContent>
     *                         &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
     *                           &lt;sequence>
     *                             &lt;element name="max_work_time" type="{http://www.w3.org/2001/XMLSchema}double" minOccurs="0"/>
     *                             &lt;element name="max_driving_time" type="{http://www.w3.org/2001/XMLSchema}double" minOccurs="0"/>
     *                             &lt;element ref="{}tw" maxOccurs="unbounded" minOccurs="0"/>
     *                             &lt;element ref="{}custom" minOccurs="0"/>
     *                           &lt;/sequence>
     *                         &lt;/restriction>
     *                       &lt;/complexContent>
     *                     &lt;/complexType>
     *                   &lt;/element>
     *                   &lt;element ref="{}cost" maxOccurs="unbounded" minOccurs="0"/>
     *                   &lt;element ref="{}custom" minOccurs="0"/>
     *                 &lt;/sequence>
     *                 &lt;attribute name="type" use="required" type="{http://www.w3.org/2001/XMLSchema}int" />
     *               &lt;/restriction>
     *             &lt;/complexContent>
     *           &lt;/complexType>
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
        "driverProfile"
    })
    public static class Drivers {

        @XmlElement(name = "driver_profile", required = true)
        protected List<Instance.Drivers.DriverProfile> driverProfile;

        /**
         * Gets the value of the driverProfile property.
         * 
         * <p>
         * This accessor method returns a reference to the live list,
         * not a snapshot. Therefore any modification you make to the
         * returned list will be present inside the JAXB object.
         * This is why there is not a <CODE>set</CODE> method for the driverProfile property.
         * 
         * <p>
         * For example, to add a new item, do as follows:
         * <pre>
         *    getDriverProfile().add(newItem);
         * </pre>
         * 
         * 
         * <p>
         * Objects of the following type(s) are allowed in the list
         * {@link Instance.Drivers.DriverProfile }
         * 
         * 
         */
        public List<Instance.Drivers.DriverProfile> getDriverProfile() {
            if (driverProfile == null) {
                driverProfile = new ArrayList<Instance.Drivers.DriverProfile>();
            }
            return this.driverProfile;
        }


        /**
         * <p>Classe Java pour anonymous complex type.
         * 
         * <p>Le fragment de schéma suivant indique le contenu attendu figurant dans cette classe.
         * 
         * <pre>
         * &lt;complexType>
         *   &lt;complexContent>
         *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
         *       &lt;sequence>
         *         &lt;element name="skill" maxOccurs="unbounded" minOccurs="0">
         *           &lt;complexType>
         *             &lt;complexContent>
         *               &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
         *                 &lt;attribute name="id" use="required" type="{http://www.w3.org/2001/XMLSchema}integer" />
         *                 &lt;anyAttribute processContents='skip'/>
         *               &lt;/restriction>
         *             &lt;/complexContent>
         *           &lt;/complexType>
         *         &lt;/element>
         *         &lt;element name="workload_profile" minOccurs="0">
         *           &lt;complexType>
         *             &lt;complexContent>
         *               &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
         *                 &lt;sequence>
         *                   &lt;element name="max_work_time" type="{http://www.w3.org/2001/XMLSchema}double" minOccurs="0"/>
         *                   &lt;element name="max_driving_time" type="{http://www.w3.org/2001/XMLSchema}double" minOccurs="0"/>
         *                   &lt;element ref="{}tw" maxOccurs="unbounded" minOccurs="0"/>
         *                   &lt;element ref="{}custom" minOccurs="0"/>
         *                 &lt;/sequence>
         *               &lt;/restriction>
         *             &lt;/complexContent>
         *           &lt;/complexType>
         *         &lt;/element>
         *         &lt;element ref="{}cost" maxOccurs="unbounded" minOccurs="0"/>
         *         &lt;element ref="{}custom" minOccurs="0"/>
         *       &lt;/sequence>
         *       &lt;attribute name="type" use="required" type="{http://www.w3.org/2001/XMLSchema}int" />
         *     &lt;/restriction>
         *   &lt;/complexContent>
         * &lt;/complexType>
         * </pre>
         * 
         * 
         */
        @XmlAccessorType(XmlAccessType.FIELD)
        @XmlType(name = "", propOrder = {
            "skill",
            "workloadProfile",
            "cost",
            "custom"
        })
        public static class DriverProfile {

            protected List<Instance.Drivers.DriverProfile.Skill> skill;
            @XmlElement(name = "workload_profile")
            protected Instance.Drivers.DriverProfile.WorkloadProfile workloadProfile;
            protected List<Cost> cost;
            protected Custom custom;
            @XmlAttribute(name = "type", required = true)
            protected int type;

            /**
             * Gets the value of the skill property.
             * 
             * <p>
             * This accessor method returns a reference to the live list,
             * not a snapshot. Therefore any modification you make to the
             * returned list will be present inside the JAXB object.
             * This is why there is not a <CODE>set</CODE> method for the skill property.
             * 
             * <p>
             * For example, to add a new item, do as follows:
             * <pre>
             *    getSkill().add(newItem);
             * </pre>
             * 
             * 
             * <p>
             * Objects of the following type(s) are allowed in the list
             * {@link Instance.Drivers.DriverProfile.Skill }
             * 
             * 
             */
            public List<Instance.Drivers.DriverProfile.Skill> getSkill() {
                if (skill == null) {
                    skill = new ArrayList<Instance.Drivers.DriverProfile.Skill>();
                }
                return this.skill;
            }

            /**
             * Obtient la valeur de la propriété workloadProfile.
             * 
             * @return
             *     possible object is
             *     {@link Instance.Drivers.DriverProfile.WorkloadProfile }
             *     
             */
            public Instance.Drivers.DriverProfile.WorkloadProfile getWorkloadProfile() {
                return workloadProfile;
            }

            /**
             * Définit la valeur de la propriété workloadProfile.
             * 
             * @param value
             *     allowed object is
             *     {@link Instance.Drivers.DriverProfile.WorkloadProfile }
             *     
             */
            public void setWorkloadProfile(Instance.Drivers.DriverProfile.WorkloadProfile value) {
                this.workloadProfile = value;
            }

            /**
             * The cost associate to the driver profile. Use this element to model, for instance, the cost of breaks Gets the value of the cost property.
             * 
             * <p>
             * This accessor method returns a reference to the live list,
             * not a snapshot. Therefore any modification you make to the
             * returned list will be present inside the JAXB object.
             * This is why there is not a <CODE>set</CODE> method for the cost property.
             * 
             * <p>
             * For example, to add a new item, do as follows:
             * <pre>
             *    getCost().add(newItem);
             * </pre>
             * 
             * 
             * <p>
             * Objects of the following type(s) are allowed in the list
             * {@link Cost }
             * 
             * 
             */
            public List<Cost> getCost() {
                if (cost == null) {
                    cost = new ArrayList<Cost>();
                }
                return this.cost;
            }

            /**
             * Obtient la valeur de la propriété custom.
             * 
             * @return
             *     possible object is
             *     {@link Custom }
             *     
             */
            public Custom getCustom() {
                return custom;
            }

            /**
             * Définit la valeur de la propriété custom.
             * 
             * @param value
             *     allowed object is
             *     {@link Custom }
             *     
             */
            public void setCustom(Custom value) {
                this.custom = value;
            }

            /**
             * Obtient la valeur de la propriété type.
             * 
             */
            public int getType() {
                return type;
            }

            /**
             * Définit la valeur de la propriété type.
             * 
             */
            public void setType(int value) {
                this.type = value;
            }


            /**
             * <p>Classe Java pour anonymous complex type.
             * 
             * <p>Le fragment de schéma suivant indique le contenu attendu figurant dans cette classe.
             * 
             * <pre>
             * &lt;complexType>
             *   &lt;complexContent>
             *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
             *       &lt;attribute name="id" use="required" type="{http://www.w3.org/2001/XMLSchema}integer" />
             *       &lt;anyAttribute processContents='skip'/>
             *     &lt;/restriction>
             *   &lt;/complexContent>
             * &lt;/complexType>
             * </pre>
             * 
             * 
             */
            @XmlAccessorType(XmlAccessType.FIELD)
            @XmlType(name = "", propOrder = {
                "content"
            })
            public static class Skill {

                @XmlValue
                protected String content;
                @XmlAttribute(name = "id", required = true)
                protected BigInteger id;
                @XmlAnyAttribute
                private Map<QName, String> otherAttributes = new HashMap<QName, String>();

                /**
                 * Obtient la valeur de la propriété content.
                 * 
                 * @return
                 *     possible object is
                 *     {@link String }
                 *     
                 */
                public String getContent() {
                    return content;
                }

                /**
                 * Définit la valeur de la propriété content.
                 * 
                 * @param value
                 *     allowed object is
                 *     {@link String }
                 *     
                 */
                public void setContent(String value) {
                    this.content = value;
                }

                /**
                 * Obtient la valeur de la propriété id.
                 * 
                 * @return
                 *     possible object is
                 *     {@link BigInteger }
                 *     
                 */
                public BigInteger getId() {
                    return id;
                }

                /**
                 * Définit la valeur de la propriété id.
                 * 
                 * @param value
                 *     allowed object is
                 *     {@link BigInteger }
                 *     
                 */
                public void setId(BigInteger value) {
                    this.id = value;
                }

                /**
                 * Gets a map that contains attributes that aren't bound to any typed property on this class.
                 * 
                 * <p>
                 * the map is keyed by the name of the attribute and 
                 * the value is the string value of the attribute.
                 * 
                 * the map returned by this method is live, and you can add new attribute
                 * by updating the map directly. Because of this design, there's no setter.
                 * 
                 * 
                 * @return
                 *     always non-null
                 */
                public Map<QName, String> getOtherAttributes() {
                    return otherAttributes;
                }

            }


            /**
             * <p>Classe Java pour anonymous complex type.
             * 
             * <p>Le fragment de schéma suivant indique le contenu attendu figurant dans cette classe.
             * 
             * <pre>
             * &lt;complexType>
             *   &lt;complexContent>
             *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
             *       &lt;sequence>
             *         &lt;element name="max_work_time" type="{http://www.w3.org/2001/XMLSchema}double" minOccurs="0"/>
             *         &lt;element name="max_driving_time" type="{http://www.w3.org/2001/XMLSchema}double" minOccurs="0"/>
             *         &lt;element ref="{}tw" maxOccurs="unbounded" minOccurs="0"/>
             *         &lt;element ref="{}custom" minOccurs="0"/>
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
                "maxWorkTime",
                "maxDrivingTime",
                "tw",
                "custom"
            })
            public static class WorkloadProfile {

                @XmlElement(name = "max_work_time")
                protected Double maxWorkTime;
                @XmlElement(name = "max_driving_time")
                protected Double maxDrivingTime;
                protected List<Tw> tw;
                protected Custom custom;

                /**
                 * Obtient la valeur de la propriété maxWorkTime.
                 * 
                 * @return
                 *     possible object is
                 *     {@link Double }
                 *     
                 */
                public Double getMaxWorkTime() {
                    return maxWorkTime;
                }

                /**
                 * Définit la valeur de la propriété maxWorkTime.
                 * 
                 * @param value
                 *     allowed object is
                 *     {@link Double }
                 *     
                 */
                public void setMaxWorkTime(Double value) {
                    this.maxWorkTime = value;
                }

                /**
                 * Obtient la valeur de la propriété maxDrivingTime.
                 * 
                 * @return
                 *     possible object is
                 *     {@link Double }
                 *     
                 */
                public Double getMaxDrivingTime() {
                    return maxDrivingTime;
                }

                /**
                 * Définit la valeur de la propriété maxDrivingTime.
                 * 
                 * @param value
                 *     allowed object is
                 *     {@link Double }
                 *     
                 */
                public void setMaxDrivingTime(Double value) {
                    this.maxDrivingTime = value;
                }

                /**
                 * Driver's availability time windows. May model either breaks or availability times Gets the value of the tw property.
                 * 
                 * <p>
                 * This accessor method returns a reference to the live list,
                 * not a snapshot. Therefore any modification you make to the
                 * returned list will be present inside the JAXB object.
                 * This is why there is not a <CODE>set</CODE> method for the tw property.
                 * 
                 * <p>
                 * For example, to add a new item, do as follows:
                 * <pre>
                 *    getTw().add(newItem);
                 * </pre>
                 * 
                 * 
                 * <p>
                 * Objects of the following type(s) are allowed in the list
                 * {@link Tw }
                 * 
                 * 
                 */
                public List<Tw> getTw() {
                    if (tw == null) {
                        tw = new ArrayList<Tw>();
                    }
                    return this.tw;
                }

                /**
                 * Obtient la valeur de la propriété custom.
                 * 
                 * @return
                 *     possible object is
                 *     {@link Custom }
                 *     
                 */
                public Custom getCustom() {
                    return custom;
                }

                /**
                 * Définit la valeur de la propriété custom.
                 * 
                 * @param value
                 *     allowed object is
                 *     {@link Custom }
                 *     
                 */
                public void setCustom(Custom value) {
                    this.custom = value;
                }

            }

        }

    }


    /**
     * <p>Classe Java pour anonymous complex type.
     * 
     * <p>Le fragment de schéma suivant indique le contenu attendu figurant dans cette classe.
     * 
     * <pre>
     * &lt;complexType>
     *   &lt;complexContent>
     *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
     *       &lt;sequence>
     *         &lt;element name="vehicle" maxOccurs="unbounded">
     *           &lt;complexType>
     *             &lt;complexContent>
     *               &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
     *                 &lt;sequence>
     *                   &lt;choice minOccurs="0">
     *                     &lt;element name="capacity" type="{http://www.w3.org/2001/XMLSchema}double"/>
     *                     &lt;sequence>
     *                       &lt;element name="max_weight" type="{http://www.w3.org/2001/XMLSchema}double"/>
     *                       &lt;element name="max_volume" type="{http://www.w3.org/2001/XMLSchema}double"/>
     *                     &lt;/sequence>
     *                   &lt;/choice>
     *                   &lt;element ref="{}dimensions" minOccurs="0"/>
     *                   &lt;element name="max_travel_distance" type="{http://www.w3.org/2001/XMLSchema}double" minOccurs="0"/>
     *                   &lt;element name="max_travel_time" type="{http://www.w3.org/2001/XMLSchema}double" minOccurs="0"/>
     *                   &lt;element ref="{}compartment" maxOccurs="unbounded" minOccurs="0"/>
     *                   &lt;element name="compatible_node_types" type="{http://www.w3.org/2001/XMLSchema}integer" maxOccurs="unbounded" minOccurs="0"/>
     *                   &lt;element name="max_stops" maxOccurs="unbounded" minOccurs="0">
     *                     &lt;complexType>
     *                       &lt;simpleContent>
     *                         &lt;extension base="&lt;http://www.w3.org/2001/XMLSchema>int">
     *                           &lt;attribute name="type" type="{http://www.w3.org/2001/XMLSchema}string" />
     *                         &lt;/extension>
     *                       &lt;/simpleContent>
     *                     &lt;/complexType>
     *                   &lt;/element>
     *                   &lt;element ref="{}speed_profile" minOccurs="0"/>
     *                   &lt;element name="departure_node" type="{http://www.w3.org/2001/XMLSchema}integer" minOccurs="0"/>
     *                   &lt;element name="arrival_node" type="{http://www.w3.org/2001/XMLSchema}integer" minOccurs="0"/>
     *                   &lt;element name="resource" maxOccurs="unbounded" minOccurs="0">
     *                     &lt;complexType>
     *                       &lt;simpleContent>
     *                         &lt;extension base="&lt;http://www.w3.org/2001/XMLSchema>double">
     *                           &lt;attribute name="type" use="required" type="{http://www.w3.org/2001/XMLSchema}anySimpleType" />
     *                         &lt;/extension>
     *                       &lt;/simpleContent>
     *                     &lt;/complexType>
     *                   &lt;/element>
     *                   &lt;element ref="{}cost" maxOccurs="unbounded" minOccurs="0"/>
     *                   &lt;element ref="{}custom" minOccurs="0"/>
     *                 &lt;/sequence>
     *                 &lt;attribute name="type" use="required" type="{http://www.w3.org/2001/XMLSchema}integer" />
     *                 &lt;attribute name="id" type="{http://www.w3.org/2001/XMLSchema}int" />
     *                 &lt;attribute name="number" type="{http://www.w3.org/2001/XMLSchema}int" />
     *               &lt;/restriction>
     *             &lt;/complexContent>
     *           &lt;/complexType>
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
        "vehicle"
    })
    public static class Fleet {

        @XmlElement(required = true)
        protected List<Instance.Fleet.Vehicle> vehicle;

        /**
         * Gets the value of the vehicle property.
         * 
         * <p>
         * This accessor method returns a reference to the live list,
         * not a snapshot. Therefore any modification you make to the
         * returned list will be present inside the JAXB object.
         * This is why there is not a <CODE>set</CODE> method for the vehicle property.
         * 
         * <p>
         * For example, to add a new item, do as follows:
         * <pre>
         *    getVehicle().add(newItem);
         * </pre>
         * 
         * 
         * <p>
         * Objects of the following type(s) are allowed in the list
         * {@link Instance.Fleet.Vehicle }
         * 
         * 
         */
        public List<Instance.Fleet.Vehicle> getVehicle() {
            if (vehicle == null) {
                vehicle = new ArrayList<Instance.Fleet.Vehicle>();
            }
            return this.vehicle;
        }


        /**
         * <p>Classe Java pour anonymous complex type.
         * 
         * <p>Le fragment de schéma suivant indique le contenu attendu figurant dans cette classe.
         * 
         * <pre>
         * &lt;complexType>
         *   &lt;complexContent>
         *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
         *       &lt;sequence>
         *         &lt;choice minOccurs="0">
         *           &lt;element name="capacity" type="{http://www.w3.org/2001/XMLSchema}double"/>
         *           &lt;sequence>
         *             &lt;element name="max_weight" type="{http://www.w3.org/2001/XMLSchema}double"/>
         *             &lt;element name="max_volume" type="{http://www.w3.org/2001/XMLSchema}double"/>
         *           &lt;/sequence>
         *         &lt;/choice>
         *         &lt;element ref="{}dimensions" minOccurs="0"/>
         *         &lt;element name="max_travel_distance" type="{http://www.w3.org/2001/XMLSchema}double" minOccurs="0"/>
         *         &lt;element name="max_travel_time" type="{http://www.w3.org/2001/XMLSchema}double" minOccurs="0"/>
         *         &lt;element ref="{}compartment" maxOccurs="unbounded" minOccurs="0"/>
         *         &lt;element name="compatible_node_types" type="{http://www.w3.org/2001/XMLSchema}integer" maxOccurs="unbounded" minOccurs="0"/>
         *         &lt;element name="max_stops" maxOccurs="unbounded" minOccurs="0">
         *           &lt;complexType>
         *             &lt;simpleContent>
         *               &lt;extension base="&lt;http://www.w3.org/2001/XMLSchema>int">
         *                 &lt;attribute name="type" type="{http://www.w3.org/2001/XMLSchema}string" />
         *               &lt;/extension>
         *             &lt;/simpleContent>
         *           &lt;/complexType>
         *         &lt;/element>
         *         &lt;element ref="{}speed_profile" minOccurs="0"/>
         *         &lt;element name="departure_node" type="{http://www.w3.org/2001/XMLSchema}integer" minOccurs="0"/>
         *         &lt;element name="arrival_node" type="{http://www.w3.org/2001/XMLSchema}integer" minOccurs="0"/>
         *         &lt;element name="resource" maxOccurs="unbounded" minOccurs="0">
         *           &lt;complexType>
         *             &lt;simpleContent>
         *               &lt;extension base="&lt;http://www.w3.org/2001/XMLSchema>double">
         *                 &lt;attribute name="type" use="required" type="{http://www.w3.org/2001/XMLSchema}anySimpleType" />
         *               &lt;/extension>
         *             &lt;/simpleContent>
         *           &lt;/complexType>
         *         &lt;/element>
         *         &lt;element ref="{}cost" maxOccurs="unbounded" minOccurs="0"/>
         *         &lt;element ref="{}custom" minOccurs="0"/>
         *       &lt;/sequence>
         *       &lt;attribute name="type" use="required" type="{http://www.w3.org/2001/XMLSchema}integer" />
         *       &lt;attribute name="id" type="{http://www.w3.org/2001/XMLSchema}int" />
         *       &lt;attribute name="number" type="{http://www.w3.org/2001/XMLSchema}int" />
         *     &lt;/restriction>
         *   &lt;/complexContent>
         * &lt;/complexType>
         * </pre>
         * 
         * 
         */
        @XmlAccessorType(XmlAccessType.FIELD)
        @XmlType(name = "", propOrder = {
            "capacity",
            "maxWeight",
            "maxVolume",
            "dimensions",
            "maxTravelDistance",
            "maxTravelTime",
            "compartment",
            "compatibleNodeTypes",
            "maxStops",
            "speedProfile",
            "departureNode",
            "arrivalNode",
            "resource",
            "cost",
            "custom"
        })
        public static class Vehicle {

            protected Double capacity;
            @XmlElement(name = "max_weight")
            protected Double maxWeight;
            @XmlElement(name = "max_volume")
            protected Double maxVolume;
            protected Dimensions dimensions;
            @XmlElement(name = "max_travel_distance")
            protected Double maxTravelDistance;
            @XmlElement(name = "max_travel_time")
            protected Double maxTravelTime;
            protected List<Compartment> compartment;
            @XmlElement(name = "compatible_node_types")
            protected List<BigInteger> compatibleNodeTypes;
            @XmlElement(name = "max_stops")
            protected List<Instance.Fleet.Vehicle.MaxStops> maxStops;
            @XmlElement(name = "speed_profile")
            protected SpeedProfile speedProfile;
            @XmlElement(name = "departure_node")
            protected BigInteger departureNode;
            @XmlElement(name = "arrival_node")
            protected BigInteger arrivalNode;
            protected List<Instance.Fleet.Vehicle.Resource> resource;
            protected List<Cost> cost;
            protected Custom custom;
            @XmlAttribute(name = "type", required = true)
            protected BigInteger type;
            @XmlAttribute(name = "id")
            protected Integer id;
            @XmlAttribute(name = "number")
            protected Integer number;

            /**
             * Obtient la valeur de la propriété capacity.
             * 
             * @return
             *     possible object is
             *     {@link Double }
             *     
             */
            public Double getCapacity() {
                return capacity;
            }

            /**
             * Définit la valeur de la propriété capacity.
             * 
             * @param value
             *     allowed object is
             *     {@link Double }
             *     
             */
            public void setCapacity(Double value) {
                this.capacity = value;
            }

            /**
             * Obtient la valeur de la propriété maxWeight.
             * 
             * @return
             *     possible object is
             *     {@link Double }
             *     
             */
            public Double getMaxWeight() {
                return maxWeight;
            }

            /**
             * Définit la valeur de la propriété maxWeight.
             * 
             * @param value
             *     allowed object is
             *     {@link Double }
             *     
             */
            public void setMaxWeight(Double value) {
                this.maxWeight = value;
            }

            /**
             * Obtient la valeur de la propriété maxVolume.
             * 
             * @return
             *     possible object is
             *     {@link Double }
             *     
             */
            public Double getMaxVolume() {
                return maxVolume;
            }

            /**
             * Définit la valeur de la propriété maxVolume.
             * 
             * @param value
             *     allowed object is
             *     {@link Double }
             *     
             */
            public void setMaxVolume(Double value) {
                this.maxVolume = value;
            }

            /**
             * Obtient la valeur de la propriété dimensions.
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
             * Obtient la valeur de la propriété maxTravelDistance.
             * 
             * @return
             *     possible object is
             *     {@link Double }
             *     
             */
            public Double getMaxTravelDistance() {
                return maxTravelDistance;
            }

            /**
             * Définit la valeur de la propriété maxTravelDistance.
             * 
             * @param value
             *     allowed object is
             *     {@link Double }
             *     
             */
            public void setMaxTravelDistance(Double value) {
                this.maxTravelDistance = value;
            }

            /**
             * Obtient la valeur de la propriété maxTravelTime.
             * 
             * @return
             *     possible object is
             *     {@link Double }
             *     
             */
            public Double getMaxTravelTime() {
                return maxTravelTime;
            }

            /**
             * Définit la valeur de la propriété maxTravelTime.
             * 
             * @param value
             *     allowed object is
             *     {@link Double }
             *     
             */
            public void setMaxTravelTime(Double value) {
                this.maxTravelTime = value;
            }

            /**
             * Defines a vehicle compartment. Use this element to model multicompartment VRPs Gets the value of the compartment property.
             * 
             * <p>
             * This accessor method returns a reference to the live list,
             * not a snapshot. Therefore any modification you make to the
             * returned list will be present inside the JAXB object.
             * This is why there is not a <CODE>set</CODE> method for the compartment property.
             * 
             * <p>
             * For example, to add a new item, do as follows:
             * <pre>
             *    getCompartment().add(newItem);
             * </pre>
             * 
             * 
             * <p>
             * Objects of the following type(s) are allowed in the list
             * {@link Compartment }
             * 
             * 
             */
            public List<Compartment> getCompartment() {
                if (compartment == null) {
                    compartment = new ArrayList<Compartment>();
                }
                return this.compartment;
            }

            /**
             * Gets the value of the compatibleNodeTypes property.
             * 
             * <p>
             * This accessor method returns a reference to the live list,
             * not a snapshot. Therefore any modification you make to the
             * returned list will be present inside the JAXB object.
             * This is why there is not a <CODE>set</CODE> method for the compatibleNodeTypes property.
             * 
             * <p>
             * For example, to add a new item, do as follows:
             * <pre>
             *    getCompatibleNodeTypes().add(newItem);
             * </pre>
             * 
             * 
             * <p>
             * Objects of the following type(s) are allowed in the list
             * {@link BigInteger }
             * 
             * 
             */
            public List<BigInteger> getCompatibleNodeTypes() {
                if (compatibleNodeTypes == null) {
                    compatibleNodeTypes = new ArrayList<BigInteger>();
                }
                return this.compatibleNodeTypes;
            }

            /**
             * Gets the value of the maxStops property.
             * 
             * <p>
             * This accessor method returns a reference to the live list,
             * not a snapshot. Therefore any modification you make to the
             * returned list will be present inside the JAXB object.
             * This is why there is not a <CODE>set</CODE> method for the maxStops property.
             * 
             * <p>
             * For example, to add a new item, do as follows:
             * <pre>
             *    getMaxStops().add(newItem);
             * </pre>
             * 
             * 
             * <p>
             * Objects of the following type(s) are allowed in the list
             * {@link Instance.Fleet.Vehicle.MaxStops }
             * 
             * 
             */
            public List<Instance.Fleet.Vehicle.MaxStops> getMaxStops() {
                if (maxStops == null) {
                    maxStops = new ArrayList<Instance.Fleet.Vehicle.MaxStops>();
                }
                return this.maxStops;
            }

            /**
             * Defines the vehicle's speed profile
             * 
             * @return
             *     possible object is
             *     {@link SpeedProfile }
             *     
             */
            public SpeedProfile getSpeedProfile() {
                return speedProfile;
            }

            /**
             * Définit la valeur de la propriété speedProfile.
             * 
             * @param value
             *     allowed object is
             *     {@link SpeedProfile }
             *     
             */
            public void setSpeedProfile(SpeedProfile value) {
                this.speedProfile = value;
            }

            /**
             * Obtient la valeur de la propriété departureNode.
             * 
             * @return
             *     possible object is
             *     {@link BigInteger }
             *     
             */
            public BigInteger getDepartureNode() {
                return departureNode;
            }

            /**
             * Définit la valeur de la propriété departureNode.
             * 
             * @param value
             *     allowed object is
             *     {@link BigInteger }
             *     
             */
            public void setDepartureNode(BigInteger value) {
                this.departureNode = value;
            }

            /**
             * Obtient la valeur de la propriété arrivalNode.
             * 
             * @return
             *     possible object is
             *     {@link BigInteger }
             *     
             */
            public BigInteger getArrivalNode() {
                return arrivalNode;
            }

            /**
             * Définit la valeur de la propriété arrivalNode.
             * 
             * @param value
             *     allowed object is
             *     {@link BigInteger }
             *     
             */
            public void setArrivalNode(BigInteger value) {
                this.arrivalNode = value;
            }

            /**
             * Gets the value of the resource property.
             * 
             * <p>
             * This accessor method returns a reference to the live list,
             * not a snapshot. Therefore any modification you make to the
             * returned list will be present inside the JAXB object.
             * This is why there is not a <CODE>set</CODE> method for the resource property.
             * 
             * <p>
             * For example, to add a new item, do as follows:
             * <pre>
             *    getResource().add(newItem);
             * </pre>
             * 
             * 
             * <p>
             * Objects of the following type(s) are allowed in the list
             * {@link Instance.Fleet.Vehicle.Resource }
             * 
             * 
             */
            public List<Instance.Fleet.Vehicle.Resource> getResource() {
                if (resource == null) {
                    resource = new ArrayList<Instance.Fleet.Vehicle.Resource>();
                }
                return this.resource;
            }

            /**
             * The costs of using a vehicle with this profile Gets the value of the cost property.
             * 
             * <p>
             * This accessor method returns a reference to the live list,
             * not a snapshot. Therefore any modification you make to the
             * returned list will be present inside the JAXB object.
             * This is why there is not a <CODE>set</CODE> method for the cost property.
             * 
             * <p>
             * For example, to add a new item, do as follows:
             * <pre>
             *    getCost().add(newItem);
             * </pre>
             * 
             * 
             * <p>
             * Objects of the following type(s) are allowed in the list
             * {@link Cost }
             * 
             * 
             */
            public List<Cost> getCost() {
                if (cost == null) {
                    cost = new ArrayList<Cost>();
                }
                return this.cost;
            }

            /**
             * Obtient la valeur de la propriété custom.
             * 
             * @return
             *     possible object is
             *     {@link Custom }
             *     
             */
            public Custom getCustom() {
                return custom;
            }

            /**
             * Définit la valeur de la propriété custom.
             * 
             * @param value
             *     allowed object is
             *     {@link Custom }
             *     
             */
            public void setCustom(Custom value) {
                this.custom = value;
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

            /**
             * Obtient la valeur de la propriété id.
             * 
             * @return
             *     possible object is
             *     {@link Integer }
             *     
             */
            public Integer getId() {
                return id;
            }

            /**
             * Définit la valeur de la propriété id.
             * 
             * @param value
             *     allowed object is
             *     {@link Integer }
             *     
             */
            public void setId(Integer value) {
                this.id = value;
            }

            /**
             * Obtient la valeur de la propriété number.
             * 
             * @return
             *     possible object is
             *     {@link Integer }
             *     
             */
            public Integer getNumber() {
                return number;
            }

            /**
             * Définit la valeur de la propriété number.
             * 
             * @param value
             *     allowed object is
             *     {@link Integer }
             *     
             */
            public void setNumber(Integer value) {
                this.number = value;
            }


            /**
             * <p>Classe Java pour anonymous complex type.
             * 
             * <p>Le fragment de schéma suivant indique le contenu attendu figurant dans cette classe.
             * 
             * <pre>
             * &lt;complexType>
             *   &lt;simpleContent>
             *     &lt;extension base="&lt;http://www.w3.org/2001/XMLSchema>int">
             *       &lt;attribute name="type" type="{http://www.w3.org/2001/XMLSchema}string" />
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
            public static class MaxStops {

                @XmlValue
                protected int value;
                @XmlAttribute(name = "type")
                protected String type;

                /**
                 * Obtient la valeur de la propriété value.
                 * 
                 */
                public int getValue() {
                    return value;
                }

                /**
                 * Définit la valeur de la propriété value.
                 * 
                 */
                public void setValue(int value) {
                    this.value = value;
                }

                /**
                 * Obtient la valeur de la propriété type.
                 * 
                 * @return
                 *     possible object is
                 *     {@link String }
                 *     
                 */
                public String getType() {
                    return type;
                }

                /**
                 * Définit la valeur de la propriété type.
                 * 
                 * @param value
                 *     allowed object is
                 *     {@link String }
                 *     
                 */
                public void setType(String value) {
                    this.type = value;
                }

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
             *       &lt;attribute name="type" use="required" type="{http://www.w3.org/2001/XMLSchema}anySimpleType" />
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
            public static class Resource {

                @XmlValue
                protected double value;
                @XmlAttribute(name = "type", required = true)
                @XmlSchemaType(name = "anySimpleType")
                protected String type;

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
                 * Obtient la valeur de la propriété type.
                 * 
                 * @return
                 *     possible object is
                 *     {@link String }
                 *     
                 */
                public String getType() {
                    return type;
                }

                /**
                 * Définit la valeur de la propriété type.
                 * 
                 * @param value
                 *     allowed object is
                 *     {@link String }
                 *     
                 */
                public void setType(String value) {
                    this.type = value;
                }

            }

        }

    }


    /**
     * <p>Classe Java pour anonymous complex type.
     * 
     * <p>Le fragment de schéma suivant indique le contenu attendu figurant dans cette classe.
     * 
     * <pre>
     * &lt;complexType>
     *   &lt;complexContent>
     *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
     *       &lt;sequence>
     *         &lt;element name="dataset" type="{http://www.w3.org/2001/XMLSchema}string"/>
     *         &lt;element name="name" type="{http://www.w3.org/2001/XMLSchema}string"/>
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
        "dataset",
        "name"
    })
    public static class Info {

        @XmlElement(required = true)
        protected String dataset;
        @XmlElement(required = true)
        protected String name;

        /**
         * Obtient la valeur de la propriété dataset.
         * 
         * @return
         *     possible object is
         *     {@link String }
         *     
         */
        public String getDataset() {
            return dataset;
        }

        /**
         * Définit la valeur de la propriété dataset.
         * 
         * @param value
         *     allowed object is
         *     {@link String }
         *     
         */
        public void setDataset(String value) {
            this.dataset = value;
        }

        /**
         * Obtient la valeur de la propriété name.
         * 
         * @return
         *     possible object is
         *     {@link String }
         *     
         */
        public String getName() {
            return name;
        }

        /**
         * Définit la valeur de la propriété name.
         * 
         * @param value
         *     allowed object is
         *     {@link String }
         *     
         */
        public void setName(String value) {
            this.name = value;
        }

    }


    /**
     * <p>Classe Java pour anonymous complex type.
     * 
     * <p>Le fragment de schéma suivant indique le contenu attendu figurant dans cette classe.
     * 
     * <pre>
     * &lt;complexType>
     *   &lt;complexContent>
     *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
     *       &lt;sequence>
     *         &lt;element name="nodes">
     *           &lt;complexType>
     *             &lt;complexContent>
     *               &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
     *                 &lt;sequence>
     *                   &lt;element name="node" maxOccurs="unbounded" minOccurs="2">
     *                     &lt;complexType>
     *                       &lt;complexContent>
     *                         &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
     *                           &lt;sequence>
     *                             &lt;choice minOccurs="0">
     *                               &lt;sequence>
     *                                 &lt;element name="cx" type="{http://www.w3.org/2001/XMLSchema}double"/>
     *                                 &lt;element name="cy" type="{http://www.w3.org/2001/XMLSchema}double"/>
     *                                 &lt;element name="cz" type="{http://www.w3.org/2001/XMLSchema}double" minOccurs="0"/>
     *                               &lt;/sequence>
     *                               &lt;sequence>
     *                                 &lt;element name="latitude" type="{http://www.w3.org/2001/XMLSchema}double"/>
     *                                 &lt;element name="longitude" type="{http://www.w3.org/2001/XMLSchema}double"/>
     *                               &lt;/sequence>
     *                             &lt;/choice>
     *                             &lt;element name="compatible_vehicle" type="{http://www.w3.org/2001/XMLSchema}int" maxOccurs="unbounded" minOccurs="0"/>
     *                             &lt;element ref="{}custom" minOccurs="0"/>
     *                           &lt;/sequence>
     *                           &lt;attribute name="id" use="required" type="{http://www.w3.org/2001/XMLSchema}integer" />
     *                           &lt;attribute name="type" use="required" type="{http://www.w3.org/2001/XMLSchema}integer" />
     *                           &lt;anyAttribute processContents='skip'/>
     *                         &lt;/restriction>
     *                       &lt;/complexContent>
     *                     &lt;/complexType>
     *                   &lt;/element>
     *                 &lt;/sequence>
     *               &lt;/restriction>
     *             &lt;/complexContent>
     *           &lt;/complexType>
     *         &lt;/element>
     *         &lt;choice>
     *           &lt;element name="links">
     *             &lt;complexType>
     *               &lt;complexContent>
     *                 &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
     *                   &lt;sequence>
     *                     &lt;element name="link" maxOccurs="unbounded">
     *                       &lt;complexType>
     *                         &lt;complexContent>
     *                           &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
     *                             &lt;sequence>
     *                               &lt;element name="length" type="{http://www.w3.org/2001/XMLSchema}double" minOccurs="0"/>
     *                               &lt;choice minOccurs="0">
     *                                 &lt;element name="travel_time" type="{}type_time"/>
     *                                 &lt;element name="td_travel_time" maxOccurs="unbounded">
     *                                   &lt;complexType>
     *                                     &lt;complexContent>
     *                                       &lt;extension base="{}type_tw">
     *                                         &lt;sequence>
     *                                           &lt;element ref="{}time"/>
     *                                         &lt;/sequence>
     *                                       &lt;/extension>
     *                                     &lt;/complexContent>
     *                                   &lt;/complexType>
     *                                 &lt;/element>
     *                               &lt;/choice>
     *                               &lt;choice minOccurs="0">
     *                                 &lt;element name="travel_cost" type="{}type_cost"/>
     *                                 &lt;element name="td_trave_cost" maxOccurs="unbounded">
     *                                   &lt;complexType>
     *                                     &lt;complexContent>
     *                                       &lt;extension base="{}type_tw">
     *                                         &lt;sequence>
     *                                           &lt;element ref="{}cost"/>
     *                                         &lt;/sequence>
     *                                       &lt;/extension>
     *                                     &lt;/complexContent>
     *                                   &lt;/complexType>
     *                                 &lt;/element>
     *                               &lt;/choice>
     *                               &lt;element ref="{}custom" minOccurs="0"/>
     *                             &lt;/sequence>
     *                             &lt;attribute name="tail" use="required" type="{http://www.w3.org/2001/XMLSchema}integer" />
     *                             &lt;attribute name="head" use="required" type="{http://www.w3.org/2001/XMLSchema}integer" />
     *                             &lt;attribute name="id" type="{http://www.w3.org/2001/XMLSchema}integer" />
     *                             &lt;attribute name="directed" type="{http://www.w3.org/2001/XMLSchema}boolean" default="false" />
     *                             &lt;attribute name="type" type="{http://www.w3.org/2001/XMLSchema}integer" />
     *                             &lt;anyAttribute processContents='skip'/>
     *                           &lt;/restriction>
     *                         &lt;/complexContent>
     *                       &lt;/complexType>
     *                     &lt;/element>
     *                   &lt;/sequence>
     *                   &lt;attribute name="symmetric" use="required" type="{http://www.w3.org/2001/XMLSchema}boolean" />
     *                 &lt;/restriction>
     *               &lt;/complexContent>
     *             &lt;/complexType>
     *           &lt;/element>
     *           &lt;sequence>
     *             &lt;choice>
     *               &lt;element name="euclidean" type="{http://www.w3.org/2001/XMLSchema}anyType"/>
     *               &lt;element name="manhattan" type="{http://www.w3.org/2001/XMLSchema}anyType"/>
     *               &lt;element name="distance_calculator" type="{http://www.w3.org/2001/XMLSchema}string"/>
     *             &lt;/choice>
     *             &lt;choice>
     *               &lt;element name="ceil" type="{http://www.w3.org/2001/XMLSchema}anyType"/>
     *               &lt;element name="floor" type="{http://www.w3.org/2001/XMLSchema}anyType"/>
     *               &lt;element name="decimals" type="{http://www.w3.org/2001/XMLSchema}int"/>
     *             &lt;/choice>
     *           &lt;/sequence>
     *         &lt;/choice>
     *         &lt;element ref="{}custom" minOccurs="0"/>
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
        "nodes",
        "links",
        "euclidean",
        "manhattan",
        "distanceCalculator",
        "ceil",
        "floor",
        "decimals",
        "custom"
    })
    public static class Network {

        @XmlElement(required = true)
        protected Instance.Network.Nodes nodes;
        protected Instance.Network.Links links;
        protected Object euclidean;
        protected Object manhattan;
        @XmlElement(name = "distance_calculator")
        protected String distanceCalculator;
        protected Object ceil;
        protected Object floor;
        protected Integer decimals;
        protected Custom custom;

        /**
         * Obtient la valeur de la propriété nodes.
         * 
         * @return
         *     possible object is
         *     {@link Instance.Network.Nodes }
         *     
         */
        public Instance.Network.Nodes getNodes() {
            return nodes;
        }

        /**
         * Définit la valeur de la propriété nodes.
         * 
         * @param value
         *     allowed object is
         *     {@link Instance.Network.Nodes }
         *     
         */
        public void setNodes(Instance.Network.Nodes value) {
            this.nodes = value;
        }

        /**
         * Obtient la valeur de la propriété links.
         * 
         * @return
         *     possible object is
         *     {@link Instance.Network.Links }
         *     
         */
        public Instance.Network.Links getLinks() {
            return links;
        }

        /**
         * Définit la valeur de la propriété links.
         * 
         * @param value
         *     allowed object is
         *     {@link Instance.Network.Links }
         *     
         */
        public void setLinks(Instance.Network.Links value) {
            this.links = value;
        }

        /**
         * Obtient la valeur de la propriété euclidean.
         * 
         * @return
         *     possible object is
         *     {@link Object }
         *     
         */
        public Object getEuclidean() {
            return euclidean;
        }

        /**
         * Définit la valeur de la propriété euclidean.
         * 
         * @param value
         *     allowed object is
         *     {@link Object }
         *     
         */
        public void setEuclidean(Object value) {
            this.euclidean = value;
        }

        /**
         * Obtient la valeur de la propriété manhattan.
         * 
         * @return
         *     possible object is
         *     {@link Object }
         *     
         */
        public Object getManhattan() {
            return manhattan;
        }

        /**
         * Définit la valeur de la propriété manhattan.
         * 
         * @param value
         *     allowed object is
         *     {@link Object }
         *     
         */
        public void setManhattan(Object value) {
            this.manhattan = value;
        }

        /**
         * Obtient la valeur de la propriété distanceCalculator.
         * 
         * @return
         *     possible object is
         *     {@link String }
         *     
         */
        public String getDistanceCalculator() {
            return distanceCalculator;
        }

        /**
         * Définit la valeur de la propriété distanceCalculator.
         * 
         * @param value
         *     allowed object is
         *     {@link String }
         *     
         */
        public void setDistanceCalculator(String value) {
            this.distanceCalculator = value;
        }

        /**
         * Obtient la valeur de la propriété ceil.
         * 
         * @return
         *     possible object is
         *     {@link Object }
         *     
         */
        public Object getCeil() {
            return ceil;
        }

        /**
         * Définit la valeur de la propriété ceil.
         * 
         * @param value
         *     allowed object is
         *     {@link Object }
         *     
         */
        public void setCeil(Object value) {
            this.ceil = value;
        }

        /**
         * Obtient la valeur de la propriété floor.
         * 
         * @return
         *     possible object is
         *     {@link Object }
         *     
         */
        public Object getFloor() {
            return floor;
        }

        /**
         * Définit la valeur de la propriété floor.
         * 
         * @param value
         *     allowed object is
         *     {@link Object }
         *     
         */
        public void setFloor(Object value) {
            this.floor = value;
        }

        /**
         * Obtient la valeur de la propriété decimals.
         * 
         * @return
         *     possible object is
         *     {@link Integer }
         *     
         */
        public Integer getDecimals() {
            return decimals;
        }

        /**
         * Définit la valeur de la propriété decimals.
         * 
         * @param value
         *     allowed object is
         *     {@link Integer }
         *     
         */
        public void setDecimals(Integer value) {
            this.decimals = value;
        }

        /**
         * Add your own lements to the network definition
         * 
         * @return
         *     possible object is
         *     {@link Custom }
         *     
         */
        public Custom getCustom() {
            return custom;
        }

        /**
         * Définit la valeur de la propriété custom.
         * 
         * @param value
         *     allowed object is
         *     {@link Custom }
         *     
         */
        public void setCustom(Custom value) {
            this.custom = value;
        }


        /**
         * <p>Classe Java pour anonymous complex type.
         * 
         * <p>Le fragment de schéma suivant indique le contenu attendu figurant dans cette classe.
         * 
         * <pre>
         * &lt;complexType>
         *   &lt;complexContent>
         *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
         *       &lt;sequence>
         *         &lt;element name="link" maxOccurs="unbounded">
         *           &lt;complexType>
         *             &lt;complexContent>
         *               &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
         *                 &lt;sequence>
         *                   &lt;element name="length" type="{http://www.w3.org/2001/XMLSchema}double" minOccurs="0"/>
         *                   &lt;choice minOccurs="0">
         *                     &lt;element name="travel_time" type="{}type_time"/>
         *                     &lt;element name="td_travel_time" maxOccurs="unbounded">
         *                       &lt;complexType>
         *                         &lt;complexContent>
         *                           &lt;extension base="{}type_tw">
         *                             &lt;sequence>
         *                               &lt;element ref="{}time"/>
         *                             &lt;/sequence>
         *                           &lt;/extension>
         *                         &lt;/complexContent>
         *                       &lt;/complexType>
         *                     &lt;/element>
         *                   &lt;/choice>
         *                   &lt;choice minOccurs="0">
         *                     &lt;element name="travel_cost" type="{}type_cost"/>
         *                     &lt;element name="td_trave_cost" maxOccurs="unbounded">
         *                       &lt;complexType>
         *                         &lt;complexContent>
         *                           &lt;extension base="{}type_tw">
         *                             &lt;sequence>
         *                               &lt;element ref="{}cost"/>
         *                             &lt;/sequence>
         *                           &lt;/extension>
         *                         &lt;/complexContent>
         *                       &lt;/complexType>
         *                     &lt;/element>
         *                   &lt;/choice>
         *                   &lt;element ref="{}custom" minOccurs="0"/>
         *                 &lt;/sequence>
         *                 &lt;attribute name="tail" use="required" type="{http://www.w3.org/2001/XMLSchema}integer" />
         *                 &lt;attribute name="head" use="required" type="{http://www.w3.org/2001/XMLSchema}integer" />
         *                 &lt;attribute name="id" type="{http://www.w3.org/2001/XMLSchema}integer" />
         *                 &lt;attribute name="directed" type="{http://www.w3.org/2001/XMLSchema}boolean" default="false" />
         *                 &lt;attribute name="type" type="{http://www.w3.org/2001/XMLSchema}integer" />
         *                 &lt;anyAttribute processContents='skip'/>
         *               &lt;/restriction>
         *             &lt;/complexContent>
         *           &lt;/complexType>
         *         &lt;/element>
         *       &lt;/sequence>
         *       &lt;attribute name="symmetric" use="required" type="{http://www.w3.org/2001/XMLSchema}boolean" />
         *     &lt;/restriction>
         *   &lt;/complexContent>
         * &lt;/complexType>
         * </pre>
         * 
         * 
         */
        @XmlAccessorType(XmlAccessType.FIELD)
        @XmlType(name = "", propOrder = {
            "link"
        })
        public static class Links {

            @XmlElement(required = true)
            protected List<Instance.Network.Links.Link> link;
            @XmlAttribute(name = "symmetric", required = true)
            protected boolean symmetric;

            /**
             * Gets the value of the link property.
             * 
             * <p>
             * This accessor method returns a reference to the live list,
             * not a snapshot. Therefore any modification you make to the
             * returned list will be present inside the JAXB object.
             * This is why there is not a <CODE>set</CODE> method for the link property.
             * 
             * <p>
             * For example, to add a new item, do as follows:
             * <pre>
             *    getLink().add(newItem);
             * </pre>
             * 
             * 
             * <p>
             * Objects of the following type(s) are allowed in the list
             * {@link Instance.Network.Links.Link }
             * 
             * 
             */
            public List<Instance.Network.Links.Link> getLink() {
                if (link == null) {
                    link = new ArrayList<Instance.Network.Links.Link>();
                }
                return this.link;
            }

            /**
             * Obtient la valeur de la propriété symmetric.
             * 
             */
            public boolean isSymmetric() {
                return symmetric;
            }

            /**
             * Définit la valeur de la propriété symmetric.
             * 
             */
            public void setSymmetric(boolean value) {
                this.symmetric = value;
            }


            /**
             * <p>Classe Java pour anonymous complex type.
             * 
             * <p>Le fragment de schéma suivant indique le contenu attendu figurant dans cette classe.
             * 
             * <pre>
             * &lt;complexType>
             *   &lt;complexContent>
             *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
             *       &lt;sequence>
             *         &lt;element name="length" type="{http://www.w3.org/2001/XMLSchema}double" minOccurs="0"/>
             *         &lt;choice minOccurs="0">
             *           &lt;element name="travel_time" type="{}type_time"/>
             *           &lt;element name="td_travel_time" maxOccurs="unbounded">
             *             &lt;complexType>
             *               &lt;complexContent>
             *                 &lt;extension base="{}type_tw">
             *                   &lt;sequence>
             *                     &lt;element ref="{}time"/>
             *                   &lt;/sequence>
             *                 &lt;/extension>
             *               &lt;/complexContent>
             *             &lt;/complexType>
             *           &lt;/element>
             *         &lt;/choice>
             *         &lt;choice minOccurs="0">
             *           &lt;element name="travel_cost" type="{}type_cost"/>
             *           &lt;element name="td_trave_cost" maxOccurs="unbounded">
             *             &lt;complexType>
             *               &lt;complexContent>
             *                 &lt;extension base="{}type_tw">
             *                   &lt;sequence>
             *                     &lt;element ref="{}cost"/>
             *                   &lt;/sequence>
             *                 &lt;/extension>
             *               &lt;/complexContent>
             *             &lt;/complexType>
             *           &lt;/element>
             *         &lt;/choice>
             *         &lt;element ref="{}custom" minOccurs="0"/>
             *       &lt;/sequence>
             *       &lt;attribute name="tail" use="required" type="{http://www.w3.org/2001/XMLSchema}integer" />
             *       &lt;attribute name="head" use="required" type="{http://www.w3.org/2001/XMLSchema}integer" />
             *       &lt;attribute name="id" type="{http://www.w3.org/2001/XMLSchema}integer" />
             *       &lt;attribute name="directed" type="{http://www.w3.org/2001/XMLSchema}boolean" default="false" />
             *       &lt;attribute name="type" type="{http://www.w3.org/2001/XMLSchema}integer" />
             *       &lt;anyAttribute processContents='skip'/>
             *     &lt;/restriction>
             *   &lt;/complexContent>
             * &lt;/complexType>
             * </pre>
             * 
             * 
             */
            @XmlAccessorType(XmlAccessType.FIELD)
            @XmlType(name = "", propOrder = {
                "length",
                "travelTime",
                "tdTravelTime",
                "travelCost",
                "tdTraveCost",
                "custom"
            })
            public static class Link {

                protected Double length;
                @XmlElement(name = "travel_time")
                protected TypeTime travelTime;
                @XmlElement(name = "td_travel_time")
                protected List<Instance.Network.Links.Link.TdTravelTime> tdTravelTime;
                @XmlElement(name = "travel_cost")
                protected TypeCost travelCost;
                @XmlElement(name = "td_trave_cost")
                protected List<Instance.Network.Links.Link.TdTraveCost> tdTraveCost;
                protected Custom custom;
                @XmlAttribute(name = "tail", required = true)
                protected BigInteger tail;
                @XmlAttribute(name = "head", required = true)
                protected BigInteger head;
                @XmlAttribute(name = "id")
                protected BigInteger id;
                @XmlAttribute(name = "directed")
                protected Boolean directed;
                @XmlAttribute(name = "type")
                protected BigInteger type;
                @XmlAnyAttribute
                private Map<QName, String> otherAttributes = new HashMap<QName, String>();

                /**
                 * Obtient la valeur de la propriété length.
                 * 
                 * @return
                 *     possible object is
                 *     {@link Double }
                 *     
                 */
                public Double getLength() {
                    return length;
                }

                /**
                 * Définit la valeur de la propriété length.
                 * 
                 * @param value
                 *     allowed object is
                 *     {@link Double }
                 *     
                 */
                public void setLength(Double value) {
                    this.length = value;
                }

                /**
                 * Obtient la valeur de la propriété travelTime.
                 * 
                 * @return
                 *     possible object is
                 *     {@link TypeTime }
                 *     
                 */
                public TypeTime getTravelTime() {
                    return travelTime;
                }

                /**
                 * Définit la valeur de la propriété travelTime.
                 * 
                 * @param value
                 *     allowed object is
                 *     {@link TypeTime }
                 *     
                 */
                public void setTravelTime(TypeTime value) {
                    this.travelTime = value;
                }

                /**
                 * Gets the value of the tdTravelTime property.
                 * 
                 * <p>
                 * This accessor method returns a reference to the live list,
                 * not a snapshot. Therefore any modification you make to the
                 * returned list will be present inside the JAXB object.
                 * This is why there is not a <CODE>set</CODE> method for the tdTravelTime property.
                 * 
                 * <p>
                 * For example, to add a new item, do as follows:
                 * <pre>
                 *    getTdTravelTime().add(newItem);
                 * </pre>
                 * 
                 * 
                 * <p>
                 * Objects of the following type(s) are allowed in the list
                 * {@link Instance.Network.Links.Link.TdTravelTime }
                 * 
                 * 
                 */
                public List<Instance.Network.Links.Link.TdTravelTime> getTdTravelTime() {
                    if (tdTravelTime == null) {
                        tdTravelTime = new ArrayList<Instance.Network.Links.Link.TdTravelTime>();
                    }
                    return this.tdTravelTime;
                }

                /**
                 * Obtient la valeur de la propriété travelCost.
                 * 
                 * @return
                 *     possible object is
                 *     {@link TypeCost }
                 *     
                 */
                public TypeCost getTravelCost() {
                    return travelCost;
                }

                /**
                 * Définit la valeur de la propriété travelCost.
                 * 
                 * @param value
                 *     allowed object is
                 *     {@link TypeCost }
                 *     
                 */
                public void setTravelCost(TypeCost value) {
                    this.travelCost = value;
                }

                /**
                 * Gets the value of the tdTraveCost property.
                 * 
                 * <p>
                 * This accessor method returns a reference to the live list,
                 * not a snapshot. Therefore any modification you make to the
                 * returned list will be present inside the JAXB object.
                 * This is why there is not a <CODE>set</CODE> method for the tdTraveCost property.
                 * 
                 * <p>
                 * For example, to add a new item, do as follows:
                 * <pre>
                 *    getTdTraveCost().add(newItem);
                 * </pre>
                 * 
                 * 
                 * <p>
                 * Objects of the following type(s) are allowed in the list
                 * {@link Instance.Network.Links.Link.TdTraveCost }
                 * 
                 * 
                 */
                public List<Instance.Network.Links.Link.TdTraveCost> getTdTraveCost() {
                    if (tdTraveCost == null) {
                        tdTraveCost = new ArrayList<Instance.Network.Links.Link.TdTraveCost>();
                    }
                    return this.tdTraveCost;
                }

                /**
                 * Models customizable elements. Use this element to add features not included in the datamodel
                 * 
                 * @return
                 *     possible object is
                 *     {@link Custom }
                 *     
                 */
                public Custom getCustom() {
                    return custom;
                }

                /**
                 * Définit la valeur de la propriété custom.
                 * 
                 * @param value
                 *     allowed object is
                 *     {@link Custom }
                 *     
                 */
                public void setCustom(Custom value) {
                    this.custom = value;
                }

                /**
                 * Obtient la valeur de la propriété tail.
                 * 
                 * @return
                 *     possible object is
                 *     {@link BigInteger }
                 *     
                 */
                public BigInteger getTail() {
                    return tail;
                }

                /**
                 * Définit la valeur de la propriété tail.
                 * 
                 * @param value
                 *     allowed object is
                 *     {@link BigInteger }
                 *     
                 */
                public void setTail(BigInteger value) {
                    this.tail = value;
                }

                /**
                 * Obtient la valeur de la propriété head.
                 * 
                 * @return
                 *     possible object is
                 *     {@link BigInteger }
                 *     
                 */
                public BigInteger getHead() {
                    return head;
                }

                /**
                 * Définit la valeur de la propriété head.
                 * 
                 * @param value
                 *     allowed object is
                 *     {@link BigInteger }
                 *     
                 */
                public void setHead(BigInteger value) {
                    this.head = value;
                }

                /**
                 * Obtient la valeur de la propriété id.
                 * 
                 * @return
                 *     possible object is
                 *     {@link BigInteger }
                 *     
                 */
                public BigInteger getId() {
                    return id;
                }

                /**
                 * Définit la valeur de la propriété id.
                 * 
                 * @param value
                 *     allowed object is
                 *     {@link BigInteger }
                 *     
                 */
                public void setId(BigInteger value) {
                    this.id = value;
                }

                /**
                 * Obtient la valeur de la propriété directed.
                 * 
                 * @return
                 *     possible object is
                 *     {@link Boolean }
                 *     
                 */
                public boolean isDirected() {
                    if (directed == null) {
                        return false;
                    } else {
                        return directed;
                    }
                }

                /**
                 * Définit la valeur de la propriété directed.
                 * 
                 * @param value
                 *     allowed object is
                 *     {@link Boolean }
                 *     
                 */
                public void setDirected(Boolean value) {
                    this.directed = value;
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

                /**
                 * Gets a map that contains attributes that aren't bound to any typed property on this class.
                 * 
                 * <p>
                 * the map is keyed by the name of the attribute and 
                 * the value is the string value of the attribute.
                 * 
                 * the map returned by this method is live, and you can add new attribute
                 * by updating the map directly. Because of this design, there's no setter.
                 * 
                 * 
                 * @return
                 *     always non-null
                 */
                public Map<QName, String> getOtherAttributes() {
                    return otherAttributes;
                }


                /**
                 * <p>Classe Java pour anonymous complex type.
                 * 
                 * <p>Le fragment de schéma suivant indique le contenu attendu figurant dans cette classe.
                 * 
                 * <pre>
                 * &lt;complexType>
                 *   &lt;complexContent>
                 *     &lt;extension base="{}type_tw">
                 *       &lt;sequence>
                 *         &lt;element ref="{}cost"/>
                 *       &lt;/sequence>
                 *     &lt;/extension>
                 *   &lt;/complexContent>
                 * &lt;/complexType>
                 * </pre>
                 * 
                 * 
                 */
                @XmlAccessorType(XmlAccessType.FIELD)
                @XmlType(name = "", propOrder = {
                    "cost"
                })
                public static class TdTraveCost
                    extends TypeTw
                {

                    @XmlElement(required = true)
                    protected Cost cost;

                    /**
                     * The travel time
                     * 
                     * @return
                     *     possible object is
                     *     {@link Cost }
                     *     
                     */
                    public Cost getCost() {
                        return cost;
                    }

                    /**
                     * Définit la valeur de la propriété cost.
                     * 
                     * @param value
                     *     allowed object is
                     *     {@link Cost }
                     *     
                     */
                    public void setCost(Cost value) {
                        this.cost = value;
                    }

                }


                /**
                 * <p>Classe Java pour anonymous complex type.
                 * 
                 * <p>Le fragment de schéma suivant indique le contenu attendu figurant dans cette classe.
                 * 
                 * <pre>
                 * &lt;complexType>
                 *   &lt;complexContent>
                 *     &lt;extension base="{}type_tw">
                 *       &lt;sequence>
                 *         &lt;element ref="{}time"/>
                 *       &lt;/sequence>
                 *     &lt;/extension>
                 *   &lt;/complexContent>
                 * &lt;/complexType>
                 * </pre>
                 * 
                 * 
                 */
                @XmlAccessorType(XmlAccessType.FIELD)
                @XmlType(name = "", propOrder = {
                    "time"
                })
                public static class TdTravelTime
                    extends TypeTw
                {

                    @XmlElement(required = true)
                    protected Time time;

                    /**
                     * The travel time
                     * 
                     * @return
                     *     possible object is
                     *     {@link Time }
                     *     
                     */
                    public Time getTime() {
                        return time;
                    }

                    /**
                     * Définit la valeur de la propriété time.
                     * 
                     * @param value
                     *     allowed object is
                     *     {@link Time }
                     *     
                     */
                    public void setTime(Time value) {
                        this.time = value;
                    }

                }

            }

        }


        /**
         * <p>Classe Java pour anonymous complex type.
         * 
         * <p>Le fragment de schéma suivant indique le contenu attendu figurant dans cette classe.
         * 
         * <pre>
         * &lt;complexType>
         *   &lt;complexContent>
         *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
         *       &lt;sequence>
         *         &lt;element name="node" maxOccurs="unbounded" minOccurs="2">
         *           &lt;complexType>
         *             &lt;complexContent>
         *               &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
         *                 &lt;sequence>
         *                   &lt;choice minOccurs="0">
         *                     &lt;sequence>
         *                       &lt;element name="cx" type="{http://www.w3.org/2001/XMLSchema}double"/>
         *                       &lt;element name="cy" type="{http://www.w3.org/2001/XMLSchema}double"/>
         *                       &lt;element name="cz" type="{http://www.w3.org/2001/XMLSchema}double" minOccurs="0"/>
         *                     &lt;/sequence>
         *                     &lt;sequence>
         *                       &lt;element name="latitude" type="{http://www.w3.org/2001/XMLSchema}double"/>
         *                       &lt;element name="longitude" type="{http://www.w3.org/2001/XMLSchema}double"/>
         *                     &lt;/sequence>
         *                   &lt;/choice>
         *                   &lt;element name="compatible_vehicle" type="{http://www.w3.org/2001/XMLSchema}int" maxOccurs="unbounded" minOccurs="0"/>
         *                   &lt;element ref="{}custom" minOccurs="0"/>
         *                 &lt;/sequence>
         *                 &lt;attribute name="id" use="required" type="{http://www.w3.org/2001/XMLSchema}integer" />
         *                 &lt;attribute name="type" use="required" type="{http://www.w3.org/2001/XMLSchema}integer" />
         *                 &lt;anyAttribute processContents='skip'/>
         *               &lt;/restriction>
         *             &lt;/complexContent>
         *           &lt;/complexType>
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
            "node"
        })
        public static class Nodes {

            @XmlElement(required = true)
            protected List<Instance.Network.Nodes.Node> node;

            /**
             * Gets the value of the node property.
             * 
             * <p>
             * This accessor method returns a reference to the live list,
             * not a snapshot. Therefore any modification you make to the
             * returned list will be present inside the JAXB object.
             * This is why there is not a <CODE>set</CODE> method for the node property.
             * 
             * <p>
             * For example, to add a new item, do as follows:
             * <pre>
             *    getNode().add(newItem);
             * </pre>
             * 
             * 
             * <p>
             * Objects of the following type(s) are allowed in the list
             * {@link Instance.Network.Nodes.Node }
             * 
             * 
             */
            public List<Instance.Network.Nodes.Node> getNode() {
                if (node == null) {
                    node = new ArrayList<Instance.Network.Nodes.Node>();
                }
                return this.node;
            }


            /**
             * <p>Classe Java pour anonymous complex type.
             * 
             * <p>Le fragment de schéma suivant indique le contenu attendu figurant dans cette classe.
             * 
             * <pre>
             * &lt;complexType>
             *   &lt;complexContent>
             *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
             *       &lt;sequence>
             *         &lt;choice minOccurs="0">
             *           &lt;sequence>
             *             &lt;element name="cx" type="{http://www.w3.org/2001/XMLSchema}double"/>
             *             &lt;element name="cy" type="{http://www.w3.org/2001/XMLSchema}double"/>
             *             &lt;element name="cz" type="{http://www.w3.org/2001/XMLSchema}double" minOccurs="0"/>
             *           &lt;/sequence>
             *           &lt;sequence>
             *             &lt;element name="latitude" type="{http://www.w3.org/2001/XMLSchema}double"/>
             *             &lt;element name="longitude" type="{http://www.w3.org/2001/XMLSchema}double"/>
             *           &lt;/sequence>
             *         &lt;/choice>
             *         &lt;element name="compatible_vehicle" type="{http://www.w3.org/2001/XMLSchema}int" maxOccurs="unbounded" minOccurs="0"/>
             *         &lt;element ref="{}custom" minOccurs="0"/>
             *       &lt;/sequence>
             *       &lt;attribute name="id" use="required" type="{http://www.w3.org/2001/XMLSchema}integer" />
             *       &lt;attribute name="type" use="required" type="{http://www.w3.org/2001/XMLSchema}integer" />
             *       &lt;anyAttribute processContents='skip'/>
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
                "longitude",
                "compatibleVehicle",
                "custom"
            })
            public static class Node {

                protected Double cx;
                protected Double cy;
                protected Double cz;
                protected Double latitude;
                protected Double longitude;
                @XmlElement(name = "compatible_vehicle", type = Integer.class)
                protected List<Integer> compatibleVehicle;
                protected Custom custom;
                @XmlAttribute(name = "id", required = true)
                protected BigInteger id;
                @XmlAttribute(name = "type", required = true)
                protected BigInteger type;
                @XmlAnyAttribute
                private Map<QName, String> otherAttributes = new HashMap<QName, String>();

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

                /**
                 * Gets the value of the compatibleVehicle property.
                 * 
                 * <p>
                 * This accessor method returns a reference to the live list,
                 * not a snapshot. Therefore any modification you make to the
                 * returned list will be present inside the JAXB object.
                 * This is why there is not a <CODE>set</CODE> method for the compatibleVehicle property.
                 * 
                 * <p>
                 * For example, to add a new item, do as follows:
                 * <pre>
                 *    getCompatibleVehicle().add(newItem);
                 * </pre>
                 * 
                 * 
                 * <p>
                 * Objects of the following type(s) are allowed in the list
                 * {@link Integer }
                 * 
                 * 
                 */
                public List<Integer> getCompatibleVehicle() {
                    if (compatibleVehicle == null) {
                        compatibleVehicle = new ArrayList<Integer>();
                    }
                    return this.compatibleVehicle;
                }

                /**
                 * Obtient la valeur de la propriété custom.
                 * 
                 * @return
                 *     possible object is
                 *     {@link Custom }
                 *     
                 */
                public Custom getCustom() {
                    return custom;
                }

                /**
                 * Définit la valeur de la propriété custom.
                 * 
                 * @param value
                 *     allowed object is
                 *     {@link Custom }
                 *     
                 */
                public void setCustom(Custom value) {
                    this.custom = value;
                }

                /**
                 * Obtient la valeur de la propriété id.
                 * 
                 * @return
                 *     possible object is
                 *     {@link BigInteger }
                 *     
                 */
                public BigInteger getId() {
                    return id;
                }

                /**
                 * Définit la valeur de la propriété id.
                 * 
                 * @param value
                 *     allowed object is
                 *     {@link BigInteger }
                 *     
                 */
                public void setId(BigInteger value) {
                    this.id = value;
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

                /**
                 * Gets a map that contains attributes that aren't bound to any typed property on this class.
                 * 
                 * <p>
                 * the map is keyed by the name of the attribute and 
                 * the value is the string value of the attribute.
                 * 
                 * the map returned by this method is live, and you can add new attribute
                 * by updating the map directly. Because of this design, there's no setter.
                 * 
                 * 
                 * @return
                 *     always non-null
                 */
                public Map<QName, String> getOtherAttributes() {
                    return otherAttributes;
                }

            }

        }

    }


    /**
     * <p>Classe Java pour anonymous complex type.
     * 
     * <p>Le fragment de schéma suivant indique le contenu attendu figurant dans cette classe.
     * 
     * <pre>
     * &lt;complexType>
     *   &lt;complexContent>
     *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
     *       &lt;sequence>
     *         &lt;element name="request" maxOccurs="unbounded">
     *           &lt;complexType>
     *             &lt;complexContent>
     *               &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
     *                 &lt;sequence>
     *                   &lt;element ref="{}tw" maxOccurs="unbounded" minOccurs="0"/>
     *                   &lt;element ref="{}demand" maxOccurs="unbounded" minOccurs="0"/>
     *                   &lt;element name="prize" type="{http://www.w3.org/2001/XMLSchema}integer" minOccurs="0"/>
     *                   &lt;element ref="{}cost" maxOccurs="unbounded" minOccurs="0"/>
     *                   &lt;element name="release_date" type="{http://www.w3.org/2001/XMLSchema}double" minOccurs="0"/>
     *                   &lt;element name="service_time" type="{}type_time" minOccurs="0"/>
     *                   &lt;element name="predecessors" minOccurs="0">
     *                     &lt;complexType>
     *                       &lt;complexContent>
     *                         &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
     *                           &lt;sequence>
     *                             &lt;element name="request" type="{http://www.w3.org/2001/XMLSchema}integer" maxOccurs="unbounded"/>
     *                           &lt;/sequence>
     *                         &lt;/restriction>
     *                       &lt;/complexContent>
     *                     &lt;/complexType>
     *                   &lt;/element>
     *                   &lt;element name="successors" minOccurs="0">
     *                     &lt;complexType>
     *                       &lt;complexContent>
     *                         &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
     *                           &lt;sequence>
     *                             &lt;element name="request" type="{http://www.w3.org/2001/XMLSchema}integer" maxOccurs="unbounded"/>
     *                           &lt;/sequence>
     *                         &lt;/restriction>
     *                       &lt;/complexContent>
     *                     &lt;/complexType>
     *                   &lt;/element>
     *                   &lt;element name="skill" type="{http://www.w3.org/2001/XMLSchema}int" maxOccurs="unbounded" minOccurs="0"/>
     *                   &lt;element name="resource" maxOccurs="unbounded" minOccurs="0">
     *                     &lt;complexType>
     *                       &lt;simpleContent>
     *                         &lt;extension base="&lt;http://www.w3.org/2001/XMLSchema>double">
     *                           &lt;attribute name="resource_id" use="required" type="{http://www.w3.org/2001/XMLSchema}int" />
     *                         &lt;/extension>
     *                       &lt;/simpleContent>
     *                     &lt;/complexType>
     *                   &lt;/element>
     *                   &lt;element ref="{}custom" minOccurs="0"/>
     *                 &lt;/sequence>
     *                 &lt;attribute name="id" use="required" type="{http://www.w3.org/2001/XMLSchema}integer" />
     *                 &lt;attribute name="type" type="{http://www.w3.org/2001/XMLSchema}integer" />
     *                 &lt;attribute name="node" type="{http://www.w3.org/2001/XMLSchema}integer" />
     *                 &lt;attribute name="link" type="{http://www.w3.org/2001/XMLSchema}integer" />
     *               &lt;/restriction>
     *             &lt;/complexContent>
     *           &lt;/complexType>
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
        "request"
    })
    public static class Requests {

        @XmlElement(required = true)
        protected List<Instance.Requests.Request> request;

        /**
         * Gets the value of the request property.
         * 
         * <p>
         * This accessor method returns a reference to the live list,
         * not a snapshot. Therefore any modification you make to the
         * returned list will be present inside the JAXB object.
         * This is why there is not a <CODE>set</CODE> method for the request property.
         * 
         * <p>
         * For example, to add a new item, do as follows:
         * <pre>
         *    getRequest().add(newItem);
         * </pre>
         * 
         * 
         * <p>
         * Objects of the following type(s) are allowed in the list
         * {@link Instance.Requests.Request }
         * 
         * 
         */
        public List<Instance.Requests.Request> getRequest() {
            if (request == null) {
                request = new ArrayList<Instance.Requests.Request>();
            }
            return this.request;
        }


        /**
         * <p>Classe Java pour anonymous complex type.
         * 
         * <p>Le fragment de schéma suivant indique le contenu attendu figurant dans cette classe.
         * 
         * <pre>
         * &lt;complexType>
         *   &lt;complexContent>
         *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
         *       &lt;sequence>
         *         &lt;element ref="{}tw" maxOccurs="unbounded" minOccurs="0"/>
         *         &lt;element ref="{}demand" maxOccurs="unbounded" minOccurs="0"/>
         *         &lt;element name="prize" type="{http://www.w3.org/2001/XMLSchema}integer" minOccurs="0"/>
         *         &lt;element ref="{}cost" maxOccurs="unbounded" minOccurs="0"/>
         *         &lt;element name="release_date" type="{http://www.w3.org/2001/XMLSchema}double" minOccurs="0"/>
         *         &lt;element name="service_time" type="{}type_time" minOccurs="0"/>
         *         &lt;element name="predecessors" minOccurs="0">
         *           &lt;complexType>
         *             &lt;complexContent>
         *               &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
         *                 &lt;sequence>
         *                   &lt;element name="request" type="{http://www.w3.org/2001/XMLSchema}integer" maxOccurs="unbounded"/>
         *                 &lt;/sequence>
         *               &lt;/restriction>
         *             &lt;/complexContent>
         *           &lt;/complexType>
         *         &lt;/element>
         *         &lt;element name="successors" minOccurs="0">
         *           &lt;complexType>
         *             &lt;complexContent>
         *               &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
         *                 &lt;sequence>
         *                   &lt;element name="request" type="{http://www.w3.org/2001/XMLSchema}integer" maxOccurs="unbounded"/>
         *                 &lt;/sequence>
         *               &lt;/restriction>
         *             &lt;/complexContent>
         *           &lt;/complexType>
         *         &lt;/element>
         *         &lt;element name="skill" type="{http://www.w3.org/2001/XMLSchema}int" maxOccurs="unbounded" minOccurs="0"/>
         *         &lt;element name="resource" maxOccurs="unbounded" minOccurs="0">
         *           &lt;complexType>
         *             &lt;simpleContent>
         *               &lt;extension base="&lt;http://www.w3.org/2001/XMLSchema>double">
         *                 &lt;attribute name="resource_id" use="required" type="{http://www.w3.org/2001/XMLSchema}int" />
         *               &lt;/extension>
         *             &lt;/simpleContent>
         *           &lt;/complexType>
         *         &lt;/element>
         *         &lt;element ref="{}custom" minOccurs="0"/>
         *       &lt;/sequence>
         *       &lt;attribute name="id" use="required" type="{http://www.w3.org/2001/XMLSchema}integer" />
         *       &lt;attribute name="type" type="{http://www.w3.org/2001/XMLSchema}integer" />
         *       &lt;attribute name="node" type="{http://www.w3.org/2001/XMLSchema}integer" />
         *       &lt;attribute name="link" type="{http://www.w3.org/2001/XMLSchema}integer" />
         *     &lt;/restriction>
         *   &lt;/complexContent>
         * &lt;/complexType>
         * </pre>
         * 
         * 
         */
        @XmlAccessorType(XmlAccessType.FIELD)
        @XmlType(name = "", propOrder = {
            "tw",
            "demand",
            "prize",
            "cost",
            "releaseDate",
            "serviceTime",
            "predecessors",
            "successors",
            "skill",
            "resource",
            "custom"
        })
        public static class Request {

            protected List<Tw> tw;
            protected List<Demand> demand;
            protected BigInteger prize;
            protected List<Cost> cost;
            @XmlElement(name = "release_date")
            protected Double releaseDate;
            @XmlElement(name = "service_time")
            protected TypeTime serviceTime;
            protected Instance.Requests.Request.Predecessors predecessors;
            protected Instance.Requests.Request.Successors successors;
            @XmlElement(type = Integer.class)
            protected List<Integer> skill;
            protected List<Instance.Requests.Request.Resource> resource;
            protected Custom custom;
            @XmlAttribute(name = "id", required = true)
            protected BigInteger id;
            @XmlAttribute(name = "type")
            protected BigInteger type;
            @XmlAttribute(name = "node")
            protected BigInteger node;
            @XmlAttribute(name = "link")
            protected BigInteger link;

            /**
             * Model request time windows (e.g., VRPTW) Gets the value of the tw property.
             * 
             * <p>
             * This accessor method returns a reference to the live list,
             * not a snapshot. Therefore any modification you make to the
             * returned list will be present inside the JAXB object.
             * This is why there is not a <CODE>set</CODE> method for the tw property.
             * 
             * <p>
             * For example, to add a new item, do as follows:
             * <pre>
             *    getTw().add(newItem);
             * </pre>
             * 
             * 
             * <p>
             * Objects of the following type(s) are allowed in the list
             * {@link Tw }
             * 
             * 
             */
            public List<Tw> getTw() {
                if (tw == null) {
                    tw = new ArrayList<Tw>();
                }
                return this.tw;
            }

            /**
             * Model a customer demands (e.g., CVRP) Gets the value of the demand property.
             * 
             * <p>
             * This accessor method returns a reference to the live list,
             * not a snapshot. Therefore any modification you make to the
             * returned list will be present inside the JAXB object.
             * This is why there is not a <CODE>set</CODE> method for the demand property.
             * 
             * <p>
             * For example, to add a new item, do as follows:
             * <pre>
             *    getDemand().add(newItem);
             * </pre>
             * 
             * 
             * <p>
             * Objects of the following type(s) are allowed in the list
             * {@link Demand }
             * 
             * 
             */
            public List<Demand> getDemand() {
                if (demand == null) {
                    demand = new ArrayList<Demand>();
                }
                return this.demand;
            }

            /**
             * Obtient la valeur de la propriété prize.
             * 
             * @return
             *     possible object is
             *     {@link BigInteger }
             *     
             */
            public BigInteger getPrize() {
                return prize;
            }

            /**
             * Définit la valeur de la propriété prize.
             * 
             * @param value
             *     allowed object is
             *     {@link BigInteger }
             *     
             */
            public void setPrize(BigInteger value) {
                this.prize = value;
            }

            /**
             * The costs of servicing the request (e.g., the outsourcing cost in the VRPPC) Gets the value of the cost property.
             * 
             * <p>
             * This accessor method returns a reference to the live list,
             * not a snapshot. Therefore any modification you make to the
             * returned list will be present inside the JAXB object.
             * This is why there is not a <CODE>set</CODE> method for the cost property.
             * 
             * <p>
             * For example, to add a new item, do as follows:
             * <pre>
             *    getCost().add(newItem);
             * </pre>
             * 
             * 
             * <p>
             * Objects of the following type(s) are allowed in the list
             * {@link Cost }
             * 
             * 
             */
            public List<Cost> getCost() {
                if (cost == null) {
                    cost = new ArrayList<Cost>();
                }
                return this.cost;
            }

            /**
             * Obtient la valeur de la propriété releaseDate.
             * 
             * @return
             *     possible object is
             *     {@link Double }
             *     
             */
            public Double getReleaseDate() {
                return releaseDate;
            }

            /**
             * Définit la valeur de la propriété releaseDate.
             * 
             * @param value
             *     allowed object is
             *     {@link Double }
             *     
             */
            public void setReleaseDate(Double value) {
                this.releaseDate = value;
            }

            /**
             * Obtient la valeur de la propriété serviceTime.
             * 
             * @return
             *     possible object is
             *     {@link TypeTime }
             *     
             */
            public TypeTime getServiceTime() {
                return serviceTime;
            }

            /**
             * Définit la valeur de la propriété serviceTime.
             * 
             * @param value
             *     allowed object is
             *     {@link TypeTime }
             *     
             */
            public void setServiceTime(TypeTime value) {
                this.serviceTime = value;
            }

            /**
             * Obtient la valeur de la propriété predecessors.
             * 
             * @return
             *     possible object is
             *     {@link Instance.Requests.Request.Predecessors }
             *     
             */
            public Instance.Requests.Request.Predecessors getPredecessors() {
                return predecessors;
            }

            /**
             * Définit la valeur de la propriété predecessors.
             * 
             * @param value
             *     allowed object is
             *     {@link Instance.Requests.Request.Predecessors }
             *     
             */
            public void setPredecessors(Instance.Requests.Request.Predecessors value) {
                this.predecessors = value;
            }

            /**
             * Obtient la valeur de la propriété successors.
             * 
             * @return
             *     possible object is
             *     {@link Instance.Requests.Request.Successors }
             *     
             */
            public Instance.Requests.Request.Successors getSuccessors() {
                return successors;
            }

            /**
             * Définit la valeur de la propriété successors.
             * 
             * @param value
             *     allowed object is
             *     {@link Instance.Requests.Request.Successors }
             *     
             */
            public void setSuccessors(Instance.Requests.Request.Successors value) {
                this.successors = value;
            }

            /**
             * Gets the value of the skill property.
             * 
             * <p>
             * This accessor method returns a reference to the live list,
             * not a snapshot. Therefore any modification you make to the
             * returned list will be present inside the JAXB object.
             * This is why there is not a <CODE>set</CODE> method for the skill property.
             * 
             * <p>
             * For example, to add a new item, do as follows:
             * <pre>
             *    getSkill().add(newItem);
             * </pre>
             * 
             * 
             * <p>
             * Objects of the following type(s) are allowed in the list
             * {@link Integer }
             * 
             * 
             */
            public List<Integer> getSkill() {
                if (skill == null) {
                    skill = new ArrayList<Integer>();
                }
                return this.skill;
            }

            /**
             * Gets the value of the resource property.
             * 
             * <p>
             * This accessor method returns a reference to the live list,
             * not a snapshot. Therefore any modification you make to the
             * returned list will be present inside the JAXB object.
             * This is why there is not a <CODE>set</CODE> method for the resource property.
             * 
             * <p>
             * For example, to add a new item, do as follows:
             * <pre>
             *    getResource().add(newItem);
             * </pre>
             * 
             * 
             * <p>
             * Objects of the following type(s) are allowed in the list
             * {@link Instance.Requests.Request.Resource }
             * 
             * 
             */
            public List<Instance.Requests.Request.Resource> getResource() {
                if (resource == null) {
                    resource = new ArrayList<Instance.Requests.Request.Resource>();
                }
                return this.resource;
            }

            /**
             * Obtient la valeur de la propriété custom.
             * 
             * @return
             *     possible object is
             *     {@link Custom }
             *     
             */
            public Custom getCustom() {
                return custom;
            }

            /**
             * Définit la valeur de la propriété custom.
             * 
             * @param value
             *     allowed object is
             *     {@link Custom }
             *     
             */
            public void setCustom(Custom value) {
                this.custom = value;
            }

            /**
             * Obtient la valeur de la propriété id.
             * 
             * @return
             *     possible object is
             *     {@link BigInteger }
             *     
             */
            public BigInteger getId() {
                return id;
            }

            /**
             * Définit la valeur de la propriété id.
             * 
             * @param value
             *     allowed object is
             *     {@link BigInteger }
             *     
             */
            public void setId(BigInteger value) {
                this.id = value;
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

            /**
             * Obtient la valeur de la propriété node.
             * 
             * @return
             *     possible object is
             *     {@link BigInteger }
             *     
             */
            public BigInteger getNode() {
                return node;
            }

            /**
             * Définit la valeur de la propriété node.
             * 
             * @param value
             *     allowed object is
             *     {@link BigInteger }
             *     
             */
            public void setNode(BigInteger value) {
                this.node = value;
            }

            /**
             * Obtient la valeur de la propriété link.
             * 
             * @return
             *     possible object is
             *     {@link BigInteger }
             *     
             */
            public BigInteger getLink() {
                return link;
            }

            /**
             * Définit la valeur de la propriété link.
             * 
             * @param value
             *     allowed object is
             *     {@link BigInteger }
             *     
             */
            public void setLink(BigInteger value) {
                this.link = value;
            }


            /**
             * <p>Classe Java pour anonymous complex type.
             * 
             * <p>Le fragment de schéma suivant indique le contenu attendu figurant dans cette classe.
             * 
             * <pre>
             * &lt;complexType>
             *   &lt;complexContent>
             *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
             *       &lt;sequence>
             *         &lt;element name="request" type="{http://www.w3.org/2001/XMLSchema}integer" maxOccurs="unbounded"/>
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
                "request"
            })
            public static class Predecessors {

                @XmlElement(required = true)
                protected List<BigInteger> request;

                /**
                 * Gets the value of the request property.
                 * 
                 * <p>
                 * This accessor method returns a reference to the live list,
                 * not a snapshot. Therefore any modification you make to the
                 * returned list will be present inside the JAXB object.
                 * This is why there is not a <CODE>set</CODE> method for the request property.
                 * 
                 * <p>
                 * For example, to add a new item, do as follows:
                 * <pre>
                 *    getRequest().add(newItem);
                 * </pre>
                 * 
                 * 
                 * <p>
                 * Objects of the following type(s) are allowed in the list
                 * {@link BigInteger }
                 * 
                 * 
                 */
                public List<BigInteger> getRequest() {
                    if (request == null) {
                        request = new ArrayList<BigInteger>();
                    }
                    return this.request;
                }

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
             *       &lt;attribute name="resource_id" use="required" type="{http://www.w3.org/2001/XMLSchema}int" />
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
            public static class Resource {

                @XmlValue
                protected double value;
                @XmlAttribute(name = "resource_id", required = true)
                protected int resourceId;

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
                 * Obtient la valeur de la propriété resourceId.
                 * 
                 */
                public int getResourceId() {
                    return resourceId;
                }

                /**
                 * Définit la valeur de la propriété resourceId.
                 * 
                 */
                public void setResourceId(int value) {
                    this.resourceId = value;
                }

            }


            /**
             * <p>Classe Java pour anonymous complex type.
             * 
             * <p>Le fragment de schéma suivant indique le contenu attendu figurant dans cette classe.
             * 
             * <pre>
             * &lt;complexType>
             *   &lt;complexContent>
             *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
             *       &lt;sequence>
             *         &lt;element name="request" type="{http://www.w3.org/2001/XMLSchema}integer" maxOccurs="unbounded"/>
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
                "request"
            })
            public static class Successors {

                @XmlElement(required = true)
                protected List<BigInteger> request;

                /**
                 * Gets the value of the request property.
                 * 
                 * <p>
                 * This accessor method returns a reference to the live list,
                 * not a snapshot. Therefore any modification you make to the
                 * returned list will be present inside the JAXB object.
                 * This is why there is not a <CODE>set</CODE> method for the request property.
                 * 
                 * <p>
                 * For example, to add a new item, do as follows:
                 * <pre>
                 *    getRequest().add(newItem);
                 * </pre>
                 * 
                 * 
                 * <p>
                 * Objects of the following type(s) are allowed in the list
                 * {@link BigInteger }
                 * 
                 * 
                 */
                public List<BigInteger> getRequest() {
                    if (request == null) {
                        request = new ArrayList<BigInteger>();
                    }
                    return this.request;
                }

            }

        }

    }


    /**
     * <p>Classe Java pour anonymous complex type.
     * 
     * <p>Le fragment de schéma suivant indique le contenu attendu figurant dans cette classe.
     * 
     * <pre>
     * &lt;complexType>
     *   &lt;complexContent>
     *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
     *       &lt;sequence>
     *         &lt;element name="resource" maxOccurs="unbounded">
     *           &lt;complexType>
     *             &lt;complexContent>
     *               &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
     *                 &lt;sequence>
     *                   &lt;element name="descriptor" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
     *                 &lt;/sequence>
     *                 &lt;attribute name="id" use="required" type="{http://www.w3.org/2001/XMLSchema}integer" />
     *                 &lt;anyAttribute processContents='skip'/>
     *               &lt;/restriction>
     *             &lt;/complexContent>
     *           &lt;/complexType>
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
        "resource"
    })
    public static class Resources {

        @XmlElement(required = true)
        protected List<Instance.Resources.Resource> resource;

        /**
         * Gets the value of the resource property.
         * 
         * <p>
         * This accessor method returns a reference to the live list,
         * not a snapshot. Therefore any modification you make to the
         * returned list will be present inside the JAXB object.
         * This is why there is not a <CODE>set</CODE> method for the resource property.
         * 
         * <p>
         * For example, to add a new item, do as follows:
         * <pre>
         *    getResource().add(newItem);
         * </pre>
         * 
         * 
         * <p>
         * Objects of the following type(s) are allowed in the list
         * {@link Instance.Resources.Resource }
         * 
         * 
         */
        public List<Instance.Resources.Resource> getResource() {
            if (resource == null) {
                resource = new ArrayList<Instance.Resources.Resource>();
            }
            return this.resource;
        }


        /**
         * <p>Classe Java pour anonymous complex type.
         * 
         * <p>Le fragment de schéma suivant indique le contenu attendu figurant dans cette classe.
         * 
         * <pre>
         * &lt;complexType>
         *   &lt;complexContent>
         *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
         *       &lt;sequence>
         *         &lt;element name="descriptor" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
         *       &lt;/sequence>
         *       &lt;attribute name="id" use="required" type="{http://www.w3.org/2001/XMLSchema}integer" />
         *       &lt;anyAttribute processContents='skip'/>
         *     &lt;/restriction>
         *   &lt;/complexContent>
         * &lt;/complexType>
         * </pre>
         * 
         * 
         */
        @XmlAccessorType(XmlAccessType.FIELD)
        @XmlType(name = "", propOrder = {
            "content"
        })
        public static class Resource {

            @XmlElementRef(name = "descriptor", type = JAXBElement.class, required = false)
            @XmlMixed
            protected List<Serializable> content;
            @XmlAttribute(name = "id", required = true)
            protected BigInteger id;
            @XmlAnyAttribute
            private Map<QName, String> otherAttributes = new HashMap<QName, String>();

            /**
             * Gets the value of the content property.
             * 
             * <p>
             * This accessor method returns a reference to the live list,
             * not a snapshot. Therefore any modification you make to the
             * returned list will be present inside the JAXB object.
             * This is why there is not a <CODE>set</CODE> method for the content property.
             * 
             * <p>
             * For example, to add a new item, do as follows:
             * <pre>
             *    getContent().add(newItem);
             * </pre>
             * 
             * 
             * <p>
             * Objects of the following type(s) are allowed in the list
             * {@link JAXBElement }{@code <}{@link String }{@code >}
             * {@link String }
             * 
             * 
             */
            public List<Serializable> getContent() {
                if (content == null) {
                    content = new ArrayList<Serializable>();
                }
                return this.content;
            }

            /**
             * Obtient la valeur de la propriété id.
             * 
             * @return
             *     possible object is
             *     {@link BigInteger }
             *     
             */
            public BigInteger getId() {
                return id;
            }

            /**
             * Définit la valeur de la propriété id.
             * 
             * @param value
             *     allowed object is
             *     {@link BigInteger }
             *     
             */
            public void setId(BigInteger value) {
                this.id = value;
            }

            /**
             * Gets a map that contains attributes that aren't bound to any typed property on this class.
             * 
             * <p>
             * the map is keyed by the name of the attribute and 
             * the value is the string value of the attribute.
             * 
             * the map returned by this method is live, and you can add new attribute
             * by updating the map directly. Because of this design, there's no setter.
             * 
             * 
             * @return
             *     always non-null
             */
            public Map<QName, String> getOtherAttributes() {
                return otherAttributes;
            }

        }

    }

}
