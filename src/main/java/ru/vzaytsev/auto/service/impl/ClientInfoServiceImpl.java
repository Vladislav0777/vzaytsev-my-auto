package ru.vzaytsev.auto.service.impl;

import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Service;
import ru.vzaytsev.auto.Logger;
import ru.vzaytsev.auto.entity.Auto;
import ru.vzaytsev.auto.entity.ClientInfo;
import ru.vzaytsev.auto.repository.ClientInfoRepository;
import ru.vzaytsev.auto.service.AutoService;
import ru.vzaytsev.auto.service.ClientInfoService;

@RequiredArgsConstructor
@Service
public class ClientInfoServiceImpl implements ClientInfoService {

    private final Logger logger;
    private final ClientInfoRepository clientInfoRepository;

    @Override
    public void createClientInfo(ClientInfo clientInfo) {
        logger.initLogger(this.getClass());
        logger.info(String.format("Клиент создан с id: %s", clientInfoRepository.save(clientInfo).getId()),
                "createClientInfo");
    }
}
