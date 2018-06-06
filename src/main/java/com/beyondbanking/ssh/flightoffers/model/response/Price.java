
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
    "displayPrice",
    "totalPrice",
    "surcharges",
    "accuracy",
    "pricePerPassengerTypes",
    "flexibilityWaiver",
    "currency",
    "displayType"
})
public class Price {

    @JsonProperty("displayPrice")
    private Double displayPrice;
    @JsonProperty("totalPrice")
    private Double totalPrice;
    @JsonProperty("surcharges")
    private List<Surcharge> surcharges = null;
    @JsonProperty("accuracy")
    private Double accuracy;
    @JsonProperty("pricePerPassengerTypes")
    private List<PricePerPassengerType> pricePerPassengerTypes = null;
    @JsonProperty("flexibilityWaiver")
    private Boolean flexibilityWaiver;
    @JsonProperty("currency")
    private String currency;
    @JsonProperty("displayType")
    private String displayType;
    @JsonIgnore
    private Map<String, Object> additionalProperties = new HashMap<String, Object>();

    @JsonProperty("displayPrice")
    public Double getDisplayPrice() {
        return displayPrice;
    }

    @JsonProperty("displayPrice")
    public void setDisplayPrice(Double displayPrice) {
        this.displayPrice = displayPrice;
    }

    @JsonProperty("totalPrice")
    public Double getTotalPrice() {
        return totalPrice;
    }

    @JsonProperty("totalPrice")
    public void setTotalPrice(Double totalPrice) {
        this.totalPrice = totalPrice;
    }

    @JsonProperty("surcharges")
    public List<Surcharge> getSurcharges() {
        return surcharges;
    }

    @JsonProperty("surcharges")
    public void setSurcharges(List<Surcharge> surcharges) {
        this.surcharges = surcharges;
    }

    @JsonProperty("accuracy")
    public Double getAccuracy() {
        return accuracy;
    }

    @JsonProperty("accuracy")
    public void setAccuracy(Double accuracy) {
        this.accuracy = accuracy;
    }

    @JsonProperty("pricePerPassengerTypes")
    public List<PricePerPassengerType> getPricePerPassengerTypes() {
        return pricePerPassengerTypes;
    }

    @JsonProperty("pricePerPassengerTypes")
    public void setPricePerPassengerTypes(List<PricePerPassengerType> pricePerPassengerTypes) {
        this.pricePerPassengerTypes = pricePerPassengerTypes;
    }

    @JsonProperty("flexibilityWaiver")
    public Boolean getFlexibilityWaiver() {
        return flexibilityWaiver;
    }

    @JsonProperty("flexibilityWaiver")
    public void setFlexibilityWaiver(Boolean flexibilityWaiver) {
        this.flexibilityWaiver = flexibilityWaiver;
    }

    @JsonProperty("currency")
    public String getCurrency() {
        return currency;
    }

    @JsonProperty("currency")
    public void setCurrency(String currency) {
        this.currency = currency;
    }

    @JsonProperty("displayType")
    public String getDisplayType() {
        return displayType;
    }

    @JsonProperty("displayType")
    public void setDisplayType(String displayType) {
        this.displayType = displayType;
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
