package org.humber.project.services;

import org.humber.project.domain.Goal;
import org.springframework.stereotype.Component;

import java.util.List;

@Component
public interface GoalService {

    List<Goal> getCompleteGoals();

    List<Goal> getIncompleteGoals();

    void createGoal(Goal goal);

    void deleteGoal(Long goalId);

    void completeGoal(Long goalId);

}
