package Aplikacja.aplikacjadostatystyk.controller;

import Aplikacja.aplikacjadostatystyk.Entity.Prediction;
import Aplikacja.aplikacjadostatystyk.services.PredicitonService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/prediction")
public class PredictionController {

    @Autowired
    private PredicitonService predictionService;

    @GetMapping("/{id}")
    public Prediction getPrediction(@PathVariable int id) {
        return predictionService.getPrediction(id);
    }
    @PostMapping
    public ResponseEntity<Prediction> addPrediction(@RequestBody Prediction prediction) {
        return ResponseEntity.ok()
                .body(predictionService.addPrediction(prediction));
    }
    @GetMapping("/match/{matchId}/{userId}")
    public Prediction getPredictionByMatchId(@PathVariable int matchId, @PathVariable int userId) {
        return predictionService.getPredictionByMatchId(matchId, userId);
    }

    @GetMapping
    public Iterable<Prediction> getAllPredictions() {
        return predictionService.getAllPredictions();
    }

    @PutMapping
    public ResponseEntity<Prediction> updatePrediction(@RequestBody Prediction prediction) {
        return ResponseEntity.ok()
                .body(predictionService.updatePrediction(prediction));
    }
}
