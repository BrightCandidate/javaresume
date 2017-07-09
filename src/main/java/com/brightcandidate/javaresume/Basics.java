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
import java.net.URI;
import java.util.HashMap;
import java.util.List;
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
        "name",
        "label",
        "image",
        "email",
        "phone",
        "url",
        "summary",
        "location",
        "profiles"
})
public class Basics implements Serializable {


    public Basics(){};

    public Basics(String name, String label, String image, String email, String phone, URI url,
                  String summary, Location location, List<Profile> profiles) {
        this.name = name;
        this.label = label;
        this.image = image;
        this.email = email;
        this.phone = phone;
        this.url = url;
        this.summary = summary;
        this.location = location;
        this.profiles = profiles;
    }

    @JsonProperty("name")
    private String name;
    /**
     * e.g. Web Developer
     *
     */
    @JsonProperty("label")
    @JsonPropertyDescription("e.g. Web Developer")
    private String label;
    /**
     * URL (as per RFC 3986) to a image in JPEG or PNG format
     *
     */
    @JsonProperty("image")
    @JsonPropertyDescription("URL (as per RFC 3986) to a image in JPEG or PNG format")
    private String image;
    /**
     * e.g. thomas@gmail.com
     *
     */
    @JsonProperty("email")
    @JsonPropertyDescription("e.g. thomas@gmail.com")
    private String email;
    /**
     * Phone numbers are stored as strings so use any format you like, e.g. 712-117-2923
     *
     */
    @JsonProperty("phone")
    @JsonPropertyDescription("Phone numbers are stored as strings so use any format you like, e.g. 712-117-2923")
    private String phone;
    /**
     * URL (as per RFC 3986) to your website, e.g. personal homepage
     *
     */
    @JsonProperty("url")
    @JsonPropertyDescription("URL (as per RFC 3986) to your website, e.g. personal homepage")
    private URI url;
    /**
     * Write a short 2-3 sentence biography about yourself
     *
     */
    @JsonProperty("summary")
    @JsonPropertyDescription("Write a short 2-3 sentence biography about yourself")
    private String summary;
    @JsonProperty("location")
    private Location location;
    /**
     * Specify any number of social networks that you participate in
     *
     */
    @JsonProperty("profiles")
    @JsonPropertyDescription("Specify any number of social networks that you participate in")
    private List<Profile> profiles = null;
    @JsonIgnore
    private Map<String, Object> additionalProperties = new HashMap<String, Object>();
    private final static long serialVersionUID = -8901284773431265115L;

    @JsonProperty("name")
    public String getName() {
        return name;
    }

    @JsonProperty("name")
    public void setName(String name) {
        this.name = name;
    }

    /**
     * e.g. Web Developer
     *
     */
    @JsonProperty("label")
    public String getLabel() {
        return label;
    }

    /**
     * e.g. Web Developer
     *
     */
    @JsonProperty("label")
    public void setLabel(String label) {
        this.label = label;
    }

    /**
     * URL (as per RFC 3986) to a image in JPEG or PNG format
     *
     */
    @JsonProperty("image")
    public String getImage() {
        return image;
    }

    /**
     * URL (as per RFC 3986) to a image in JPEG or PNG format
     *
     */
    @JsonProperty("image")
    public void setImage(String image) {
        this.image = image;
    }

    /**
     * e.g. thomas@gmail.com
     *
     */
    @JsonProperty("email")
    public String getEmail() {
        return email;
    }

    /**
     * e.g. thomas@gmail.com
     *
     */
    @JsonProperty("email")
    public void setEmail(String email) {
        this.email = email;
    }

    /**
     * Phone numbers are stored as strings so use any format you like, e.g. 712-117-2923
     *
     */
    @JsonProperty("phone")
    public String getPhone() {
        return phone;
    }

    /**
     * Phone numbers are stored as strings so use any format you like, e.g. 712-117-2923
     *
     */
    @JsonProperty("phone")
    public void setPhone(String phone) {
        this.phone = phone;
    }

    /**
     * URL (as per RFC 3986) to your website, e.g. personal homepage
     *
     */
    @JsonProperty("url")
    public URI getUrl() {
        return url;
    }

    /**
     * URL (as per RFC 3986) to your website, e.g. personal homepage
     *
     */
    @JsonProperty("url")
    public void setUrl(URI url) {
        this.url = url;
    }

    /**
     * Write a short 2-3 sentence biography about yourself
     *
     */
    @JsonProperty("summary")
    public String getSummary() {
        return summary;
    }

    /**
     * Write a short 2-3 sentence biography about yourself
     *
     */
    @JsonProperty("summary")
    public void setSummary(String summary) {
        this.summary = summary;
    }

    @JsonProperty("location")
    public Location getLocation() {
        return location;
    }

    @JsonProperty("location")
    public void setLocation(Location location) {
        this.location = location;
    }

    /**
     * Specify any number of social networks that you participate in
     *
     */
    @JsonProperty("profiles")
    public List<Profile> getProfiles() {
        return profiles;
    }

    /**
     * Specify any number of social networks that you participate in
     *
     */
    @JsonProperty("profiles")
    public void setProfiles(List<Profile> profiles) {
        this.profiles = profiles;
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

        Basics basics = (Basics) o;

        if (name != null ? !name.equals(basics.name) : basics.name != null) return false;
        if (label != null ? !label.equals(basics.label) : basics.label != null) return false;
        if (image != null ? !image.equals(basics.image) : basics.image != null) return false;
        if (email != null ? !email.equals(basics.email) : basics.email != null) return false;
        if (phone != null ? !phone.equals(basics.phone) : basics.phone != null) return false;
        if (url != null ? !url.equals(basics.url) : basics.url != null) return false;
        if (summary != null ? !summary.equals(basics.summary) : basics.summary != null) return false;
        if (location != null ? !location.equals(basics.location) : basics.location != null) return false;
        if (profiles != null ? !profiles.equals(basics.profiles) : basics.profiles != null) return false;
        return additionalProperties != null ? additionalProperties.equals(basics.additionalProperties) : basics.additionalProperties == null;
    }

    @Override
    public int hashCode() {
        int result = name != null ? name.hashCode() : 0;
        result = 31 * result + (label != null ? label.hashCode() : 0);
        result = 31 * result + (image != null ? image.hashCode() : 0);
        result = 31 * result + (email != null ? email.hashCode() : 0);
        result = 31 * result + (phone != null ? phone.hashCode() : 0);
        result = 31 * result + (url != null ? url.hashCode() : 0);
        result = 31 * result + (summary != null ? summary.hashCode() : 0);
        result = 31 * result + (location != null ? location.hashCode() : 0);
        result = 31 * result + (profiles != null ? profiles.hashCode() : 0);
        result = 31 * result + (additionalProperties != null ? additionalProperties.hashCode() : 0);
        return result;
    }
}
