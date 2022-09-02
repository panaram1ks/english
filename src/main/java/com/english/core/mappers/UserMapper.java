package com.english.core.mappers;

import com.english.core.dto.UserDTO;
import com.english.core.model.User;
import org.mapstruct.Mapper;

@Mapper
public interface UserMapper {
    UserDTO toDTO(User user);
}
