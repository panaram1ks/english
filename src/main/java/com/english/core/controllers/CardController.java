package com.english.core.controllers;

import com.english.core.dto.CardDTO;
import com.english.core.mappers.CardMapper;
import com.english.core.model.Card;
import com.english.core.services.CardService;
import lombok.RequiredArgsConstructor;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequiredArgsConstructor
public class CardController {

    private final CardService cardService;
    private final CardMapper cardMapper;

    @GetMapping("/cards/{id}")
    public CardDTO getCardById(@PathVariable Long id){
        Card card = cardService.getCard(id);
        return cardMapper.toDTO(card);
    }

}
