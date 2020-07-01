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

    @JsonProperty("Global")
    private Global global;

    @JsonProperty("Countries")
    private List<Country> countries;
    
    public List<Country> getCountries() {
    	return countries;
    }
}
