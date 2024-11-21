package tejas.model.mobileshop.app;

import tejas.model.bookshelf.Dimension;
import tejas.model.mobileshop.DisplayType;
import tejas.model.mobileshop.GPSType;
import tejas.model.mobileshop.IPRating;
import tejas.model.mobileshop.Mobile;
import tejas.model.mobileshop.MobileCamera;
import tejas.model.mobileshop.MobileDisplay;
import tejas.model.mobileshop.Resolution;
import tejas.model.mobileshop.USBType;

public class MobileCartApp {

	public static void main(String[] args) {
		Dimension dimSamsung1 = new Dimension(7.5, 0.9, 16.5, "cm");
		MobileCamera cameraSamsungRear =  new MobileCamera(50,"f/1.56", "1/2.55", 26.0, "LED", "OIS", "4K", 60, "autofocus", "wide-angle", true);
		MobileCamera cameraSamsungFront =  new MobileCamera(12,"f/1.2", "1/2.4", 26.0, "LED", "OIS", "4K", 60, "autofocus", "wide-angle", false);
		MobileDisplay displayS23 =  new MobileDisplay(DisplayType.AMOLED, Resolution.FULL_HD, 6.1, 120);
		Mobile samsung1 = new Mobile("S23", "Samsung", "Appario private Limited", "Android 13.0", 256, 
				dimSamsung1, "Soothing sea", 168, true, GPSType.GLONASS, USBType.USB_C, cameraSamsungRear,cameraSamsungFront, displayS23,IPRating.IP68);
		System.out.println("MOBILE DETAILS OF SAMSUNG S23 ULTRA: \n"+ samsung1);
	}
}
