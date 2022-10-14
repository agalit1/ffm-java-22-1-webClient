package com.example.ffmjava221webclient;


import org.springframework.web.bind.annotation.*;

import java.util.List;
import java.util.Map;
import java.util.stream.Collectors;

@RestController
@RequestMapping("/api")
public class RIckAndMortyController {

    RickAndMortyService rickAndMortyService;

    public RIckAndMortyController(RickAndMortyService rickAndMortyService) {
        this.rickAndMortyService = rickAndMortyService;
    }

    @GetMapping
    public List<RickAndMortyCharacter> getByParams(@RequestParam Map<String, String> allParams){
        String completeQuery = "?" + allParams.entrySet().stream().map(entry -> entry.getKey() + "=" + entry.getValue()).collect(Collectors.joining("&"));
        return rickAndMortyService.getByParams(completeQuery);
    }

    @GetMapping("/rickmorty")
    public List<RickAndMortyCharacter> getCharacters() {
        return  rickAndMortyService.getCharacters();
    }
}

