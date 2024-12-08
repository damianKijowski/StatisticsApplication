package Aplikacja.aplikacjadostatystyk.controller;

import Aplikacja.aplikacjadostatystyk.Entity.Prediction;
import Aplikacja.aplikacjadostatystyk.services.PredicitonService;
import org.springframework.beans.factory.annotation.Autowired;
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
    public Prediction addPrediction(@RequestBody Prediction prediction) {
        return predictionService.addPrediction(prediction);
    }

    @GetMapping
    public Iterable<Prediction> getAllPredictions() {
        return predictionService.getAllPredictions();
    }

}
