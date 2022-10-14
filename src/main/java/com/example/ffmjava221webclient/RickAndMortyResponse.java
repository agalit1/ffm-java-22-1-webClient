package com.example.ffmjava221webclient;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.util.List;

@Data
@NoArgsConstructor
@AllArgsConstructor

public class RickAndMortyResponse {
    public List<RickAndMortyCharacter> results;
}
