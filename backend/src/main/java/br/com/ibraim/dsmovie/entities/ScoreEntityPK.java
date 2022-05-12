package br.com.ibraim.dsmovie.entities;

import javax.persistence.Embeddable;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import java.io.Serializable;

@Embeddable
public class ScoreEntityPK implements Serializable {
    private static final long serialVersionUID = 1045713339645456183L;

    @ManyToOne
    @JoinColumn(name = "movie_id")
    private MovieEntity movie;
    @ManyToOne
    @JoinColumn(name = "user_id")
    private UserEntity user;

    public ScoreEntityPK() {
    }

    public MovieEntity getMovie() {
        return movie;
    }

    public void setMovie(MovieEntity movie) {
        this.movie = movie;
    }

    public UserEntity getUser() {
        return user;
    }

    public void setUser(UserEntity user) {
        this.user = user;
    }
}
