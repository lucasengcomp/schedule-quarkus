package org.schedule.entity;

public class Episode {
    private Long id;
    private String name;
    private Long season;
    private String summary;

    public Episode() {
    }

    public Episode(Long id, String name, Long season, String summary) {
        this.id = id;
        this.name = name;
        this.season = season;
        this.summary = summary;
    }

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public Long getSeason() {
        return season;
    }

    public void setSeason(Long season) {
        this.season = season;
    }

    public String getSummary() {
        return summary;
    }

    public void setSummary(String summary) {
        this.summary = summary;
    }
}
