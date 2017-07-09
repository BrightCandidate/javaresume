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
import java.time.LocalDate;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

import com.fasterxml.jackson.annotation.*;
import com.fasterxml.jackson.databind.annotation.JsonDeserialize;
import com.fasterxml.jackson.databind.annotation.JsonSerialize;


@JsonInclude(JsonInclude.Include.NON_NULL)
@JsonPropertyOrder({
        "organization",
        "position",
        "url",
        "startDate",
        "endDate",
        "summary",
        "highlights"
})
public class Volunteer implements Serializable {


    public Volunteer() {
    }

    public Volunteer(String organization, String position, URI url, LocalDate startDate, LocalDate endDate,
                     String summary, List<String> highlights) {
        this.organization = organization;
        this.position = position;
        this.url = url;
        this.startDate = startDate;
        this.endDate = endDate;
        this.summary = summary;
        this.highlights = highlights;
    }

    /**
     * e.g. Facebook
     *
     */
    @JsonProperty("organization")
    @JsonPropertyDescription("e.g. Facebook")
    private String organization;
    /**
     * e.g. Software Engineer
     *
     */
    @JsonProperty("position")
    @JsonPropertyDescription("e.g. Software Engineer")
    private String position;
    /**
     * e.g. http://facebook.example.com
     *
     */
    @JsonProperty("url")
    @JsonPropertyDescription("e.g. http://facebook.example.com")
    private URI url;
    /**
     * resume.json uses the ISO 8601 date standard e.g. 2014-06-29
     *
     */
    @JsonProperty("startDate")
    @JsonPropertyDescription("resume.json uses the ISO 8601 date standard e.g. 2014-06-29")
    @JsonSerialize(using = DateSerializer.class)
    @JsonDeserialize(using = DateDeserializer.class)
    private LocalDate startDate;
    /**
     * e.g. 2012-06-29
     *
     */
    @JsonProperty("endDate")
    @JsonPropertyDescription("e.g. 2012-06-29")
    @JsonSerialize(using = DateSerializer.class)
    @JsonDeserialize(using = DateDeserializer.class)
    private LocalDate endDate;
    /**
     * Give an overview of your responsibilities at the company
     *
     */
    @JsonProperty("summary")
    @JsonPropertyDescription("Give an overview of your responsibilities at the company")
    private String summary;
    /**
     * Specify accomplishments and achievements
     *
     */
    @JsonProperty("highlights")
    @JsonPropertyDescription("Specify accomplishments and achievements")
    private List<String> highlights = null;
    @JsonIgnore
    private Map<String, Object> additionalProperties = new HashMap<String, Object>();
    private final static long serialVersionUID = -7020066093585239999L;

    /**
     * e.g. Facebook
     *
     */
    @JsonProperty("organization")
    public String getOrganization() {
        return organization;
    }

    /**
     * e.g. Facebook
     *
     */
    @JsonProperty("organization")
    public void setOrganization(String organization) {
        this.organization = organization;
    }

    /**
     * e.g. Software Engineer
     *
     */
    @JsonProperty("position")
    public String getPosition() {
        return position;
    }

    /**
     * e.g. Software Engineer
     *
     */
    @JsonProperty("position")
    public void setPosition(String position) {
        this.position = position;
    }

    /**
     * e.g. http://facebook.example.com
     *
     */
    @JsonProperty("url")
    public URI getUrl() {
        return url;
    }

    /**
     * e.g. http://facebook.example.com
     *
     */
    @JsonProperty("url")
    public void setUrl(URI url) {
        this.url = url;
    }

    /**
     * resume.json uses the ISO 8601 date standard e.g. 2014-06-29
     *
     */
    @JsonProperty("startDate")
    public LocalDate getStartDate() {
        return startDate;
    }

    /**
     * resume.json uses the ISO 8601 date standard e.g. 2014-06-29
     *
     */
    @JsonProperty("startDate")
    public void setStartDate(LocalDate startDate) {
        this.startDate = startDate;
    }

    /**
     * e.g. 2012-06-29
     *
     */
    @JsonProperty("endDate")
    public LocalDate getEndDate() {
        return endDate;
    }

    /**
     * e.g. 2012-06-29
     *
     */
    @JsonProperty("endDate")
    public void setEndDate(LocalDate endDate) {
        this.endDate = endDate;
    }

    /**
     * Give an overview of your responsibilities at the company
     *
     */
    @JsonProperty("summary")
    public String getSummary() {
        return summary;
    }

    /**
     * Give an overview of your responsibilities at the company
     *
     */
    @JsonProperty("summary")
    public void setSummary(String summary) {
        this.summary = summary;
    }

    /**
     * Specify accomplishments and achievements
     *
     */
    @JsonProperty("highlights")
    public List<String> getHighlights() {
        return highlights;
    }

    /**
     * Specify accomplishments and achievements
     *
     */
    @JsonProperty("highlights")
    public void setHighlights(List<String> highlights) {
        this.highlights = highlights;
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

        Volunteer volunteer = (Volunteer) o;

        if (organization != null ? !organization.equals(volunteer.organization) : volunteer.organization != null)
            return false;
        if (position != null ? !position.equals(volunteer.position) : volunteer.position != null) return false;
        if (url != null ? !url.equals(volunteer.url) : volunteer.url != null) return false;
        if (startDate != null ? !startDate.equals(volunteer.startDate) : volunteer.startDate != null) return false;
        if (endDate != null ? !endDate.equals(volunteer.endDate) : volunteer.endDate != null) return false;
        if (summary != null ? !summary.equals(volunteer.summary) : volunteer.summary != null) return false;
        if (highlights != null ? !highlights.equals(volunteer.highlights) : volunteer.highlights != null) return false;
        return additionalProperties != null ? additionalProperties.equals(volunteer.additionalProperties) : volunteer.additionalProperties == null;
    }

    @Override
    public int hashCode() {
        int result = organization != null ? organization.hashCode() : 0;
        result = 31 * result + (position != null ? position.hashCode() : 0);
        result = 31 * result + (url != null ? url.hashCode() : 0);
        result = 31 * result + (startDate != null ? startDate.hashCode() : 0);
        result = 31 * result + (endDate != null ? endDate.hashCode() : 0);
        result = 31 * result + (summary != null ? summary.hashCode() : 0);
        result = 31 * result + (highlights != null ? highlights.hashCode() : 0);
        result = 31 * result + (additionalProperties != null ? additionalProperties.hashCode() : 0);
        return result;
    }
}
