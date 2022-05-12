package br.com.ibraim.dsmovie.services;

import br.com.ibraim.dsmovie.dto.MovieDTO;
import br.com.ibraim.dsmovie.entities.MovieEntity;
import br.com.ibraim.dsmovie.repository.MovieRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.Pageable;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;
import org.springframework.web.bind.annotation.GetMapping;

@Service
public class MovieService {

    private final MovieRepository movieRepository;

    public MovieService(MovieRepository movieRepository) {
        this.movieRepository = movieRepository;
    }

    @Transactional(readOnly = true)
    public Page<MovieDTO> findAll(Pageable pageable){
        Page<MovieEntity> listMoviesPag = movieRepository.findAll(pageable);

        return listMoviesPag.map(element -> new MovieDTO(element));
    }

    @Transactional(readOnly = true)
    public MovieDTO findById(Long id){
        MovieEntity movieId = movieRepository.findById(id).get();
        MovieDTO movieById = new MovieDTO(movieId);

        return movieById;
    }
}
