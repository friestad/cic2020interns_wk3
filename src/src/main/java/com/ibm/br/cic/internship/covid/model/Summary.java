package com.ibm.br.cic.internship.covid.model;

import com.fasterxml.jackson.annotation.JsonProperty;
import java.util.List;
import lombok.Data;

/**
 * @author JamieRichardson
 */
public @Data class Summary {

    public Summary(Global global, List<Country> countries) {
        this.global = global;
        this.countries = countries;
    }

    public Global getGlobal() {
		return global;
	}

	public void setGlobal(Global global) {
		this.global = global;
	}

	public List<Country> getCountries() {
		return countries;
	}

	public void setCountries(List<Country> countries) {
		this.countries = countries;
	}

	@JsonProperty("Global")
    public Global global;

    @JsonProperty("Countries")
	public List<Country> countries;
    
   
}
