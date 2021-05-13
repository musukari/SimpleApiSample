package com.example.controller;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class HelloController {

    @GetMapping(value = "/")
    public Response index() {
        return new Response("hello");
    }

    static class Response {

        private final String message;

        public Response(String message) {
            this.message = message;
        }

        public String getMessage() {
            return this.message;
        }
    }
}
