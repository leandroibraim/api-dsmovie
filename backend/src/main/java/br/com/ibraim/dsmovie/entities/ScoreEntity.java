package br.com.ibraim.dsmovie.entities;

import javax.persistence.*;

@Entity
@Table(name = "TB_SCORE")
public class ScoreEntity {

    @EmbeddedId
    private ScoreEntityPK id = new ScoreEntityPK();
    private Double value;

    public ScoreEntity() {
    }

    public void setMovie(MovieEntity movie){
        id.setMovie(movie);
    }

    public void setUser(UserEntity user){
        id.setUser(user);
    }

    public ScoreEntityPK getId() {
        return id;
    }

    public void setId(ScoreEntityPK id) {
        this.id = id;
    }

    public Double getValue() {
        return value;
    }

    public void setValue(Double value) {
        this.value = value;
    }
}
