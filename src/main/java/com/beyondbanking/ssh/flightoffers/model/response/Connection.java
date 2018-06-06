
package com.beyondbanking.ssh.flightoffers.model.response;

import java.util.HashMap;
import java.util.List;
import java.util.Map;

import com.beyondbanking.ssh.flightoffers.model.Destination;
import com.beyondbanking.ssh.flightoffers.model.Origin;
import com.fasterxml.jackson.annotation.JsonAnyGetter;
import com.fasterxml.jackson.annotation.JsonAnySetter;
import com.fasterxml.jackson.annotation.JsonIgnore;
import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonPropertyOrder;

@JsonInclude(JsonInclude.Include.NON_NULL)
@JsonPropertyOrder({
    "destination",
    "numberOfSeatsAvailable",
    "origin",
    "segments"
})
public class Connection {

    @JsonProperty("destination")
    private Destination destination;
    @JsonProperty("numberOfSeatsAvailable")
    private Integer numberOfSeatsAvailable;
    @JsonProperty("origin")
    private com.beyondbanking.ssh.flightoffers.model.Origin origin;
    @JsonProperty("segments")
    private List<Segment> segments = null;
    @JsonIgnore
    private Map<String, Object> additionalProperties = new HashMap<String, Object>();

    @JsonProperty("destination")
    public Destination getDestination() {
        return destination;
    }

    @JsonProperty("destination")
    public void setDestination(Destination destination) {
        this.destination = destination;
    }

    @JsonProperty("numberOfSeatsAvailable")
    public Integer getNumberOfSeatsAvailable() {
        return numberOfSeatsAvailable;
    }

    @JsonProperty("numberOfSeatsAvailable")
    public void setNumberOfSeatsAvailable(Integer numberOfSeatsAvailable) {
        this.numberOfSeatsAvailable = numberOfSeatsAvailable;
    }

    @JsonProperty("origin")
    public com.beyondbanking.ssh.flightoffers.model.Origin getOrigin() {
        return origin;
    }

    @JsonProperty("origin")
    public void setOrigin(Origin origin) {
        this.origin = origin;
    }

    @JsonProperty("segments")
    public List<Segment> getSegments() {
        return segments;
    }

    @JsonProperty("segments")
    public void setSegments(List<Segment> segments) {
        this.segments = segments;
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
