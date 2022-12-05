package ru.vzaytsev.auto.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;
import ru.vzaytsev.auto.entity.ConsumableHistory;

@Repository
public interface ConsumableHistoryRepository extends JpaRepository<ConsumableHistory, Long> {
}
