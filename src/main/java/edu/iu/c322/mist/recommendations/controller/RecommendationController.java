package edu.iu.c322.mist.recommendations.controller;

import edu.iu.c322.mist.recommendations.repository.GameListRepository;
import edu.iu.c322.mist.recommendations.repository.GenreListRepository;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/recommendations")
public class RecommendationController {
    private GameListRepository gameRepository;
    private GenreListRepository genreRepository;
}
