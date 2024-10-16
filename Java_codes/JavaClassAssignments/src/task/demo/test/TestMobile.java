package task.demo.test;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

import task.demo.model.Mobile;

public class TestMobile {
	public static void main(String[] args) {
		List<Mobile> mobiles = new ArrayList<>();
		mobiles.add(new Mobile("Samsung", "S24", "256 GB", "ATT", 125000, false));
		mobiles.add(new Mobile("Apple", "iPhone 15 Pro Max", "512 GB", "ATT", 70000, true));
		mobiles.add(new Mobile("Motorola", "Moto Edge 50 Neo", "512 GB", "Verizon", 25000, false));
		mobiles.add(new Mobile("Samsung", "S23", "256 GB", "Airtel", 75000, false));

		Collections.sort(mobiles);
		for (Mobile mobile : mobiles) {
			System.out.println(mobile);
		}

	}
}
