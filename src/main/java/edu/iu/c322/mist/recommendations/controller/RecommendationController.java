package edu.iu.c322.mist.recommendations.controller;

import edu.iu.c322.mist.recommendations.model.Game;
import edu.iu.c322.mist.recommendations.model.Genre;
import edu.iu.c322.mist.recommendations.repository.GameListRepository;
import edu.iu.c322.mist.recommendations.repository.GenreListRepository;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
@RequestMapping("/recommendation")
public class RecommendationController {
    private GameListRepository gameRepository;
    private GenreListRepository genreRepository;

    public RecommendationController(GameListRepository gameRepository, GenreListRepository genreRepository){
        this.gameRepository = gameRepository;
        this.genreRepository = genreRepository;
    }

    @GetMapping("/all")
    public List<Genre> genres(){
        return genreRepository.findAll();
    }


    @GetMapping("/games")
    public List<Game> games(@RequestBody Genre genre){
        return genre.getGames();
    }
}
