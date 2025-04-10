package com.github.shiloh;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

/**
 * Test Sample
 *
 * @author shiloh
 * @date 2025/4/10 9:19
 */
class SampleTests {
    @Test
    void test() {
        String msg = "Hello World";
        Assertions.assertNotNull(msg);
        Assertions.assertEquals("Hello World", msg);
    }
}
