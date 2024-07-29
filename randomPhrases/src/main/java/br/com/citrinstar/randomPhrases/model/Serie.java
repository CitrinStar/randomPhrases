package br.com.citrinstar.randomPhrases.model;

import jakarta.persistence.*;

@Entity
public class Serie {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;
    private String title;
    private String poster;
    private String phrase;
    private String personage;

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        id = id;
    }

    public String getTitle() {
        return title;
    }

    public void setTitle(String title) {
        this.title = title;
    }

    public String getPoster() {
        return poster;
    }

    public void setPoster(String poster) {
        this.poster = poster;
    }

    public String getPhrase() {
        return phrase;
    }

    public void setPhrase(String phrase) {
        this.phrase = phrase;
    }

    public String getPersonage() {
        return personage;
    }

    public void setPersonage(String personage) {
        this.personage = personage;
    }
}
