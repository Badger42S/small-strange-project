package com.somethingelse.somethingelseapp.services;
import guru.springframework.norris.chuck.ChuckNorrisQuotes;
import org.springframework.stereotype.Service;

@Service
public class SomeServiceImpl implements SomeService{
    private final ChuckNorrisQuotes chuckQuotes;

    public SomeServiceImpl() {
        this.chuckQuotes = new ChuckNorrisQuotes();
    }

    @Override
    public String getJoke() {
        return chuckQuotes.getRandomQuote();
    }
}
