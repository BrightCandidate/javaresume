package com.brightcandidate.javaresume;

import com.brightcandidate.javaresume.builder.JsonResume;
import com.fasterxml.jackson.databind.DeserializationFeature;
import com.fasterxml.jackson.databind.ObjectMapper;
import org.junit.Test;

import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.net.URI;
import java.time.LocalDate;
import java.time.Month;
import java.util.Arrays;

import static org.junit.Assert.assertEquals;

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
public class JsonResumeTest {

    @Test
    public void testJsonResumeBuilder() throws Exception{
        ObjectMapper objectMapper = new ObjectMapper();
        objectMapper.configure(DeserializationFeature.FAIL_ON_UNKNOWN_PROPERTIES, true);

        JsonResume resumeCopy;

        JsonResume resume = new JsonResume.JsonResumeBuilder(new Basics("Chris Wyse",
                "java Developer", null, "chris@brightcandidate.com", "555-5555",
                new URI("https:www.brightcandidate.com"), "Anachronistic Java Developer",
                new Location("22 Arcacia Avenue", "666", "Ventura", "US",
                        "West"), Arrays.asList(new Profile("LinkedIn", "Chris Wyse",
                "https://www.linkedin.com/in/chris-wyse-a1764a23/"))))

                .setWorkList(Arrays.asList(new Work("Bright Candidate", "Self-recruiting marketplace for candidates and employers",
                        "Co-Founder", new URI("https://www.brightcandidate.com"), LocalDate.of(2014, Month.AUGUST,
                        1), null, "An awesome idea, please join us.",
                        Arrays.asList("Created a totally new product and class of service in employment."))))

                .setEducationList(Arrays.asList(new Education("North Carolina State University", "Computer Science", "Bachelors",
                        LocalDate.of(1998, Month.OCTOBER, 12), LocalDate.of(2002, Month.SEPTEMBER, 12),
                        null, Arrays.asList("Cyber Security", "Data Visualization", "Machine Learning"))))

                .build();

        try(FileOutputStream fos = new FileOutputStream("./src/test/resources/jsonresume.json")){
            objectMapper.writerWithDefaultPrettyPrinter().writeValue(fos, resume);
        }

        try(FileInputStream fis = new FileInputStream("./src/test/resources/jsonresume.json")){
            resumeCopy = objectMapper.readValue(fis, JsonResume.class);
        }
        assertEquals(resume, resumeCopy);
    }
}
