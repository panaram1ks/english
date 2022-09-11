package com.english.core.dto;

import lombok.*;

@Getter
@Setter
@NoArgsConstructor
@AllArgsConstructor
@Builder
public class CardDTO {
    private Long id;
    private EnWordDTO enWordDTO;
    private RuWordDTO ruWordDTO;
    private Long rating;
    private ImageDTO imageDTO;
}
