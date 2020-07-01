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
    private String country;

    @JsonProperty("CountryCode")
    @SerializedName("CountryCode")
    private String countryCode;

    @JsonProperty("Slug")
    @SerializedName("Slug")
    private String slug;

    @JsonProperty("NewConfirmed")
    @SerializedName("NewConfirmed")
    private int newConfirmed;

    @JsonProperty("TotalConfirmed")
    @SerializedName("TotalConfirmed")
    private int totalConfirmed;

    @JsonProperty("NewDeaths")
    @SerializedName("NewDeaths")
    private int newDeaths;

    @JsonProperty("TotalDeaths")
    @SerializedName("TotalDeaths")
    private int totalDeaths;

    @JsonProperty("NewRecovered")
    @SerializedName("NewRecovered")
    private int newRecovered;

    @JsonProperty("TotalRecovered")
    @SerializedName("TotalRecovered")
    private int totalRecovered;

    @JsonProperty("Date")
    @SerializedName("Date")
    private String date;
}
