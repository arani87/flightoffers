
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
    "departureDateTime",
    "destination",
    "marketingFlight",
    "origin",
    "farebase"
})
public class Segment {

    @JsonProperty("departureDateTime")
    private String departureDateTime;
    @JsonProperty("destination")
    private Destination_ destination;
    @JsonProperty("marketingFlight")
    private MarketingFlight marketingFlight;
    @JsonProperty("origin")
    private Origin_ origin;
    @JsonProperty("farebase")
    private Farebase farebase;
    @JsonIgnore
    private Map<String, Object> additionalProperties = new HashMap<String, Object>();

    @JsonProperty("departureDateTime")
    public String getDepartureDateTime() {
        return departureDateTime;
    }

    @JsonProperty("departureDateTime")
    public void setDepartureDateTime(String departureDateTime) {
        this.departureDateTime = departureDateTime;
    }

    @JsonProperty("destination")
    public Destination_ getDestination() {
        return destination;
    }

    @JsonProperty("destination")
    public void setDestination(Destination_ destination) {
        this.destination = destination;
    }

    @JsonProperty("marketingFlight")
    public MarketingFlight getMarketingFlight() {
        return marketingFlight;
    }

    @JsonProperty("marketingFlight")
    public void setMarketingFlight(MarketingFlight marketingFlight) {
        this.marketingFlight = marketingFlight;
    }

    @JsonProperty("origin")
    public Origin_ getOrigin() {
        return origin;
    }

    @JsonProperty("origin")
    public void setOrigin(Origin_ origin) {
        this.origin = origin;
    }

    @JsonProperty("farebase")
    public Farebase getFarebase() {
        return farebase;
    }

    @JsonProperty("farebase")
    public void setFarebase(Farebase farebase) {
        this.farebase = farebase;
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
