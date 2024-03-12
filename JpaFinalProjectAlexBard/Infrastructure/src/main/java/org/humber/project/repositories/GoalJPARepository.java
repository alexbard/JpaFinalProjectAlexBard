package org.humber.project.repositories;

import org.humber.project.repositories.entities.GoalEntity;
import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

import java.util.List;

@Repository
public interface GoalJPARepository extends CrudRepository<GoalEntity, Long> {
    List<GoalEntity> findByStatus(String status);

}
