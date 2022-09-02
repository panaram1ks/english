package com.english.core.repository;

import com.english.core.model.EnWord;
import com.english.core.model.RuWord;
import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface RuWordRepository extends CrudRepository<RuWord, Long> {
    RuWord getById(Long id);
}
