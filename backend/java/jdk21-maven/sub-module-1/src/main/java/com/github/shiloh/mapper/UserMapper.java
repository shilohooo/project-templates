package com.github.shiloh.mapper;

import com.github.shiloh.domain.dto.UserDto;
import com.github.shiloh.domain.entity.User;
import org.mapstruct.Mapper;
import org.mapstruct.Mapping;
import org.mapstruct.factory.Mappers;

/**
 * User mapper
 *
 * @author shiloh
 * @date 2025/4/10 10:50
 */
@Mapper
public interface UserMapper {
    UserMapper INSTANCE = Mappers.getMapper(UserMapper.class);

    /**
     * Entity to DTO
     *
     * @param user user entity
     * @return user DTO
     * @author shiloh
     * @date 2025/4/10 10:51
     */
    @Mapping(source = "id", target = "userId")
    UserDto toDto(User user);
}
