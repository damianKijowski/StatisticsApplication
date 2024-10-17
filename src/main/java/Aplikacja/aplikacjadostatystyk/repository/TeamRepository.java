package Aplikacja.aplikacjadostatystyk.repository;

import Aplikacja.aplikacjadostatystyk.Entity.Team;
import Aplikacja.aplikacjadostatystyk.football_api_entity.ApiTeam;
import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

import java.util.List;

@Repository
public interface TeamRepository extends CrudRepository<Team, Integer> {
    public List<Team> findByUserId(int userId);
}
