package ru.semenov.IS.repository;

import jakarta.persistence.EntityManager;
import jakarta.persistence.PersistenceContext;
import org.springframework.data.jpa.repository.Query;
import org.springframework.stereotype.Repository;
import ru.semenov.IS.model.Modem;

import java.util.List;

@Repository
public class ModemRepositoryNativeQuery {

    @PersistenceContext
    private EntityManager entityManager;


    public List<Modem> getResults(String result) {
        String zapros = "select * from modem where " + result;

        var query = entityManager.createNativeQuery(zapros, Modem.class);

        return query.getResultList();
    }

}
