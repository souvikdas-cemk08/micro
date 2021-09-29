package com.example.springframework.msscbrewery.web.service;

import com.example.springframework.msscbrewery.web.model.BeerDto;

import java.util.UUID;

public interface BeerService {
    BeerDto getBeerById(UUID beerId);

    BeerDto saveNewBear(BeerDto beerDto);

    void updateBeer(UUID beerId, BeerDto beerDto);
}
