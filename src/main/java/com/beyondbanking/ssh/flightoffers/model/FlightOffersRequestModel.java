
package com.beyondbanking.ssh.flightoffers.model;

import com.fasterxml.jackson.annotation.*;

import java.util.HashMap;
import java.util.List;
import java.util.Map;

@JsonInclude(JsonInclude.Include.NON_NULL)
@JsonPropertyOrder({
    "cabinClass",
    "discountCode",
    "passengerCount",
    "currency",
    "minimumAccuracy",
    "type",
    "requestedConnections",
    "shortest"
})
public class FlightOffersRequestModel {

    @JsonProperty("cabinClass")
    private String cabinClass;
    @JsonProperty("discountCode")
    private String discountCode;
    @JsonProperty("passengerCount")
    private PassengerCount passengerCount;
    @JsonProperty("currency")
    private String currency;
    @JsonProperty("minimumAccuracy")
    private String minimumAccuracy;
    @JsonProperty("type")
    private String type;
    @JsonProperty("requestedConnections")
    private List<RequestedConnection> requestedConnections = null;
    @JsonProperty("shortest")
    private Boolean shortest;
    @JsonIgnore
    private Map<String, Object> additionalProperties = new HashMap<String, Object>();

    @JsonProperty("cabinClass")
    public String getCabinClass() {
        return cabinClass;
    }

    @JsonProperty("cabinClass")
    public void setCabinClass(String cabinClass) {
        this.cabinClass = cabinClass;
    }

    @JsonProperty("discountCode")
    public String getDiscountCode() {
        return discountCode;
    }

    @JsonProperty("discountCode")
    public void setDiscountCode(String discountCode) {
        this.discountCode = discountCode;
    }

    @JsonProperty("passengerCount")
    public PassengerCount getPassengerCount() {
        return passengerCount;
    }

    @JsonProperty("passengerCount")
    public void setPassengerCount(PassengerCount passengerCount) {
        this.passengerCount = passengerCount;
    }

    @JsonProperty("currency")
    public String getCurrency() {
        return currency;
    }

    @JsonProperty("currency")
    public void setCurrency(String currency) {
        this.currency = currency;
    }

    @JsonProperty("minimumAccuracy")
    public String getMinimumAccuracy() {
        return minimumAccuracy;
    }

    @JsonProperty("minimumAccuracy")
    public void setMinimumAccuracy(String minimumAccuracy) {
        this.minimumAccuracy = minimumAccuracy;
    }

    @JsonProperty("type")
    public String getType() {
        return type;
    }

    @JsonProperty("type")
    public void setType(String type) {
        this.type = type;
    }

    @JsonProperty("requestedConnections")
    public List<RequestedConnection> getRequestedConnections() {
        return requestedConnections;
    }

    @JsonProperty("requestedConnections")
    public void setRequestedConnections(List<RequestedConnection> requestedConnections) {
        this.requestedConnections = requestedConnections;
    }

    @JsonProperty("shortest")
    public Boolean getShortest() {
        return shortest;
    }

    @JsonProperty("shortest")
    public void setShortest(Boolean shortest) {
        this.shortest = shortest;
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
