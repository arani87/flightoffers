
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
    "flightProducts",
    "disclaimer"
})
public class FlightOffersResponseModel {

    @JsonProperty("flightProducts")
    private List<FlightProduct> flightProducts = null;
    @JsonProperty("disclaimer")
    private Disclaimer disclaimer;
    @JsonIgnore
    private Map<String, Object> additionalProperties = new HashMap<String, Object>();

    @JsonProperty("flightProducts")
    public List<FlightProduct> getFlightProducts() {
        return flightProducts;
    }

    @JsonProperty("flightProducts")
    public void setFlightProducts(List<FlightProduct> flightProducts) {
        this.flightProducts = flightProducts;
    }

    @JsonProperty("disclaimer")
    public Disclaimer getDisclaimer() {
        return disclaimer;
    }

    @JsonProperty("disclaimer")
    public void setDisclaimer(Disclaimer disclaimer) {
        this.disclaimer = disclaimer;
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
