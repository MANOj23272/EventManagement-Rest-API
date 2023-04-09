package com.springdatarest.EventmanagementApiApplication.entities;

import java.util.Objects;

import jakarta.persistence.Entity;
@Entity
public class Venue extends AbstractEntity {

	private String name;
	private String streetAddress;
	private String streetAddress2;
	private String city;
	private String state;
	private String country;
	private String postalCode;

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public String getStreetAddress() {
		return streetAddress;
	}

	public void setStreetAddress(String streetaAddress) {
		this.streetAddress = streetaAddress;
	}

	public String getStreetAddress2() {
		return streetAddress2;
	}

	public void setStreetAddress2(String streetAddress2) {
		this.streetAddress2 = streetAddress2;
	}

	public String getCity() {
		return city;
	}

	public void setCity(String city) {
		this.city = city;
	}

	public String getState() {
		return state;
	}

	public void setState(String state) {
		this.state = state;
	}

	public String getCountry() {
		return country;
	}

	public void setCountry(String country) {
		this.country = country;
	}

	public String getPostalCode() {
		return postalCode;
	}

	public void setPostalCode(String postalcode) {
		this.postalCode = postalcode;
	}
	public Long getResourceId() {
		return this.id;
	}
	
	@Override
	public boolean equals(Object obj) {
		return Objects.equals(id,((Venue)obj).id);
	}
	
	@Override
	public int hashCode() {
		return Objects.hash(id);
	}
}
