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
        "title",
        "date",
        "awarder",
        "summary"
})
public class Award implements Serializable {

    public Award(){}

    public Award(String title, LocalDate date, String awarder, String summary) {
        this.title = title;
        this.date = date;
        this.awarder = awarder;
        this.summary = summary;
    }

    /**
     * e.g. One of the 100 greatest minds of the century
     *
     */
    @JsonProperty("title")
    @JsonPropertyDescription("e.g. One of the 100 greatest minds of the century")
    private String title;
    /**
     * e.g. 1989-06-12
     *
     */
    @JsonProperty("date")
    @JsonPropertyDescription("e.g. 1989-06-12")
    @JsonSerialize(using = DateSerializer.class)
    @JsonDeserialize(using = DateDeserializer.class)
    private LocalDate date;
    /**
     * e.g. Time Magazine
     *
     */
    @JsonProperty("awarder")
    @JsonPropertyDescription("e.g. Time Magazine")
    private String awarder;
    /**
     * e.g. Received for my work with Quantum Physics
     *
     */
    @JsonProperty("summary")
    @JsonPropertyDescription("e.g. Received for my work with Quantum Physics")
    private String summary;
    @JsonIgnore
    private Map<String, Object> additionalProperties = new HashMap<String, Object>();
    private final static long serialVersionUID = 3109567213326558609L;

    /**
     * e.g. One of the 100 greatest minds of the century
     *
     */
    @JsonProperty("title")
    public String getTitle() {
        return title;
    }

    /**
     * e.g. One of the 100 greatest minds of the century
     *
     */
    @JsonProperty("title")
    public void setTitle(String title) {
        this.title = title;
    }

    /**
     * e.g. 1989-06-12
     *
     */
    @JsonProperty("date")
    public LocalDate getDate() {
        return date;
    }

    /**
     * e.g. 1989-06-12
     *
     */
    @JsonProperty("date")
    public void setDate(LocalDate date) {
        this.date = date;
    }

    /**
     * e.g. Time Magazine
     *
     */
    @JsonProperty("awarder")
    public String getAwarder() {
        return awarder;
    }

    /**
     * e.g. Time Magazine
     *
     */
    @JsonProperty("awarder")
    public void setAwarder(String awarder) {
        this.awarder = awarder;
    }

    /**
     * e.g. Received for my work with Quantum Physics
     *
     */
    @JsonProperty("summary")
    public String getSummary() {
        return summary;
    }

    /**
     * e.g. Received for my work with Quantum Physics
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

        Award award = (Award) o;

        if (title != null ? !title.equals(award.title) : award.title != null) return false;
        if (date != null ? !date.equals(award.date) : award.date != null) return false;
        if (awarder != null ? !awarder.equals(award.awarder) : award.awarder != null) return false;
        if (summary != null ? !summary.equals(award.summary) : award.summary != null) return false;
        return additionalProperties != null ? additionalProperties.equals(award.additionalProperties) : award.additionalProperties == null;
    }

    @Override
    public int hashCode() {
        int result = title != null ? title.hashCode() : 0;
        result = 31 * result + (date != null ? date.hashCode() : 0);
        result = 31 * result + (awarder != null ? awarder.hashCode() : 0);
        result = 31 * result + (summary != null ? summary.hashCode() : 0);
        result = 31 * result + (additionalProperties != null ? additionalProperties.hashCode() : 0);
        return result;
    }


}