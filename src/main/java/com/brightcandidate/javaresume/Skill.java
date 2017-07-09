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
        "level",
        "keywords"
})
public class Skill implements Serializable {

    public Skill(){}

    public Skill(String name, String level, List<String> keywords) {
        this.name = name;
        this.level = level;
        this.keywords = keywords;
    }

    /**
     * e.g. Web Development
     *
     */
    @JsonProperty("name")
    @JsonPropertyDescription("e.g. Web Development")
    private String name;
    /**
     * e.g. Master
     *
     */
    @JsonProperty("level")
    @JsonPropertyDescription("e.g. Master")
    private String level;
    /**
     * List some keywords pertaining to this skill
     *
     */
    @JsonProperty("keywords")
    @JsonPropertyDescription("List some keywords pertaining to this skill")
    private List<String> keywords = null;
    @JsonIgnore
    private Map<String, Object> additionalProperties = new HashMap<String, Object>();
    private final static long serialVersionUID = -364910220613817100L;

    /**
     * e.g. Web Development
     *
     */
    @JsonProperty("name")
    public String getName() {
        return name;
    }

    /**
     * e.g. Web Development
     *
     */
    @JsonProperty("name")
    public void setName(String name) {
        this.name = name;
    }

    /**
     * e.g. Master
     *
     */
    @JsonProperty("level")
    public String getLevel() {
        return level;
    }

    /**
     * e.g. Master
     *
     */
    @JsonProperty("level")
    public void setLevel(String level) {
        this.level = level;
    }

    /**
     * List some keywords pertaining to this skill
     *
     */
    @JsonProperty("keywords")
    public List<String> getKeywords() {
        return keywords;
    }

    /**
     * List some keywords pertaining to this skill
     *
     */
    @JsonProperty("keywords")
    public void setKeywords(List<String> keywords) {
        this.keywords = keywords;
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

        Skill skill = (Skill) o;

        if (name != null ? !name.equals(skill.name) : skill.name != null) return false;
        if (level != null ? !level.equals(skill.level) : skill.level != null) return false;
        if (keywords != null ? !keywords.equals(skill.keywords) : skill.keywords != null) return false;
        return additionalProperties != null ? additionalProperties.equals(skill.additionalProperties) : skill.additionalProperties == null;
    }

    @Override
    public int hashCode() {
        int result = name != null ? name.hashCode() : 0;
        result = 31 * result + (level != null ? level.hashCode() : 0);
        result = 31 * result + (keywords != null ? keywords.hashCode() : 0);
        result = 31 * result + (additionalProperties != null ? additionalProperties.hashCode() : 0);
        return result;
    }
}
