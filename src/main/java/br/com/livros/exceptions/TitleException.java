package br.com.livros.exceptions;

import static br.com.livros.message.TitleMessage.*;

public class TitleException extends RuntimeException{

    public TitleException() {
        super(String.format(NO_TITLE_FOUND));
    }
}
