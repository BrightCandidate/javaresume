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
        "language",
        "fluency"
})
public class Language implements Serializable {


    public Language(){}

    public Language(String language, String fluency) {
        this.language = language;
        this.fluency = fluency;
    }

    /**
     * e.g. English, Spanish
     *
     */
    @JsonProperty("language")
    @JsonPropertyDescription("e.g. English, Spanish")
    private String language;
    /**
     * e.g. Fluent, Beginner
     *
     */
    @JsonProperty("fluency")
    @JsonPropertyDescription("e.g. Fluent, Beginner")
    private String fluency;
    @JsonIgnore
    private Map<String, Object> additionalProperties = new HashMap<String, Object>();
    private final static long serialVersionUID = -7494706857374886476L;

    /**
     * e.g. English, Spanish
     *
     */
    @JsonProperty("language")
    public String getLanguage() {
        return language;
    }

    /**
     * e.g. English, Spanish
     *
     */
    @JsonProperty("language")
    public void setLanguage(String language) {
        this.language = language;
    }

    /**
     * e.g. Fluent, Beginner
     *
     */
    @JsonProperty("fluency")
    public String getFluency() {
        return fluency;
    }

    /**
     * e.g. Fluent, Beginner
     *
     */
    @JsonProperty("fluency")
    public void setFluency(String fluency) {
        this.fluency = fluency;
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

        Language language1 = (Language) o;

        if (language != null ? !language.equals(language1.language) : language1.language != null) return false;
        if (fluency != null ? !fluency.equals(language1.fluency) : language1.fluency != null) return false;
        return additionalProperties != null ? additionalProperties.equals(language1.additionalProperties) : language1.additionalProperties == null;
    }

    @Override
    public int hashCode() {
        int result = language != null ? language.hashCode() : 0;
        result = 31 * result + (fluency != null ? fluency.hashCode() : 0);
        result = 31 * result + (additionalProperties != null ? additionalProperties.hashCode() : 0);
        return result;
    }
}
