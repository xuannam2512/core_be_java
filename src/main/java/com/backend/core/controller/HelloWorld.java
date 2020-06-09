package com.backend.core.controller;

import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import static com.backend.core.controller.HelloWorld.HELLO_WORLD_API;
import static org.springframework.http.ResponseEntity.ok;

@RequestMapping(HELLO_WORLD_API)
@RestController
public class HelloWorld {

    public static final String HELLO_WORLD_API = "/test";

    @GetMapping
    public ResponseEntity<String> helloWord() {
        return ok("Hello World");
    }
}
