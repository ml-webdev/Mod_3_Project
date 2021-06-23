package com.project.Mod_3_Project.job;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

//This will have all of the resources for our api
@RestController
@RequestMapping(path = "api/v1/job")
public class JobController {
    private final JobService jobService;

    @Autowired
    public JobController(JobService jobService) {
        this.jobService = jobService;
    }

    @GetMapping
//	Makes this as a REST endpoint
    public List<Job> getJob(){
        return jobService.getJob();
    }

}
