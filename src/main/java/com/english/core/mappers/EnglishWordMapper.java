package com.english.core.mappers;

import com.english.core.dto.EnWordDTO;
import com.english.core.model.EnWord;
import org.mapstruct.Mapper;

@Mapper
public interface EnglishWordMapper {
  EnWordDTO toDTO(EnWord enWord);
}
