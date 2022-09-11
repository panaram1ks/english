package com.english.core.controllers;

import com.english.core.dto.CardDTO;
import com.english.core.mappers.CardMapper;
import com.english.core.model.Card;
import com.english.core.services.CardService;
import lombok.RequiredArgsConstructor;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;
import org.springframework.web.multipart.MultipartFile;

@RestController
@RequiredArgsConstructor
public class CardController {

    private final CardService cardService;
    private final CardMapper cardMapper;

    @GetMapping("/cards/{id}")
    public ResponseEntity<?> getCardById(@PathVariable Long id){
        Card card = cardService.getCard(id);
        CardDTO cardDTO = cardMapper.toDTO(card);
        return new ResponseEntity(cardDTO, HttpStatus.OK);
    }

//    @PostMapping("/cards")
//    public ResponseEntity<?> saveCard(@RequestParam("file")MultipartFile file, @RequestBody CardDTO cardDTO){
////        Card card = cardMapper.toEntity(cardDTO, file);
////        card = cardService.addCard(card);
//        cardDTO = cardMapper.addCard(null);
//      //  cardDTO = cardMapper.toDTO(card);
//        return new ResponseEntity<>(cardDTO, HttpStatus.CREATED);
//    }

}
