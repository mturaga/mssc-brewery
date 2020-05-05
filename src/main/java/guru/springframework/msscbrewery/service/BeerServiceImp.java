package guru.springframework.msscbrewery.service;

import guru.springframework.msscbrewery.web.model.BeerDto;
import org.springframework.stereotype.Service;

import java.util.UUID;

@Service
public class BeerServiceImp implements BeerService {
    @Override
    public BeerDto getBeerById(UUID beerId) {
        return BeerDto.builder().id(beerId)
                .beerName("India Pale Ale")
                .beerStyle("Pale Ale")
                .build();
    }
}
