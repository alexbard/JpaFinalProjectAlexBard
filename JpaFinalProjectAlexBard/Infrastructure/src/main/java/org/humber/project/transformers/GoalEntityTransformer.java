package org.humber.project.transformers;

import org.humber.project.domain.Goal;
import org.humber.project.repositories.entities.GoalEntity;

import java.util.List;
import java.util.stream.Collectors;

public final class GoalEntityTransformer {
    private GoalEntityTransformer(){
    }

    public static GoalEntity transformToGoalEntity(Goal goal) {
        GoalEntity goalEntity = new GoalEntity();
        goalEntity.setGoalId(goal.getGoalId());
        goalEntity.setStatus(goal.getStatus());
        goalEntity.setContent(goal.getContent());
        return goalEntity;
    }

    public static Goal transformToGoal(GoalEntity goalEntity) {
        return Goal.builder()
                .goalId(goalEntity.getGoalId())
                .status(goalEntity.getStatus())
                .content(goalEntity.getContent())
                .build();
    }

    public static List<Goal> transformToGoals(List<GoalEntity> entities) {
        return entities.stream()
                .map(GoalEntityTransformer::transformToGoal)
                .collect(Collectors.toList());
    }
}
