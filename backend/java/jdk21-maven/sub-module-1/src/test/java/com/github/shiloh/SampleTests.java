package com.github.shiloh;

import com.github.shiloh.domain.dto.UserDto;
import com.github.shiloh.domain.entity.User;
import com.github.shiloh.mapper.UserMapper;
import lombok.extern.slf4j.Slf4j;
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

/**
 * Test Sample
 *
 * @author shiloh
 * @date 2025/4/10 9:19
 */
@Slf4j
class SampleTests {
    @Test
    void test() {
        String msg = "Hello World";
        log.trace(msg);
        log.debug(msg);
        log.info(msg);
        log.warn(msg);
        log.error(msg);
        Assertions.assertNotNull(msg);
        Assertions.assertEquals("Hello World", msg);
    }

    @Test
    void testUserMapping() {
        final User user = new User(1L, "shiloh");
        final UserDto userDto = UserMapper.INSTANCE.toDto(user);
        Assertions.assertNotNull(userDto);
        Assertions.assertNotNull(userDto.getUserId());
        Assertions.assertNotNull(userDto.getUsername());
        Assertions.assertFalse(userDto.getUsername().isBlank());
        Assertions.assertEquals(user.getId(), userDto.getUserId());
        Assertions.assertEquals(user.getUsername(), userDto.getUsername());
    }
}
