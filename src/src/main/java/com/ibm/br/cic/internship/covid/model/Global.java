package com.ibm.br.cic.internship.covid.model;

import com.fasterxml.jackson.annotation.JsonProperty;
import com.google.gson.annotations.SerializedName;
import lombok.Data;

/**
 * @author JamieRichardson
 */
public @Data class Global {

    @JsonProperty("NewConfirmed")
    @SerializedName("NewConfirmed")
    private final int newConfirmed;

    @JsonProperty("TotalConfirmed")
    @SerializedName("TotalConfirmed")
    private final int totalConfirmed;

    @JsonProperty("NewDeaths")
    @SerializedName("NewDeaths")
    private final int newDeaths;

    @JsonProperty("TotalDeaths")
    @SerializedName("TotalDeaths")
    private final int totalDeaths;

    @JsonProperty("NewRecovered")
    @SerializedName("NewRecovered")
    private final int newRecovered;

    @JsonProperty("TotalRecovered")
    @SerializedName("TotalRecovered")
    private final int totalRecovered;
}
