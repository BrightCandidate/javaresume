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
import com.fasterxml.jackson.annotation.JsonAnyGetter;
import com.fasterxml.jackson.annotation.JsonAnySetter;
import com.fasterxml.jackson.annotation.JsonIgnore;
import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonPropertyDescription;
import com.fasterxml.jackson.annotation.JsonPropertyOrder;
import com.fasterxml.jackson.databind.annotation.JsonDeserialize;
import com.fasterxml.jackson.databind.annotation.JsonSerialize;

@JsonInclude(JsonInclude.Include.NON_NULL)
@JsonPropertyOrder({
        "name",
        "description",
        "highlights",
        "keywords",
        "startDate",
        "endDate",
        "url",
        "roles",
        "entity",
        "type"
})
public class Project implements Serializable {

    public Project() {
    }

    public Project(String name, String description, List<String> highlights, List<String> keywords, LocalDate startDate,
                   LocalDate endDate, URI url, List<String> roles, String entity, String type) {
        this.name = name;
        this.description = description;
        this.highlights = highlights;
        this.keywords = keywords;
        this.startDate = startDate;
        this.endDate = endDate;
        this.url = url;
        this.roles = roles;
        this.entity = entity;
        this.type = type;
    }

    /**
     * e.g. The World Wide Web
     *
     */
    @JsonProperty("name")
    @JsonPropertyDescription("e.g. The World Wide Web")
    private String name;
    /**
     * Short summary of project. e.g. Collated works of 2017.
     *
     */
    @JsonProperty("description")
    @JsonPropertyDescription("Short summary of project. e.g. Collated works of 2017.")
    private String description;
    /**
     * Specify multiple features
     *
     */
    @JsonProperty("highlights")
    @JsonPropertyDescription("Specify multiple features")
    private List<String> highlights = null;
    /**
     * Specify special elements involved
     *
     */
    @JsonProperty("keywords")
    @JsonPropertyDescription("Specify special elements involved")
    private List<String> keywords = null;
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
     * e.g. http://www.computer.org/csdl/mags/co/1996/10/rx069-abs.html
     *
     */
    @JsonProperty("url")
    @JsonPropertyDescription("e.g. http://www.computer.org/csdl/mags/co/1996/10/rx069-abs.html")
    private URI url;
    /**
     * Specify your role on this project or in company
     *
     */
    @JsonProperty("roles")
    @JsonPropertyDescription("Specify your role on this project or in company")
    private List<String> roles = null;
    /**
     * Specify the relevant company/entity affiliations e.g. 'greenpeace', 'corporationXYZ'
     *
     */
    @JsonProperty("entity")
    @JsonPropertyDescription("Specify the relevant company/entity affiliations e.g. 'greenpeace', 'corporationXYZ'")
    private String entity;
    /**
     * e.g. 'volunteering', 'presentation', 'talk', 'application', 'conference'
     *
     */
    @JsonProperty("type")
    @JsonPropertyDescription(" e.g. 'volunteering', 'presentation', 'talk', 'application', 'conference'")
    private String type;
    @JsonIgnore
    private Map<String, Object> additionalProperties = new HashMap<String, Object>();
    private final static long serialVersionUID = -721054157838499050L;

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
     * Short summary of project. e.g. Collated works of 2017.
     *
     */
    @JsonProperty("description")
    public String getDescription() {
        return description;
    }

    /**
     * Short summary of project. e.g. Collated works of 2017.
     *
     */
    @JsonProperty("description")
    public void setDescription(String description) {
        this.description = description;
    }

    /**
     * Specify multiple features
     *
     */
    @JsonProperty("highlights")
    public List<String> getHighlights() {
        return highlights;
    }

    /**
     * Specify multiple features
     *
     */
    @JsonProperty("highlights")
    public void setHighlights(List<String> highlights) {
        this.highlights = highlights;
    }

    /**
     * Specify special elements involved
     *
     */
    @JsonProperty("keywords")
    public List<String> getKeywords() {
        return keywords;
    }

    /**
     * Specify special elements involved
     *
     */
    @JsonProperty("keywords")
    public void setKeywords(List<String> keywords) {
        this.keywords = keywords;
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
     * e.g. http://www.computer.org/csdl/mags/co/1996/10/rx069-abs.html
     *
     */
    @JsonProperty("url")
    public URI getUrl() {
        return url;
    }

    /**
     * e.g. http://www.computer.org/csdl/mags/co/1996/10/rx069-abs.html
     *
     */
    @JsonProperty("url")
    public void setUrl(URI url) {
        this.url = url;
    }

    /**
     * Specify your role on this project or in company
     *
     */
    @JsonProperty("roles")
    public List<String> getRoles() {
        return roles;
    }

    /**
     * Specify your role on this project or in company
     *
     */
    @JsonProperty("roles")
    public void setRoles(List<String> roles) {
        this.roles = roles;
    }

    /**
     * Specify the relevant company/entity affiliations e.g. 'greenpeace', 'corporationXYZ'
     *
     */
    @JsonProperty("entity")
    public String getEntity() {
        return entity;
    }

    /**
     * Specify the relevant company/entity affiliations e.g. 'greenpeace', 'corporationXYZ'
     *
     */
    @JsonProperty("entity")
    public void setEntity(String entity) {
        this.entity = entity;
    }

    /**
     * e.g. 'volunteering', 'presentation', 'talk', 'application', 'conference'
     *
     */
    @JsonProperty("type")
    public String getType() {
        return type;
    }

    /**
     * e.g. 'volunteering', 'presentation', 'talk', 'application', 'conference'
     *
     */
    @JsonProperty("type")
    public void setType(String type) {
        this.type = type;
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

        Project project = (Project) o;

        if (name != null ? !name.equals(project.name) : project.name != null) return false;
        if (description != null ? !description.equals(project.description) : project.description != null) return false;
        if (highlights != null ? !highlights.equals(project.highlights) : project.highlights != null) return false;
        if (keywords != null ? !keywords.equals(project.keywords) : project.keywords != null) return false;
        if (startDate != null ? !startDate.equals(project.startDate) : project.startDate != null) return false;
        if (endDate != null ? !endDate.equals(project.endDate) : project.endDate != null) return false;
        if (url != null ? !url.equals(project.url) : project.url != null) return false;
        if (roles != null ? !roles.equals(project.roles) : project.roles != null) return false;
        if (entity != null ? !entity.equals(project.entity) : project.entity != null) return false;
        if (type != null ? !type.equals(project.type) : project.type != null) return false;
        return additionalProperties != null ? additionalProperties.equals(project.additionalProperties) : project.additionalProperties == null;
    }

    @Override
    public int hashCode() {
        int result = name != null ? name.hashCode() : 0;
        result = 31 * result + (description != null ? description.hashCode() : 0);
        result = 31 * result + (highlights != null ? highlights.hashCode() : 0);
        result = 31 * result + (keywords != null ? keywords.hashCode() : 0);
        result = 31 * result + (startDate != null ? startDate.hashCode() : 0);
        result = 31 * result + (endDate != null ? endDate.hashCode() : 0);
        result = 31 * result + (url != null ? url.hashCode() : 0);
        result = 31 * result + (roles != null ? roles.hashCode() : 0);
        result = 31 * result + (entity != null ? entity.hashCode() : 0);
        result = 31 * result + (type != null ? type.hashCode() : 0);
        result = 31 * result + (additionalProperties != null ? additionalProperties.hashCode() : 0);
        return result;
    }
}
