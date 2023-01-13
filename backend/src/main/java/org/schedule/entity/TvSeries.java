package org.schedule.entity;

import com.fasterxml.jackson.annotation.JsonIgnoreProperties;

import java.net.URL;
import java.util.ArrayList;
import java.util.List;
import java.util.Set;

@JsonIgnoreProperties(ignoreUnknown = true)
public class TvSeries {

    private Long id;
    private String name;
    private URL url;
    private String language;
    private String summary;
    private Set<String> genres;
    private URL officialSite;
    private List<Episode> episodes = new ArrayList<>();

    public TvSeries() {
    }

    public TvSeries(Long id, String name, URL url, String language, String summary,
                    Set<String> genres, URL officialSite, List<Episode> episodes) {
        this.id = id;
        this.name = name;
        this.url = url;
        this.language = language;
        this.summary = summary;
        this.genres = genres;
        this.officialSite = officialSite;
        this.episodes = episodes;
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

    public URL getUrl() {
        return url;
    }

    public void setUrl(URL url) {
        this.url = url;
    }

    public String getLanguage() {
        return language;
    }

    public void setLanguage(String language) {
        this.language = language;
    }

    public String getSummary() {
        return summary;
    }

    public void setSummary(String summary) {
        this.summary = summary;
    }

    public Set<String> getGenres() {
        return genres;
    }

    public void setGenres(Set<String> genres) {
        this.genres = genres;
    }

    public URL getOfficialSite() {
        return officialSite;
    }

    public void setOfficialSite(URL officialSite) {
        this.officialSite = officialSite;
    }

    public List<Episode> getEpisodes() {
        return episodes;
    }

    public void setEpisodes(List<Episode> episodes) {
        this.episodes = episodes;
    }
}
