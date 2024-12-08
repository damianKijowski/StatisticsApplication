package Aplikacja.aplikacjadostatystyk.services;

import Aplikacja.aplikacjadostatystyk.Entity.Prediction;
import Aplikacja.aplikacjadostatystyk.football_api_controller.CompetitionMatchesControllerApi;
import Aplikacja.aplikacjadostatystyk.football_api_entity.Match;
import Aplikacja.aplikacjadostatystyk.football_api_entity.Matches;
import Aplikacja.aplikacjadostatystyk.repository.PredictionRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.ArrayList;
import java.util.List;

@Service
public class PredicitonService {

    @Autowired
    private PredictionRepository predictionRepository;
    @Autowired
    private CompetitionMatchesControllerApi competitionMatchesControllerApi;

    public Prediction addPrediction(Prediction prediciton) {
        return predictionRepository.save(prediciton);
    }
    public Prediction getPrediction(int id) {
        Matches match = competitionMatchesControllerApi.getCompetitionMatch(Integer.toString(id));
        Prediction prediction = predictionRepository.findById(id).orElse(null);
        prediction.setMatch(match);
        prediction.setResult(getResult(match));
        return prediction;
    }

    public int getResult(Matches match)
    {
        int homeTeamResult = match.getScore().getFullTime().getHome();
        int awayTeamResult = match.getScore().getFullTime().getAway();
        if(homeTeamResult > awayTeamResult)
        {
            return 1;
        }
        else if (homeTeamResult < awayTeamResult)
        {
            return 2;
        } else
        {
            return 0;
        }


    }


    public Iterable <Prediction> getAllPredictions() {
         Iterable <Prediction> predictions = predictionRepository.findAll();
        List <Prediction> predictions2 = new ArrayList<>();
         for (Prediction prediction : predictions) {
             Matches match = competitionMatchesControllerApi.getCompetitionMatch(Integer.toString(prediction.getId()));
             prediction.setMatch(match);
             prediction.setResult(getResult(match));
             predictions2.add(prediction);
         }
         return predictions2;
    }
}
