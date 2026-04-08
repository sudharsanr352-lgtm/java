package com.user;

import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

public class UserTest {

    @Test
    void testValidEmail() {
        assertTrue(Validation.isValidEmail("test@gmail.com"));
    }

    @Test
    void testInvalidEmail() {
        assertFalse(Validation.isValidEmail("testgmail"));
    }

    @Test
    void testValidPassword() {
        assertTrue(Validation.isValidPassword("123456"));
    }

    @Test
    void testInvalidPassword() {
        assertFalse(Validation.isValidPassword("123"));
    }
}