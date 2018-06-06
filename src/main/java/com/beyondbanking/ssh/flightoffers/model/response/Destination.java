
package com.beyondbanking.ssh.flightoffers.model.response;

import java.util.HashMap;
import java.util.Map;

import com.beyondbanking.ssh.flightoffers.model.Airport;
import com.fasterxml.jackson.annotation.JsonAnyGetter;
import com.fasterxml.jackson.annotation.JsonAnySetter;
import com.fasterxml.jackson.annotation.JsonIgnore;
import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonPropertyOrder;

@JsonInclude(JsonInclude.Include.NON_NULL)
@JsonPropertyOrder({
    "airport"
})
public class Destination {

    @JsonProperty("airport")
    private com.beyondbanking.ssh.flightoffers.model.Airport airport;
    @JsonIgnore
    private Map<String, Object> additionalProperties = new HashMap<String, Object>();

    @JsonProperty("airport")
    public com.beyondbanking.ssh.flightoffers.model.Airport getAirport() {
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
