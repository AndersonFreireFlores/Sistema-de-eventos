package com.example.lembrete_eventos;

import org.springframework.boot.SpringApplication;

public class TestLembreteEventosApplication {

    public static void main(String[] args) {
        SpringApplication.from(LembreteEventosApplication::main).with(TestcontainersConfiguration.class).run(args);
    }

}
