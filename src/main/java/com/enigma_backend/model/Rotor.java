package com.enigma_backend.model;

import java.util.Map;

import com.enigma_backend.constants.Alphabet;
import com.enigma_backend.enums.EnigmaModelName;

import lombok.Getter;

@Getter
public class Rotor {

    private Map<Character, Character> wiring;

    private EnigmaModelName modelName;

    private String customName;

    public Rotor(Character[] mapping) {
        setWiring(mapping);
    }

    public Rotor(Character[] mapping, EnigmaModelName modelName) {
        setWiring(mapping);
        this.modelName = modelName;
    }

    public Rotor(Character[] mapping, String customName) {
        setWiring(mapping);
        this.customName = customName;
    }

    private void setWiring(Character[] mapping) {
        for (int i = 0; i < Alphabet.SIZE; i++) {
            wiring.put(Alphabet.LETTERS[i], mapping[i]);
        }
    }
}
