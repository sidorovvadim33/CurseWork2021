package main.service.impl;

import main.model.GameStatistics;
import main.model.User;
import main.repository.GameStatisticsRepository;
import main.repository.UserRepository;
import main.service.GameStatisticsService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.stereotype.Service;

@Service("gameStatisticsService")
public class GameStatisticsServiceImpl implements GameStatisticsService {

    private GameStatisticsRepository statisticsRepository;

    @Autowired
    public GameStatisticsServiceImpl(@Qualifier("gameStatisticsRepository") GameStatisticsRepository statisticsRepository) {
        this.statisticsRepository = statisticsRepository;
    }

    @Override
    public void saveStatistics(GameStatistics stat) {
        GameStatistics statistics = stat;
        statisticsRepository.save(statistics);
    }

    @Override
    public GameStatistics readUserStatistics(User user) {

        return null;
    }
}
