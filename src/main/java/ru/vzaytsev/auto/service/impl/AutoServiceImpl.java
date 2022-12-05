package ru.vzaytsev.auto.service.impl;

import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Service;
import ru.vzaytsev.auto.Logger;
import ru.vzaytsev.auto.entity.Auto;
import ru.vzaytsev.auto.repository.AutoRepository;
import ru.vzaytsev.auto.service.AutoService;

import java.util.ArrayList;
import java.util.List;
import java.util.stream.Collectors;

@RequiredArgsConstructor
@Service
public class AutoServiceImpl implements AutoService {

    private final AutoRepository autoRepository;
    private final Logger logger;

    @Override
    public void createAuto(Auto auto) {
        logger.initLogger(this.getClass());
        logger.info("createAuto", "Машина создана с id: " + autoRepository.save(auto).getId());
    }

    @Override
    public Auto getAutoById(Long autoId) {
        logger.initLogger(this.getClass());
        Auto auto = autoRepository.findById(autoId).orElse(null);
        if(auto != null){
            logger.info("createAuto", "Машина найдена с id: " + auto.getId());
            return auto;
        }
        return null;
    }

    @Override
    public List<Auto> getAutoByClientId(Long clientId) {
        logger.initLogger(this.getClass());
        List<Auto> autos = autoRepository.getAllByClientId(clientId);
        if(autos != null && autos.size() > 0){
            logger.info(String.format("Машины найдены с id: %s",autos.stream().map(Auto::getId).collect(Collectors.toList()))
                    ,"getAutoByClientId");
            return autos;
        }
        return autos;
    }

    @Override
    public void updatedAuto(Auto auto) {
        logger.initLogger(this.getClass());
        logger.info("createAuto", "Машина обновлена с id: " + autoRepository.save(auto).getId());
    }
}
