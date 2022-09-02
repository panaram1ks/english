package com.english.core.services;

import com.english.core.model.Card;
import com.english.core.repository.CardRepository;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Service;

@Service
@RequiredArgsConstructor
public class CardServiceImpl implements CardService{

    private final CardRepository cardRepository;

    @Override
    public Card getCard(Long id) {
        return cardRepository.getById(id);
    }
}
