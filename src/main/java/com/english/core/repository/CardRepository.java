package com.english.core.repository;

import com.english.core.model.Card;
import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface CardRepository extends CrudRepository<Card, Long> {
    Card getById(Long id);
}
