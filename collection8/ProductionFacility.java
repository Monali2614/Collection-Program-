package com.yash.collection8;

import java.time.LocalDate;

public class ProductionFacility {

	private int plid;
	private String facility_name;
	private String facility_location;
	private int production_perday;
	private String itemnames[];
	private LocalDate date;

	public int getPlid() {
		return plid;
	}

	public void setPlid(int plid) {
		this.plid = plid;
	}

	public String getFacility_name() {
		return facility_name;
	}

	public void setFacility_name(String facility_name) {
		this.facility_name = facility_name;
	}

	public String getFacility_location() {
		return facility_location;
	}

	public void setFacility_location(String facility_location) {
		this.facility_location = facility_location;
	}

	public int getProduction_perday() {
		return production_perday;
	}

	public void setProduction_perday(int production_perday) {
		this.production_perday = production_perday;
	}

	public String[] getItemnames() {
		return itemnames;
	}

	public void setItemnames(String[] itemnames) {
		this.itemnames = itemnames;
	}

	public LocalDate getDate() {
		return date;
	}

	public void setDate(LocalDate date) {
		this.date = date;
	}

}
