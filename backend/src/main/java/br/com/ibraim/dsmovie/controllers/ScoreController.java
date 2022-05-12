package br.com.ibraim.dsmovie.controllers;


import br.com.ibraim.dsmovie.dto.MovieDTO;
import br.com.ibraim.dsmovie.dto.ScoreDTO;
import br.com.ibraim.dsmovie.services.MovieService;
import br.com.ibraim.dsmovie.services.ScoreService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.Pageable;
import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping(value = "/scores")
public class ScoreController {

    @Autowired
    private ScoreService scoreService;

    @PutMapping
    public MovieDTO saveScore(@RequestBody ScoreDTO score){
        MovieDTO movie = scoreService.saveScore(score);
        return movie;
    }
}
