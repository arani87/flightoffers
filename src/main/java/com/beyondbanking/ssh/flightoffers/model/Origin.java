
package com.beyondbanking.ssh.flightoffers.model;

import com.fasterxml.jackson.annotation.*;

import java.util.HashMap;
import java.util.Map;

@JsonInclude(JsonInclude.Include.NON_NULL)
@JsonPropertyOrder({
    "airport"
})
public class Origin {

    @JsonProperty("airport")
    private Airport airport;
    @JsonIgnore
    private Map<String, Object> additionalProperties = new HashMap<String, Object>();

    @JsonProperty("airport")
    public Airport getAirport() {
        return airport;
    }

    @JsonProperty("airport")
    public void setAirport(Airport airport) {
        this.airport = airport;
    }

    @JsonAnyGetter
    public Map<String, Object> getAdditionalProperties() {
        return this.additionalProperties;
    }

    @JsonAnySetter
    public void setAdditionalProperty(String name, Object value) {
        this.additionalProperties.put(name, value);
    }

}
