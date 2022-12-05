package ru.vzaytsev.auto.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;
import ru.vzaytsev.auto.entity.ClientInfo;

@Repository
public interface ClientInfoRepository extends JpaRepository<ClientInfo, Long> {
}
