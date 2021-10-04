package com.example.springframework.msscbrewery.web.service.v2;

import com.example.springframework.msscbrewery.web.model.BeerDto;
import com.example.springframework.msscbrewery.web.model.v2.BeerDtoV2;
import com.example.springframework.msscbrewery.web.service.BeerService;
import lombok.extern.slf4j.Slf4j;
import org.springframework.stereotype.Service;

import java.util.UUID;

@Slf4j
@Service
public class BeerServiceImplV2 implements BeerServiceV2 {
    @Override
    public BeerDto getBeerById(UUID beerId) {
        return BeerDto.builder().id(UUID.randomUUID())
                .beerName("Galaxy Cat")
                .beerStyle("Pale Ale")
                .build();
    }

    @Override
    public BeerDtoV2 saveNewBear(BeerDtoV2 beerDtoV2) {
        return BeerDtoV2.builder().id(UUID.randomUUID()).build();
    }

    @Override
    public void updateBeer(UUID beerId, BeerDtoV2 beerDtoV2) {
        // implementation will done later
    }

    @Override
    public void deleteById(UUID beerId) {
        log.info("Deleting a Beer...");
    }


}
