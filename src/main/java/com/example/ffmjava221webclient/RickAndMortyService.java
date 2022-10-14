package com.example.ffmjava221webclient;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.stereotype.Service;
import org.springframework.web.reactive.function.client.WebClient;

import java.util.List;

@Data
@NoArgsConstructor
@AllArgsConstructor
@Service

public class RickAndMortyService {

    @Value("${url}")
    private String url;

    private WebClient webClient = WebClient.create();
//  private WebClient webClient = WebClient.create("https://rickandmortyapi.com/api");

    public List<RickAndMortyCharacter> getCharacters() {
        RickAndMortyResponse rickAndMortyResponse =
                webClient.get().uri(url + "/character")
                        .retrieve()
                        .toEntity(RickAndMortyResponse.class)
                        .block()
                        .getBody();
        return rickAndMortyResponse.getResults();
    }

    public List<RickAndMortyCharacter> getByParams(String status) {
        RickAndMortyResponse rickAndMortyResponse =
                webClient.get().uri(url + "/character/" + status)
                        .retrieve()
                        .toEntity(RickAndMortyResponse.class)
                        .block()
                        .getBody();
        return rickAndMortyResponse.getResults();
    }
}

