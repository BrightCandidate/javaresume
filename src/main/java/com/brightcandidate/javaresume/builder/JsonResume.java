package com.brightcandidate.javaresume.builder;


import com.brightcandidate.javaresume.*;
import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonPropertyDescription;
import com.fasterxml.jackson.annotation.JsonPropertyOrder;

import java.util.List;

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
@JsonInclude(JsonInclude.Include.NON_NULL)
@JsonPropertyOrder({
        "basics",
        "profiles",
        "work",
        "volunteer",
        "education",
        "awards",
        "publications",
        "skills",
        "languages",
        "interests",
        "references",
        "projects",
        "meta"
})
public class JsonResume {

    @JsonProperty("basics")
    private Basics basics;
    @JsonProperty("work")
    private List<Work> workList = null;
    @JsonProperty("volunteer")
    private List<Volunteer> volunteerList = null;
    @JsonProperty("education")
    private List<Education> educationList = null;
    /**
     * Specify any awards you have received throughout your professional career
     *
     */
    @JsonProperty("awards")
    @JsonPropertyDescription("Specify any awards you have received throughout your professional career")
    private List<Award> awardList = null;
    /**
     * Specify your publications through your career
     *
     */
    @JsonProperty("publications")
    @JsonPropertyDescription("Specify your publications through your career")
    private List<Publication> publicationList = null;
    /**
     * List out your professional skill-set
     *
     */
    @JsonProperty("skills")
    @JsonPropertyDescription("List out your professional skill-set")
    private List<Skill> skillList = null;
    /**
     * List any other languages you speak
     *
     */
    @JsonProperty("languages")
    @JsonPropertyDescription("List any other languages you speak")
    private List<Language> languageList = null;
    @JsonProperty("interests")
    private List<Interest> interestList = null;
    /**
     * List references you have received
     *
     */
    @JsonProperty("references")
    @JsonPropertyDescription("List references you have received")
    private List<Reference> referenceList = null;

    /**
     * Specify career projects
     *
     */
    @JsonProperty("projects")
    @JsonPropertyDescription("Specify career projects")
    private List<Project> projectList = null;

    /**
     * The schema version and any other tooling configuration lives here
     *
     */
    @JsonProperty("meta")
    @JsonPropertyDescription("The schema version and any other tooling configuration lives here")
    private Meta meta;

    public JsonResume(){}

    private JsonResume(JsonResumeBuilder builder){
        this.basics = builder.basics;
        this.workList = builder.workList;
        this.volunteerList = builder.volunteerList;
        this.educationList = builder.educationList;
        this.awardList = builder.awardList;
        this.publicationList = builder.publicationList;
        this.skillList = builder.skillList;
        this.languageList = builder.languageList;
        this.interestList = builder.interestList;
        this.referenceList = builder.referenceList;
        this.projectList = builder.projectList;
        this.meta = builder.meta;
    }

    public Basics getBasics() {
        return basics;
    }

    public List<Work> getWorkList() {
        return workList;
    }

    public List<Volunteer> getVolunteerList() {
        return volunteerList;
    }

    public List<Education> getEducationList() {
        return educationList;
    }

    public List<Award> getAwardList() {
        return awardList;
    }

    public List<Publication> getPublicationList() {
        return publicationList;
    }

    public List<Skill> getSkillList() {
        return skillList;
    }

    public List<Language> getLanguageList() {
        return languageList;
    }

    public List<Interest> getInterestList() {
        return interestList;
    }

    public List<Reference> getReferenceList() {
        return referenceList;
    }

    public static class JsonResumeBuilder{

        //required
        private final Basics basics;

        //optionals
        private List<Work> workList;
        private List<Volunteer> volunteerList;
        private List<Education> educationList;
        private List<Award> awardList;
        private List<Publication> publicationList;
        private List<Skill> skillList;
        private List<Language> languageList;
        private List<Interest> interestList;
        private List<Reference> referenceList;
        private List<Project> projectList;
        private Meta meta;

        public JsonResumeBuilder(Basics basics){
            this.basics = basics;
        }

        public JsonResume build(){
            return new JsonResume(this);
        }

        public JsonResumeBuilder setWorkList(List<Work> workList) {
            this.workList = workList;
            return this;
        }

        public JsonResumeBuilder setVolunteerList(List<Volunteer> volunteerList) {
            this.volunteerList = volunteerList;
            return this;
        }

        public JsonResumeBuilder setEducationList(List<Education> educationList) {
            this.educationList = educationList;
            return this;
        }

        public JsonResumeBuilder setAwardList(List<Award> awardList) {
            this.awardList = awardList;
            return this;
        }

        public JsonResumeBuilder setPublicationList(List<Publication> publicationList) {
            this.publicationList = publicationList;
            return this;
        }

        public JsonResumeBuilder setSkillList(List<Skill> skillList) {
            this.skillList = skillList;
            return this;
        }

        public JsonResumeBuilder setLanguageList(List<Language> languageList) {
            this.languageList = languageList;
            return this;
        }

        public JsonResumeBuilder setInterestList(List<Interest> interestList) {
            this.interestList = interestList;
            return this;
        }

        public JsonResumeBuilder setReferenceList(List<Reference> referenceList) {
            this.referenceList = referenceList;
            return this;
        }

        public JsonResumeBuilder setProjectsList(List<Project> projectList) {
            this.projectList = projectList;
            return this;
        }

        public JsonResumeBuilder setMeta(Meta meta) {
            this.meta = meta;
            return this;
        }
    }


    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;

        JsonResume that = (JsonResume) o;

        if (basics != null ? !basics.equals(that.basics) : that.basics != null) return false;
        if (workList != null ? !workList.equals(that.workList) : that.workList != null) return false;
        if (volunteerList != null ? !volunteerList.equals(that.volunteerList) : that.volunteerList != null)
            return false;
        if (educationList != null ? !educationList.equals(that.educationList) : that.educationList != null)
            return false;
        if (awardList != null ? !awardList.equals(that.awardList) : that.awardList != null) return false;
        if (publicationList != null ? !publicationList.equals(that.publicationList) : that.publicationList != null)
            return false;
        if (skillList != null ? !skillList.equals(that.skillList) : that.skillList != null) return false;
        if (languageList != null ? !languageList.equals(that.languageList) : that.languageList != null) return false;
        if (interestList != null ? !interestList.equals(that.interestList) : that.interestList != null) return false;
        if (referenceList != null ? !referenceList.equals(that.referenceList) : that.referenceList != null)
            return false;
        if (projectList != null ? !projectList.equals(that.projectList) : that.projectList != null) return false;
        return meta != null ? meta.equals(that.meta) : that.meta == null;
    }

    @Override
    public int hashCode() {
        int result = basics != null ? basics.hashCode() : 0;
        result = 31 * result + (workList != null ? workList.hashCode() : 0);
        result = 31 * result + (volunteerList != null ? volunteerList.hashCode() : 0);
        result = 31 * result + (educationList != null ? educationList.hashCode() : 0);
        result = 31 * result + (awardList != null ? awardList.hashCode() : 0);
        result = 31 * result + (publicationList != null ? publicationList.hashCode() : 0);
        result = 31 * result + (skillList != null ? skillList.hashCode() : 0);
        result = 31 * result + (languageList != null ? languageList.hashCode() : 0);
        result = 31 * result + (interestList != null ? interestList.hashCode() : 0);
        result = 31 * result + (referenceList != null ? referenceList.hashCode() : 0);
        result = 31 * result + (projectList != null ? projectList.hashCode() : 0);
        result = 31 * result + (meta != null ? meta.hashCode() : 0);
        return result;
    }
}
