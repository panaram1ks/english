package com.english.core.dto;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.EqualsAndHashCode;
import lombok.NoArgsConstructor;

import javax.persistence.*;

@Data
@AllArgsConstructor
@NoArgsConstructor
@EqualsAndHashCode(of = {"id"})
public class ImageDTO {
    private Long id;
    private String name;
    private String originalFilename;
    private String contentType;
    private Long size;
    private byte[] bytes;
}
