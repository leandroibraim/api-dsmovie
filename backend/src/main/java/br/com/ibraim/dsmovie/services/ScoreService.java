package br.com.ibraim.dsmovie.services;

import br.com.ibraim.dsmovie.dto.MovieDTO;
import br.com.ibraim.dsmovie.dto.ScoreDTO;
import br.com.ibraim.dsmovie.entities.MovieEntity;
import br.com.ibraim.dsmovie.entities.ScoreEntity;
import br.com.ibraim.dsmovie.entities.UserEntity;
import br.com.ibraim.dsmovie.repository.MovieRepository;
import br.com.ibraim.dsmovie.repository.ScoreRepository;
import br.com.ibraim.dsmovie.repository.UserRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

@Service
public class ScoreService {

    @Autowired
    private MovieRepository movieRepository;
    @Autowired
    private UserRepository userRepository;
    @Autowired
    private ScoreRepository scoreRepository;

    @Transactional
    public MovieDTO saveScore(ScoreDTO scoredto){
        UserEntity user = userRepository.findByEmail(scoredto.getEmail());
        if(user == null){
            user = new UserEntity();
            user.setEmail(scoredto.getEmail());
            user = userRepository.saveAndFlush(user);
        }

        MovieEntity movie = movieRepository.findById(scoredto.getMovieId()).get();

        ScoreEntity score = new ScoreEntity();
        score.setMovie(movie);
        score.setUser(user);
        score.setValue(scoredto.getScore());

        score = scoreRepository.saveAndFlush(score);

        double sum = 0.0;
        for (ScoreEntity s : movie.getScores()){
            sum = sum + s.getValue();
        }
        double avg = sum / movie.getScores().size();

        movie.setScore(avg);
        movie.setCount(movie.getScores().size());
        movie = movieRepository.save(movie);

        return new MovieDTO(movie);
    }
}
