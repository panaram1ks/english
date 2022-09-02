package com.english.core.services;

import com.english.core.model.EnWord;
import com.english.core.repository.EnWordRepository;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Service;

@Service
@RequiredArgsConstructor
public class EnWordServiceImpl implements EnWordService {

    private final EnWordRepository enWordRepository;

    @Override
    public EnWord getEnWord(Long id) {
        return enWordRepository.getById(id);
    }
}
