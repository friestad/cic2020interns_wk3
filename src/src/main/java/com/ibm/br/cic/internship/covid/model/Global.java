package com.ibm.br.cic.internship.covid.model;

import com.fasterxml.jackson.annotation.JsonProperty;
import com.google.gson.annotations.SerializedName;
import lombok.Data;

/**
 * @author JamieRichardson
 */
public @Data class Global {

    public int getNewConfirmed() {
		return newConfirmed;
	}

	public int getTotalConfirmed() {
		return totalConfirmed;
	}

	public int getNewDeaths() {
		return newDeaths;
	}

	public int getTotalDeaths() {
		return totalDeaths;
	}

	public int getNewRecovered() {
		return newRecovered;
	}

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

	public int getTotalRecovered() {
		return totalRecovered;
	}
}
