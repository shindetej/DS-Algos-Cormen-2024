package tejas.model.mobileshop;

public class MobileDisplay {

	DisplayType displayType;
	Resolution resolution; 
	Double sizeInInches;
	Integer refreshRate;
	
	public MobileDisplay(DisplayType displayType, Resolution resolution, Double sizeInInches, Integer refreshRate) {
		super();
		this.displayType = displayType;
		this.resolution = resolution;
		this.sizeInInches = sizeInInches;
		this.refreshRate = refreshRate;
	}
	
	public DisplayType getDisplayType() {
		return displayType;
	}
	public void setDisplayType(DisplayType displayType) {
		this.displayType = displayType;
	}
	public Resolution getResolution() {
		return resolution;
	}
	public void setResolution(Resolution resolution) {
		this.resolution = resolution;
	}
	public Double getSizeInInches() {
		return sizeInInches;
	}
	public void setSizeInInches(Double sizeInInches) {
		this.sizeInInches = sizeInInches;
	}
	public Integer getRefreshRate() {
		return refreshRate;
	}
	public void setRefreshRate(Integer refreshRate) {
		this.refreshRate = refreshRate;
	}
	

	@Override
	public String toString() {
	    return "{\n" +
	           "  \"displayType\": \"" + displayType + "\",\n" +
	           "  \"resolution\": \"" + resolution + "\",\n" +
	           "  \"sizeInInches\": " + sizeInInches + ",\n" +
	           "  \"refreshRate\": " + refreshRate + "\n" +
	           "}";
	}
}
