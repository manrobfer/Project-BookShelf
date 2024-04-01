package br.com.livros.exceptions;

import static br.com.livros.message.PressMessage.NO_PRESS_FOUND;

public class PressException extends RuntimeException {

    public PressException() {
        super(NO_PRESS_FOUND)
        ;
    }
}
