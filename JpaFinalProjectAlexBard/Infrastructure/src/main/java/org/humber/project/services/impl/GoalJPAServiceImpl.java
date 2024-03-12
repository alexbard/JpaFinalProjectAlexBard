package org.humber.project.services.impl;

import lombok.RequiredArgsConstructor;
import org.humber.project.domain.Goal;
import org.humber.project.repositories.GoalJPARepository;
import org.humber.project.repositories.entities.GoalEntity;
import org.humber.project.services.GoalJPAService;
import org.humber.project.transformers.GoalEntityTransformer;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;

import static org.humber.project.transformers.GoalEntityTransformer.transformToGoal;
import static org.humber.project.transformers.GoalEntityTransformer.transformToGoalEntity;

@Service
@RequiredArgsConstructor
public class GoalJPAServiceImpl implements GoalJPAService {

    private final GoalJPARepository goalJPARepository;

    @Override
    public void create(Goal goal) {
        GoalEntity goalEntity = transformToGoalEntity(goal);
        GoalEntity createdEntity = goalJPARepository.save(goalEntity);
        transformToGoal(createdEntity);
    }

    @Override
    public void delete(Long goalId) {
        Optional<GoalEntity> optionalGoal = goalJPARepository.findById(goalId);
        optionalGoal.ifPresent(goalJPARepository::delete);
    }

    @Override
    public void complete(Long goalId) {
        Optional<GoalEntity> optionalGoal = goalJPARepository.findById(goalId);

        optionalGoal.ifPresent(goal -> {
            goal.setStatus("Complete");
            goalJPARepository.save(goal);
        });
    }

    @Override
    public List<Goal> findGoalsByStatus(String status) {
        return Optional.of(goalJPARepository.findByStatus(status))
                .map(GoalEntityTransformer::transformToGoals)
                .orElse(null);
    }



}
