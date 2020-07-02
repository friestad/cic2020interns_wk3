package com.ibm.br.cic.internship.covid.model;

import com.fasterxml.jackson.annotation.JsonProperty;
import java.util.List;
import lombok.Data;

/**
 * @author JamieRichardson
 */
public @Data class Comparison {

    public Comparison(List<Country> countries, CompareBy compareBy) {
		super();
		this.countries = countries;
		this.compareBy = compareBy;
	}

	@JsonProperty("Countries")
    private List<Country> countries;

    private CompareBy compareBy;

	public List<Country> getCountries() {
		return countries;
	}

	public void setCountries(List<Country> countries) {
		this.countries = countries;
	}

	public CompareBy getCompareBy() {
		return compareBy;
	}

	public void setCompareBy(CompareBy compareBy) {
		this.compareBy = compareBy;
	}
}
