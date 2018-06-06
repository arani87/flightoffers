
package com.beyondbanking.ssh.flightoffers.model.response;

import java.util.HashMap;
import java.util.Map;
import com.fasterxml.jackson.annotation.JsonAnyGetter;
import com.fasterxml.jackson.annotation.JsonAnySetter;
import com.fasterxml.jackson.annotation.JsonIgnore;
import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonPropertyOrder;

@JsonInclude(JsonInclude.Include.NON_NULL)
@JsonPropertyOrder({
    "passengerType",
    "fare",
    "taxes"
})
public class PricePerPassengerType {

    @JsonProperty("passengerType")
    private String passengerType;
    @JsonProperty("fare")
    private Double fare;
    @JsonProperty("taxes")
    private Double taxes;
    @JsonIgnore
    private Map<String, Object> additionalProperties = new HashMap<String, Object>();

    @JsonProperty("passengerType")
    public String getPassengerType() {
        return passengerType;
    }

    @JsonProperty("passengerType")
    public void setPassengerType(String passengerType) {
        this.passengerType = passengerType;
    }

    @JsonProperty("fare")
    public Double getFare() {
        return fare;
    }

    @JsonProperty("fare")
    public void setFare(Double fare) {
        this.fare = fare;
    }

    @JsonProperty("taxes")
    public Double getTaxes() {
        return taxes;
    }

    @JsonProperty("taxes")
    public void setTaxes(Double taxes) {
        this.taxes = taxes;
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
