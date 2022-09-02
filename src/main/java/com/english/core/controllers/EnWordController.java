package com.english.core.controllers;

import com.english.core.dto.EnWordDTO;
import com.english.core.mappers.EnglishWordMapper;
import com.english.core.model.EnWord;
import com.english.core.services.EnWordService;
import lombok.RequiredArgsConstructor;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequiredArgsConstructor
public class EnWordController {

    private final EnWordService enWordService;
    private final EnglishWordMapper englishWordMapper;

    @GetMapping("/en-words/{id}")
    public EnWordDTO sayHello(@PathVariable("id") Long pid) {
        EnWord enWord = enWordService.getEnWord(pid);
        return englishWordMapper.toDTO(enWord);
    }


}
