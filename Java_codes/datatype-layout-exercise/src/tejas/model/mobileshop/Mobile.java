package tejas.model.mobileshop;

import tejas.model.bookshelf.Dimension;

/*
 * OS	‎Android 13.0
RAM	‎6 GB
Product Dimensions	‎0.9 x 7.7 x 16.7 cm; 206 g
Batteries	‎1 Lithium Ion batteries required. (included)
Item model number	‎SM-M146B
Wireless communication technologies	‎Cellular
Connectivity technologies	‎Bluetooth, Wi-Fi, USB
GPS	‎True
Special features	‎Dual SIM, Expandable Memory, Always On Display, Mobile Hotspot Capability, Built-In GPS
Other display features	‎Wireless
Device interface - primary	‎Touchscreen
Resolution	‎1080 x 2408
Other camera features	‎Triple Camera Setup – Rear - 50MP+2MP+2MP | Front – 13MP
Audio Jack	‎3.5 mm
Form factor	‎Bar
Colour	‎Icy Silver
Battery Power Rating	‎6000
Whats in the box	‎Device|Data Cable (USB Type C to C)|SIM Tray Ejector Pin|Quick Start Guide
Manufacturer	‎SAMSUNG
Country of Origin	‎India
Item Weight	‎206 g

 * 
 * */
public class Mobile {
	private String modelNumber;
	private String manufacturer;
	private String vendor;
	private String operatingSystem;
	private Integer memory;
	private Dimension dimension;
	private double weightInGrams;
	private String color;
	private boolean isDualSim;
	private GPSType GPS;
	private USBType USB;
	private MobileCamera rearCameraDetails;
	private MobileCamera frontCameraDetails;
	private MobileDisplay displayDetails;
	private IPRating ipRating;

	public Mobile(String modelNumber, String manufacturer, String vendor, String operatingSystem, int memory, Dimension dimension,
			String color, double weightInGrams, boolean dualSim, GPSType gpsType, USBType usb, MobileCamera rearCamera,MobileCamera frontCamera,
			MobileDisplay display,IPRating ipRating) {
		this.modelNumber = modelNumber;
		this.manufacturer = manufacturer;
		this.vendor = vendor;
		this.operatingSystem = operatingSystem;
		this.dimension = dimension;
		this.color = color;
		this.memory =memory;
		this.weightInGrams = weightInGrams;
		this.isDualSim = dualSim;
		this.GPS = gpsType;
		this.USB = usb;
		this.rearCameraDetails = rearCamera;
		this.frontCameraDetails = frontCamera;
		this.displayDetails = display;
		this.ipRating =  ipRating;
	}

	public String getModelNumber() {
		return modelNumber;
	}

	public void setModelNumber(String modelNumber) {
		this.modelNumber = modelNumber;
	}

	public String getManufacturer() {
		return manufacturer;
	}

	public void setManufacturer(String manufacturer) {
		this.manufacturer = manufacturer;
	}

	public String getVendor() {
		return vendor;
	}

	public void setVendor(String vendor) {
		this.vendor = vendor;
	}

	public String getOperatingSystem() {
		return operatingSystem;
	}

	public void setOperatingSystem(String operatingSystem) {
		this.operatingSystem = operatingSystem;
	}

	public Integer getMemory() {
		return memory;
	}

	public void setMemory(Integer memory) {
		this.memory = memory;
	}

	public Dimension getDimension() {
		return dimension;
	}

	public void setDimension(Dimension dimension) {
		this.dimension = dimension;
	}

	public double getWeightInGrams() {
		return weightInGrams;
	}

	public void setWeightInGrams(double weightInGrams) {
		this.weightInGrams = weightInGrams;
	}

	public String getColor() {
		return color;
	}

	public void setColor(String color) {
		this.color = color;
	}

	public boolean isDualSim() {
		return isDualSim;
	}

	public void setDualSim(boolean isDualSim) {
		this.isDualSim = isDualSim;
	}

	public GPSType getGPS() {
		return GPS;
	}

	public void setGPS(GPSType gPS) {
		GPS = gPS;
	}

	public USBType getUSB() {
		return USB;
	}

	public void setUSB(USBType uSB) {
		USB = uSB;
	}

	
	public MobileCamera getRearCameraDetails() {
		return rearCameraDetails;
	}

	public void setRearCameraDetails(MobileCamera rearCameraDetails) {
		this.rearCameraDetails = rearCameraDetails;
	}

	public MobileCamera getFrontCameraDetails() {
		return frontCameraDetails;
	}

	public void setFrontCameraDetails(MobileCamera frontCameraDetails) {
		this.frontCameraDetails = frontCameraDetails;
	}

	public MobileDisplay getDisplayDetails() {
		return displayDetails;
	}

	public void setDisplayDetails(MobileDisplay displayDetails) {
		this.displayDetails = displayDetails;
	}
	

	public IPRating getIpRating() {
		return ipRating;
	}

	public void setIpRating(IPRating ipRating) {
		this.ipRating = ipRating;
	}

	@Override
	public String toString() {
	    return "{\n" +
	           "  \"modelNumber\": \"" + modelNumber + "\",\n" +
	           "  \"manufacturer\": \"" + manufacturer + "\",\n" +
	           "  \"vendor\": \"" + vendor + "\",\n" +
	           "  \"operatingSystem\": \"" + operatingSystem + "\",\n" +
	           "  \"memory\": \"" + memory + "\",\n" +
	           "  \"dimension\": \"" + dimension + "\",\n" +
	           "  \"weightInGrams\": " + weightInGrams + ",\n" +
	           "  \"color\": \"" + color + "\",\n" +
	           "  \"isDualSim\": " + isDualSim + ",\n" +
	           "  \"GPS\": \"" + GPS + "\",\n" +
	           "  \"USB\": \"" + USB + "\",\n" +
	           "  \"frontCameraDetails\": " + frontCameraDetails + ",\n" +
	           "  \"rearCameraDetails\": " + rearCameraDetails + ",\n" +
	           "  \"displayDetails\": " + displayDetails + "\n" +
	           "  \"ipRATING \": " + ipRating + "\n" +
	           "}";
	}



}
