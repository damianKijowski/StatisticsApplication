package Aplikacja.aplikacjadostatystyk.services;

import Aplikacja.aplikacjadostatystyk.Entity.League;
import Aplikacja.aplikacjadostatystyk.repository.LeagueRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class LeagueService {
    @Autowired
    private LeagueRepository leagueRepository;

    public League addLeague(int userId, int leagueId) throws Exception {
        if(leagueRepository.findByUserIdAndLeagueId(userId, leagueId) == null){
            League league = new League();
            league.setUserId(userId);
            league.setLeagueId(leagueId);
            return leagueRepository.save(league);
        }
        else{
            throw new Exception("League already added to favorite");
        }
    }
    public List<League> getAll(int userId) throws Exception {
        return leagueRepository.findAllByUserId(userId);
    }
    public void removeLeague(int userId, int leagueId) throws Exception {
        League league = leagueRepository.findByUserIdAndLeagueId(userId, leagueId);
        if(league != null){
            leagueRepository.delete(league);
        }
    }
}
