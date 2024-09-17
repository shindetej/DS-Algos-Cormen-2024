package tejas.model.mobileshop;

public class MobileCamera {

	private double resolution; 
	private String aperture; 
	private String sensorSize; 
	private double focalLength; 
	private String flashType; // e.g., "LED"
	private String stabilization; // e.g., "OIS"
	private String videoResolution; // e.g., "4K"
	private int frameRate; // frames per second
	private String focusType; // e.g., "autofocus"
	private String lensType; // e.g., "wide-angle"
	private boolean hdr;
	
	
	
	public MobileCamera(double resolution, String aperture, String sensorSize,String videoResolution, boolean hdr) {
		super();
		this.resolution = resolution;
		this.aperture = aperture;
		this.sensorSize = sensorSize;
		this.hdr = hdr;
		this.videoResolution = videoResolution;
	}
	public MobileCamera(double resolution, String aperture, String sensorSize, double focalLength, String flashType,
			String stabilization, String videoResolution, int frameRate, String focusType, String lensType,
			boolean hdr) {
		super();
		this.resolution = resolution;
		this.aperture = aperture;
		this.sensorSize = sensorSize;
		this.focalLength = focalLength;
		this.flashType = flashType;
		this.stabilization = stabilization;
		this.videoResolution = videoResolution;
		this.frameRate = frameRate;
		this.focusType = focusType;
		this.lensType = lensType;
		this.hdr = hdr;
	}
	public double getResolution() {
		return resolution;
	}
	public void setResolution(double resolution) {
		this.resolution = resolution;
	}
	public String getAperture() {
		return aperture;
	}
	public void setAperture(String aperture) {
		this.aperture = aperture;
	}
	public String getSensorSize() {
		return sensorSize;
	}
	public void setSensorSize(String sensorSize) {
		this.sensorSize = sensorSize;
	}
	public double getFocalLength() {
		return focalLength;
	}
	public void setFocalLength(double focalLength) {
		this.focalLength = focalLength;
	}
	public String getFlashType() {
		return flashType;
	}
	public void setFlashType(String flashType) {
		this.flashType = flashType;
	}
	public String getStabilization() {
		return stabilization;
	}
	public void setStabilization(String stabilization) {
		this.stabilization = stabilization;
	}
	public String getVideoResolution() {
		return videoResolution;
	}
	public void setVideoResolution(String videoResolution) {
		this.videoResolution = videoResolution;
	}
	public int getFrameRate() {
		return frameRate;
	}
	public void setFrameRate(int frameRate) {
		this.frameRate = frameRate;
	}
	public String getFocusType() {
		return focusType;
	}
	public void setFocusType(String focusType) {
		this.focusType = focusType;
	}
	public String getLensType() {
		return lensType;
	}
	public void setLensType(String lensType) {
		this.lensType = lensType;
	}
	public boolean isHdr() {
		return hdr;
	}
	public void setHdr(boolean hdr) {
		this.hdr = hdr;
	}
	
	@Override
    public String toString() {
        return "{\n" +
               "  \"resolution\": " + resolution + "MP,\n" +
               "  \"aperture\": \"" + aperture + "\",\n" +
               "  \"sensorSize\": \"" + sensorSize + "\",\n" +
               "  \"focalLength\": " + focalLength + " mm,\n" +
               "  \"flashType\": \"" + flashType + "\",\n" +
               "  \"stabilization\": \"" + stabilization + "\",\n" +
               "  \"videoResolution\": \"" + videoResolution + "\",\n" +
               "  \"frameRate\": " + frameRate + " fps,\n" +
               "  \"focusType\": \"" + focusType + "\",\n" +
               "  \"lensType\": \"" + lensType + "\",\n" +
               "  \"hdr\": " + hdr + "\n" +
               "}";
    }
}
