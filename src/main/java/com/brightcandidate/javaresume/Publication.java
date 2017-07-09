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
import java.time.LocalDate;
import java.util.HashMap;
import java.util.Map;

import com.fasterxml.jackson.annotation.*;
import com.fasterxml.jackson.databind.annotation.JsonDeserialize;
import com.fasterxml.jackson.databind.annotation.JsonSerialize;

@JsonInclude(JsonInclude.Include.NON_NULL)
@JsonPropertyOrder({
        "name",
        "publisher",
        "releaseDate",
        "url",
        "summary"
})
public class Publication implements Serializable {

    public Publication() {
    }

    public Publication(String name, String publisher, LocalDate releaseDate, String url, String summary) {
        this.name = name;
        this.publisher = publisher;
        this.releaseDate = releaseDate;
        this.url = url;
        this.summary = summary;
    }

    /**
     * e.g. The World Wide Web
     *
     */
    @JsonProperty("name")
    @JsonPropertyDescription("e.g. The World Wide Web")
    private String name;
    /**
     * e.g. IEEE, Computer Magazine
     *
     */
    @JsonProperty("publisher")
    @JsonPropertyDescription("e.g. IEEE, Computer Magazine")
    private String publisher;
    /**
     * e.g. 1990-08-01
     *
     */
    @JsonProperty("releaseDate")
    @JsonPropertyDescription("e.g. 1990-08-01")
    @JsonSerialize(using = DateSerializer.class)
    @JsonDeserialize(using = DateDeserializer.class)
    private LocalDate releaseDate;
    /**
     * e.g. http://www.computer.org.example.com/csdl/mags/co/1996/10/rx069-abs.html
     *
     */
    @JsonProperty("url")
    @JsonPropertyDescription("e.g. http://www.computer.org.example.com/csdl/mags/co/1996/10/rx069-abs.html")
    private String url;
    /**
     * Short summary of publication. e.g. Discussion of the World Wide Web, HTTP, HTML.
     *
     */
    @JsonProperty("summary")
    @JsonPropertyDescription("Short summary of publication. e.g. Discussion of the World Wide Web, HTTP, HTML.")
    private String summary;
    @JsonIgnore
    private Map<String, Object> additionalProperties = new HashMap<String, Object>();
    private final static long serialVersionUID = -1781470210943037664L;

    /**
     * e.g. The World Wide Web
     *
     */
    @JsonProperty("name")
    public String getName() {
        return name;
    }

    /**
     * e.g. The World Wide Web
     *
     */
    @JsonProperty("name")
    public void setName(String name) {
        this.name = name;
    }

    /**
     * e.g. IEEE, Computer Magazine
     *
     */
    @JsonProperty("publisher")
    public String getPublisher() {
        return publisher;
    }

    /**
     * e.g. IEEE, Computer Magazine
     *
     */
    @JsonProperty("publisher")
    public void setPublisher(String publisher) {
        this.publisher = publisher;
    }

    /**
     * e.g. 1990-08-01
     *
     */
    @JsonProperty("releaseDate")
    public LocalDate getReleaseDate() {
        return releaseDate;
    }

    /**
     * e.g. 1990-08-01
     *
     */
    @JsonProperty("releaseDate")
    public void setReleaseDate(LocalDate releaseDate) {
        this.releaseDate = releaseDate;
    }

    /**
     * e.g. http://www.computer.org.example.com/csdl/mags/co/1996/10/rx069-abs.html
     *
     */
    @JsonProperty("url")
    public String getUrl() {
        return url;
    }

    /**
     * e.g. http://www.computer.org.example.com/csdl/mags/co/1996/10/rx069-abs.html
     *
     */
    @JsonProperty("url")
    public void setUrl(String url) {
        this.url = url;
    }

    /**
     * Short summary of publication. e.g. Discussion of the World Wide Web, HTTP, HTML.
     *
     */
    @JsonProperty("summary")
    public String getSummary() {
        return summary;
    }

    /**
     * Short summary of publication. e.g. Discussion of the World Wide Web, HTTP, HTML.
     *
     */
    @JsonProperty("summary")
    public void setSummary(String summary) {
        this.summary = summary;
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

        Publication that = (Publication) o;

        if (name != null ? !name.equals(that.name) : that.name != null) return false;
        if (publisher != null ? !publisher.equals(that.publisher) : that.publisher != null) return false;
        if (releaseDate != null ? !releaseDate.equals(that.releaseDate) : that.releaseDate != null) return false;
        if (url != null ? !url.equals(that.url) : that.url != null) return false;
        if (summary != null ? !summary.equals(that.summary) : that.summary != null) return false;
        return additionalProperties != null ? additionalProperties.equals(that.additionalProperties) : that.additionalProperties == null;
    }

    @Override
    public int hashCode() {
        int result = name != null ? name.hashCode() : 0;
        result = 31 * result + (publisher != null ? publisher.hashCode() : 0);
        result = 31 * result + (releaseDate != null ? releaseDate.hashCode() : 0);
        result = 31 * result + (url != null ? url.hashCode() : 0);
        result = 31 * result + (summary != null ? summary.hashCode() : 0);
        result = 31 * result + (additionalProperties != null ? additionalProperties.hashCode() : 0);
        return result;
    }
}
