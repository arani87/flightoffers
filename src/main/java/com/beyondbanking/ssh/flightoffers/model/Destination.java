
package com.beyondbanking.ssh.flightoffers.model;

import com.fasterxml.jackson.annotation.*;

import java.util.HashMap;
import java.util.Map;

@JsonInclude(JsonInclude.Include.NON_NULL)
@JsonPropertyOrder({
    "airport"
})
public class Destination {

    @JsonProperty("airport")
    private Airport_ airport;
    @JsonIgnore
    private Map<String, Object> additionalProperties = new HashMap<String, Object>();

    @JsonProperty("airport")
    public Airport_ getAirport() {
        return airport;
    }

    @JsonProperty("airport")
    public void setAirport(Airport_ airport) {
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
