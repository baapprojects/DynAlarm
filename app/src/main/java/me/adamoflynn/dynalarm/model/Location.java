package me.adamoflynn.dynalarm.model;

import io.realm.RealmObject;
import io.realm.annotations.PrimaryKey;

public class Location extends RealmObject {

  @PrimaryKey
  private int id;
  private String location;
	private String address;
  private double locLat;
  private double locLon;

  public Location(){}

  public Location(int id, String location, double locLat, double locLon){
      this.setId(id);
      this.setLocation(location);
      this.setLocLat(locLat);
      this.setLocLon(locLon);
  }

	public Location(int id, String location, String address, double locLat, double locLon){
		this.setId(id);
		this.setLocation(location);
		this.setAddress(address);
		this.setLocLat(locLat);
		this.setLocLon(locLon);
	}


  public int getId() {
      return id;
  }

  public void setId(int id) {
      this.id = id;
  }

  public String getLocation() {
      return location;
  }

  public void setLocation(String location) {
      this.location = location;
  }

  public double getLocLat() {
      return locLat;
  }

  public void setLocLat(double locLat) {
      this.locLat = locLat;
  }

  public double getLocLon() {
      return locLon;
  }

  public void setLocLon(double locLon) {
      this.locLon = locLon;
  }

	public String getAddress() {
		return address;
	}

	public void setAddress(String address) {
		this.address = address;
	}
}



