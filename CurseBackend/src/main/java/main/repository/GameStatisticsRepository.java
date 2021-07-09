package main.repository;

import main.model.GameStatistics;
import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface GameStatisticsRepository extends CrudRepository<GameStatistics, Integer> {
}
