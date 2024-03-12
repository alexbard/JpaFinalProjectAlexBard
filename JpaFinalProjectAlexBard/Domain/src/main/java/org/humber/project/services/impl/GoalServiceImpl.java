package org.humber.project.services.impl;

import lombok.RequiredArgsConstructor;
import org.humber.project.domain.Goal;
import org.humber.project.services.GoalJPAService;
import org.humber.project.services.GoalService;
import org.springframework.stereotype.Component;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
@Component
@RequiredArgsConstructor
public class GoalServiceImpl implements GoalService {
    private final GoalJPAService goalJPAService;

    @Override
    public List<Goal> getCompleteGoals() {
        return goalJPAService.findGoalsByStatus("Complete");
    }

    @Override
    public List<Goal> getIncompleteGoals() {
        return goalJPAService.findGoalsByStatus("Incomplete");
    }

    @Override
    public void createGoal(Goal goal) {
        goalJPAService.create(goal);
    }

    @Override
    public void deleteGoal(Long goalId) {
        goalJPAService.delete(goalId);
    }

    @Override
    public void completeGoal(Long goalId) {
        goalJPAService.complete(goalId);
    }

}
