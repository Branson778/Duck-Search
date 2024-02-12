
package org.jointheleague.level7.duck.repository.dto;

import java.util.LinkedHashMap;
import java.util.Map;
import com.fasterxml.jackson.annotation.JsonAnyGetter;
import com.fasterxml.jackson.annotation.JsonAnySetter;
import com.fasterxml.jackson.annotation.JsonIgnore;
import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonPropertyOrder;

@JsonInclude(JsonInclude.Include.NON_NULL)
@JsonPropertyOrder({
    "sunrise",
    "sunset",
    "moonrise",
    "moonset",
    "moon_phase",
    "moon_illumination",
    "is_moon_up",
    "is_sun_up"
})

public class Astro {

    @JsonProperty("sunrise")
    private String sunrise;
    @JsonProperty("sunset")
    private String sunset;
    @JsonProperty("moonrise")
    private String moonrise;
    @JsonProperty("moonset")
    private String moonset;
    @JsonProperty("moon_phase")
    private String moonPhase;
    @JsonProperty("moon_illumination")
    private Integer moonIllumination;
    @JsonProperty("is_moon_up")
    private Integer isMoonUp;
    @JsonProperty("is_sun_up")
    private Integer isSunUp;
    @JsonIgnore
    private Map<String, Object> additionalProperties = new LinkedHashMap<String, Object>();

    @JsonProperty("sunrise")
    public String getSunrise() {
        return sunrise;
    }

    @JsonProperty("sunrise")
    public void setSunrise(String sunrise) {
        this.sunrise = sunrise;
    }

    @JsonProperty("sunset")
    public String getSunset() {
        return sunset;
    }

    @JsonProperty("sunset")
    public void setSunset(String sunset) {
        this.sunset = sunset;
    }

    @JsonProperty("moonrise")
    public String getMoonrise() {
        return moonrise;
    }

    @JsonProperty("moonrise")
    public void setMoonrise(String moonrise) {
        this.moonrise = moonrise;
    }

    @JsonProperty("moonset")
    public String getMoonset() {
        return moonset;
    }

    @JsonProperty("moonset")
    public void setMoonset(String moonset) {
        this.moonset = moonset;
    }

    @JsonProperty("moon_phase")
    public String getMoonPhase() {
        return moonPhase;
    }

    @JsonProperty("moon_phase")
    public void setMoonPhase(String moonPhase) {
        this.moonPhase = moonPhase;
    }

    @JsonProperty("moon_illumination")
    public Integer getMoonIllumination() {
        return moonIllumination;
    }

    @JsonProperty("moon_illumination")
    public void setMoonIllumination(Integer moonIllumination) {
        this.moonIllumination = moonIllumination;
    }

    @JsonProperty("is_moon_up")
    public Integer getIsMoonUp() {
        return isMoonUp;
    }

    @JsonProperty("is_moon_up")
    public void setIsMoonUp(Integer isMoonUp) {
        this.isMoonUp = isMoonUp;
    }

    @JsonProperty("is_sun_up")
    public Integer getIsSunUp() {
        return isSunUp;
    }

    @JsonProperty("is_sun_up")
    public void setIsSunUp(Integer isSunUp) {
        this.isSunUp = isSunUp;
    }

    @JsonAnyGetter
    public Map<String, Object> getAdditionalProperties() {
        return this.additionalProperties;
    }

    @JsonAnySetter
    public void setAdditionalProperty(String name, Object value) {
        this.additionalProperties.put(name, value);
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append(Astro.class.getName()).append('@').append(Integer.toHexString(System.identityHashCode(this))).append('[');
        sb.append("sunrise");
        sb.append('=');
        sb.append(((this.sunrise == null)?"<null>":this.sunrise));
        sb.append(',');
        sb.append("sunset");
        sb.append('=');
        sb.append(((this.sunset == null)?"<null>":this.sunset));
        sb.append(',');
        sb.append("moonrise");
        sb.append('=');
        sb.append(((this.moonrise == null)?"<null>":this.moonrise));
        sb.append(',');
        sb.append("moonset");
        sb.append('=');
        sb.append(((this.moonset == null)?"<null>":this.moonset));
        sb.append(',');
        sb.append("moonPhase");
        sb.append('=');
        sb.append(((this.moonPhase == null)?"<null>":this.moonPhase));
        sb.append(',');
        sb.append("moonIllumination");
        sb.append('=');
        sb.append(((this.moonIllumination == null)?"<null>":this.moonIllumination));
        sb.append(',');
        sb.append("is_moon_up");
        sb.append('=');
        sb.append(((this.isMoonUp == null)?"<null>":this.isMoonUp));
        sb.append(',');
        sb.append("is_sun_up");
        sb.append('=');
        sb.append(((this.isSunUp == null)?"<null>":this.isSunUp));
        sb.append(',');
        sb.append("additionalProperties");
        sb.append('=');
        sb.append(((this.additionalProperties == null)?"<null>":this.additionalProperties));
        sb.append(',');
        if (sb.charAt((sb.length()- 1)) == ',') {
            sb.setCharAt((sb.length()- 1), ']');
        } else {
            sb.append(']');
        }
        return sb.toString();
    }

}
