package ru.vzaytsev.auto.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;
import ru.vzaytsev.auto.entity.AutoHistory;

@Repository
public interface AutoHistoryRepository extends JpaRepository<AutoHistory, Long> {
}
