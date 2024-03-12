package org.humber.project.services;

import org.humber.project.domain.Goal;
import org.springframework.stereotype.Component;

import java.util.List;

@Component
public interface GoalJPAService {
    void create(Goal goal);

    void delete(Long goalId);

    void complete(Long goalId);

    List<Goal> findGoalsByStatus(String status);

}
