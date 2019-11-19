package com.codegym.youtube.model;

import javax.persistence.*;

@Entity
@Table (name="videos")
public class Video {
    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private Long id;
    private String idName;
    private String title;

    public Video() {
    }

    public Video(String idName, String title) {
        this.idName = idName;
        this.title = title;
    }

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public String getIdName() {
        return idName;
    }

    public void setIdName(String idName) {
        this.idName = idName;
    }

    public String getTitle() {
        return title;
    }

    public void setTitle(String title) {
        this.title = title;
    }

    @Override
    public String toString() {
        return "Video{" +
                "id=" + id +
                ", idName='" + idName + '\'' +
                ", title='" + title + '\'' +
                '}';
    }
}
