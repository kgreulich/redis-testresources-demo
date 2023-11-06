package com.example;

import io.micronaut.cache.annotation.Cacheable;
import jakarta.inject.Singleton;

@Singleton
public class Service {

    @Cacheable("mycache")
    public String get() {
        return "Hello World";
    }

}
