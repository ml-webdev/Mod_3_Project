package com.project.Mod_3_Project.job;

import org.springframework.boot.CommandLineRunner;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

import java.util.List;

@Configuration
public class JobConfig {

    @Bean
    CommandLineRunner commandLineRunner(
            JobRepository repository){
        return args -> {
            Job job1 = new Job(
                    "Java Developer",
                    "XYZ Corp.,",
                    "Austin",
                    "TX",
                    "US",
                    "Austin, TX",
                    "Dice",
                    "Mon, 02 Aug 2017 16:21:00 GMT",
                    "looking for an object-oriented Java Developer... Java Servlets, HTML, JavaScript, AJAX, Struts, Struts2, JSF) desirable. Familiarity with  Tomcat and the Java...",
                    "https://www.indeed.com/viewjob?jk=12345&indpubnum=8343699265155203",
                    "indeed_clk(this, '0000');",
                    30.27127,
                    -97.74103,
                    "12345",
                    false,
                    false,
                    true,
                    "Austin, TX",
                    "11 hours ago"
            );
            repository.saveAll(List.of(job1));
        };
    }
}
