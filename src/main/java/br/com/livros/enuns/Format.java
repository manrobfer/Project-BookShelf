package br.com.livros.enuns;

public enum Format {
    brochure("Bruchura"),
    spiral("Espiral");

    private String desciption;

    Format(String description) {
        desciption = description;
    }
}
