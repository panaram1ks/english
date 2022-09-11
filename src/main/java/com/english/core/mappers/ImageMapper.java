package com.english.core.mappers;

import com.english.core.dto.ImageDTO;
import com.english.core.model.Image;
import org.mapstruct.Mapper;
import org.springframework.web.multipart.MultipartFile;

import java.io.IOException;

@Mapper
public interface ImageMapper {
    ImageDTO toDTO(Image image) throws IOException;
    Image toEntity(MultipartFile file) throws IOException;
}
