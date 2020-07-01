package com.ibm.br.cic.internship.covid.model;

import com.fasterxml.jackson.annotation.JsonProperty;
import com.google.gson.annotations.SerializedName;
import lombok.Data;

/**
 * @author JamieRichardson
 */
public @Data class Country {

    @JsonProperty("Country")
    @SerializedName("Country")
    public String country;

    @JsonProperty("CountryCode")
    @SerializedName("CountryCode")
    public String countryCode;

    @JsonProperty("Slug")
    @SerializedName("Slug")
    public String slug;

    @JsonProperty("NewConfirmed")
    @SerializedName("NewConfirmed")
    public int newConfirmed;

    @JsonProperty("TotalConfirmed")
    @SerializedName("TotalConfirmed")
    public int totalConfirmed;

    @JsonProperty("NewDeaths")
    @SerializedName("NewDeaths")
    public int newDeaths;

    @JsonProperty("TotalDeaths")
    @SerializedName("TotalDeaths")
    public int totalDeaths;

    @JsonProperty("NewRecovered")
    @SerializedName("NewRecovered")
    public int newRecovered;

    @JsonProperty("TotalRecovered")
    @SerializedName("TotalRecovered")
    public int totalRecovered;

    @JsonProperty("Date")
    @SerializedName("Date")
    public String date;

	public String getCountry() {
		return country;
	}

	public void setCountry(String country) {
		this.country = country;
	}

	public String getCountryCode() {
		return countryCode;
	}

	public void setCountryCode(String countryCode) {
		this.countryCode = countryCode;
	}

	public String getSlug() {
		return slug;
	}

	public void setSlug(String slug) {
		this.slug = slug;
	}

	public int getNewConfirmed() {
		return newConfirmed;
	}

	public void setNewConfirmed(int newConfirmed) {
		this.newConfirmed = newConfirmed;
	}

	public int getTotalConfirmed() {
		return totalConfirmed;
	}

	public void setTotalConfirmed(int totalConfirmed) {
		this.totalConfirmed = totalConfirmed;
	}

	public int getNewDeaths() {
		return newDeaths;
	}

	public void setNewDeaths(int newDeaths) {
		this.newDeaths = newDeaths;
	}

	public int getTotalDeaths() {
		return totalDeaths;
	}

	public void setTotalDeaths(int totalDeaths) {
		this.totalDeaths = totalDeaths;
	}

	public int getNewRecovered() {
		return newRecovered;
	}

	public void setNewRecovered(int newRecovered) {
		this.newRecovered = newRecovered;
	}

	public int getTotalRecovered() {
		return totalRecovered;
	}

	public void setTotalRecovered(int totalRecovered) {
		this.totalRecovered = totalRecovered;
	}

	public String getDate() {
		return date;
	}

	public void setDate(String date) {
		this.date = date;
	}
}
