package task.demo.model;

import java.util.Objects;

public class Mobile implements Comparable<Mobile> {
	private String make;
	private String model;
	private String memory;
	private long price;
	private String carrier;
	private boolean isRefurbished;

	public Mobile(String make, String model, String memory, String carrier, long price, boolean isRefurbished) {
		this.make = make;
		this.model = model;
		this.memory = memory;
		this.carrier = carrier;
		this.price = price;
		this.isRefurbished = isRefurbished;
	}

	public String getMake() {
		return make;
	}

	public void setMake(String make) {
		this.make = make;
	}

	public String getModel() {
		return model;
	}

	public void setModel(String model) {
		this.model = model;
	}

	public String getMemory() {
		return memory;
	}

	public void setMemory(String memory) {
		this.memory = memory;
	}

	public long getPrice() {
		return price;
	}

	public void setPrice(long price) {
		this.price = price;
	}

	public String getCarrier() {
		return carrier;
	}

	public void setCarrier(String carrier) {
		this.carrier = carrier;
	}

	public boolean isRefurbished() {
		return isRefurbished;
	}

	public void setRefurbished(boolean isRefurbished) {
		this.isRefurbished = isRefurbished;
	}

	@Override
	public int hashCode() {
		return Objects.hash(make, memory, model);
	}

	@Override
	public boolean equals(Object o) {
		if (this == o) {
			return true;
		}

		if (o == null) {
			return false;
		}

		if (getClass() != o.getClass())
			return false;

		Mobile other = (Mobile) o;
		return Objects.equals(make, other.make) && Objects.equals(model, other.model)
				&& Objects.equals(memory, other.memory);
	}

	@Override
	public String toString() {
		return "Mobile [make=" + make + ", model=" + model + ", memory=" + memory + ", price=" + price + ", carrier="
				+ carrier + ", isRefurbished=" + isRefurbished + "]";
	}

	@Override
	public int compareTo(Mobile o) {
		System.out.println("Comparing: " + this.model + " with " + o.model +":"+this.model.compareTo(o.model));
		return this.model.trim().compareToIgnoreCase(o.model.trim());
	}


}
