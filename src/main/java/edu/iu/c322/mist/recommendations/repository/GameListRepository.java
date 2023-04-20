package edu.iu.c322.mist.recommendations.repository;

import edu.iu.c322.mist.recommendations.model.Game;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface GameListRepository extends JpaRepository<Game, Integer> {
}
