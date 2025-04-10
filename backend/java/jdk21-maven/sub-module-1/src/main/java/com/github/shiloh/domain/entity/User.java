package com.github.shiloh.domain.entity;

import lombok.*;

/**
 * User entity
 *
 * @author shiloh
 * @date 2025/4/10 10:48
 */
@Setter
@Getter
@ToString
@NoArgsConstructor
@AllArgsConstructor
public class User {
    /**
     * ID
     */
    private Long id;

    /**
     * Username
     */
    private String username;
}
