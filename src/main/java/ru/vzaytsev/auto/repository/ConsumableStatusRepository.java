package ru.vzaytsev.auto.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;
import ru.vzaytsev.auto.entity.ConsumableStatus;

@Repository
public interface ConsumableStatusRepository extends JpaRepository<ConsumableStatus, Long> {
}
