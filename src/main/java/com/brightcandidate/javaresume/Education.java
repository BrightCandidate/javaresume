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
import java.util.List;
import java.util.Map;

import com.fasterxml.jackson.annotation.*;
import com.fasterxml.jackson.databind.annotation.JsonDeserialize;
import com.fasterxml.jackson.databind.annotation.JsonSerialize;

@JsonInclude(JsonInclude.Include.NON_NULL)
@JsonPropertyOrder({
        "institution",
        "area",
        "studyType",
        "startDate",
        "endDate",
        "gpa",
        "courses"
})
public class Education implements Serializable {


    public Education(){}

    public Education(String institution, String area, String studyType, LocalDate startDate, LocalDate endDate, String gpa,
                     List<String> courses) {
        this.institution = institution;
        this.area = area;
        this.studyType = studyType;
        this.startDate = startDate;
        this.endDate = endDate;
        this.gpa = gpa;
        this.courses = courses;

    }

    /**
     * e.g. Massachusetts Institute of Technology
     *
     */
    @JsonProperty("institution")
    @JsonPropertyDescription("e.g. Massachusetts Institute of Technology")
    private String institution;
    /**
     * e.g. Arts
     *
     */
    @JsonProperty("area")
    @JsonPropertyDescription("e.g. Arts")
    private String area;
    /**
     * e.g. Bachelor
     *
     */
    @JsonProperty("studyType")
    @JsonPropertyDescription("e.g. Bachelor")
    private String studyType;
    /**
     * e.g. 2014-06-29
     *
     */
    @JsonProperty("startDate")
    @JsonPropertyDescription("e.g. 2014-06-29")
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
     * grade point average, e.g. 3.67/4.0
     *
     */
    @JsonProperty("gpa")
    @JsonPropertyDescription("grade point average, e.g. 3.67/4.0")
    private String gpa;
    /**
     * List notable courses/subjects
     *
     */
    @JsonProperty("courses")
    @JsonPropertyDescription("List notable courses/subjects")
    private List<String> courses = null;
    @JsonIgnore
    private Map<String, Object> additionalProperties = new HashMap<String, Object>();
    private final static long serialVersionUID = 3745395026826121720L;

    /**
     * e.g. Massachusetts Institute of Technology
     *
     */
    @JsonProperty("institution")
    public String getInstitution() {
        return institution;
    }

    /**
     * e.g. Massachusetts Institute of Technology
     *
     */
    @JsonProperty("institution")
    public void setInstitution(String institution) {
        this.institution = institution;
    }

    /**
     * e.g. Arts
     *
     */
    @JsonProperty("area")
    public String getArea() {
        return area;
    }

    /**
     * e.g. Arts
     *
     */
    @JsonProperty("area")
    public void setArea(String area) {
        this.area = area;
    }

    /**
     * e.g. Bachelor
     *
     */
    @JsonProperty("studyType")
    public String getStudyType() {
        return studyType;
    }

    /**
     * e.g. Bachelor
     *
     */
    @JsonProperty("studyType")
    public void setStudyType(String studyType) {
        this.studyType = studyType;
    }

    /**
     * e.g. 2014-06-29
     *
     */
    @JsonProperty("startDate")
    public LocalDate getStartDate() {
        return startDate;
    }

    /**
     * e.g. 2014-06-29
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
     * grade point average, e.g. 3.67/4.0
     *
     */
    @JsonProperty("gpa")
    public String getGpa() {
        return gpa;
    }

    /**
     * grade point average, e.g. 3.67/4.0
     *
     */
    @JsonProperty("gpa")
    public void setGpa(String gpa) {
        this.gpa = gpa;
    }

    /**
     * List notable courses/subjects
     *
     */
    @JsonProperty("courses")
    public List<String> getCourses() {
        return courses;
    }

    /**
     * List notable courses/subjects
     *
     */
    @JsonProperty("courses")
    public void setCourses(List<String> courses) {
        this.courses = courses;
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

        Education education = (Education) o;

        if (institution != null ? !institution.equals(education.institution) : education.institution != null)
            return false;
        if (area != null ? !area.equals(education.area) : education.area != null) return false;
        if (studyType != null ? !studyType.equals(education.studyType) : education.studyType != null) return false;
        if (startDate != null ? !startDate.equals(education.startDate) : education.startDate != null) return false;
        if (endDate != null ? !endDate.equals(education.endDate) : education.endDate != null) return false;
        if (gpa != null ? !gpa.equals(education.gpa) : education.gpa != null) return false;
        if (courses != null ? !courses.equals(education.courses) : education.courses != null) return false;
        return additionalProperties != null ? additionalProperties.equals(education.additionalProperties) : education.additionalProperties == null;
    }

    @Override
    public int hashCode() {
        int result = institution != null ? institution.hashCode() : 0;
        result = 31 * result + (area != null ? area.hashCode() : 0);
        result = 31 * result + (studyType != null ? studyType.hashCode() : 0);
        result = 31 * result + (startDate != null ? startDate.hashCode() : 0);
        result = 31 * result + (endDate != null ? endDate.hashCode() : 0);
        result = 31 * result + (gpa != null ? gpa.hashCode() : 0);
        result = 31 * result + (courses != null ? courses.hashCode() : 0);
        result = 31 * result + (additionalProperties != null ? additionalProperties.hashCode() : 0);
        return result;
    }
}
