package com.github.shiloh.domain.dto;

import lombok.Getter;
import lombok.Setter;
import lombok.ToString;

/**
 * DTO of {@link com.github.shiloh.domain.entity.User}
 *
 * @author shiloh
 * @date 2025/4/10 10:48
 */
@Setter
@Getter
@ToString
public class UserDto {
    /**
     * User ID
     */
    private Long userId;

    /**
     * Username
     */
    private String username;
}
