
package com.beyondbanking.ssh.flightoffers.model;

import com.fasterxml.jackson.annotation.*;

import java.util.HashMap;
import java.util.Map;

@JsonInclude(JsonInclude.Include.NON_NULL)
@JsonPropertyOrder({
    "YOUNG_ADULT",
    "INFANT",
    "CHILD",
    "ADULT"
})
public class PassengerCount {

    @JsonProperty("YOUNG_ADULT")
    private Integer yOUNGADULT;
    @JsonProperty("INFANT")
    private Integer iNFANT;
    @JsonProperty("CHILD")
    private Integer cHILD;
    @JsonProperty("ADULT")
    private Integer aDULT;
    @JsonIgnore
    private Map<String, Object> additionalProperties = new HashMap<String, Object>();

    @JsonProperty("YOUNG_ADULT")
    public Integer getYOUNGADULT() {
        return yOUNGADULT;
    }

    @JsonProperty("YOUNG_ADULT")
    public void setYOUNGADULT(Integer yOUNGADULT) {
        this.yOUNGADULT = yOUNGADULT;
    }

    @JsonProperty("INFANT")
    public Integer getINFANT() {
        return iNFANT;
    }

    @JsonProperty("INFANT")
    public void setINFANT(Integer iNFANT) {
        this.iNFANT = iNFANT;
    }

    @JsonProperty("CHILD")
    public Integer getCHILD() {
        return cHILD;
    }

    @JsonProperty("CHILD")
    public void setCHILD(Integer cHILD) {
        this.cHILD = cHILD;
    }

    @JsonProperty("ADULT")
    public Integer getADULT() {
        return aDULT;
    }

    @JsonProperty("ADULT")
    public void setADULT(Integer aDULT) {
        this.aDULT = aDULT;
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
