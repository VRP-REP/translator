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
import javax.xml.bind.annotation.XmlAnyElement;
import javax.xml.bind.annotation.XmlAttribute;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlRootElement;
import javax.xml.bind.annotation.XmlSchemaType;
import javax.xml.bind.annotation.XmlType;
import javax.xml.bind.annotation.XmlValue;
import org.w3c.dom.Element;


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
 *                   &lt;element name="descriptor" minOccurs="0">
 *                     &lt;complexType>
 *                       &lt;complexContent>
 *                         &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *                           &lt;sequence>
 *                             &lt;any processContents='skip' maxOccurs="unbounded"/>
 *                           &lt;/sequence>
 *                         &lt;/restriction>
 *                       &lt;/complexContent>
 *                     &lt;/complexType>
 *                   &lt;/element>
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
 *                                     &lt;/sequence>
 *                                     &lt;attribute name="id" use="required" type="{http://www.w3.org/2001/XMLSchema}integer" />
 *                                     &lt;attribute name="type" use="required" type="{http://www.w3.org/2001/XMLSchema}integer" />
 *                                     &lt;attribute name="trailer" type="{http://www.w3.org/2001/XMLSchema}boolean" />
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
 *                                         &lt;element name="length" type="{}positive_double" minOccurs="0"/>
 *                                         &lt;choice minOccurs="0">
 *                                           &lt;element name="travel_time" type="{}positive_double"/>
 *                                           &lt;element name="td_travel_time" type="{}time_dependent_parameter_type" maxOccurs="unbounded"/>
 *                                           &lt;element name="uncertain_travel_time" type="{}uncertain_parameter_type"/>
 *                                         &lt;/choice>
 *                                         &lt;choice minOccurs="0">
 *                                           &lt;element name="travel_cost" type="{}positive_double"/>
 *                                           &lt;element name="td_travel_cost" type="{}time_dependent_parameter_type" maxOccurs="unbounded"/>
 *                                           &lt;element name="uncertain_travel_cost" type="{}uncertain_parameter_type"/>
 *                                         &lt;/choice>
 *                                         &lt;element ref="{}tw" maxOccurs="unbounded" minOccurs="0"/>
 *                                       &lt;/sequence>
 *                                       &lt;attribute name="tail" use="required" type="{http://www.w3.org/2001/XMLSchema}integer" />
 *                                       &lt;attribute name="head" use="required" type="{http://www.w3.org/2001/XMLSchema}integer" />
 *                                       &lt;attribute name="id" type="{http://www.w3.org/2001/XMLSchema}integer" />
 *                                       &lt;attribute name="directed" type="{http://www.w3.org/2001/XMLSchema}boolean" default="false" />
 *                                       &lt;attribute name="type" type="{http://www.w3.org/2001/XMLSchema}integer" />
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
 *                   &lt;element name="vehicle_profile" maxOccurs="unbounded">
 *                     &lt;complexType>
 *                       &lt;complexContent>
 *                         &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *                           &lt;sequence>
 *                             &lt;choice>
 *                               &lt;element name="departure_from_any_node">
 *                                 &lt;complexType>
 *                                   &lt;complexContent>
 *                                     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *                                     &lt;/restriction>
 *                                   &lt;/complexContent>
 *                                 &lt;/complexType>
 *                               &lt;/element>
 *                               &lt;element name="departure_node" type="{http://www.w3.org/2001/XMLSchema}integer" maxOccurs="unbounded"/>
 *                             &lt;/choice>
 *                             &lt;choice>
 *                               &lt;element name="arrival_at_any_node">
 *                                 &lt;complexType>
 *                                   &lt;complexContent>
 *                                     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *                                     &lt;/restriction>
 *                                   &lt;/complexContent>
 *                                 &lt;/complexType>
 *                               &lt;/element>
 *                               &lt;element name="arrival_node" type="{http://www.w3.org/2001/XMLSchema}integer" maxOccurs="unbounded"/>
 *                             &lt;/choice>
 *                             &lt;group ref="{}storage"/>
 *                             &lt;element name="max_travel_time" type="{}positive_double" minOccurs="0"/>
 *                             &lt;element name="max_travel_distance" type="{}positive_double" minOccurs="0"/>
 *                             &lt;element name="speed_factor" type="{http://www.w3.org/2001/XMLSchema}double" minOccurs="0"/>
 *                             &lt;sequence>
 *                               &lt;element name="fix_cost" type="{}positive_double" minOccurs="0"/>
 *                               &lt;element name="cost_x_distance" type="{}positive_double" minOccurs="0"/>
 *                               &lt;element name="cost_x_time" type="{}positive_double" minOccurs="0"/>
 *                             &lt;/sequence>
 *                             &lt;element name="resource" maxOccurs="unbounded" minOccurs="0">
 *                               &lt;complexType>
 *                                 &lt;simpleContent>
 *                                   &lt;extension base="&lt;http://www.w3.org/2001/XMLSchema>double">
 *                                     &lt;attribute name="id" use="required" type="{http://www.w3.org/2001/XMLSchema}int" />
 *                                   &lt;/extension>
 *                                 &lt;/simpleContent>
 *                               &lt;/complexType>
 *                             &lt;/element>
 *                             &lt;element name="trailers" maxOccurs="unbounded" minOccurs="0">
 *                               &lt;complexType>
 *                                 &lt;simpleContent>
 *                                   &lt;extension base="&lt;http://www.w3.org/2001/XMLSchema>positiveInteger">
 *                                     &lt;attribute name="type" use="required" type="{http://www.w3.org/2001/XMLSchema}positiveInteger" />
 *                                   &lt;/extension>
 *                                 &lt;/simpleContent>
 *                               &lt;/complexType>
 *                             &lt;/element>
 *                             &lt;element ref="{}action" maxOccurs="unbounded" minOccurs="0"/>
 *                           &lt;/sequence>
 *                           &lt;attribute name="type" use="required" type="{http://www.w3.org/2001/XMLSchema}integer" />
 *                           &lt;attribute name="number" type="{http://www.w3.org/2001/XMLSchema}int" />
 *                         &lt;/restriction>
 *                       &lt;/complexContent>
 *                     &lt;/complexType>
 *                   &lt;/element>
 *                   &lt;element name="trailer_profile" maxOccurs="unbounded" minOccurs="0">
 *                     &lt;complexType>
 *                       &lt;complexContent>
 *                         &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *                           &lt;sequence>
 *                             &lt;group ref="{}storage"/>
 *                             &lt;sequence>
 *                               &lt;element name="fix_cost" type="{}positive_double" minOccurs="0"/>
 *                               &lt;element name="cost_x_distance" type="{}positive_double" minOccurs="0"/>
 *                               &lt;element name="cost_x_time" type="{}positive_double" minOccurs="0"/>
 *                             &lt;/sequence>
 *                           &lt;/sequence>
 *                           &lt;attribute name="type" use="required" type="{http://www.w3.org/2001/XMLSchema}int" />
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
 *                             &lt;choice>
 *                               &lt;element name="quantity" type="{http://www.w3.org/2001/XMLSchema}double"/>
 *                               &lt;element name="td_quantity" type="{}time_dependent_parameter_type"/>
 *                               &lt;element name="uncertain_quantity" type="{}uncertain_parameter_type"/>
 *                             &lt;/choice>
 *                             &lt;element ref="{}demand" maxOccurs="unbounded" minOccurs="0"/>
 *                             &lt;element name="prize" type="{http://www.w3.org/2001/XMLSchema}integer" minOccurs="0"/>
 *                             &lt;element name="release" type="{http://www.w3.org/2001/XMLSchema}double" minOccurs="0"/>
 *                             &lt;element name="service_time" type="{http://www.w3.org/2001/XMLSchema}anyType" minOccurs="0"/>
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
 *                                     &lt;attribute name="id" use="required" type="{http://www.w3.org/2001/XMLSchema}int" />
 *                                   &lt;/extension>
 *                                 &lt;/simpleContent>
 *                               &lt;/complexType>
 *                             &lt;/element>
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
 *         &lt;element name="resources" minOccurs="0">
 *           &lt;complexType>
 *             &lt;complexContent>
 *               &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *                 &lt;sequence>
 *                   &lt;element name="resource" maxOccurs="unbounded">
 *                     &lt;complexType>
 *                       &lt;complexContent>
 *                         &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *                           &lt;attribute name="id" use="required" type="{http://www.w3.org/2001/XMLSchema}integer" />
 *                           &lt;attribute name="renewable" use="required" type="{http://www.w3.org/2001/XMLSchema}boolean" />
 *                           &lt;attribute name="name" use="required" type="{http://www.w3.org/2001/XMLSchema}string" />
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
 *                             &lt;choice>
 *                               &lt;element name="compatible_with_all_vehicles">
 *                                 &lt;complexType>
 *                                   &lt;complexContent>
 *                                     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *                                     &lt;/restriction>
 *                                   &lt;/complexContent>
 *                                 &lt;/complexType>
 *                               &lt;/element>
 *                               &lt;element name="compatible_vehicle_type" type="{http://www.w3.org/2001/XMLSchema}int" maxOccurs="unbounded"/>
 *                             &lt;/choice>
 *                             &lt;element name="skill" maxOccurs="unbounded" minOccurs="0">
 *                               &lt;complexType>
 *                                 &lt;complexContent>
 *                                   &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *                                     &lt;attribute name="id" use="required" type="{http://www.w3.org/2001/XMLSchema}integer" />
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
 *                                     &lt;/sequence>
 *                                   &lt;/restriction>
 *                                 &lt;/complexContent>
 *                               &lt;/complexType>
 *                             &lt;/element>
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
    protected Instance.Resources resources;
    protected Instance.Drivers drivers;

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
     *                   &lt;choice>
     *                     &lt;element name="compatible_with_all_vehicles">
     *                       &lt;complexType>
     *                         &lt;complexContent>
     *                           &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
     *                           &lt;/restriction>
     *                         &lt;/complexContent>
     *                       &lt;/complexType>
     *                     &lt;/element>
     *                     &lt;element name="compatible_vehicle_type" type="{http://www.w3.org/2001/XMLSchema}int" maxOccurs="unbounded"/>
     *                   &lt;/choice>
     *                   &lt;element name="skill" maxOccurs="unbounded" minOccurs="0">
     *                     &lt;complexType>
     *                       &lt;complexContent>
     *                         &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
     *                           &lt;attribute name="id" use="required" type="{http://www.w3.org/2001/XMLSchema}integer" />
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
     *                           &lt;/sequence>
     *                         &lt;/restriction>
     *                       &lt;/complexContent>
     *                     &lt;/complexType>
     *                   &lt;/element>
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
         *         &lt;choice>
         *           &lt;element name="compatible_with_all_vehicles">
         *             &lt;complexType>
         *               &lt;complexContent>
         *                 &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
         *                 &lt;/restriction>
         *               &lt;/complexContent>
         *             &lt;/complexType>
         *           &lt;/element>
         *           &lt;element name="compatible_vehicle_type" type="{http://www.w3.org/2001/XMLSchema}int" maxOccurs="unbounded"/>
         *         &lt;/choice>
         *         &lt;element name="skill" maxOccurs="unbounded" minOccurs="0">
         *           &lt;complexType>
         *             &lt;complexContent>
         *               &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
         *                 &lt;attribute name="id" use="required" type="{http://www.w3.org/2001/XMLSchema}integer" />
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
         *                 &lt;/sequence>
         *               &lt;/restriction>
         *             &lt;/complexContent>
         *           &lt;/complexType>
         *         &lt;/element>
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
            "compatibleWithAllVehicles",
            "compatibleVehicleType",
            "skill",
            "workloadProfile"
        })
        public static class DriverProfile {

            @XmlElement(name = "compatible_with_all_vehicles")
            protected Instance.Drivers.DriverProfile.CompatibleWithAllVehicles compatibleWithAllVehicles;
            @XmlElement(name = "compatible_vehicle_type", type = Integer.class)
            protected List<Integer> compatibleVehicleType;
            protected List<Instance.Drivers.DriverProfile.Skill> skill;
            @XmlElement(name = "workload_profile")
            protected Instance.Drivers.DriverProfile.WorkloadProfile workloadProfile;
            @XmlAttribute(name = "type", required = true)
            protected int type;

            /**
             * Obtient la valeur de la propriété compatibleWithAllVehicles.
             * 
             * @return
             *     possible object is
             *     {@link Instance.Drivers.DriverProfile.CompatibleWithAllVehicles }
             *     
             */
            public Instance.Drivers.DriverProfile.CompatibleWithAllVehicles getCompatibleWithAllVehicles() {
                return compatibleWithAllVehicles;
            }

            /**
             * Définit la valeur de la propriété compatibleWithAllVehicles.
             * 
             * @param value
             *     allowed object is
             *     {@link Instance.Drivers.DriverProfile.CompatibleWithAllVehicles }
             *     
             */
            public void setCompatibleWithAllVehicles(Instance.Drivers.DriverProfile.CompatibleWithAllVehicles value) {
                this.compatibleWithAllVehicles = value;
            }

            /**
             * Gets the value of the compatibleVehicleType property.
             * 
             * <p>
             * This accessor method returns a reference to the live list,
             * not a snapshot. Therefore any modification you make to the
             * returned list will be present inside the JAXB object.
             * This is why there is not a <CODE>set</CODE> method for the compatibleVehicleType property.
             * 
             * <p>
             * For example, to add a new item, do as follows:
             * <pre>
             *    getCompatibleVehicleType().add(newItem);
             * </pre>
             * 
             * 
             * <p>
             * Objects of the following type(s) are allowed in the list
             * {@link Integer }
             * 
             * 
             */
            public List<Integer> getCompatibleVehicleType() {
                if (compatibleVehicleType == null) {
                    compatibleVehicleType = new ArrayList<Integer>();
                }
                return this.compatibleVehicleType;
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
             *     &lt;/restriction>
             *   &lt;/complexContent>
             * &lt;/complexType>
             * </pre>
             * 
             * 
             */
            @XmlAccessorType(XmlAccessType.FIELD)
            @XmlType(name = "")
            public static class CompatibleWithAllVehicles {


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
                "tw"
            })
            public static class WorkloadProfile {

                @XmlElement(name = "max_work_time")
                protected Double maxWorkTime;
                @XmlElement(name = "max_driving_time")
                protected Double maxDrivingTime;
                protected List<Tw> tw;

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
     *         &lt;element name="vehicle_profile" maxOccurs="unbounded">
     *           &lt;complexType>
     *             &lt;complexContent>
     *               &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
     *                 &lt;sequence>
     *                   &lt;choice>
     *                     &lt;element name="departure_from_any_node">
     *                       &lt;complexType>
     *                         &lt;complexContent>
     *                           &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
     *                           &lt;/restriction>
     *                         &lt;/complexContent>
     *                       &lt;/complexType>
     *                     &lt;/element>
     *                     &lt;element name="departure_node" type="{http://www.w3.org/2001/XMLSchema}integer" maxOccurs="unbounded"/>
     *                   &lt;/choice>
     *                   &lt;choice>
     *                     &lt;element name="arrival_at_any_node">
     *                       &lt;complexType>
     *                         &lt;complexContent>
     *                           &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
     *                           &lt;/restriction>
     *                         &lt;/complexContent>
     *                       &lt;/complexType>
     *                     &lt;/element>
     *                     &lt;element name="arrival_node" type="{http://www.w3.org/2001/XMLSchema}integer" maxOccurs="unbounded"/>
     *                   &lt;/choice>
     *                   &lt;group ref="{}storage"/>
     *                   &lt;element name="max_travel_time" type="{}positive_double" minOccurs="0"/>
     *                   &lt;element name="max_travel_distance" type="{}positive_double" minOccurs="0"/>
     *                   &lt;element name="speed_factor" type="{http://www.w3.org/2001/XMLSchema}double" minOccurs="0"/>
     *                   &lt;sequence>
     *                     &lt;element name="fix_cost" type="{}positive_double" minOccurs="0"/>
     *                     &lt;element name="cost_x_distance" type="{}positive_double" minOccurs="0"/>
     *                     &lt;element name="cost_x_time" type="{}positive_double" minOccurs="0"/>
     *                   &lt;/sequence>
     *                   &lt;element name="resource" maxOccurs="unbounded" minOccurs="0">
     *                     &lt;complexType>
     *                       &lt;simpleContent>
     *                         &lt;extension base="&lt;http://www.w3.org/2001/XMLSchema>double">
     *                           &lt;attribute name="id" use="required" type="{http://www.w3.org/2001/XMLSchema}int" />
     *                         &lt;/extension>
     *                       &lt;/simpleContent>
     *                     &lt;/complexType>
     *                   &lt;/element>
     *                   &lt;element name="trailers" maxOccurs="unbounded" minOccurs="0">
     *                     &lt;complexType>
     *                       &lt;simpleContent>
     *                         &lt;extension base="&lt;http://www.w3.org/2001/XMLSchema>positiveInteger">
     *                           &lt;attribute name="type" use="required" type="{http://www.w3.org/2001/XMLSchema}positiveInteger" />
     *                         &lt;/extension>
     *                       &lt;/simpleContent>
     *                     &lt;/complexType>
     *                   &lt;/element>
     *                   &lt;element ref="{}action" maxOccurs="unbounded" minOccurs="0"/>
     *                 &lt;/sequence>
     *                 &lt;attribute name="type" use="required" type="{http://www.w3.org/2001/XMLSchema}integer" />
     *                 &lt;attribute name="number" type="{http://www.w3.org/2001/XMLSchema}int" />
     *               &lt;/restriction>
     *             &lt;/complexContent>
     *           &lt;/complexType>
     *         &lt;/element>
     *         &lt;element name="trailer_profile" maxOccurs="unbounded" minOccurs="0">
     *           &lt;complexType>
     *             &lt;complexContent>
     *               &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
     *                 &lt;sequence>
     *                   &lt;group ref="{}storage"/>
     *                   &lt;sequence>
     *                     &lt;element name="fix_cost" type="{}positive_double" minOccurs="0"/>
     *                     &lt;element name="cost_x_distance" type="{}positive_double" minOccurs="0"/>
     *                     &lt;element name="cost_x_time" type="{}positive_double" minOccurs="0"/>
     *                   &lt;/sequence>
     *                 &lt;/sequence>
     *                 &lt;attribute name="type" use="required" type="{http://www.w3.org/2001/XMLSchema}int" />
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
        "vehicleProfile",
        "trailerProfile"
    })
    public static class Fleet {

        @XmlElement(name = "vehicle_profile", required = true)
        protected List<Instance.Fleet.VehicleProfile> vehicleProfile;
        @XmlElement(name = "trailer_profile")
        protected List<Instance.Fleet.TrailerProfile> trailerProfile;

        /**
         * Gets the value of the vehicleProfile property.
         * 
         * <p>
         * This accessor method returns a reference to the live list,
         * not a snapshot. Therefore any modification you make to the
         * returned list will be present inside the JAXB object.
         * This is why there is not a <CODE>set</CODE> method for the vehicleProfile property.
         * 
         * <p>
         * For example, to add a new item, do as follows:
         * <pre>
         *    getVehicleProfile().add(newItem);
         * </pre>
         * 
         * 
         * <p>
         * Objects of the following type(s) are allowed in the list
         * {@link Instance.Fleet.VehicleProfile }
         * 
         * 
         */
        public List<Instance.Fleet.VehicleProfile> getVehicleProfile() {
            if (vehicleProfile == null) {
                vehicleProfile = new ArrayList<Instance.Fleet.VehicleProfile>();
            }
            return this.vehicleProfile;
        }

        /**
         * Gets the value of the trailerProfile property.
         * 
         * <p>
         * This accessor method returns a reference to the live list,
         * not a snapshot. Therefore any modification you make to the
         * returned list will be present inside the JAXB object.
         * This is why there is not a <CODE>set</CODE> method for the trailerProfile property.
         * 
         * <p>
         * For example, to add a new item, do as follows:
         * <pre>
         *    getTrailerProfile().add(newItem);
         * </pre>
         * 
         * 
         * <p>
         * Objects of the following type(s) are allowed in the list
         * {@link Instance.Fleet.TrailerProfile }
         * 
         * 
         */
        public List<Instance.Fleet.TrailerProfile> getTrailerProfile() {
            if (trailerProfile == null) {
                trailerProfile = new ArrayList<Instance.Fleet.TrailerProfile>();
            }
            return this.trailerProfile;
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
         *         &lt;group ref="{}storage"/>
         *         &lt;sequence>
         *           &lt;element name="fix_cost" type="{}positive_double" minOccurs="0"/>
         *           &lt;element name="cost_x_distance" type="{}positive_double" minOccurs="0"/>
         *           &lt;element name="cost_x_time" type="{}positive_double" minOccurs="0"/>
         *         &lt;/sequence>
         *       &lt;/sequence>
         *       &lt;attribute name="type" use="required" type="{http://www.w3.org/2001/XMLSchema}int" />
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
            "compartment",
            "fixCost",
            "costXDistance",
            "costXTime"
        })
        public static class TrailerProfile {

            protected Double capacity;
            @XmlElement(name = "max_weight")
            protected Double maxWeight;
            @XmlElement(name = "max_volume")
            protected Double maxVolume;
            protected DimensionsType dimensions;
            protected List<Compartment> compartment;
            @XmlElement(name = "fix_cost")
            protected Double fixCost;
            @XmlElement(name = "cost_x_distance")
            protected Double costXDistance;
            @XmlElement(name = "cost_x_time")
            protected Double costXTime;
            @XmlAttribute(name = "type", required = true)
            protected int type;
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
             * Defines the dimensions of the storage unit
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
             * Defines a compartment. Use this element to model multicompartment VRPs Gets the value of the compartment property.
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
             * Obtient la valeur de la propriété fixCost.
             * 
             * @return
             *     possible object is
             *     {@link Double }
             *     
             */
            public Double getFixCost() {
                return fixCost;
            }

            /**
             * Définit la valeur de la propriété fixCost.
             * 
             * @param value
             *     allowed object is
             *     {@link Double }
             *     
             */
            public void setFixCost(Double value) {
                this.fixCost = value;
            }

            /**
             * Obtient la valeur de la propriété costXDistance.
             * 
             * @return
             *     possible object is
             *     {@link Double }
             *     
             */
            public Double getCostXDistance() {
                return costXDistance;
            }

            /**
             * Définit la valeur de la propriété costXDistance.
             * 
             * @param value
             *     allowed object is
             *     {@link Double }
             *     
             */
            public void setCostXDistance(Double value) {
                this.costXDistance = value;
            }

            /**
             * Obtient la valeur de la propriété costXTime.
             * 
             * @return
             *     possible object is
             *     {@link Double }
             *     
             */
            public Double getCostXTime() {
                return costXTime;
            }

            /**
             * Définit la valeur de la propriété costXTime.
             * 
             * @param value
             *     allowed object is
             *     {@link Double }
             *     
             */
            public void setCostXTime(Double value) {
                this.costXTime = value;
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
         *         &lt;choice>
         *           &lt;element name="departure_from_any_node">
         *             &lt;complexType>
         *               &lt;complexContent>
         *                 &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
         *                 &lt;/restriction>
         *               &lt;/complexContent>
         *             &lt;/complexType>
         *           &lt;/element>
         *           &lt;element name="departure_node" type="{http://www.w3.org/2001/XMLSchema}integer" maxOccurs="unbounded"/>
         *         &lt;/choice>
         *         &lt;choice>
         *           &lt;element name="arrival_at_any_node">
         *             &lt;complexType>
         *               &lt;complexContent>
         *                 &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
         *                 &lt;/restriction>
         *               &lt;/complexContent>
         *             &lt;/complexType>
         *           &lt;/element>
         *           &lt;element name="arrival_node" type="{http://www.w3.org/2001/XMLSchema}integer" maxOccurs="unbounded"/>
         *         &lt;/choice>
         *         &lt;group ref="{}storage"/>
         *         &lt;element name="max_travel_time" type="{}positive_double" minOccurs="0"/>
         *         &lt;element name="max_travel_distance" type="{}positive_double" minOccurs="0"/>
         *         &lt;element name="speed_factor" type="{http://www.w3.org/2001/XMLSchema}double" minOccurs="0"/>
         *         &lt;sequence>
         *           &lt;element name="fix_cost" type="{}positive_double" minOccurs="0"/>
         *           &lt;element name="cost_x_distance" type="{}positive_double" minOccurs="0"/>
         *           &lt;element name="cost_x_time" type="{}positive_double" minOccurs="0"/>
         *         &lt;/sequence>
         *         &lt;element name="resource" maxOccurs="unbounded" minOccurs="0">
         *           &lt;complexType>
         *             &lt;simpleContent>
         *               &lt;extension base="&lt;http://www.w3.org/2001/XMLSchema>double">
         *                 &lt;attribute name="id" use="required" type="{http://www.w3.org/2001/XMLSchema}int" />
         *               &lt;/extension>
         *             &lt;/simpleContent>
         *           &lt;/complexType>
         *         &lt;/element>
         *         &lt;element name="trailers" maxOccurs="unbounded" minOccurs="0">
         *           &lt;complexType>
         *             &lt;simpleContent>
         *               &lt;extension base="&lt;http://www.w3.org/2001/XMLSchema>positiveInteger">
         *                 &lt;attribute name="type" use="required" type="{http://www.w3.org/2001/XMLSchema}positiveInteger" />
         *               &lt;/extension>
         *             &lt;/simpleContent>
         *           &lt;/complexType>
         *         &lt;/element>
         *         &lt;element ref="{}action" maxOccurs="unbounded" minOccurs="0"/>
         *       &lt;/sequence>
         *       &lt;attribute name="type" use="required" type="{http://www.w3.org/2001/XMLSchema}integer" />
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
            "departureFromAnyNode",
            "departureNode",
            "arrivalAtAnyNode",
            "arrivalNode",
            "capacity",
            "maxWeight",
            "maxVolume",
            "dimensions",
            "compartment",
            "maxTravelTime",
            "maxTravelDistance",
            "speedFactor",
            "fixCost",
            "costXDistance",
            "costXTime",
            "resource",
            "trailers",
            "action"
        })
        public static class VehicleProfile {

            @XmlElement(name = "departure_from_any_node")
            protected Instance.Fleet.VehicleProfile.DepartureFromAnyNode departureFromAnyNode;
            @XmlElement(name = "departure_node")
            protected List<BigInteger> departureNode;
            @XmlElement(name = "arrival_at_any_node")
            protected Instance.Fleet.VehicleProfile.ArrivalAtAnyNode arrivalAtAnyNode;
            @XmlElement(name = "arrival_node")
            protected List<BigInteger> arrivalNode;
            protected Double capacity;
            @XmlElement(name = "max_weight")
            protected Double maxWeight;
            @XmlElement(name = "max_volume")
            protected Double maxVolume;
            protected DimensionsType dimensions;
            protected List<Compartment> compartment;
            @XmlElement(name = "max_travel_time")
            protected Double maxTravelTime;
            @XmlElement(name = "max_travel_distance")
            protected Double maxTravelDistance;
            @XmlElement(name = "speed_factor")
            protected Double speedFactor;
            @XmlElement(name = "fix_cost")
            protected Double fixCost;
            @XmlElement(name = "cost_x_distance")
            protected Double costXDistance;
            @XmlElement(name = "cost_x_time")
            protected Double costXTime;
            protected List<Instance.Fleet.VehicleProfile.Resource> resource;
            protected List<Instance.Fleet.VehicleProfile.Trailers> trailers;
            protected List<Action> action;
            @XmlAttribute(name = "type", required = true)
            protected BigInteger type;
            @XmlAttribute(name = "number")
            protected Integer number;

            /**
             * Obtient la valeur de la propriété departureFromAnyNode.
             * 
             * @return
             *     possible object is
             *     {@link Instance.Fleet.VehicleProfile.DepartureFromAnyNode }
             *     
             */
            public Instance.Fleet.VehicleProfile.DepartureFromAnyNode getDepartureFromAnyNode() {
                return departureFromAnyNode;
            }

            /**
             * Définit la valeur de la propriété departureFromAnyNode.
             * 
             * @param value
             *     allowed object is
             *     {@link Instance.Fleet.VehicleProfile.DepartureFromAnyNode }
             *     
             */
            public void setDepartureFromAnyNode(Instance.Fleet.VehicleProfile.DepartureFromAnyNode value) {
                this.departureFromAnyNode = value;
            }

            /**
             * Gets the value of the departureNode property.
             * 
             * <p>
             * This accessor method returns a reference to the live list,
             * not a snapshot. Therefore any modification you make to the
             * returned list will be present inside the JAXB object.
             * This is why there is not a <CODE>set</CODE> method for the departureNode property.
             * 
             * <p>
             * For example, to add a new item, do as follows:
             * <pre>
             *    getDepartureNode().add(newItem);
             * </pre>
             * 
             * 
             * <p>
             * Objects of the following type(s) are allowed in the list
             * {@link BigInteger }
             * 
             * 
             */
            public List<BigInteger> getDepartureNode() {
                if (departureNode == null) {
                    departureNode = new ArrayList<BigInteger>();
                }
                return this.departureNode;
            }

            /**
             * Obtient la valeur de la propriété arrivalAtAnyNode.
             * 
             * @return
             *     possible object is
             *     {@link Instance.Fleet.VehicleProfile.ArrivalAtAnyNode }
             *     
             */
            public Instance.Fleet.VehicleProfile.ArrivalAtAnyNode getArrivalAtAnyNode() {
                return arrivalAtAnyNode;
            }

            /**
             * Définit la valeur de la propriété arrivalAtAnyNode.
             * 
             * @param value
             *     allowed object is
             *     {@link Instance.Fleet.VehicleProfile.ArrivalAtAnyNode }
             *     
             */
            public void setArrivalAtAnyNode(Instance.Fleet.VehicleProfile.ArrivalAtAnyNode value) {
                this.arrivalAtAnyNode = value;
            }

            /**
             * Gets the value of the arrivalNode property.
             * 
             * <p>
             * This accessor method returns a reference to the live list,
             * not a snapshot. Therefore any modification you make to the
             * returned list will be present inside the JAXB object.
             * This is why there is not a <CODE>set</CODE> method for the arrivalNode property.
             * 
             * <p>
             * For example, to add a new item, do as follows:
             * <pre>
             *    getArrivalNode().add(newItem);
             * </pre>
             * 
             * 
             * <p>
             * Objects of the following type(s) are allowed in the list
             * {@link BigInteger }
             * 
             * 
             */
            public List<BigInteger> getArrivalNode() {
                if (arrivalNode == null) {
                    arrivalNode = new ArrayList<BigInteger>();
                }
                return this.arrivalNode;
            }

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
             * Defines the dimensions of the storage unit
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
             * Defines a compartment. Use this element to model multicompartment VRPs Gets the value of the compartment property.
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
             * Obtient la valeur de la propriété speedFactor.
             * 
             * @return
             *     possible object is
             *     {@link Double }
             *     
             */
            public Double getSpeedFactor() {
                return speedFactor;
            }

            /**
             * Définit la valeur de la propriété speedFactor.
             * 
             * @param value
             *     allowed object is
             *     {@link Double }
             *     
             */
            public void setSpeedFactor(Double value) {
                this.speedFactor = value;
            }

            /**
             * Obtient la valeur de la propriété fixCost.
             * 
             * @return
             *     possible object is
             *     {@link Double }
             *     
             */
            public Double getFixCost() {
                return fixCost;
            }

            /**
             * Définit la valeur de la propriété fixCost.
             * 
             * @param value
             *     allowed object is
             *     {@link Double }
             *     
             */
            public void setFixCost(Double value) {
                this.fixCost = value;
            }

            /**
             * Obtient la valeur de la propriété costXDistance.
             * 
             * @return
             *     possible object is
             *     {@link Double }
             *     
             */
            public Double getCostXDistance() {
                return costXDistance;
            }

            /**
             * Définit la valeur de la propriété costXDistance.
             * 
             * @param value
             *     allowed object is
             *     {@link Double }
             *     
             */
            public void setCostXDistance(Double value) {
                this.costXDistance = value;
            }

            /**
             * Obtient la valeur de la propriété costXTime.
             * 
             * @return
             *     possible object is
             *     {@link Double }
             *     
             */
            public Double getCostXTime() {
                return costXTime;
            }

            /**
             * Définit la valeur de la propriété costXTime.
             * 
             * @param value
             *     allowed object is
             *     {@link Double }
             *     
             */
            public void setCostXTime(Double value) {
                this.costXTime = value;
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
             * {@link Instance.Fleet.VehicleProfile.Resource }
             * 
             * 
             */
            public List<Instance.Fleet.VehicleProfile.Resource> getResource() {
                if (resource == null) {
                    resource = new ArrayList<Instance.Fleet.VehicleProfile.Resource>();
                }
                return this.resource;
            }

            /**
             * Gets the value of the trailers property.
             * 
             * <p>
             * This accessor method returns a reference to the live list,
             * not a snapshot. Therefore any modification you make to the
             * returned list will be present inside the JAXB object.
             * This is why there is not a <CODE>set</CODE> method for the trailers property.
             * 
             * <p>
             * For example, to add a new item, do as follows:
             * <pre>
             *    getTrailers().add(newItem);
             * </pre>
             * 
             * 
             * <p>
             * Objects of the following type(s) are allowed in the list
             * {@link Instance.Fleet.VehicleProfile.Trailers }
             * 
             * 
             */
            public List<Instance.Fleet.VehicleProfile.Trailers> getTrailers() {
                if (trailers == null) {
                    trailers = new ArrayList<Instance.Fleet.VehicleProfile.Trailers>();
                }
                return this.trailers;
            }

            /**
             * Gets the value of the action property.
             * 
             * <p>
             * This accessor method returns a reference to the live list,
             * not a snapshot. Therefore any modification you make to the
             * returned list will be present inside the JAXB object.
             * This is why there is not a <CODE>set</CODE> method for the action property.
             * 
             * <p>
             * For example, to add a new item, do as follows:
             * <pre>
             *    getAction().add(newItem);
             * </pre>
             * 
             * 
             * <p>
             * Objects of the following type(s) are allowed in the list
             * {@link Action }
             * 
             * 
             */
            public List<Action> getAction() {
                if (action == null) {
                    action = new ArrayList<Action>();
                }
                return this.action;
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
             *   &lt;complexContent>
             *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
             *     &lt;/restriction>
             *   &lt;/complexContent>
             * &lt;/complexType>
             * </pre>
             * 
             * 
             */
            @XmlAccessorType(XmlAccessType.FIELD)
            @XmlType(name = "")
            public static class ArrivalAtAnyNode {


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
             *     &lt;/restriction>
             *   &lt;/complexContent>
             * &lt;/complexType>
             * </pre>
             * 
             * 
             */
            @XmlAccessorType(XmlAccessType.FIELD)
            @XmlType(name = "")
            public static class DepartureFromAnyNode {


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
             *       &lt;attribute name="id" use="required" type="{http://www.w3.org/2001/XMLSchema}int" />
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
                @XmlAttribute(name = "id", required = true)
                protected int id;

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
                 */
                public int getId() {
                    return id;
                }

                /**
                 * Définit la valeur de la propriété id.
                 * 
                 */
                public void setId(int value) {
                    this.id = value;
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
             *     &lt;extension base="&lt;http://www.w3.org/2001/XMLSchema>positiveInteger">
             *       &lt;attribute name="type" use="required" type="{http://www.w3.org/2001/XMLSchema}positiveInteger" />
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
            public static class Trailers {

                @XmlValue
                @XmlSchemaType(name = "positiveInteger")
                protected BigInteger value;
                @XmlAttribute(name = "type", required = true)
                @XmlSchemaType(name = "positiveInteger")
                protected BigInteger type;

                /**
                 * Obtient la valeur de la propriété value.
                 * 
                 * @return
                 *     possible object is
                 *     {@link BigInteger }
                 *     
                 */
                public BigInteger getValue() {
                    return value;
                }

                /**
                 * Définit la valeur de la propriété value.
                 * 
                 * @param value
                 *     allowed object is
                 *     {@link BigInteger }
                 *     
                 */
                public void setValue(BigInteger value) {
                    this.value = value;
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
     *         &lt;element name="descriptor" minOccurs="0">
     *           &lt;complexType>
     *             &lt;complexContent>
     *               &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
     *                 &lt;sequence>
     *                   &lt;any processContents='skip' maxOccurs="unbounded"/>
     *                 &lt;/sequence>
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
        "dataset",
        "name",
        "descriptor"
    })
    public static class Info {

        @XmlElement(required = true)
        protected String dataset;
        @XmlElement(required = true)
        protected String name;
        protected Instance.Info.Descriptor descriptor;

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

        /**
         * Obtient la valeur de la propriété descriptor.
         * 
         * @return
         *     possible object is
         *     {@link Instance.Info.Descriptor }
         *     
         */
        public Instance.Info.Descriptor getDescriptor() {
            return descriptor;
        }

        /**
         * Définit la valeur de la propriété descriptor.
         * 
         * @param value
         *     allowed object is
         *     {@link Instance.Info.Descriptor }
         *     
         */
        public void setDescriptor(Instance.Info.Descriptor value) {
            this.descriptor = value;
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
         *         &lt;any processContents='skip' maxOccurs="unbounded"/>
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
            "any"
        })
        public static class Descriptor {

            @XmlAnyElement
            protected List<Element> any;

            /**
             * Gets the value of the any property.
             * 
             * <p>
             * This accessor method returns a reference to the live list,
             * not a snapshot. Therefore any modification you make to the
             * returned list will be present inside the JAXB object.
             * This is why there is not a <CODE>set</CODE> method for the any property.
             * 
             * <p>
             * For example, to add a new item, do as follows:
             * <pre>
             *    getAny().add(newItem);
             * </pre>
             * 
             * 
             * <p>
             * Objects of the following type(s) are allowed in the list
             * {@link Element }
             * 
             * 
             */
            public List<Element> getAny() {
                if (any == null) {
                    any = new ArrayList<Element>();
                }
                return this.any;
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
     *                           &lt;/sequence>
     *                           &lt;attribute name="id" use="required" type="{http://www.w3.org/2001/XMLSchema}integer" />
     *                           &lt;attribute name="type" use="required" type="{http://www.w3.org/2001/XMLSchema}integer" />
     *                           &lt;attribute name="trailer" type="{http://www.w3.org/2001/XMLSchema}boolean" />
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
     *                               &lt;element name="length" type="{}positive_double" minOccurs="0"/>
     *                               &lt;choice minOccurs="0">
     *                                 &lt;element name="travel_time" type="{}positive_double"/>
     *                                 &lt;element name="td_travel_time" type="{}time_dependent_parameter_type" maxOccurs="unbounded"/>
     *                                 &lt;element name="uncertain_travel_time" type="{}uncertain_parameter_type"/>
     *                               &lt;/choice>
     *                               &lt;choice minOccurs="0">
     *                                 &lt;element name="travel_cost" type="{}positive_double"/>
     *                                 &lt;element name="td_travel_cost" type="{}time_dependent_parameter_type" maxOccurs="unbounded"/>
     *                                 &lt;element name="uncertain_travel_cost" type="{}uncertain_parameter_type"/>
     *                               &lt;/choice>
     *                               &lt;element ref="{}tw" maxOccurs="unbounded" minOccurs="0"/>
     *                             &lt;/sequence>
     *                             &lt;attribute name="tail" use="required" type="{http://www.w3.org/2001/XMLSchema}integer" />
     *                             &lt;attribute name="head" use="required" type="{http://www.w3.org/2001/XMLSchema}integer" />
     *                             &lt;attribute name="id" type="{http://www.w3.org/2001/XMLSchema}integer" />
     *                             &lt;attribute name="directed" type="{http://www.w3.org/2001/XMLSchema}boolean" default="false" />
     *                             &lt;attribute name="type" type="{http://www.w3.org/2001/XMLSchema}integer" />
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
        "decimals"
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
         *                   &lt;element name="length" type="{}positive_double" minOccurs="0"/>
         *                   &lt;choice minOccurs="0">
         *                     &lt;element name="travel_time" type="{}positive_double"/>
         *                     &lt;element name="td_travel_time" type="{}time_dependent_parameter_type" maxOccurs="unbounded"/>
         *                     &lt;element name="uncertain_travel_time" type="{}uncertain_parameter_type"/>
         *                   &lt;/choice>
         *                   &lt;choice minOccurs="0">
         *                     &lt;element name="travel_cost" type="{}positive_double"/>
         *                     &lt;element name="td_travel_cost" type="{}time_dependent_parameter_type" maxOccurs="unbounded"/>
         *                     &lt;element name="uncertain_travel_cost" type="{}uncertain_parameter_type"/>
         *                   &lt;/choice>
         *                   &lt;element ref="{}tw" maxOccurs="unbounded" minOccurs="0"/>
         *                 &lt;/sequence>
         *                 &lt;attribute name="tail" use="required" type="{http://www.w3.org/2001/XMLSchema}integer" />
         *                 &lt;attribute name="head" use="required" type="{http://www.w3.org/2001/XMLSchema}integer" />
         *                 &lt;attribute name="id" type="{http://www.w3.org/2001/XMLSchema}integer" />
         *                 &lt;attribute name="directed" type="{http://www.w3.org/2001/XMLSchema}boolean" default="false" />
         *                 &lt;attribute name="type" type="{http://www.w3.org/2001/XMLSchema}integer" />
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
             *         &lt;element name="length" type="{}positive_double" minOccurs="0"/>
             *         &lt;choice minOccurs="0">
             *           &lt;element name="travel_time" type="{}positive_double"/>
             *           &lt;element name="td_travel_time" type="{}time_dependent_parameter_type" maxOccurs="unbounded"/>
             *           &lt;element name="uncertain_travel_time" type="{}uncertain_parameter_type"/>
             *         &lt;/choice>
             *         &lt;choice minOccurs="0">
             *           &lt;element name="travel_cost" type="{}positive_double"/>
             *           &lt;element name="td_travel_cost" type="{}time_dependent_parameter_type" maxOccurs="unbounded"/>
             *           &lt;element name="uncertain_travel_cost" type="{}uncertain_parameter_type"/>
             *         &lt;/choice>
             *         &lt;element ref="{}tw" maxOccurs="unbounded" minOccurs="0"/>
             *       &lt;/sequence>
             *       &lt;attribute name="tail" use="required" type="{http://www.w3.org/2001/XMLSchema}integer" />
             *       &lt;attribute name="head" use="required" type="{http://www.w3.org/2001/XMLSchema}integer" />
             *       &lt;attribute name="id" type="{http://www.w3.org/2001/XMLSchema}integer" />
             *       &lt;attribute name="directed" type="{http://www.w3.org/2001/XMLSchema}boolean" default="false" />
             *       &lt;attribute name="type" type="{http://www.w3.org/2001/XMLSchema}integer" />
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
                "uncertainTravelTime",
                "travelCost",
                "tdTravelCost",
                "uncertainTravelCost",
                "tw"
            })
            public static class Link {

                protected Double length;
                @XmlElement(name = "travel_time")
                protected Double travelTime;
                @XmlElement(name = "td_travel_time")
                protected List<TimeDependentParameterType> tdTravelTime;
                @XmlElement(name = "uncertain_travel_time")
                protected UncertainParameterType uncertainTravelTime;
                @XmlElement(name = "travel_cost")
                protected Double travelCost;
                @XmlElement(name = "td_travel_cost")
                protected List<TimeDependentParameterType> tdTravelCost;
                @XmlElement(name = "uncertain_travel_cost")
                protected UncertainParameterType uncertainTravelCost;
                protected List<Tw> tw;
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
                 *     {@link Double }
                 *     
                 */
                public Double getTravelTime() {
                    return travelTime;
                }

                /**
                 * Définit la valeur de la propriété travelTime.
                 * 
                 * @param value
                 *     allowed object is
                 *     {@link Double }
                 *     
                 */
                public void setTravelTime(Double value) {
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
                 * {@link TimeDependentParameterType }
                 * 
                 * 
                 */
                public List<TimeDependentParameterType> getTdTravelTime() {
                    if (tdTravelTime == null) {
                        tdTravelTime = new ArrayList<TimeDependentParameterType>();
                    }
                    return this.tdTravelTime;
                }

                /**
                 * Obtient la valeur de la propriété uncertainTravelTime.
                 * 
                 * @return
                 *     possible object is
                 *     {@link UncertainParameterType }
                 *     
                 */
                public UncertainParameterType getUncertainTravelTime() {
                    return uncertainTravelTime;
                }

                /**
                 * Définit la valeur de la propriété uncertainTravelTime.
                 * 
                 * @param value
                 *     allowed object is
                 *     {@link UncertainParameterType }
                 *     
                 */
                public void setUncertainTravelTime(UncertainParameterType value) {
                    this.uncertainTravelTime = value;
                }

                /**
                 * Obtient la valeur de la propriété travelCost.
                 * 
                 * @return
                 *     possible object is
                 *     {@link Double }
                 *     
                 */
                public Double getTravelCost() {
                    return travelCost;
                }

                /**
                 * Définit la valeur de la propriété travelCost.
                 * 
                 * @param value
                 *     allowed object is
                 *     {@link Double }
                 *     
                 */
                public void setTravelCost(Double value) {
                    this.travelCost = value;
                }

                /**
                 * Gets the value of the tdTravelCost property.
                 * 
                 * <p>
                 * This accessor method returns a reference to the live list,
                 * not a snapshot. Therefore any modification you make to the
                 * returned list will be present inside the JAXB object.
                 * This is why there is not a <CODE>set</CODE> method for the tdTravelCost property.
                 * 
                 * <p>
                 * For example, to add a new item, do as follows:
                 * <pre>
                 *    getTdTravelCost().add(newItem);
                 * </pre>
                 * 
                 * 
                 * <p>
                 * Objects of the following type(s) are allowed in the list
                 * {@link TimeDependentParameterType }
                 * 
                 * 
                 */
                public List<TimeDependentParameterType> getTdTravelCost() {
                    if (tdTravelCost == null) {
                        tdTravelCost = new ArrayList<TimeDependentParameterType>();
                    }
                    return this.tdTravelCost;
                }

                /**
                 * Obtient la valeur de la propriété uncertainTravelCost.
                 * 
                 * @return
                 *     possible object is
                 *     {@link UncertainParameterType }
                 *     
                 */
                public UncertainParameterType getUncertainTravelCost() {
                    return uncertainTravelCost;
                }

                /**
                 * Définit la valeur de la propriété uncertainTravelCost.
                 * 
                 * @param value
                 *     allowed object is
                 *     {@link UncertainParameterType }
                 *     
                 */
                public void setUncertainTravelCost(UncertainParameterType value) {
                    this.uncertainTravelCost = value;
                }

                /**
                 * Time windows. Use these elements to model the link's availability Gets the value of the tw property.
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
         *                 &lt;/sequence>
         *                 &lt;attribute name="id" use="required" type="{http://www.w3.org/2001/XMLSchema}integer" />
         *                 &lt;attribute name="type" use="required" type="{http://www.w3.org/2001/XMLSchema}integer" />
         *                 &lt;attribute name="trailer" type="{http://www.w3.org/2001/XMLSchema}boolean" />
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
             *       &lt;/sequence>
             *       &lt;attribute name="id" use="required" type="{http://www.w3.org/2001/XMLSchema}integer" />
             *       &lt;attribute name="type" use="required" type="{http://www.w3.org/2001/XMLSchema}integer" />
             *       &lt;attribute name="trailer" type="{http://www.w3.org/2001/XMLSchema}boolean" />
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
                "compatibleVehicle"
            })
            public static class Node {

                protected Double cx;
                protected Double cy;
                protected Double cz;
                protected Double latitude;
                protected Double longitude;
                @XmlElement(name = "compatible_vehicle", type = Integer.class)
                protected List<Integer> compatibleVehicle;
                @XmlAttribute(name = "id", required = true)
                protected BigInteger id;
                @XmlAttribute(name = "type", required = true)
                protected BigInteger type;
                @XmlAttribute(name = "trailer")
                protected Boolean trailer;

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
                 * Obtient la valeur de la propriété trailer.
                 * 
                 * @return
                 *     possible object is
                 *     {@link Boolean }
                 *     
                 */
                public Boolean isTrailer() {
                    return trailer;
                }

                /**
                 * Définit la valeur de la propriété trailer.
                 * 
                 * @param value
                 *     allowed object is
                 *     {@link Boolean }
                 *     
                 */
                public void setTrailer(Boolean value) {
                    this.trailer = value;
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
     *                   &lt;choice>
     *                     &lt;element name="quantity" type="{http://www.w3.org/2001/XMLSchema}double"/>
     *                     &lt;element name="td_quantity" type="{}time_dependent_parameter_type"/>
     *                     &lt;element name="uncertain_quantity" type="{}uncertain_parameter_type"/>
     *                   &lt;/choice>
     *                   &lt;element ref="{}demand" maxOccurs="unbounded" minOccurs="0"/>
     *                   &lt;element name="prize" type="{http://www.w3.org/2001/XMLSchema}integer" minOccurs="0"/>
     *                   &lt;element name="release" type="{http://www.w3.org/2001/XMLSchema}double" minOccurs="0"/>
     *                   &lt;element name="service_time" type="{http://www.w3.org/2001/XMLSchema}anyType" minOccurs="0"/>
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
     *                           &lt;attribute name="id" use="required" type="{http://www.w3.org/2001/XMLSchema}int" />
     *                         &lt;/extension>
     *                       &lt;/simpleContent>
     *                     &lt;/complexType>
     *                   &lt;/element>
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
         *         &lt;choice>
         *           &lt;element name="quantity" type="{http://www.w3.org/2001/XMLSchema}double"/>
         *           &lt;element name="td_quantity" type="{}time_dependent_parameter_type"/>
         *           &lt;element name="uncertain_quantity" type="{}uncertain_parameter_type"/>
         *         &lt;/choice>
         *         &lt;element ref="{}demand" maxOccurs="unbounded" minOccurs="0"/>
         *         &lt;element name="prize" type="{http://www.w3.org/2001/XMLSchema}integer" minOccurs="0"/>
         *         &lt;element name="release" type="{http://www.w3.org/2001/XMLSchema}double" minOccurs="0"/>
         *         &lt;element name="service_time" type="{http://www.w3.org/2001/XMLSchema}anyType" minOccurs="0"/>
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
         *                 &lt;attribute name="id" use="required" type="{http://www.w3.org/2001/XMLSchema}int" />
         *               &lt;/extension>
         *             &lt;/simpleContent>
         *           &lt;/complexType>
         *         &lt;/element>
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
            "quantity",
            "tdQuantity",
            "uncertainQuantity",
            "demand",
            "prize",
            "release",
            "serviceTime",
            "predecessors",
            "successors",
            "skill",
            "resource"
        })
        public static class Request {

            protected List<Tw> tw;
            protected Double quantity;
            @XmlElement(name = "td_quantity")
            protected TimeDependentParameterType tdQuantity;
            @XmlElement(name = "uncertain_quantity")
            protected UncertainParameterType uncertainQuantity;
            protected List<Demand> demand;
            protected BigInteger prize;
            protected Double release;
            @XmlElement(name = "service_time")
            protected Object serviceTime;
            protected Instance.Requests.Request.Predecessors predecessors;
            protected Instance.Requests.Request.Successors successors;
            @XmlElement(type = Integer.class)
            protected List<Integer> skill;
            protected List<Instance.Requests.Request.Resource> resource;
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
             * Obtient la valeur de la propriété quantity.
             * 
             * @return
             *     possible object is
             *     {@link Double }
             *     
             */
            public Double getQuantity() {
                return quantity;
            }

            /**
             * Définit la valeur de la propriété quantity.
             * 
             * @param value
             *     allowed object is
             *     {@link Double }
             *     
             */
            public void setQuantity(Double value) {
                this.quantity = value;
            }

            /**
             * Obtient la valeur de la propriété tdQuantity.
             * 
             * @return
             *     possible object is
             *     {@link TimeDependentParameterType }
             *     
             */
            public TimeDependentParameterType getTdQuantity() {
                return tdQuantity;
            }

            /**
             * Définit la valeur de la propriété tdQuantity.
             * 
             * @param value
             *     allowed object is
             *     {@link TimeDependentParameterType }
             *     
             */
            public void setTdQuantity(TimeDependentParameterType value) {
                this.tdQuantity = value;
            }

            /**
             * Obtient la valeur de la propriété uncertainQuantity.
             * 
             * @return
             *     possible object is
             *     {@link UncertainParameterType }
             *     
             */
            public UncertainParameterType getUncertainQuantity() {
                return uncertainQuantity;
            }

            /**
             * Définit la valeur de la propriété uncertainQuantity.
             * 
             * @param value
             *     allowed object is
             *     {@link UncertainParameterType }
             *     
             */
            public void setUncertainQuantity(UncertainParameterType value) {
                this.uncertainQuantity = value;
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
             * Obtient la valeur de la propriété release.
             * 
             * @return
             *     possible object is
             *     {@link Double }
             *     
             */
            public Double getRelease() {
                return release;
            }

            /**
             * Définit la valeur de la propriété release.
             * 
             * @param value
             *     allowed object is
             *     {@link Double }
             *     
             */
            public void setRelease(Double value) {
                this.release = value;
            }

            /**
             * Obtient la valeur de la propriété serviceTime.
             * 
             * @return
             *     possible object is
             *     {@link Object }
             *     
             */
            public Object getServiceTime() {
                return serviceTime;
            }

            /**
             * Définit la valeur de la propriété serviceTime.
             * 
             * @param value
             *     allowed object is
             *     {@link Object }
             *     
             */
            public void setServiceTime(Object value) {
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
             *       &lt;attribute name="id" use="required" type="{http://www.w3.org/2001/XMLSchema}int" />
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
                @XmlAttribute(name = "id", required = true)
                protected int id;

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
                 */
                public int getId() {
                    return id;
                }

                /**
                 * Définit la valeur de la propriété id.
                 * 
                 */
                public void setId(int value) {
                    this.id = value;
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
     *                 &lt;attribute name="id" use="required" type="{http://www.w3.org/2001/XMLSchema}integer" />
     *                 &lt;attribute name="renewable" use="required" type="{http://www.w3.org/2001/XMLSchema}boolean" />
     *                 &lt;attribute name="name" use="required" type="{http://www.w3.org/2001/XMLSchema}string" />
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
         *       &lt;attribute name="id" use="required" type="{http://www.w3.org/2001/XMLSchema}integer" />
         *       &lt;attribute name="renewable" use="required" type="{http://www.w3.org/2001/XMLSchema}boolean" />
         *       &lt;attribute name="name" use="required" type="{http://www.w3.org/2001/XMLSchema}string" />
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

            @XmlValue
            protected String content;
            @XmlAttribute(name = "id", required = true)
            protected BigInteger id;
            @XmlAttribute(name = "renewable", required = true)
            protected boolean renewable;
            @XmlAttribute(name = "name", required = true)
            protected String name;

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
             * Obtient la valeur de la propriété renewable.
             * 
             */
            public boolean isRenewable() {
                return renewable;
            }

            /**
             * Définit la valeur de la propriété renewable.
             * 
             */
            public void setRenewable(boolean value) {
                this.renewable = value;
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

    }

}
