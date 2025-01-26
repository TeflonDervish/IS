package ru.semenov.IS.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.query.Param;
import org.springframework.stereotype.Repository;
import ru.semenov.IS.model.Modem;

import java.util.List;

@Repository
public interface ModemRepository extends JpaRepository<Modem, Long> {

    @Query(value = "SELECT * FROM modem WHERE :condition", nativeQuery = true)
    List<Modem> findByCustomCondition(@Param("condition") String condition);

}
