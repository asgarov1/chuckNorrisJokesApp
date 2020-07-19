package com.asgarov.app.service;

import guru.springframework.norris.chuck.ChuckNorrisQuotes;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.stereotype.Service;

import javax.annotation.PostConstruct;

@Service
public class JokeService {

    @Value("${message}")
    private String message;

    @PostConstruct
    public void message() {
        System.out.println("====profile====");
        System.out.println(message);
        System.out.println("====profile====");
    }

    private final ChuckNorrisQuotes chuckNorrisQuotes;

    public JokeService() {
        this.chuckNorrisQuotes = new ChuckNorrisQuotes();
    }

    public String getJoke() {
        return chuckNorrisQuotes.getRandomQuote();
    }
}
