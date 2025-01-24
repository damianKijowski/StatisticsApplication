package Aplikacja.aplikacjadostatystyk.repository;

import Aplikacja.aplikacjadostatystyk.Entity.League;
import org.springframework.data.repository.CrudRepository;

import java.util.List;

public interface LeagueRepository extends CrudRepository<League, Integer> {
    League findByUserIdAndLeagueId(Integer userId, Integer leagueId);
    List<League> findAllByUserId(Integer userId);
}
