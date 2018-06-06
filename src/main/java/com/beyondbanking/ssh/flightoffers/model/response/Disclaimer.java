
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
    "displayPriceText",
    "totalPriceText"
})
public class Disclaimer {

    @JsonProperty("displayPriceText")
    private String displayPriceText;
    @JsonProperty("totalPriceText")
    private String totalPriceText;
    @JsonIgnore
    private Map<String, Object> additionalProperties = new HashMap<String, Object>();

    @JsonProperty("displayPriceText")
    public String getDisplayPriceText() {
        return displayPriceText;
    }

    @JsonProperty("displayPriceText")
    public void setDisplayPriceText(String displayPriceText) {
        this.displayPriceText = displayPriceText;
    }

    @JsonProperty("totalPriceText")
    public String getTotalPriceText() {
        return totalPriceText;
    }

    @JsonProperty("totalPriceText")
    public void setTotalPriceText(String totalPriceText) {
        this.totalPriceText = totalPriceText;
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
