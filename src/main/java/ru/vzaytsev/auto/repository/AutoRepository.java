package ru.vzaytsev.auto.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;
import ru.vzaytsev.auto.entity.Auto;

import java.util.List;

@Repository
public interface AutoRepository extends JpaRepository<Auto, Long> {
    List<Auto> getAllByClientId (Long clientId);
}
