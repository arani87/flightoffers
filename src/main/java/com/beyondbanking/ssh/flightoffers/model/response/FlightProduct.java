
package com.beyondbanking.ssh.flightoffers.model.response;

import java.util.HashMap;
import java.util.List;
import java.util.Map;
import com.fasterxml.jackson.annotation.JsonAnyGetter;
import com.fasterxml.jackson.annotation.JsonAnySetter;
import com.fasterxml.jackson.annotation.JsonIgnore;
import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonPropertyOrder;

@JsonInclude(JsonInclude.Include.NON_NULL)
@JsonPropertyOrder({
    "connections",
    "passengers",
    "price",
    "type"
})
public class FlightProduct {

    @JsonProperty("connections")
    private List<Connection> connections = null;
    @JsonProperty("passengers")
    private List<Passenger> passengers = null;
    @JsonProperty("price")
    private Price price;
    @JsonProperty("type")
    private String type;
    @JsonIgnore
    private Map<String, Object> additionalProperties = new HashMap<String, Object>();

    @JsonProperty("connections")
    public List<Connection> getConnections() {
        return connections;
    }

    @JsonProperty("connections")
    public void setConnections(List<Connection> connections) {
        this.connections = connections;
    }

    @JsonProperty("passengers")
    public List<Passenger> getPassengers() {
        return passengers;
    }

    @JsonProperty("passengers")
    public void setPassengers(List<Passenger> passengers) {
        this.passengers = passengers;
    }

    @JsonProperty("price")
    public Price getPrice() {
        return price;
    }

    @JsonProperty("price")
    public void setPrice(Price price) {
        this.price = price;
    }

    @JsonProperty("type")
    public String getType() {
        return type;
    }

    @JsonProperty("type")
    public void setType(String type) {
        this.type = type;
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
