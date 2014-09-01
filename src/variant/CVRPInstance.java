package variant;

public class CVRPInstance {
	
	public static final int ID = 0;
	
	public static final int NODE_X = 1;
	
	public static final int NODE_Y = 2;
	
	private String name;
	
	private String comment;
	
	private String type;
	
	private int dimension;
	
	private String edgeWeightType;
	
	private int capacity;
	
	private int vehicles;
	
	private int[][] nodeCoordinates;
	
	private int[][] demands;
	
	private int[] depotSection;

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public String getComment() {
		return comment;
	}

	public void setComment(String comment) {
		this.comment = comment;
	}

	public String getType() {
		return type;
	}

	public void setType(String type) {
		this.type = type;
	}

	public int getDimension() {
		return dimension;
	}

	public void setDimension(int dimension) {
		this.dimension = dimension;
	}

	public String getEdgeWeightType() {
		return edgeWeightType;
	}

	public void setEdgeWeightType(String edgeWeightType) {
		this.edgeWeightType = edgeWeightType;
	}

	public int getCapacity() {
		return capacity;
	}

	public void setCapacity(int capacity) {
		this.capacity = capacity;
	}

	public int getVehicles() {
		return vehicles;
	}

	public void setVehicles(int vehicles) {
		this.vehicles = vehicles;
	}

	public int[][] getNodeCoordinates() {
		return nodeCoordinates;
	}

	public void setNodeCoordinates(int[][] nodeCoordinates) {
		this.nodeCoordinates = nodeCoordinates;
	}

	public int[][] getDemands() {
		return demands;
	}

	public void setDemands(int[][] demands) {
		this.demands = demands;
	}

	public int[] getDepotSection() {
		return depotSection;
	}

	public void setDepotSection(int[] depotSection) {
		this.depotSection = depotSection;
	}
	
}
