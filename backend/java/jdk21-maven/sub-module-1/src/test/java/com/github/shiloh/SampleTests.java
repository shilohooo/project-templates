package com.github.shiloh;

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
}
