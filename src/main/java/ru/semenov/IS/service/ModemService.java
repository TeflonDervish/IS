package ru.semenov.IS.service;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.stereotype.Service;
import ru.semenov.IS.model.Modem;
import ru.semenov.IS.repository.ModemRepository;

import java.util.ArrayList;
import java.util.List;
import java.util.Map;

@Service
public class ModemService {

    private static final Logger log = LoggerFactory.getLogger(ModemService.class);
    private ModemRepository modemRepository;

    public ModemService(ModemRepository modemRepository) {
        this.modemRepository = modemRepository;
    }

    public List<Modem> getResult(Map<String, String> mapOfResult) {

        StringBuilder query = new StringBuilder();

        for (String s: mapOfResult.keySet()) {
            query.append(s).append("='").append(mapOfResult.get(s)).append("' AND ");
        }

        log.info(query.substring(0, query.length() - 5));

        return modemRepository.findByCustomCondition(query.substring(0, query.length() - 5));
    }

    public List<Modem> getAll() {
        return modemRepository.findAll();
    }



}
