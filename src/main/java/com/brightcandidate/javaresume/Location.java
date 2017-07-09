package com.brightcandidate.javaresume;

/*
 * Java classes based on open source jsonresume https://github.com/jsonresume
 * Bright Candidate www.brightcandidate.com
 * Copyright (C) 2017 Bright Candidate
 *
 * This program is free software: you can redistribute it and/or modify
 * it under the terms of the GNU General Public License as published by
 * the Free Software Foundation, either version 3 of the License, or
 * (at your option) any later version.
 *
 * This program is distributed in the hope that it will be useful,
 * but WITHOUT ANY WARRANTY; without even the implied warranty of
 * MERCHANTABILITY or FITNESS FOR A PARTICULAR PURPOSE.  See the
 * GNU General Public License for more details.
 *
 * You should have received a copy of the GNU General Public License
 * along with this program.  If not, see <http://www.gnu.org/licenses/>.
 */
import java.io.Serializable;
import java.util.HashMap;
import java.util.Map;
import com.fasterxml.jackson.annotation.JsonAnyGetter;
import com.fasterxml.jackson.annotation.JsonAnySetter;
import com.fasterxml.jackson.annotation.JsonIgnore;
import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonPropertyDescription;
import com.fasterxml.jackson.annotation.JsonPropertyOrder;

@JsonInclude(JsonInclude.Include.NON_NULL)
@JsonPropertyOrder({
        "address",
        "postalCode",
        "city",
        "countryCode",
        "region"
})
public class Location implements Serializable {


    public Location(){}

    public Location(String address, String postalCode, String city, String countryCode, String region) {
        this.address = address;
        this.postalCode = postalCode;
        this.city = city;
        this.countryCode = countryCode;
        this.region = region;
    }

    /**
     * To add multiple address lines, use
     * . For example, 1234 Glücklichkeit Straße
     * Hinterhaus 5. Etage li.
     *
     */
    @JsonProperty("address")
    @JsonPropertyDescription("To add multiple address lines, use \n. For example, 1234 Gl\u00fccklichkeit Stra\u00dfe\nHinterhaus 5. Etage li.")
    private String address;
    @JsonProperty("postalCode")
    private String postalCode;
    @JsonProperty("city")
    private String city;
    /**
     * code as per ISO-3166-1 ALPHA-2, e.g. US, AU, IN
     *
     */
    @JsonProperty("countryCode")
    @JsonPropertyDescription("code as per ISO-3166-1 ALPHA-2, e.g. US, AU, IN")
    private String countryCode;
    /**
     * The general region where you live. Can be a US state, or a province, for instance.
     *
     */
    @JsonProperty("region")
    @JsonPropertyDescription("The general region where you live. Can be a US state, or a province, for instance.")
    private String region;
    @JsonIgnore
    private Map<String, Object> additionalProperties = new HashMap<String, Object>();
    private final static long serialVersionUID = -1354737587205604260L;

    /**
     * To add multiple address lines, use
     * . For example, 1234 Glücklichkeit Straße
     * Hinterhaus 5. Etage li.
     *
     */
    @JsonProperty("address")
    public String getAddress() {
        return address;
    }

    /**
     * To add multiple address lines, use
     * . For example, 1234 Glücklichkeit Straße
     * Hinterhaus 5. Etage li.
     *
     */
    @JsonProperty("address")
    public void setAddress(String address) {
        this.address = address;
    }

    @JsonProperty("postalCode")
    public String getPostalCode() {
        return postalCode;
    }

    @JsonProperty("postalCode")
    public void setPostalCode(String postalCode) {
        this.postalCode = postalCode;
    }

    @JsonProperty("city")
    public String getCity() {
        return city;
    }

    @JsonProperty("city")
    public void setCity(String city) {
        this.city = city;
    }

    /**
     * code as per ISO-3166-1 ALPHA-2, e.g. US, AU, IN
     *
     */
    @JsonProperty("countryCode")
    public String getCountryCode() {
        return countryCode;
    }

    /**
     * code as per ISO-3166-1 ALPHA-2, e.g. US, AU, IN
     *
     */
    @JsonProperty("countryCode")
    public void setCountryCode(String countryCode) {
        this.countryCode = countryCode;
    }

    /**
     * The general region where you live. Can be a US state, or a province, for instance.
     *
     */
    @JsonProperty("region")
    public String getRegion() {
        return region;
    }

    /**
     * The general region where you live. Can be a US state, or a province, for instance.
     *
     */
    @JsonProperty("region")
    public void setRegion(String region) {
        this.region = region;
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
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;

        Location location = (Location) o;

        if (address != null ? !address.equals(location.address) : location.address != null) return false;
        if (postalCode != null ? !postalCode.equals(location.postalCode) : location.postalCode != null) return false;
        if (city != null ? !city.equals(location.city) : location.city != null) return false;
        if (countryCode != null ? !countryCode.equals(location.countryCode) : location.countryCode != null)
            return false;
        if (region != null ? !region.equals(location.region) : location.region != null) return false;
        return additionalProperties != null ? additionalProperties.equals(location.additionalProperties) : location.additionalProperties == null;
    }

    @Override
    public int hashCode() {
        int result = address != null ? address.hashCode() : 0;
        result = 31 * result + (postalCode != null ? postalCode.hashCode() : 0);
        result = 31 * result + (city != null ? city.hashCode() : 0);
        result = 31 * result + (countryCode != null ? countryCode.hashCode() : 0);
        result = 31 * result + (region != null ? region.hashCode() : 0);
        result = 31 * result + (additionalProperties != null ? additionalProperties.hashCode() : 0);
        return result;
    }
}