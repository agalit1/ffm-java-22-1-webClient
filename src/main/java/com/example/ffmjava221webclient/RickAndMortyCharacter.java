package com.example.ffmjava221webclient;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@NoArgsConstructor
@AllArgsConstructor

public class RickAndMortyCharacter {

    private int id;
    private String name;
    private String status;
    private String species;
}

