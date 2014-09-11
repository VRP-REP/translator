//
// Ce fichier a été généré par l'implémentation de référence JavaTM Architecture for XML Binding (JAXB), v2.2.8-b130911.1802 
// Voir <a href="http://java.sun.com/xml/jaxb">http://java.sun.com/xml/jaxb</a> 
// Toute modification apportée à ce fichier sera perdue lors de la recompilation du schéma source. 
// Généré le : 2014.09.09 à 04:59:16 PM CEST 
//


package model;

import javax.xml.bind.JAXBElement;
import javax.xml.bind.annotation.XmlElementDecl;
import javax.xml.bind.annotation.XmlRegistry;
import javax.xml.namespace.QName;


/**
 * This object contains factory methods for each 
 * Java content interface and Java element interface 
 * generated in the model package. 
 * <p>An ObjectFactory allows you to programatically 
 * construct new instances of the Java representation 
 * for XML content. The Java representation of XML 
 * content can consist of schema derived interfaces 
 * and classes representing the binding of schema 
 * type definitions, element declarations and model 
 * groups.  Factory methods for each of these are 
 * provided in this class.
 * 
 */
@XmlRegistry
public class ObjectFactory {

    private final static QName _RandomVariable_QNAME = new QName("", "random_variable");
    private final static QName _Dimensions_QNAME = new QName("", "dimensions");

    /**
     * Create a new ObjectFactory that can be used to create new instances of schema derived classes for package: model
     * 
     */
    public ObjectFactory() {
    }

    /**
     * Create an instance of {@link Instance }
     * 
     */
    public Instance createInstance() {
        return new Instance();
    }

    /**
     * Create an instance of {@link TwType }
     * 
     */
    public TwType createTwType() {
        return new TwType();
    }

    /**
     * Create an instance of {@link UncertainParameterType }
     * 
     */
    public UncertainParameterType createUncertainParameterType() {
        return new UncertainParameterType();
    }

    /**
     * Create an instance of {@link Instance.Drivers }
     * 
     */
    public Instance.Drivers createInstanceDrivers() {
        return new Instance.Drivers();
    }

    /**
     * Create an instance of {@link Instance.Drivers.DriverProfile }
     * 
     */
    public Instance.Drivers.DriverProfile createInstanceDriversDriverProfile() {
        return new Instance.Drivers.DriverProfile();
    }

    /**
     * Create an instance of {@link Instance.Resources }
     * 
     */
    public Instance.Resources createInstanceResources() {
        return new Instance.Resources();
    }

    /**
     * Create an instance of {@link Instance.Requests }
     * 
     */
    public Instance.Requests createInstanceRequests() {
        return new Instance.Requests();
    }

    /**
     * Create an instance of {@link Instance.Requests.Request }
     * 
     */
    public Instance.Requests.Request createInstanceRequestsRequest() {
        return new Instance.Requests.Request();
    }

    /**
     * Create an instance of {@link Instance.Fleet }
     * 
     */
    public Instance.Fleet createInstanceFleet() {
        return new Instance.Fleet();
    }

    /**
     * Create an instance of {@link Instance.Fleet.VehicleProfile }
     * 
     */
    public Instance.Fleet.VehicleProfile createInstanceFleetVehicleProfile() {
        return new Instance.Fleet.VehicleProfile();
    }

    /**
     * Create an instance of {@link Instance.Network }
     * 
     */
    public Instance.Network createInstanceNetwork() {
        return new Instance.Network();
    }

    /**
     * Create an instance of {@link Instance.Network.Links }
     * 
     */
    public Instance.Network.Links createInstanceNetworkLinks() {
        return new Instance.Network.Links();
    }

    /**
     * Create an instance of {@link Instance.Network.Nodes }
     * 
     */
    public Instance.Network.Nodes createInstanceNetworkNodes() {
        return new Instance.Network.Nodes();
    }

    /**
     * Create an instance of {@link Instance.Info }
     * 
     */
    public Instance.Info createInstanceInfo() {
        return new Instance.Info();
    }

    /**
     * Create an instance of {@link RandomVariableType }
     * 
     */
    public RandomVariableType createRandomVariableType() {
        return new RandomVariableType();
    }

    /**
     * Create an instance of {@link Tw }
     * 
     */
    public Tw createTw() {
        return new Tw();
    }

    /**
     * Create an instance of {@link TwType.Start }
     * 
     */
    public TwType.Start createTwTypeStart() {
        return new TwType.Start();
    }

    /**
     * Create an instance of {@link TwType.End }
     * 
     */
    public TwType.End createTwTypeEnd() {
        return new TwType.End();
    }

    /**
     * Create an instance of {@link TwType.Period }
     * 
     */
    public TwType.Period createTwTypePeriod() {
        return new TwType.Period();
    }

    /**
     * Create an instance of {@link Compartment }
     * 
     */
    public Compartment createCompartment() {
        return new Compartment();
    }

    /**
     * Create an instance of {@link DimensionsType }
     * 
     */
    public DimensionsType createDimensionsType() {
        return new DimensionsType();
    }

    /**
     * Create an instance of {@link Action }
     * 
     */
    public Action createAction() {
        return new Action();
    }

    /**
     * Create an instance of {@link Location }
     * 
     */
    public Location createLocation() {
        return new Location();
    }

    /**
     * Create an instance of {@link Demand }
     * 
     */
    public Demand createDemand() {
        return new Demand();
    }

    /**
     * Create an instance of {@link TimeDependentParameterType }
     * 
     */
    public TimeDependentParameterType createTimeDependentParameterType() {
        return new TimeDependentParameterType();
    }

    /**
     * Create an instance of {@link UncertainParameterType.Scenario }
     * 
     */
    public UncertainParameterType.Scenario createUncertainParameterTypeScenario() {
        return new UncertainParameterType.Scenario();
    }

    /**
     * Create an instance of {@link Instance.Drivers.DriverProfile.CompatibleWithAllVehicles }
     * 
     */
    public Instance.Drivers.DriverProfile.CompatibleWithAllVehicles createInstanceDriversDriverProfileCompatibleWithAllVehicles() {
        return new Instance.Drivers.DriverProfile.CompatibleWithAllVehicles();
    }

    /**
     * Create an instance of {@link Instance.Drivers.DriverProfile.Skill }
     * 
     */
    public Instance.Drivers.DriverProfile.Skill createInstanceDriversDriverProfileSkill() {
        return new Instance.Drivers.DriverProfile.Skill();
    }

    /**
     * Create an instance of {@link Instance.Drivers.DriverProfile.WorkloadProfile }
     * 
     */
    public Instance.Drivers.DriverProfile.WorkloadProfile createInstanceDriversDriverProfileWorkloadProfile() {
        return new Instance.Drivers.DriverProfile.WorkloadProfile();
    }

    /**
     * Create an instance of {@link Instance.Resources.Resource }
     * 
     */
    public Instance.Resources.Resource createInstanceResourcesResource() {
        return new Instance.Resources.Resource();
    }

    /**
     * Create an instance of {@link Instance.Requests.Request.Predecessors }
     * 
     */
    public Instance.Requests.Request.Predecessors createInstanceRequestsRequestPredecessors() {
        return new Instance.Requests.Request.Predecessors();
    }

    /**
     * Create an instance of {@link Instance.Requests.Request.Successors }
     * 
     */
    public Instance.Requests.Request.Successors createInstanceRequestsRequestSuccessors() {
        return new Instance.Requests.Request.Successors();
    }

    /**
     * Create an instance of {@link Instance.Requests.Request.Resource }
     * 
     */
    public Instance.Requests.Request.Resource createInstanceRequestsRequestResource() {
        return new Instance.Requests.Request.Resource();
    }

    /**
     * Create an instance of {@link Instance.Fleet.TrailerProfile }
     * 
     */
    public Instance.Fleet.TrailerProfile createInstanceFleetTrailerProfile() {
        return new Instance.Fleet.TrailerProfile();
    }

    /**
     * Create an instance of {@link Instance.Fleet.VehicleProfile.DepartureFromAnyNode }
     * 
     */
    public Instance.Fleet.VehicleProfile.DepartureFromAnyNode createInstanceFleetVehicleProfileDepartureFromAnyNode() {
        return new Instance.Fleet.VehicleProfile.DepartureFromAnyNode();
    }

    /**
     * Create an instance of {@link Instance.Fleet.VehicleProfile.ArrivalAtAnyNode }
     * 
     */
    public Instance.Fleet.VehicleProfile.ArrivalAtAnyNode createInstanceFleetVehicleProfileArrivalAtAnyNode() {
        return new Instance.Fleet.VehicleProfile.ArrivalAtAnyNode();
    }

    /**
     * Create an instance of {@link Instance.Fleet.VehicleProfile.Resource }
     * 
     */
    public Instance.Fleet.VehicleProfile.Resource createInstanceFleetVehicleProfileResource() {
        return new Instance.Fleet.VehicleProfile.Resource();
    }

    /**
     * Create an instance of {@link Instance.Fleet.VehicleProfile.Trailers }
     * 
     */
    public Instance.Fleet.VehicleProfile.Trailers createInstanceFleetVehicleProfileTrailers() {
        return new Instance.Fleet.VehicleProfile.Trailers();
    }

    /**
     * Create an instance of {@link Instance.Network.Links.Link }
     * 
     */
    public Instance.Network.Links.Link createInstanceNetworkLinksLink() {
        return new Instance.Network.Links.Link();
    }

    /**
     * Create an instance of {@link Instance.Network.Nodes.Node }
     * 
     */
    public Instance.Network.Nodes.Node createInstanceNetworkNodesNode() {
        return new Instance.Network.Nodes.Node();
    }

    /**
     * Create an instance of {@link Instance.Info.Descriptor }
     * 
     */
    public Instance.Info.Descriptor createInstanceInfoDescriptor() {
        return new Instance.Info.Descriptor();
    }

    /**
     * Create an instance of {@link RandomVariableType.Moment }
     * 
     */
    public RandomVariableType.Moment createRandomVariableTypeMoment() {
        return new RandomVariableType.Moment();
    }

    /**
     * Create an instance of {@link RandomVariableType.Parameter }
     * 
     */
    public RandomVariableType.Parameter createRandomVariableTypeParameter() {
        return new RandomVariableType.Parameter();
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link RandomVariableType }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "", name = "random_variable")
    public JAXBElement<RandomVariableType> createRandomVariable(RandomVariableType value) {
        return new JAXBElement<RandomVariableType>(_RandomVariable_QNAME, RandomVariableType.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link DimensionsType }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "", name = "dimensions")
    public JAXBElement<DimensionsType> createDimensions(DimensionsType value) {
        return new JAXBElement<DimensionsType>(_Dimensions_QNAME, DimensionsType.class, null, value);
    }

}
