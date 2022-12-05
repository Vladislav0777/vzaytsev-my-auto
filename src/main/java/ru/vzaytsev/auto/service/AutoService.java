package ru.vzaytsev.auto.service;

import ru.vzaytsev.auto.entity.Auto;

import java.util.List;

public interface AutoService {
    void createAuto(Auto auto);

    Auto getAutoById(Long autoId);

    List<Auto> getAutoByClientId(Long clientId);

    void updatedAuto(Auto auto);
}
