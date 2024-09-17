package tejas.model.mobileshop;

public enum Resolution {
    HD("1280x720"),       // High Definition
    FULL_HD("1920x1080"), // Full High Definition
    QHD("2560x1440"),     // Quad High Definition
    UHD("3840x2160"),     // Ultra High Definition
    UHD_8K("7680x4320"),  // 8K Ultra High Definition
    WVGA("800x480"),      // Wide Video Graphics Array
    FWVGA("854x480"),     // Full Wide Video Graphics Array
    QVGA("320x240"),      // Quarter Video Graphics Array
    WQHD("3440x1440");    // Wide Quad High Definition

    private final String resolution;

    Resolution(String resolution) {
        this.resolution = resolution;
    }

    @Override
    public String toString() {
        return resolution;
    }
}
