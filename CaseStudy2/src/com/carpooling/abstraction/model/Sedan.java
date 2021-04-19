package com.carpooling.abstraction.model;

public class Sedan extends Car {
	private boolean absEnable;
	private int bootSpace;

	public Sedan() {
	}

	public Sedan(long id, String name, boolean absEnable, int bootSpace) {
		super(id, name);
		this.absEnable = absEnable;
		this.bootSpace = bootSpace;
	}

	public boolean isAbsEnable() {
		return absEnable;
	}

	public void setAbsEnable(boolean absEnable) {
		this.absEnable = absEnable;
	}

	public int getBootSpace() {
		return bootSpace;
	}

	public void setBootSpace(int bootSpace) {
		this.bootSpace = bootSpace;
	}

	@Override
	public String toString() {
		return "Sedan [absEnable=" + absEnable + ", bootSpace=" + bootSpace + "]";
	}

	@Override
	public double calculateDrivingCost(double km) {
		double price = 15;
		if (absEnable == true)
			price = price + 10;
		if (bootSpace > 600) {
			double c = (price * 20) / 100;
			price = price + c;
		}
		return price;
	}

}