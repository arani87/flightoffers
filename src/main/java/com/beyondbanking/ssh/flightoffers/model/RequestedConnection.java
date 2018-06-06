
package com.beyondbanking.ssh.flightoffers.model;

import com.fasterxml.jackson.annotation.*;

import java.util.HashMap;
import java.util.Map;

@JsonInclude(JsonInclude.Include.NON_NULL)
@JsonPropertyOrder({
    "maxDaysOfStay",
    "minDaysOfStay",
    "dateInterval",
    "origin",
    "destination"
})
public class RequestedConnection {

    @JsonProperty("maxDaysOfStay")
    private Integer maxDaysOfStay;
    @JsonProperty("minDaysOfStay")
    private Integer minDaysOfStay;
    @JsonProperty("dateInterval")
    private String dateInterval;
    @JsonProperty("origin")
    private Origin origin;
    @JsonProperty("destination")
    private Destination destination;
    @JsonIgnore
    private Map<String, Object> additionalProperties = new HashMap<String, Object>();

    @JsonProperty("maxDaysOfStay")
    public Integer getMaxDaysOfStay() {
        return maxDaysOfStay;
    }

    @JsonProperty("maxDaysOfStay")
    public void setMaxDaysOfStay(Integer maxDaysOfStay) {
        this.maxDaysOfStay = maxDaysOfStay;
    }

    @JsonProperty("minDaysOfStay")
    public Integer getMinDaysOfStay() {
        return minDaysOfStay;
    }

    @JsonProperty("minDaysOfStay")
    public void setMinDaysOfStay(Integer minDaysOfStay) {
        this.minDaysOfStay = minDaysOfStay;
    }

    @JsonProperty("dateInterval")
    public String getDateInterval() {
        return dateInterval;
    }

    @JsonProperty("dateInterval")
    public void setDateInterval(String dateInterval) {
        this.dateInterval = dateInterval;
    }

    @JsonProperty("origin")
    public Origin getOrigin() {
        return origin;
    }

    @JsonProperty("origin")
    public void setOrigin(Origin origin) {
        this.origin = origin;
    }

    @JsonProperty("destination")
    public Destination getDestination() {
        return destination;
    }

    @JsonProperty("destination")
    public void setDestination(Destination destination) {
        this.destination = destination;
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
