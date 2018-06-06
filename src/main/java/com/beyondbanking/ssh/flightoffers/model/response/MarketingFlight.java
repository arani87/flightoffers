
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
    "carrier",
    "number"
})
public class MarketingFlight {

    @JsonProperty("carrier")
    private Carrier carrier;
    @JsonProperty("number")
    private String number;
    @JsonIgnore
    private Map<String, Object> additionalProperties = new HashMap<String, Object>();

    @JsonProperty("carrier")
    public Carrier getCarrier() {
        return carrier;
    }

    @JsonProperty("carrier")
    public void setCarrier(Carrier carrier) {
        this.carrier = carrier;
    }

    @JsonProperty("number")
    public String getNumber() {
        return number;
    }

    @JsonProperty("number")
    public void setNumber(String number) {
        this.number = number;
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
