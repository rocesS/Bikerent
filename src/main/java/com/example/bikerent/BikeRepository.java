package com.example.bikerent;
//klasa zastępująca DAO

import jakarta.persistence.EntityManager;
import org.springframework.stereotype.Repository;
import org.springframework.transaction.annotation.Transactional;

import java.util.Optional;

@Repository //adnotacja do utworzenia ziarna w kontenerze dla DAO wg hibernate
public class BikeRepository {

    private final EntityManager entityManager;

    public BikeRepository(EntityManager entityManager) {
        this.entityManager = entityManager;
    }

//wywołanie entitymenagera aby zapisał obiekt "bike"  dodatkowo @transactional uzywamy do metod dla zapisu/usuniecia/edycji
    @Transactional
    public void save(Bike bike) {

        entityManager.persist(bike);
    }

    //zastosowany optional aby uchronić sie przed nullpointerexception
    public Optional <Bike> findById(Long id) {
        return Optional.ofNullable(entityManager.find(Bike.class, id));
    }

    @Transactional
    public void deleteById(Long id) {
        findById(id).ifPresent(entityManager::remove);
    }
}
