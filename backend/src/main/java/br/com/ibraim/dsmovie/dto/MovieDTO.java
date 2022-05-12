package br.com.ibraim.dsmovie.dto;

import br.com.ibraim.dsmovie.entities.MovieEntity;

import java.util.Objects;

public class MovieDTO {

    private Long id;
    private String title;
    private Double score;
    private Integer count;
    private String image;

    public MovieDTO() {
    }

    public MovieDTO(MovieEntity movieEntity) {
        this.id = movieEntity.getId();
        this.title = movieEntity.getTitle();
        this.score = movieEntity.getScore();
        this.count = movieEntity.getCount();
        this.image = movieEntity.getImage();
    }

    public Long getId() {
        return id;
    }

    public String getTitle() {
        return title;
    }

    public Double getScore() {
        return score;
    }

    public Integer getCount() {
        return count;
    }

    public String getImage() {
        return image;
    }

}
