package com.carpooling.abstraction.model;

public class HatchBack extends Car {
	private boolean powerWindowsEnable;
	private boolean automaticGear;

	public HatchBack() {
	}

	public HatchBack(long id, String name, boolean powerWindowsEnable, boolean automaticGear) {
		super(id, name);
		this.powerWindowsEnable = powerWindowsEnable;
		this.automaticGear = automaticGear;
	}

	public boolean isPowerWindowsEnable() {
		return powerWindowsEnable;
	}

	public void setPowerWindowsEnable(boolean powerWindowsEnable) {
		this.powerWindowsEnable = powerWindowsEnable;
	}

	public boolean isAutomaticGear() {
		return automaticGear;
	}

	public void setAutumaticGear(boolean automaticGear) {
		this.automaticGear = automaticGear;
	}

	@Override
	public String toString() {
		return "HatchBack [powerWindowsEnable=" + powerWindowsEnable + ", autumaticGear=" + automaticGear + "]";
	}

	@Override
	public double calculateDrivingCost(double km) {
		double price=0;
		double count=km/10;
		if(automaticGear==true) {
			price=10;
		}else {
			price=12;
		}
		return price*count;
	}

}