package Aplikacja.aplikacjadostatystyk.repository;

import Aplikacja.aplikacjadostatystyk.Entity.Friend;
import Aplikacja.aplikacjadostatystyk.Entity.Prediction;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface PredictionRepository extends CrudRepository<Prediction, Integer> {

}
