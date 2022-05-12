package br.com.ibraim.dsmovie.repository;

import br.com.ibraim.dsmovie.entities.ScoreEntity;
import br.com.ibraim.dsmovie.entities.ScoreEntityPK;
import br.com.ibraim.dsmovie.entities.UserEntity;
import org.springframework.data.jpa.repository.JpaRepository;

public interface ScoreRepository extends JpaRepository<ScoreEntity, ScoreEntityPK> {
}
