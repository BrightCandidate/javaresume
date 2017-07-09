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


/**
 * The schema version and any other tooling configuration lives here
 *
 */
@JsonInclude(JsonInclude.Include.NON_NULL)
@JsonPropertyOrder({
        "canonical",
        "version",
        "lastModified"
})
public class Meta implements Serializable {

    public Meta() {
    }

    public Meta(String canonical, String version, String lastModified) {
        this.canonical = canonical;
        this.version = version;
        this.lastModified = lastModified;
    }

    /**
     * URL (as per RFC 3986) to latest version of this document
     *
     */
    @JsonProperty("canonical")
    @JsonPropertyDescription("URL (as per RFC 3986) to latest version of this document")
    private String canonical;
    /**
     * A version field which follows semver - e.g. v1.0.0
     *
     */
    @JsonProperty("version")
    @JsonPropertyDescription("A version field which follows semver - e.g. v1.0.0")
    private String version;
    /**
     * Using ISO 8601 with YYYY-MM-DDThh:mm:ss
     *
     */
    @JsonProperty("lastModified")
    @JsonPropertyDescription("Using ISO 8601 with YYYY-MM-DDThh:mm:ss")
    private String lastModified;
    @JsonIgnore
    private Map<String, Object> additionalProperties = new HashMap<String, Object>();
    private final static long serialVersionUID = -1256298928252192989L;

    /**
     * URL (as per RFC 3986) to latest version of this document
     *
     */
    @JsonProperty("canonical")
    public String getCanonical() {
        return canonical;
    }

    /**
     * URL (as per RFC 3986) to latest version of this document
     *
     */
    @JsonProperty("canonical")
    public void setCanonical(String canonical) {
        this.canonical = canonical;
    }

    /**
     * A version field which follows semver - e.g. v1.0.0
     *
     */
    @JsonProperty("version")
    public String getVersion() {
        return version;
    }

    /**
     * A version field which follows semver - e.g. v1.0.0
     *
     */
    @JsonProperty("version")
    public void setVersion(String version) {
        this.version = version;
    }

    /**
     * Using ISO 8601 with YYYY-MM-DDThh:mm:ss
     *
     */
    @JsonProperty("lastModified")
    public String getLastModified() {
        return lastModified;
    }

    /**
     * Using ISO 8601 with YYYY-MM-DDThh:mm:ss
     *
     */
    @JsonProperty("lastModified")
    public void setLastModified(String lastModified) {
        this.lastModified = lastModified;
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

        Meta meta = (Meta) o;

        if (canonical != null ? !canonical.equals(meta.canonical) : meta.canonical != null) return false;
        if (version != null ? !version.equals(meta.version) : meta.version != null) return false;
        if (lastModified != null ? !lastModified.equals(meta.lastModified) : meta.lastModified != null) return false;
        return additionalProperties != null ? additionalProperties.equals(meta.additionalProperties) : meta.additionalProperties == null;
    }

    @Override
    public int hashCode() {
        int result = canonical != null ? canonical.hashCode() : 0;
        result = 31 * result + (version != null ? version.hashCode() : 0);
        result = 31 * result + (lastModified != null ? lastModified.hashCode() : 0);
        result = 31 * result + (additionalProperties != null ? additionalProperties.hashCode() : 0);
        return result;
    }
}
