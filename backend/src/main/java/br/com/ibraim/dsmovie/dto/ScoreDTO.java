package br.com.ibraim.dsmovie.dto;

public class ScoreDTO {

    private Long movieId;
    private String email;
    private Double score;

    public ScoreDTO() {
    }

    public Long getMovieId() {
        return movieId;
    }

    public String getEmail() {
        return email;
    }

    public Double getScore() {
        return score;
    }
}
