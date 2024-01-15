package com.kozich.KinoMan.model.mapper;

import com.kozich.KinoMan.model.dto.UserDto;
import com.kozich.KinoMan.model.entity.UserEntity;
import org.mapstruct.InjectionStrategy;
import org.mapstruct.Mapper;

@Mapper(componentModel = "spring", injectionStrategy = InjectionStrategy.CONSTRUCTOR)
public interface User {
    UserDto userEntityToUserDto(UserEntity userEntity);

    UserEntity userDtoToUserEntity(UserDto userDto);
}
