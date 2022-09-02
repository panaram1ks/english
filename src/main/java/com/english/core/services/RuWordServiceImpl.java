package com.english.core.services;

import com.english.core.model.RuWord;
import com.english.core.repository.RuWordRepository;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Service;
@Service
@RequiredArgsConstructor
public class RuWordServiceImpl implements RuWordService{

    private final RuWordRepository ruWordRepository;

    @Override
    public RuWord getRuWord(Long id) {
        return ruWordRepository.getById(id);
    }
}
