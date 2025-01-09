package com.enigma_backend.constants;

public abstract class Alphabet {

    private Alphabet() {
        throw new UnsupportedOperationException("Utiliy class");
    }

    public static final Integer SIZE = 26;

    public static final Character[] LETTERS = {'A', 'B', 'C', 'D', 'E', 'F', 'G', 'H', 'I', 'J', 'K', 'L', 'M', 'N', 'O', 'P', 'Q', 'R', 'S', 'U', 'V', 'W', 'X', 'Y', 'Z'};
}
