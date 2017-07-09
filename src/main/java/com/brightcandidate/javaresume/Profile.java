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
        "network",
        "username",
        "url"
})
public class Profile implements Serializable {

    public Profile(){}

    public Profile(String network, String username, String url) {
        this.network = network;
        this.username = username;
        this.url = url;
    }

    /**
     * e.g. Facebook or Twitter
     *
     */
    @JsonProperty("network")
    @JsonPropertyDescription("e.g. Facebook or Twitter")
    private String network;
    /**
     * e.g. neutralthoughts
     *
     */
    @JsonProperty("username")
    @JsonPropertyDescription("e.g. neutralthoughts")
    private String username;
    /**
     * e.g. http://twitter.example.com/neutralthoughts
     *
     */
    @JsonProperty("url")
    @JsonPropertyDescription("e.g. http://twitter.example.com/neutralthoughts")
    private String url;

    @JsonIgnore
    private Map<String, Object> additionalProperties = new HashMap<String, Object>();
    private final static long serialVersionUID = -2065291404381138795L;

    /**
     * e.g. Facebook or Twitter
     *
     */
    @JsonProperty("network")
    public String getNetwork() {
        return network;
    }

    /**
     * e.g. Facebook or Twitter
     *
     */
    @JsonProperty("network")
    public void setNetwork(String network) {
        this.network = network;
    }

    /**
     * e.g. neutralthoughts
     *
     */
    @JsonProperty("username")
    public String getUsername() {
        return username;
    }

    /**
     * e.g. neutralthoughts
     *
     */
    @JsonProperty("username")
    public void setUsername(String username) {
        this.username = username;
    }

    /**
     * e.g. http://twitter.example.com/neutralthoughts
     *
     */
    @JsonProperty("url")
    public String getUrl() {
        return url;
    }

    /**
     * e.g. http://twitter.example.com/neutralthoughts
     *
     */
    @JsonProperty("url")
    public void setUrl(String url) {
        this.url = url;
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

        Profile profile = (Profile) o;

        if (network != null ? !network.equals(profile.network) : profile.network != null) return false;
        if (username != null ? !username.equals(profile.username) : profile.username != null) return false;
        if (url != null ? !url.equals(profile.url) : profile.url != null) return false;
        return additionalProperties != null ? additionalProperties.equals(profile.additionalProperties) : profile.additionalProperties == null;
    }

    @Override
    public int hashCode() {
        int result = network != null ? network.hashCode() : 0;
        result = 31 * result + (username != null ? username.hashCode() : 0);
        result = 31 * result + (url != null ? url.hashCode() : 0);
        result = 31 * result + (additionalProperties != null ? additionalProperties.hashCode() : 0);
        return result;
    }
}
