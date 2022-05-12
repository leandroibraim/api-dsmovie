package br.com.ibraim.dsmovie.repository;

import br.com.ibraim.dsmovie.entities.MovieEntity;
import org.springframework.data.jpa.repository.JpaRepository;

public interface MovieRepository extends JpaRepository<MovieEntity, Long> {
}
