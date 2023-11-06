package com.example;

import io.micronaut.test.extensions.junit5.annotation.MicronautTest;
import jakarta.inject.Inject;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

@MicronautTest
class ServiceTest {

    @Inject
    Service service;

    @Test
    void testGet() {
        assertEquals("Hello World", service.get());
    }

}