package com.english.core.mappers;

import com.english.core.dto.CardDTO;
import com.english.core.model.Card;
import org.mapstruct.Mapper;
import org.mapstruct.Mapping;

@Mapper
public interface CardMapper {

    @Mapping(target = "enWordDTO", source = "enWord")
    @Mapping(target = "ruWordDTO", source = "ruWord")
    CardDTO toDTO(Card enWord);


   Card toEntity(CardDTO dto);
}
