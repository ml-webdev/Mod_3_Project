package com.project.Mod_3_Project.job;

import javax.persistence.*;

@Entity
@Table
public class Job {
//    instantiate the schema of the table
    @Id
    @SequenceGenerator(
            name = "job_sequence",
            sequenceName = "job_sequence",
            allocationSize = 1
    )
    @GeneratedValue(
            strategy = GenerationType.SEQUENCE,
            generator = "job_sequence"
    )
    private Long id;
    private String jobtitle;
    private String company;
    private String city;
    private String state;
    private String country;
    private String formattedLocation;
    private String source;
    private String date;
    private String snippet;
    private String url;
    private String onmousedown;
    private Double latitude;
    private Double longitude;
    private String jobkey;
    private Boolean sponsored;
    private Boolean expired;
    private Boolean indeedApply;
    private String formattedLocationFull;
    private String formattedRelativeTime;


//    Generate constructors

    public Job() {
//        No arg constructor
    }

    public Job(Long id,
               String jobtitle,
               String company,
               String city,
               String state,
               String country,
               String formattedLocation,
               String source,
               String date,
               String snippet,
               String url,
               String onmousedown,
               Double latitude,
               Double longitude,
               String jobkey,
               Boolean sponsored,
               Boolean expired,
               Boolean indeedApply,
               String formattedLocationFull,
               String formattedRelativeTime) {
        this.id = id;
        this.jobtitle = jobtitle;
        this.company = company;
        this.city = city;
        this.state = state;
        this.country = country;
        this.formattedLocation = formattedLocation;
        this.source = source;
        this.date = date;
        this.snippet = snippet;
        this.url = url;
        this.onmousedown = onmousedown;
        this.latitude = latitude;
        this.longitude = longitude;
        this.jobkey = jobkey;
        this.sponsored = sponsored;
        this.expired = expired;
        this.indeedApply = indeedApply;
        this.formattedLocationFull = formattedLocationFull;
        this.formattedRelativeTime = formattedRelativeTime;
    }

    public Job(String jobtitle,
               String company,
               String city,
               String state,
               String country,
               String formattedLocation,
               String source,
               String date,
               String snippet,
               String url,
               String onmousedown,
               Double latitude,
               Double longitude,
               String jobkey,
               Boolean sponsored,
               Boolean expired,
               Boolean indeedApply,
               String formattedLocationFull,
               String formattedRelativeTime) {
        this.jobtitle = jobtitle;
        this.company = company;
        this.city = city;
        this.state = state;
        this.country = country;
        this.formattedLocation = formattedLocation;
        this.source = source;
        this.date = date;
        this.snippet = snippet;
        this.url = url;
        this.onmousedown = onmousedown;
        this.latitude = latitude;
        this.longitude = longitude;
        this.jobkey = jobkey;
        this.sponsored = sponsored;
        this.expired = expired;
        this.indeedApply = indeedApply;
        this.formattedLocationFull = formattedLocationFull;
        this.formattedRelativeTime = formattedRelativeTime;
    }

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public String getJobtitle() {
        return jobtitle;
    }

    public void setJobtitle(String jobtitle) {
        this.jobtitle = jobtitle;
    }

    public String getCompany() {
        return company;
    }

    public void setCompany(String company) {
        this.company = company;
    }

    public String getCity() {
        return city;
    }

    public void setCity(String city) {
        this.city = city;
    }

    public String getState() {
        return state;
    }

    public void setState(String state) {
        this.state = state;
    }

    public String getCountry() {
        return country;
    }

    public void setCountry(String country) {
        this.country = country;
    }

    public String getFormattedLocation() {
        return formattedLocation;
    }

    public void setFormattedLocation(String formattedLocation) {
        this.formattedLocation = formattedLocation;
    }

    public String getSource() {
        return source;
    }

    public void setSource(String source) {
        this.source = source;
    }

    public String getDate() {
        return date;
    }

    public void setDate(String date) {
        this.date = date;
    }

    public String getSnippet() {
        return snippet;
    }

    public void setSnippet(String snippet) {
        this.snippet = snippet;
    }

    public String getUrl() {
        return url;
    }

    public void setUrl(String url) {
        this.url = url;
    }

    public String getOnmousedown() {
        return onmousedown;
    }

    public void setOnmousedown(String onmousedown) {
        this.onmousedown = onmousedown;
    }

    public Double getLatitude() {
        return latitude;
    }

    public void setLatitude(Double latitude) {
        this.latitude = latitude;
    }

    public Double getLongitude() {
        return longitude;
    }

    public void setLongitude(Double longitude) {
        this.longitude = longitude;
    }

    public String getJobkey() {
        return jobkey;
    }

    public void setJobkey(String jobkey) {
        this.jobkey = jobkey;
    }

    public Boolean getSponsored() {
        return sponsored;
    }

    public void setSponsored(Boolean sponsored) {
        this.sponsored = sponsored;
    }

    public Boolean getExpired() {
        return expired;
    }

    public void setExpired(Boolean expired) {
        this.expired = expired;
    }

    public Boolean getIndeedApply() {
        return indeedApply;
    }

    public void setIndeedApply(Boolean indeedApply) {
        this.indeedApply = indeedApply;
    }

    public String getFormattedLocationFull() {
        return formattedLocationFull;
    }

    public void setFormattedLocationFull(String formattedLocationFull) {
        this.formattedLocationFull = formattedLocationFull;
    }

    public String getFormattedRelativeTime() {
        return formattedRelativeTime;
    }

    public void setFormattedRelativeTime(String formattedRelativeTime) {
        this.formattedRelativeTime = formattedRelativeTime;
    }

    @Override
    public String toString() {
        return "Job{" +
                "id=" + id +
                ", jobtitle='" + jobtitle + '\'' +
                ", company='" + company + '\'' +
                ", city='" + city + '\'' +
                ", state='" + state + '\'' +
                ", country='" + country + '\'' +
                ", formattedLocation='" + formattedLocation + '\'' +
                ", source='" + source + '\'' +
                ", date='" + date + '\'' +
                ", snippet='" + snippet + '\'' +
                ", url='" + url + '\'' +
                ", onmousedown='" + onmousedown + '\'' +
                ", latitude=" + latitude +
                ", longitude=" + longitude +
                ", jobkey='" + jobkey + '\'' +
                ", sponsored=" + sponsored +
                ", expired=" + expired +
                ", indeedApply=" + indeedApply +
                ", formattedLocationFull='" + formattedLocationFull + '\'' +
                ", formattedRelativeTime='" + formattedRelativeTime + '\'' +
                '}';
    }
}
