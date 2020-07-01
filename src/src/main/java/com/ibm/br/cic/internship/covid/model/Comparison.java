package com.ibm.br.cic.internship.covid.model;

import com.fasterxml.jackson.annotation.JsonProperty;
import java.util.List;
import lombok.Data;

/**
 * @author JamieRichardson
 */
public @Data class Comparison {

    @JsonProperty("Countries")
    private List<Country> countries;

    private CompareBy compareBy;
}
