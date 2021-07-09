package main.service;

import main.model.GameStatistics;
import main.model.User;

public interface GameStatisticsService {
    public void saveStatistics(GameStatistics stat);
    public GameStatistics readUserStatistics(User user);
}
