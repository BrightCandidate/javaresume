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
        "name",
        "description",
        "position",
        "url",
        "startDate",
        "endDate",
        "summary",
        "highlights"
})
public class Work implements Serializable {

    public Work(){}

    public Work(String name, String description, String position, URI url, LocalDate startDate, LocalDate endDate,
                String summary, List<String> highlights) {
        this.name = name;
        this.description = description;
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
    @JsonProperty("name")
    @JsonPropertyDescription("e.g. Facebook")
    private String name;
    /**
     * e.g. Social Media Company
     *
     */
    @JsonProperty("description")
    @JsonPropertyDescription("e.g. Social Media Company")
    private String description;
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
     * Specify multiple accomplishments
     *
     */
    @JsonProperty("highlights")
    @JsonPropertyDescription("Specify multiple accomplishments")
    private List<String> highlights = null;
    @JsonIgnore
    private Map<String, Object> additionalProperties = new HashMap<String, Object>();
    private final static long serialVersionUID = 5905584906425760905L;

    /**
     * e.g. Facebook
     *
     */
    @JsonProperty("name")
    public String getName() {
        return name;
    }

    /**
     * e.g. Facebook
     *
     */
    @JsonProperty("name")
    public void setName(String name) {
        this.name = name;
    }

    /**
     * e.g. Social Media Company
     *
     */
    @JsonProperty("description")
    public String getDescription() {
        return description;
    }

    /**
     * e.g. Social Media Company
     *
     */
    @JsonProperty("description")
    public void setDescription(String description) {
        this.description = description;
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
     * Specify multiple accomplishments
     *
     */
    @JsonProperty("highlights")
    public List<String> getHighlights() {
        return highlights;
    }

    /**
     * Specify multiple accomplishments
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

        Work work = (Work) o;

        if (name != null ? !name.equals(work.name) : work.name != null) return false;
        if (description != null ? !description.equals(work.description) : work.description != null) return false;
        if (position != null ? !position.equals(work.position) : work.position != null) return false;
        if (url != null ? !url.equals(work.url) : work.url != null) return false;
        if (startDate != null ? !startDate.equals(work.startDate) : work.startDate != null) return false;
        if (endDate != null ? !endDate.equals(work.endDate) : work.endDate != null) return false;
        if (summary != null ? !summary.equals(work.summary) : work.summary != null) return false;
        if (highlights != null ? !highlights.equals(work.highlights) : work.highlights != null) return false;
        return additionalProperties != null ? additionalProperties.equals(work.additionalProperties) : work.additionalProperties == null;
    }

    @Override
    public int hashCode() {
        int result = name != null ? name.hashCode() : 0;
        result = 31 * result + (description != null ? description.hashCode() : 0);
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
